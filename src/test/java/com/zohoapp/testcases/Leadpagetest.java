package com.zohoapp.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zohoapp.base.Basepage;
import com.zohoapp.pages.CRMhomepage;
import com.zohoapp.pages.Leadpage;
import com.zohoapp.pages.Zohoappapge;
import com.zohoapp.pages.Zohohomepage;

public class Leadpagetest {
	
	Basepage base=new Basepage();
	Zohoappapge zohoapp;
	Zohohomepage home;
	CRMhomepage crm;
	Leadpage lead;
	
	
	@BeforeMethod
	public 	void Setup()
	{
		Basepage.Intialization("chrome");
		home=new Zohohomepage();
		zohoapp=home.gotoLogin().doLogin();
		crm=zohoapp.gotoCRM();
		lead=crm.gotoLead();
		lead.gotocreateNewlead();
		
	}
	
	@Test
	public void docreateLeadpage()
	{
		lead.docreateLead("tittle", "phone","Advertiement","Service Provider",
				"10000","company", "lastname", "email", "fax", "website",
				"Contacted","employee","Active","skype","secondayemail","twitter",
				"state", "country", "city", "zipcode", "desc");
		
		
	}
	
	
	@AfterMethod
	public void Quit()
	{
		Basepage.driver.quit();
		
	}

}
