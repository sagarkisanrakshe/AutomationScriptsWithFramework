package com.rqanrs.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rqanrs.qa.base.Testbase;
import com.rqanrs.qa.pages.Loginpage;
import com.rqanrs.qa.pages.ManageJobsPage;
import com.rqanrs.qa.pages.ManageResumesPage;
import com.rqanrs.qa.pages.OpenResumeModelHtmlPage;
import com.rqanrs.qa.pages.OpenResumePage;

public class DeletingCreatedTestDataTest extends Testbase{
	
	Loginpage loginpage;
	ManageJobsPage managejobs;
	ManageResumesPage manageresumes;
	
	public DeletingCreatedTestDataTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
	initialization();
	loginpage=new Loginpage();
	managejobs=new ManageJobsPage();
	manageresumes=new ManageResumesPage();
	
	managejobs=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	
}
	
	@Test(priority=46)
	public void deleteTestDataTest() throws InterruptedException
	{
		managejobs.verifyDeletingJob();
		Thread.sleep(2000);
		System.out.println("Test Case for Deleting the Created Test Data Pass");
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}
}
