package com.zohoapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.zohoapp.base.Basepage;

public class Dealpage extends Basepage {

	@FindBy(xpath = "//button[@data-zcqa='cv_createbtn']")
	public WebElement createbtn;

	@FindBy(css = "[id='Crm_Potentials_POTENTIALNAME']")
	@CacheLookup
	public WebElement dealnametb;

	@FindBy(css = "[id='Crm_Potentials_ACCOUNTID']")
	@CacheLookup
	public WebElement accountnametb;

	@FindBy(css = "[aria-labelledby='select2-Crm_Potentials_POTENTIALTYPE-container']")
	@CacheLookup
	public WebElement typeddl;

	@FindBy(css = "[id='Crm_Potentials_NEXTSTEP']")
	@CacheLookup
	public WebElement nextsteptb;

	@FindBy(css = "[aria-labelledby='select2-Crm_Potentials_LEADSOURCE-container']")
	@CacheLookup
	public WebElement Leadsrcddl;

	@FindBy(css = "[id='Crm_Potentials_CONTACTID']")
	@CacheLookup
	public WebElement contactidtb;

	@FindBy(css = "[id='Crm_Potentials_AMOUNT']")
	@CacheLookup
	public WebElement amounttb;

	@FindBy(css = "[id='Crm_Potentials_CLOSINGDATE']")
	@CacheLookup
	public WebElement closingdatetb;

	@FindBy(css = "[aria-labelledby='select2-Crm_Potentials_STAGE-container']")
	@CacheLookup
	public WebElement stageddl;

	@FindBy(css = "[id='Crm_Potentials_PROBABILITY']")
	@CacheLookup
	public WebElement probablitytb;

	@FindBy(css = "[id='Crm_Potentials_EXPECTEDREVENUE']")
	@CacheLookup
	public WebElement revenuetb;

	@FindBy(css = "[id='Crm_Potentials_CAMPAIGNID']")
	@CacheLookup
	public WebElement campaignid;

	@FindBy(css = "[id='Crm_Potentials_DESCRIPTION']")
	@CacheLookup
	public WebElement desctb;

	@FindBy(css = "(//input[@value='Save'])[2]")
	@CacheLookup
	public WebElement savetbn;

	public Dealpage() {
		PageFactory.initElements(driver, this);
	}

	public void gotonewDeal() {
		createbtn.click();

	}

	public void donewDeal(String dealname, String accountname, String type, String nextstep, String leadsrc,
			String contactid, String amount, String closingdate, String stage, String probability, String revenue,
			String campaign, String description) {
		dealnametb.clear();
		dealnametb.sendKeys(dealname);
		accountnametb.clear();
		accountnametb.sendKeys(accountname);
		typeddl.sendKeys(type);
		nextsteptb.clear();
		nextsteptb.sendKeys(nextstep);
		Leadsrcddl.sendKeys(leadsrc);
		//Select selec=new Select(Leadsrcddl);
		//selec.selectByIndex(0);
		contactidtb.clear();
		contactidtb.sendKeys(contactid);
		amounttb.clear();
		amounttb.sendKeys(amount);
		closingdatetb.sendKeys(closingdate);
		stageddl.sendKeys(stage);
		probablitytb.clear();
		probablitytb.sendKeys(probability);
		revenuetb.clear();
		revenuetb.sendKeys(revenue);
		campaignid.clear();
		campaignid.sendKeys(campaign);
		desctb.clear();
		desctb.sendKeys(description);
		savetbn.click();

	}

}
