package com.zohoapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zohoapp.base.Basepage;

public class Accountpage extends Basepage {
	
	
	@FindBy(xpath="//button[@data-zcqa='cv_createbtn']")
	@CacheLookup
	public WebElement createbtn;
	
	@FindBy(xpath="(//td[starts-with(text(),'Create Account ')])[2]")
	@CacheLookup
	public WebElement editpagelabel;
	
	@FindBy(css="#Crm_Accounts_ACCOUNTNAME")
	@CacheLookup
	public WebElement nametb;
	
	@FindBy(css="#Crm_Accounts_ACCOUNTSITE")
	@CacheLookup
	public WebElement sitetb;
	
	
	@FindBy(css="#Crm_Accounts_PARENTACCOUNTID")
	@CacheLookup
	public WebElement parentacctb;
	
	@FindBy(css="#Crm_Accounts_ACCOUNTNUMBER")
	@CacheLookup
	public WebElement acctnumtb;
	
	@FindBy(xpath="//span[@aria-labelledby='select2-Crm_Accounts_ACCOUNTTYPE-container']")
	@CacheLookup
	public WebElement accttypeddl;
	
	
	@FindBy(xpath="//span[@aria-labelledby='select2-Crm_Accounts_INDUSTRY-container']")
	@CacheLookup
	public WebElement industryddl;
	
	@FindBy(css="#Crm_Accounts_ANNUALREVENUE")
	@CacheLookup
	public WebElement revenuetb;
	
	@FindBy(xpath="//span[@aria-labelledby='select2-Crm_Accounts_RATING-container']")
	@CacheLookup
	public WebElement ratingddl;
	
	@FindBy(css="#Crm_Accounts_PHONE")
	@CacheLookup
	public WebElement phonetb;
	
	@FindBy(css="#Crm_Accounts_FAX")
	@CacheLookup
	public WebElement faxtb;
	
	@FindBy(css="#Crm_Accounts_WEBSITE")
	@CacheLookup
	public WebElement websitetb;
	
	@FindBy(css="#Crm_Accounts_TICKERSYMBOL")
	@CacheLookup
	public WebElement symboltb;
	
	@FindBy(xpath="//span[@aria-labelledby='select2-Crm_Accounts_OWNERSHIP-container']")
	@CacheLookup
	public WebElement ownershipddl;
	
	@FindBy(css="#Crm_Accounts_TICKERSYMBOL")
	@CacheLookup
	public WebElement tickersymboltb;
	
	@FindBy(css="#Crm_Accounts_EMPLOYEES")
	@CacheLookup
	public WebElement employeetb;
	
	@FindBy(css="#Crm_Accounts_SICCODE")
	@CacheLookup
	public WebElement siccodetb;
	
	@FindBy(css="#Crm_Accounts_BILLINGSTREET")
	@CacheLookup
	public WebElement billstrrettb;
	
	@FindBy(css="#Crm_Accounts_BILLINGCITY")
	@CacheLookup
	public WebElement billingcity;
	
	@FindBy(css="#Crm_Accounts_BILLINGSTATE")
	@CacheLookup
	public WebElement billingstatetb;
	
	@FindBy(css="#Crm_Accounts_BILLINGCODE")
	@CacheLookup
	public WebElement billingcodetb;
	
	@FindBy(css="#Crm_Accounts_BILLINGCOUNTRY")
	@CacheLookup
	public WebElement billingcountrytb;
	
	@FindBy(css="#Crm_Accounts_SHIPPINGSTREET")
	@CacheLookup
	public WebElement shippingstreettb;
	
	@FindBy(css="#Crm_Accounts_SHIPPINGCITY")
	@CacheLookup
	public WebElement shippingcitytb;
	
	@FindBy(css="#Crm_Accounts_SHIPPINGSTATE")
	@CacheLookup
	public WebElement shippingstatetb;
	
	@FindBy(css="#Crm_Accounts_SHIPPINGCODE")
	@CacheLookup
	public WebElement shippingcodetb;
	
	@FindBy(css="#Crm_Accounts_SHIPPINGCOUNTRY")
	@CacheLookup
	public WebElement shippingcountrytb;
	
	@FindBy(css="#Crm_Accounts_DESCRIPTION")
	@CacheLookup
	public WebElement desctb;
	
	public Accountpage()
	{
		PageFactory.initElements(driver, this);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
