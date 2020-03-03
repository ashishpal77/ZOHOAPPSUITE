package com.zohoapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zohoapp.base.Basepage;

public class Loginpage extends Basepage {
	
	
	@FindBy(xpath="//input[@id='login_id']")
	@CacheLookup
	public WebElement usrname;
	
	@FindBy(xpath="(//button[@id='nextbtn'])[1]")
	@CacheLookup
	public WebElement nextbtn;
	
	@FindBy(css="[id='password']")
	@CacheLookup
	public WebElement password;
	
	
	@FindBy(xpath="(//span[text()='Sign in'])[2]")
	@CacheLookup
	public WebElement signinbtn;
	
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String gettittle()
	{
		return driver.getTitle();
	}
	
	public Zohoappapge doLogin()
	{
		usrname.sendKeys(prop.getProperty("username"));
		nextbtn.click();
		password.sendKeys(prop.getProperty("pwd"));
		signinbtn.click();
		return new Zohoappapge();
		
	}
	
	
	
	
	
	
	

}
