package com.zohoapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.zohoapp.base.Basepage;

public class Contactpage extends Basepage {
	
	
	@FindBy(css=".newwhitebtn.customPlusBtn")
	@CacheLookup
	public WebElement createbtn;
	
	@FindBy(xpath="//span[@id='select2-Crm_Contacts_FIRSTNAME_SALUTATION-container']")
	@CacheLookup
	public WebElement fnmaprefix;
	
	@FindBy(css="#Crm_Contacts_FIRSTNAME")
	@CacheLookup
	public WebElement fnametb;
	
	@FindBy(css="#Crm_Contacts_ACCOUNTID")
	@CacheLookup
	public WebElement accountidtb;
	
	@FindBy(css="#Crm_Contacts_EMAIL")
	@CacheLookup
	public WebElement emailtb;
	
	@FindBy(css="#Crm_Contacts_PHONE")
	@CacheLookup
	public WebElement phonetb;
	
	
	@FindBy(css="#Crm_Contacts_OTHERPHONE")
	@CacheLookup
	public WebElement otherphonetb;
	
	@FindBy(css="#Crm_Contacts_MOBILE")
	@CacheLookup
	public WebElement mobiletb;
	
	@FindBy(css="#Crm_Contacts_ASSISTANT")
	@CacheLookup
	public WebElement assistanttb;
	
	@FindBy(xpath="//span[@aria-labelledby='select2-Crm_Contacts_LEADSOURCE-container']")
	@CacheLookup
	public WebElement leadsourceddl;
	
	
	@FindBy(css="#Crm_Contacts_LASTNAME")
	@CacheLookup
	public WebElement lastnametb;
	
	
	@FindBy(css="#Crm_Contacts_TITLE")
	@CacheLookup
	public WebElement tittletb;
	
	@FindBy(css="#Crm_Contacts_DEPARTMENT")
	@CacheLookup
	public WebElement departmenttb;
	
	
	@FindBy(css="#Crm_Contacts_HOMEPHONE")
	@CacheLookup
	public WebElement homephonetb;
	
	@FindBy(css="#Crm_Contacts_FAX")
	@CacheLookup
	public WebElement faxtb;
	
	@FindBy(css="#Crm_Contacts_BIRTHDAY")
	@CacheLookup
	public WebElement birthdaytb;
	
	@FindBy(css="#Crm_Contacts_ASSISTANTPHONE")
	@CacheLookup
	public WebElement aastphonetb;
	
	@FindBy(css="#Crm_Contacts_SKYPEIDENTITY")
	@CacheLookup
	public WebElement skypeidtb;
	
	@FindBy(css="##Crm_Contacts_ADDN_EMAIL")
	@CacheLookup
	public WebElement secondayemail;
	
	@FindBy(css="#Contacts_fldRow_REPORTINGTOCONTACTID")
	@CacheLookup
	public WebElement reportingtb;
	
	@FindBy(css="#Crm_Contacts_TWITTER")
	@CacheLookup
	public WebElement twitterrb;
	
	
	
	
	

}
