package com.rqanrs.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rqanrs.qa.base.Testbase;
import com.rqanrs.qa.pages.Loginpage;
import com.rqanrs.qa.pages.ManageJobsPage;
import com.rqanrs.qa.pages.ManageJobsPage;
import com.rqanrs.qa.pages.OpenJobPage;

public class OpenJobPageTest extends Testbase{
	Loginpage loginpage;
	ManageJobsPage managejobs;
	OpenJobPage openjobpage;
	
	public OpenJobPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		loginpage=new Loginpage();
		managejobs=new ManageJobsPage();
		openjobpage=new OpenJobPage();
		managejobs=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		
		managejobs.verifyOpeningJD();
		
		
}
	@Test(priority=15)
	public void backToCorpusFromAnnotatedTabJDTest()
	{
		openjobpage.verifyBacktoCorpusClick();
		System.out.println("Test Case for Clicking on the Back to Corpus Button Pass");
		
	}
	@Test(priority=16)
	public void logoutFromAnnotatedTabJDTest() throws InterruptedException
	{
		openjobpage.verifyLogout();
		System.out.println("Test Case for Logout from AnnotatedTab Pass");
	}
	@Test(priority=17)
	public void MoveToPipelineFromAnnotatedTabJDTest() throws InterruptedException
	{
	  openjobpage.verifySolrRedirect();
	  System.out.println("Test Case For Solr Redirect Check Pass");
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}

