package com.zohoapp.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zohoapp.base.Basepage;
import com.zohoapp.pages.CRMhomepage;
import com.zohoapp.pages.Contactpage;
import com.zohoapp.pages.Loginpage;
import com.zohoapp.pages.Zohoappapge;
import com.zohoapp.pages.Zohohomepage;

public class Contactpagetest {
	Basepage bse=new Basepage();
	Zohohomepage home;
	Loginpage login;
	Zohoappapge zohoapp;
	Contactpage contactpage;
	

	@BeforeMethod
	public void Setup() {
		Basepage.Intialization("chrome");
		home = new Zohohomepage();
		login = home.gotoLogin();
		zohoapp = login.doLogin();
		CRMhomepage crmhome = zohoapp.gotoCRM();
		contactpage = crmhome.gotoContact();
		contactpage.gotoNewcontact();

	}

	@Test
	public void CreatecontactPagetest() {
		contactpage.docreateContact("Mr.", "Ashish", "Benton", "test@gmail.com", "9540648555", "01126347701",
				"9810122118", "assistant", "Cold Call", "pal", "tittle", "department", "01126347701", "fax",
				"03/21/2020", "asstphone", "skypeid", "ashish@gmail.com", "", "", "mailstreet", "mailcity", "mailstate",
				"mailzip", "mailcountry", "otherstreet", "otherstate", "otherzip", "otherzip", "othercountry",
				"description");

	}

	@AfterMethod
	public void quit() {
		Basepage.driver.quit();

	}

}
