package com.zohoapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zohoapp.base.Basepage;

public class Zohoappapge extends Basepage {
	
	
	@FindBy(xpath="//div[contains(text(),'CRM')]")
	@CacheLookup
	public WebElement CRMLink;
	
	
	@FindBy(xpath="//div[contains(text(),'Books')]")
	@CacheLookup
	public WebElement BooksLink;
	
	
	@FindBy(xpath="//div[contains(text(),'Cliq')]")
	@CacheLookup
	public WebElement CliqLink;
	
	
	@FindBy(xpath="//div[contains(text(),'Mail')]")
	@CacheLookup
	public WebElement MailLink;
	
	public Zohoappapge()
	{
		PageFactory.initElements(driver, this);
	}
	
	public CRMhomepage gotoCRM()
	{
		CRMLink.click();
		return new CRMhomepage();
		
	}
	
	public void gotoBOOK()
	{
		
		
	}
	
	public void gotoMail()
	{
		
		
	}
	
	
	

}
