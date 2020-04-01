package com.zohoapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zohoapp.base.Basepage;

public class Contactpage extends Basepage {

	@FindBy(xpath = "//button[@data-zcqa='cv_createbtn']")
	@CacheLookup
	public WebElement createbtn;

	@FindBy(xpath = "//span[@id='select2-Crm_Contacts_FIRSTNAME_SALUTATION-container']")
	@CacheLookup
	public WebElement fnmaprefix;

	@FindBy(css = "#Crm_Contacts_FIRSTNAME")
	@CacheLookup
	public WebElement fnametb;

	@FindBy(css = "#Crm_Contacts_ACCOUNTID")
	@CacheLookup
	public WebElement accountidtb;

	@FindBy(css = "#Crm_Contacts_EMAIL")
	@CacheLookup
	public WebElement emailtb;

	@FindBy(css = "#Crm_Contacts_PHONE")
	@CacheLookup
	public WebElement phonetb;

	@FindBy(css = "#Crm_Contacts_OTHERPHONE")
	@CacheLookup
	public WebElement otherphonetb;

	@FindBy(css = "#Crm_Contacts_MOBILE")
	@CacheLookup
	public WebElement mobiletb;

	@FindBy(css = "#Crm_Contacts_ASSISTANT")
	@CacheLookup
	public WebElement assistanttb;

	@FindBy(xpath = "//span[@aria-labelledby='select2-Crm_Contacts_LEADSOURCE-container']")
	@CacheLookup
	public WebElement leadsourceddl;

	@FindBy(css = "#Crm_Contacts_LASTNAME")
	@CacheLookup
	public WebElement lastnametb;

	@FindBy(css = "#Crm_Contacts_TITLE")
	@CacheLookup
	public WebElement tittletb;

	@FindBy(css = "#Crm_Contacts_DEPARTMENT")
	@CacheLookup
	public WebElement departmenttb;

	@FindBy(css = "#Crm_Contacts_HOMEPHONE")
	@CacheLookup
	public WebElement homephonetb;

	@FindBy(css = "#Crm_Contacts_FAX")
	@CacheLookup
	public WebElement faxtb;

	@FindBy(css = "#Crm_Contacts_BIRTHDAY")
	@CacheLookup
	public WebElement birthdaytb;

	@FindBy(css = "#Crm_Contacts_ASSISTANTPHONE")
	@CacheLookup
	public WebElement aastphonetb;

	@FindBy(css = "#Crm_Contacts_SKYPEIDENTITY")
	@CacheLookup
	public WebElement skypeidtb;

	@FindBy(css = "##Crm_Contacts_ADDN_EMAIL")
	@CacheLookup
	public WebElement secondayemail;

	@FindBy(css = "#Contacts_fldRow_REPORTINGTOCONTACTID")
	@CacheLookup
	public WebElement reportingtb;

	@FindBy(css = "#Crm_Contacts_TWITTER")
	@CacheLookup
	public WebElement twitterrb;
	
	@FindBy(css="[id='Crm_Contacts_MAILINGSTREET']")
	@CacheLookup
	public WebElement mailingstreettb;
	
	@FindBy(css="[id='Crm_Contacts_MAILINGCITY']")
	@CacheLookup
	public WebElement mailingcitytb;
	
	@FindBy(css="[id='Crm_Contacts_MAILINGSTATE']")
	@CacheLookup
	public WebElement mailstatetb;
	
	@FindBy(css="[id='Crm_Contacts_MAILINGZIP']")
	@CacheLookup
	public WebElement mailingziptb;
	
	@FindBy(css="[id='Crm_Contacts_MAILINGCOUNTRY']")
	@CacheLookup
	public WebElement mailingcountrytb;
	
	@FindBy(css="[id='Crm_Contacts_OTHERSTREET']")
	@CacheLookup
	public WebElement Ostreettb;
	
	@FindBy(css="[id='Crm_Contacts_OTHERCITY']")
	@CacheLookup
	public WebElement Ocitytb;
	
	@FindBy(css="[id='Crm_Contacts_OTHERSTATE']")
	@CacheLookup
	public WebElement ostatetb;
	
	@FindBy(css="[id='Crm_Contacts_OTHERZIP']")
	@CacheLookup
	public WebElement ostatezip;
	
	@FindBy(css="[id='Crm_Contacts_OTHERCOUNTRY']")
	@CacheLookup
	public WebElement ocountry;
	
	@FindBy(css="[id='Crm_Contacts_DESCRIPTION']")
	@CacheLookup
	public WebElement descriptiontb;
	
	@FindBy(xpath="(//input[@id='saveContactsBtn'])[2]")
	@CacheLookup
	public WebElement savebtn;
	
	
	
	

	public Contactpage() {
		PageFactory.initElements(driver, this);
	}
	
	public void gotoNewcontact()
	{
		createbtn.click();
	}

	public void docreateContact(String fnameprefix, String fname, String accountid, String email, String phone,
			String otherphone, String mobileno, String assistant, String leadsource, String lname, String tittle,
			String departmentname, String homephone, String fax, String birthdaydate, String asstphone, String skypeid,
			String secondaryemail, String reporting, String twitter,String mailstreet,String mailcity,String mailstate,
			String mailzip,String mailcountry,String otherstreet,String othercity,String otherstate,String otherstatezip,
			String othercountry,String description) {
		//sfnmaprefix.sendKeys(fnameprefix);
		fnametb.sendKeys(fname);
		accountidtb.sendKeys(accountid);
		emailtb.sendKeys(email);
		phonetb.sendKeys(phone);
		otherphonetb.sendKeys(otherphone);
		mobiletb.sendKeys(mobileno);
		assistanttb.sendKeys(assistant);
		leadsourceddl.sendKeys(leadsource);
		lastnametb.sendKeys(lname);
		tittletb.sendKeys(tittle);
		departmenttb.sendKeys(departmentname);
		homephonetb.sendKeys(homephone);
		faxtb.sendKeys(fax);
		birthdaytb.sendKeys(birthdaydate);
		aastphonetb.sendKeys(asstphone);
		skypeidtb.sendKeys(skypeid);
		secondayemail.sendKeys(secondaryemail);
		reportingtb.sendKeys(reporting);
		twitterrb.sendKeys(twitter);
		mailingstreettb.sendKeys(mailstreet);
		mailingcitytb.sendKeys(mailcity);
		mailstatetb.sendKeys(mailstate);
		mailingziptb.sendKeys(mailzip);
		mailingcountrytb.sendKeys(mailcountry);
		Ostreettb.sendKeys(otherstreet);
		Ocitytb.sendKeys(othercity);
		ostatetb.sendKeys(otherstate);
		ostatezip.sendKeys(otherstatezip);
		ocountry.sendKeys(othercountry);
		descriptiontb.sendKeys(description);
        savebtn.click();

	}

}
