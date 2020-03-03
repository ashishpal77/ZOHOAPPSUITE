package com.zohoapp.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zohoapp.base.Basepage;

public class Zohohomepage extends Basepage {
	
	@FindBy(css=".zh-customers")
	@CacheLookup
	public WebElement customerlink;
	
	@FindBy(css=".zh-support")
	@CacheLookup
	public WebElement supportlink;
	
	@FindBy(css=".zh-contact")
	@CacheLookup
	public WebElement contactlink;
	
	@FindBy(css=".zh-login")
	@CacheLookup
	public WebElement loginlink;
	
	@FindBy(css=".zoho-logo")
	@CacheLookup
	public WebElement logolink;
	
	@FindBy(xpath="//a[contains(text(),'Zoho Home')]")
	@CacheLookup
	public WebElement zohohomelink;
	
	@FindBy(xpath="(//a[contains(text(),'Contact')])[3]")
	@CacheLookup
	public WebElement contactlink1;
	
	@FindBy(xpath="//a[contains(text(),'Security')]")
	@CacheLookup
	public WebElement securitylink;
	
	@FindBy(xpath="//a[contains(text(),'IPR Complaints')]")
	@CacheLookup
	public WebElement iprcomplaintslink;
	
	@FindBy(xpath="//a[contains(text(),' Anti-spam Policy')]")
	@CacheLookup
	public WebElement asntspampolicylink;
	
	
	@FindBy(xpath="//a[contains(text(),'Terms of Service')]")
	@CacheLookup
	public WebElement termsofservicelink;
	
	@FindBy(xpath="//a[contains(text(),'Privacy Policy')]")
	@CacheLookup
	public WebElement privacypolicy;
	
	
	public Zohohomepage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void getTittle()
	{
		//super();
		driver.getTitle();
	}
	
	public void logoTest(WebElement element)
	{
		System.out.println(element.getText());
		
	}
	
	public void getactiveLinks()
	{
		List<WebElement> list=driver.findElements(By.tagName("a"));
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)!=null)
			{
				System.out.println(list.get(i).getText());
			}
		}
		
	}
	
	public void getactiveimages()
	{
		
		
	}
	
	public void getHeaderlinks()
	{
		
	}
	
	public void getFooterLinks()
	{
		
	}
	
	public void getTermsofservice()
	{
		
	}
	
	public void getPrivacypolicy()
	{
		
	}
	
	public void gotoCustomers()
	{
		
	}
	
	public void gotoSupport()
	{
		
	}
	
	
	public void gotoContactSales()
	{
		
	}
	
	public Loginpage gotoLogin()
	{
		loginlink.click();
		return new Loginpage();
	   
		
	}
	
	
	
	
	
	
	
	

}
