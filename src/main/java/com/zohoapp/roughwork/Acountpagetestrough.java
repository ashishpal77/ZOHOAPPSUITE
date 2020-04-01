package com.zohoapp.roughwork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Acountpagetestrough {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.zoho.com/");
		driver.findElement(By.cssSelector(".zh-login")).click();
		driver.findElement(By.xpath("//input[@id='login_id']")).sendKeys("vinod.verma@orientknits.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@id='nextbtn'])[1]")).click();
		driver.findElement(By.cssSelector("[id='password']")).sendKeys("zptodx23578",Keys.ENTER);
		driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//div[@data-value='Accounts']")).click();
		driver.findElement(By.xpath("//button[@data-zcqa='cv_createbtn']")).click();
		//Select selec=new Select(driver.findElement(By.xpath("//span[@aria-labelledby='select2-Crm_Accounts_ACCOUNTTYPE-container']")));
	    //List<WebElement> elements=selec.getOptions();
	   //int getsize= elements.size();
	   //System.out.println(getsize);
		//	selec.selectByIndex(2);
		//driver.findElement(By.xpath(""))
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.cssSelector("[id='select2-Crm_Accounts_ACCOUNTTYPE-container']"));
		//s.selectByIndex(2);
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
	     String dropdownScript = "var select = window.document.getElementById('" + 
	    		 element +
	             "'); for(var i = 0; i < select.options.length; i++){if(select.options[i].text == '" +
	             element +
	             "'){ select.options[i].selected = true; } }";

	     Thread.sleep(2000);
	     executor.executeScript(dropdownScript);
	     Thread.sleep(2000);

	     String clickScript = "if ("+"\"createEvent\""+" in document) {var evt = document.createEvent("+"\"HTMLEvents\""+");     evt.initEvent("+"\"change\""+", false, true); " + element + ".dispatchEvent(evt); } else " + element + ".fireEvent("+"\"onchange\""+");";

	     executor.executeScript(clickScript);

	 }
		
		
		
		

	}


