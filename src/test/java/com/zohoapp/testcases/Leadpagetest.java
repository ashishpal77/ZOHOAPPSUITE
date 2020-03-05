package com.zohoapp.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zohoapp.base.Basepage;
import com.zohoapp.pages.Zohoappapge;
import com.zohoapp.pages.Zohohomepage;

public class Leadpagetest {
	
	Basepage base=new Basepage();
	Zohoappapge zohoapp;
	Zohohomepage home;
	
	
	@BeforeMethod
	public 	void Setup()
	{
		
		home=new Zohohomepage();
		zohoapp=home.gotoLogin().doLogin();
		
		
		
	}
	
	@Test
	public void docreateLeadpage()
	{
		
		
		
	}
	
	
	@AfterMethod
	public void Quit()
	{
		Basepage.driver.quit();
		
	}

}
