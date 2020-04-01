package com.zohoapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zohoapp.base.Basepage;

public class Leadpage extends Basepage {

	@FindBy(xpath = "//button[@data-zcqa='cv_createbtn']")
	@CacheLookup
	public WebElement createbtn;

	@FindBy(xpath = "//input[@id='Crm_Leads_DESIGNATION']")
	@CacheLookup
	public WebElement Tittletb;

	@FindBy(css = "[id='Crm_Leads_PHONE']")
	@CacheLookup
	public WebElement phonetb;

	@FindBy(css = "#Crm_Leads_MOBILE")
	@CacheLookup
	public WebElement mobiletb;

	@FindBy(xpath = "//span[@aria-labelledby='select2-Crm_Leads_LEADSOURCE-container']")
	@CacheLookup
	public WebElement leadsourceddl;

	@FindBy(xpath = "//span[@aria-labelledby='select2-Crm_Leads_INDUSTRY-container']")
	@CacheLookup
	public WebElement industryddl;

	@FindBy(css = "#Crm_Leads_ANNUALREVENUE")
	@CacheLookup
	public WebElement annualrevenuetb;

	@FindBy(css = "#Crm_Leads_COMPANY")
	@CacheLookup
	public WebElement leadcompanytb;

	@FindBy(css = "#Crm_Leads_LASTNAME")
	@CacheLookup
	public WebElement lastnametb;

	@FindBy(css = "#Crm_Leads_EMAIL")
	@CacheLookup
	public WebElement emailtb;

	@FindBy(css = "#Crm_Leads_FAX")
	@CacheLookup
	public WebElement faxtb;

	@FindBy(css = "#Crm_Leads_WEBSITE")
	@CacheLookup
	public WebElement websitetb;

	@FindBy(xpath = "//span[@aria-labelledby='select2-Crm_Leads_STATUS-container']")
	@CacheLookup
	public WebElement leadstatusddl;

	@FindBy(css = "#Crm_Leads_EMPCT")
	@CacheLookup
	public WebElement noofemployeetb;

	@FindBy(xpath = "//span[@aria-labelledby='select2-Crm_Leads_RATING-container']")
	@CacheLookup
	public WebElement ratingddl;

	@FindBy(css = "#Crm_Leads_SKYPEIDENTITY")
	@CacheLookup
	public WebElement skypeidtb;

	@FindBy(css = "#Crm_Leads_ADDN_EMAIL")
	@CacheLookup
	public WebElement secondaryemailtb;

	@FindBy(css = "#Crm_Leads_TWITTER")
	@CacheLookup
	public WebElement twittertb;

	@FindBy(css = "#Crm_Leads_LANE")
	@CacheLookup
	public WebElement streettb;

	@FindBy(css = "#Crm_Leads_STATE")
	@CacheLookup
	public WebElement statetb;

	@FindBy(css = "#Crm_Leads_COUNTRY")
	@CacheLookup
	public WebElement countrytb;

	@FindBy(css = "#Crm_Leads_CITY")
	@CacheLookup
	public WebElement citytb;

	@FindBy(css = "#Crm_Leads_CODE")
	@CacheLookup
	public WebElement zipcodetb;

	@FindBy(css = "#Crm_Leads_DESCRIPTION")
	@CacheLookup
	public WebElement desctb;

	public Leadpage() {
		PageFactory.initElements(driver, this);
	}
	
	public void gotocreateNewlead()
	{
		createbtn.click();
		
	}

	public void docreateLead(String tittle, String phone, String source, String industry, String annualrevenue,
			String company, String lastname, String email, String fax, String website, String status, String employee,
			String rating, String skype, String secondayemail, String twitter, String state, String country,
			String city, String zipcode, String desc) {
		Tittletb.sendKeys(tittle);
		phonetb.sendKeys(phone);
		leadsourceddl.sendKeys(source);
        industryddl.sendKeys(industry);
		annualrevenuetb.sendKeys(annualrevenue);
		leadcompanytb.sendKeys(company);
		lastnametb.sendKeys(lastname);
		emailtb.sendKeys(email);
		faxtb.sendKeys(fax);
		websitetb.sendKeys(website);
		leadstatusddl.sendKeys(status);
		noofemployeetb.sendKeys(employee);
		ratingddl.sendKeys(rating);
		skypeidtb.sendKeys(skype);
		secondaryemailtb.sendKeys(secondayemail);
		twittertb.sendKeys(twitter);
		statetb.sendKeys(state);
		countrytb.sendKeys(country);
		citytb.sendKeys(city);
		zipcodetb.sendKeys(zipcode);
		desctb.sendKeys(desc);

	}

}
