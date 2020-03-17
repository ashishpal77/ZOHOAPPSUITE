package com.zohoapp.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.zohoapp.qa.utilities.ExcelReader;

public class Basepage {

	/*
	 * Initializing a propert file in constructor
	 * 
	 * 
	 * 
	 * 
	 * /
	 */

	public FileInputStream fis;
	public static Properties prop;
	public static WebDriver driver;
	public ExcelReader excel=new ExcelReader("E:\\ZOHOAPPSUITE\\src\\test\\resources\\testdata\\Testdata.xlsx");

	public Basepage() {
		prop = new Properties();

		try {
			fis = new FileInputStream("E:\\ZOHOAPPSUITE\\src\\test\\resources\\config.properties\\Config.properties");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Object url= prop.get("url");
	}

	public static void Intialization(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-infobars");

			driver = new ChromeDriver(options);

			//driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(Long.parseLong(prop.getProperty("implicit_wait")), TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		

	}
	
	
	

}
