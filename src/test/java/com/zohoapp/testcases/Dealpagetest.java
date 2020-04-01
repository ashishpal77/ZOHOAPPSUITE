package com.zohoapp.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zohoapp.base.Basepage;
import com.zohoapp.pages.CRMhomepage;
import com.zohoapp.pages.Dealpage;
import com.zohoapp.pages.Loginpage;
import com.zohoapp.pages.Zohoappapge;
import com.zohoapp.pages.Zohohomepage;

public class Dealpagetest {
	Basepage base = new Basepage();
	Zohohomepage zohohome;
	Loginpage loginpage;
	Zohoappapge zohoapp;
	CRMhomepage crmhome;
	Dealpage deal;

	@BeforeMethod
	public void Setup() {
		Basepage.Intialization("chrome");
		zohohome = new Zohohomepage();
		loginpage = zohohome.gotoLogin();
		zohoapp = loginpage.doLogin();
		crmhome = zohoapp.gotoCRM();
		deal = crmhome.gotoDeal();
		deal.gotonewDeal();

	}

	@Test
	public void Createnewdeal() {
		deal.donewDeal("dealname", "Benton (Sample)", "New Business", "nextstep", "Online Store",
				"Kris Marrier (Sample)", "1000", "06/06/1988", "Qualification", "20", "1000",
				"", "description");

	}
	
	@AfterMethod
	public void quit()
	{
	//	Basepage.driver.quit();
	}

}
