package com.zohoapp.testcases;

import java.util.Hashtable;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zohoapp.base.Basepage;
import com.zohoapp.pages.Accountpage;
import com.zohoapp.pages.CRMhomepage;
import com.zohoapp.pages.Loginpage;
import com.zohoapp.pages.Zohoappapge;
import com.zohoapp.pages.Zohohomepage;
import com.zohoapp.qa.utilities.TestUtil;

public class Accountpagetest {
	Basepage base=new Basepage();
	Zohohomepage home;
	Loginpage login;
	Zohoappapge zohoapppage;
	CRMhomepage crmhomepage;
	Accountpage accountpage;
	
	@BeforeMethod
	public void Setup()
	{
		Basepage.Intialization("chrome");
		home=new Zohohomepage();
		login=home.gotoLogin();
		zohoapppage=login.doLogin();
		crmhomepage=zohoapppage.gotoCRM();
		accountpage=crmhomepage.gotoAccount();
		accountpage.gotoCreatenewAccount();
	}
	
	@Test(priority=1)
	public void VerifyAccountCreation()
	{
		accountpage.CreatenewAccount("Ashish", "www.ashishpal.in", "test", "5784125", "current", "manufacturing", "10lakh", "4", "01126347701", "0112", "www.sonuprov.in", "symbol", "ownership", "tssymbol", "5", "sic123", "delhi",
				"delhi", "110065", "new delhi", "india", "delhi", "delhi", "india", "delhi", "delhi", "description");
		
	}
	
	
	
	//@Test(priority=1)
	/*
	@Test(dataProviderClass = TestUtil.class,dataProvider = "dp")
	public void Accountpagetest(Hashtable<String,String> data)
	{
		accountpage.CreatenewAccount(data.get("name"), data.get("site"), data.get("parentaccount"), data.get("accountno"), data.get("acctype"), data.get("industry"), data.get("revenue"), data.get("rating"),
				data.get("phone"), data.get("fax"), data.get("website"), data.get("symbol"), data.get("ownership"), data.get("tsymbol"), data.get("employee"), data.get("siccode"), data.get("billstreet"), data.get("bcity"), data.get("bcode"),
				data.get("bstate"), data.get("bcountry"), data.get("scity"), data.get("scode"), data.get("scountry"), data.get("sstate"), data.get("sstreet"), data.get("description"));		
	}
	*/
	
	@Test(priority=2)
	public void VerifyAccountCancel()
	{
		accountpage.CreatenewAccount("Ashish", "www.ashishpal.in", "test", "5784125", "current", "manufacturing", "10lakh", "4", "01126347701", "0112", "www.sonuprov.in", "symbol", "ownership", "tssymbol", "5", "sic123", "delhi",
				"delhi", "110065", "new delhi", "india", "delhi", "delhi", "india", "delhi", "delhi", "description");
		
	}
	
	@Test(priority=3)
	public void VerifyMandatoryFields()
	{
		accountpage.Mandatoryfields();
		
		
	}
	
	
	
	@AfterMethod
	public void Teardown()
	{
		Basepage.driver.quit();
	}

}
