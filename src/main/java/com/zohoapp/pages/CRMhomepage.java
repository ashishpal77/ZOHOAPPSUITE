package com.zohoapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zohoapp.base.Basepage;

public class CRMhomepage extends Basepage {
	
	
	@FindBy(xpath="//span[@id='show-uName']")
	@CacheLookup
	public WebElement shownamelbl;
	
	@FindBy(xpath="//div[contains(text(),'Leads')]")
	@CacheLookup
	public WebElement Leadslinks;
	
	@FindBy(xpath="//div[@data-value='Contacts']")
	@CacheLookup
	public WebElement Contactlink;
	
	@FindBy(xpath="//div[@data-value='Accounts']")
	@CacheLookup
	public WebElement Accountlink;
	
	@FindBy(xpath="//div[@data-value='Potentials']")
	@CacheLookup
	public WebElement dealslink;
	
	@FindBy(xpath="//div[@data-value='Campaigns']")
	@CacheLookup
	public WebElement Campaignslink;
	
	public CRMhomepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public Leadpage gotoLead()
	{
		Leadslinks.click();
		return new Leadpage();
		
		
	}
	
	public Contactpage gotoContact()
	{
		Contactlink.click();
		return new Contactpage();
		
	}
	
	public Accountpage gotoAccount()
	{
		Accountlink.click();
		return new Accountpage();
		
	}
	
	public Dealpage gotoDeal()
	{
		dealslink.click();
		return new Dealpage();
		
	}
	
	

}
