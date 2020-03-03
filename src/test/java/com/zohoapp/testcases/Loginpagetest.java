package com.zohoapp.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zohoapp.base.Basepage;
import com.zohoapp.pages.Loginpage;
import com.zohoapp.pages.Zohohomepage;

public class Loginpagetest {

	Loginpagetest() {

	}

	Zohohomepage zohohome;
	Loginpage login;
	Basepage base = new Basepage();

	@BeforeMethod
	public void Setup() {

		Basepage.Intialization("chrome");
		zohohome = new Zohohomepage();
		login = zohohome.gotoLogin();

	}

	@Test(priority=2)
	public void Logintest() {

		login.doLogin();

	}

	@Test(priority=1)
	public void Validateloginpagetittle() {
		String tittle = login.gettittle();
		Assert.assertEquals(tittle, "Zoho Accounts");
	}

	@AfterMethod
	public void Quit() {
		Basepage.driver.quit();
	}

}
