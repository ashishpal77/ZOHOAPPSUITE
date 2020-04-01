package com.zohoapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.zohoapp.base.Basepage;

public class Accountpage extends Basepage {

	@FindBy(xpath = "//button[@data-zcqa='cv_createbtn']")
	@CacheLookup
	public WebElement createbtn;

	@FindBy(xpath = "(//td[starts-with(text(),'Create Account ')])[2]")
	@CacheLookup
	public WebElement editpagelabel;

	@FindBy(css = "#Crm_Accounts_ACCOUNTNAME")
	@CacheLookup
	public WebElement nametb;

	@FindBy(css = "#Crm_Accounts_ACCOUNTSITE")
	@CacheLookup
	public WebElement sitetb;

	@FindBy(css = "#Crm_Accounts_PARENTACCOUNTID")
	@CacheLookup
	public WebElement parentacctb;

	@FindBy(css = "#Crm_Accounts_ACCOUNTNUMBER")
	@CacheLookup
	public WebElement acctnumtb;

	@FindBy(xpath = "//span[@aria-labelledby='select2-Crm_Accounts_ACCOUNTTYPE-container']")
	@CacheLookup
	public WebElement accttypeddl;

	@FindBy(xpath = "//span[@aria-labelledby='select2-Crm_Accounts_INDUSTRY-container']")
	@CacheLookup
	public WebElement industryddl;

	@FindBy(css = "#Crm_Accounts_ANNUALREVENUE")
	@CacheLookup
	public WebElement revenuetb;

	@FindBy(xpath = "//span[@aria-labelledby='select2-Crm_Accounts_RATING-container']")
	@CacheLookup
	public WebElement ratingddl;

	@FindBy(css = "#Crm_Accounts_PHONE")
	@CacheLookup
	public WebElement phonetb;

	@FindBy(css = "#Crm_Accounts_FAX")
	@CacheLookup
	public WebElement faxtb;

	@FindBy(css = "#Crm_Accounts_WEBSITE")
	@CacheLookup
	public WebElement websitetb;

	@FindBy(css = "#Crm_Accounts_TICKERSYMBOL")
	@CacheLookup
	public WebElement symboltb;

	@FindBy(xpath = "//span[@aria-labelledby='select2-Crm_Accounts_OWNERSHIP-container']")
	@CacheLookup
	public WebElement ownershipddl;

	@FindBy(css = "#Crm_Accounts_TICKERSYMBOL")
	@CacheLookup
	public WebElement tickersymboltb;

	@FindBy(css = "#Crm_Accounts_EMPLOYEES")
	@CacheLookup
	public WebElement employeetb;

	@FindBy(css = "#Crm_Accounts_SICCODE")
	@CacheLookup
	public WebElement siccodetb;

	@FindBy(css = "#Crm_Accounts_BILLINGSTREET")
	@CacheLookup
	public WebElement billstrrettb;

	@FindBy(css = "#Crm_Accounts_BILLINGCITY")
	@CacheLookup
	public WebElement billingcity;

	@FindBy(css = "#Crm_Accounts_BILLINGSTATE")
	@CacheLookup
	public WebElement billingstatetb;

	@FindBy(css = "#Crm_Accounts_BILLINGCODE")
	@CacheLookup
	public WebElement billingcodetb;

	@FindBy(css = "#Crm_Accounts_BILLINGCOUNTRY")
	@CacheLookup
	public WebElement billingcountrytb;

	@FindBy(css = "#Crm_Accounts_SHIPPINGSTREET")
	@CacheLookup
	public WebElement shippingstreettb;

	@FindBy(css = "#Crm_Accounts_SHIPPINGCITY")
	@CacheLookup
	public WebElement shippingcitytb;

	@FindBy(css = "#Crm_Accounts_SHIPPINGSTATE")
	@CacheLookup
	public WebElement shippingstatetb;

	@FindBy(css = "#Crm_Accounts_SHIPPINGCODE")
	@CacheLookup
	public WebElement shippingcodetb;

	@FindBy(css = "#Crm_Accounts_SHIPPINGCOUNTRY")
	@CacheLookup
	public WebElement shippingcountrytb;

	@FindBy(css = "#Crm_Accounts_DESCRIPTION")
	@CacheLookup
	public WebElement desctb;

	@FindBy(css = "[id='errorMsg_Crm_Accounts_ACCOUNTNAME']")
	@CacheLookup
	public WebElement errormsg;

	@FindBy(css = "[id='saveAccountsBtn']")
	@CacheLookup
	public WebElement savebtn;

	@FindBy(css = "cancelAccountsBtn")
	@CacheLookup
	public WebElement cancelbtn;

	public Accountpage() {
		PageFactory.initElements(driver, this);
	}

	public void Verifytittle() {
		String tittle = driver.getTitle();
		System.out.println(tittle);

	}

	public void islogopresent() {
		editpagelabel.isDisplayed();

	}

	public void gotoCreatenewAccount() {
		createbtn.click();

	}

	public void CreatenewAccount(String name, String site, String parentaccount, String accountno, String acctype,
			String industry, String revenue, String rating, String phone, String fax, String website, String symbol,
			String ownership, String tsymbol, String employee, String siccode, String billstreet, String bcity,
			String bcode, String bstate, String bcountry, String scity, String scode, String scountry, String sstate,
			String sstreet, String description) {
		nametb.sendKeys(name);
		sitetb.sendKeys(site);
		parentacctb.sendKeys(parentaccount);
		acctnumtb.sendKeys(accountno);
		accttypeddl.sendKeys(acctype);
		industryddl.sendKeys(industry);
		revenuetb.sendKeys(revenue);
		ratingddl.sendKeys(rating);
		phonetb.sendKeys(phone);
		faxtb.sendKeys(fax);
		websitetb.sendKeys(website);
		symboltb.sendKeys(symbol);
		ownershipddl.sendKeys(ownership);
		tickersymboltb.sendKeys(tsymbol);
		employeetb.sendKeys(employee);
		siccodetb.sendKeys(siccode);
		billstrrettb.sendKeys(billstreet);
		billingcity.sendKeys(bcity);
		billingcodetb.sendKeys(bcode);
		billingstatetb.sendKeys(bstate);
		billingcountrytb.sendKeys(bcountry);
		shippingcitytb.sendKeys(scity);
		shippingcodetb.sendKeys(scode);
		shippingcountrytb.sendKeys(scountry);
		shippingstatetb.sendKeys(sstate);
		shippingstreettb.sendKeys(sstreet);
		desctb.sendKeys(description);
		savebtn.click();

	}

	public void doCancelAccount(String name, String site, String parentaccount, String accountno, String acctype,
			String industry, String revenue, String rating, String phone, String fax, String website, String symbol,
			String ownership, String tsymbol, String employee, String siccode, String billstreet, String bcity,
			String bcode, String bstate, String bcountry, String scity, String scode, String scountry, String sstate,
			String sstreet, String description) {
		nametb.sendKeys(name);
		sitetb.sendKeys(site);
		parentacctb.sendKeys(parentaccount);
		acctnumtb.sendKeys(accountno);
		accttypeddl.sendKeys(acctype);
		Select selec = new Select(accttypeddl);
		selec.selectByVisibleText("Analyst");
		industryddl.sendKeys(industry);
		revenuetb.sendKeys(revenue);
		ratingddl.sendKeys(rating);
		Select s = new Select(ratingddl);
		s.deselectByIndex(2);
		phonetb.sendKeys(phone);
		faxtb.sendKeys(fax);
		websitetb.sendKeys(website);
		symboltb.sendKeys(symbol);
		ownershipddl.sendKeys(ownership);
		tickersymboltb.sendKeys(tsymbol);
		employeetb.sendKeys(employee);
		siccodetb.sendKeys(siccode);
		billstrrettb.sendKeys(billstreet);
		billingcity.sendKeys(bcity);
		billingcodetb.sendKeys(bcode);
		billingstatetb.sendKeys(bstate);
		billingcountrytb.sendKeys(bcountry);
		shippingcitytb.sendKeys(scity);
		shippingcodetb.sendKeys(scode);
		shippingcountrytb.sendKeys(scountry);
		shippingstatetb.sendKeys(sstate);
		shippingstreettb.sendKeys(sstreet);
		desctb.sendKeys(description);
		cancelbtn.click();

	}

	public void Mandatoryfields() {

		savebtn.click();
		String text = errormsg.getText();
		System.out.println(text);

	}
	
	
	

}
