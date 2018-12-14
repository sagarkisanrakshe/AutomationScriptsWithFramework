package com.rqanrs.qa.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.rqanrs.qa.base.Testbase;
import com.rqanrs.qa.pages.Loginpage;
import com.rqanrs.qa.pages.ManageJobsPage;
import com.rqanrs.qa.pages.ManageJobsPage;
import com.rqanrs.qa.util.TestUtil;

public class LoginPageTest extends Testbase{
	Loginpage loginpage;
	ManageJobsPage managejobs;
	String sheetName="login";
	
	
	
	public LoginPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginpage=new Loginpage();
		
	}
	
	@DataProvider
	public Object[][] getTestdata()
	{
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
		
		
	}
	@Test(priority=1)
	public void loginPageTitleTest()
	{
		String title=loginpage.validateLoginPageTitle();
		String expected_title="Rezoomex Quick Assessment & Ranking System";
		Assert.assertEquals(title,expected_title ,"Login Page Title Not Matched");
		System.out.println("Test Case for Page Title Check Pass");
		
	}
	
	
	@Test(priority=2,dataProvider="getTestdata")
	public void loginTest(String Username,String Password)
	
	{
		managejobs=loginpage.login(Username, Password);
		//managejobs=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		System.out.println("Test Case for Login into Web Application Pass");
	}

	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
