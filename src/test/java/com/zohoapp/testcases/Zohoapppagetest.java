package com.zohoapp.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zohoapp.base.Basepage;
import com.zohoapp.pages.Loginpage;
import com.zohoapp.pages.Zohoappapge;
import com.zohoapp.pages.Zohohomepage;

public class Zohoapppagetest {

	Basepage base = new Basepage();
	Zohohomepage home;
	Loginpage login;
	Zohoappapge zohoapp;

	@BeforeMethod
	public void Setup() {
		Basepage.Intialization("chrome");
		home = new Zohohomepage();
		login = home.gotoLogin();
		zohoapp = login.doLogin();

	}

	@Test(priority = 1)
	public void VerifyCrmlink() {
		zohoapp.gotoCRM();

	}

	/*
	 * 
	 * @Test public void VerifyBooklink() {
	 * 
	 * }
	 * 
	 * @Test public void VerifyCliq() {
	 * 
	 * }
	 * 
	 */

	@AfterMethod
	public void Quit() {
		Basepage.driver.quit();

	}

}
