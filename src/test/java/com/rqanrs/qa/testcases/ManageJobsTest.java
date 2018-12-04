package com.rqanrs.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rqanrs.qa.base.Testbase;
import com.rqanrs.qa.pages.Loginpage;
import com.rqanrs.qa.pages.ManageJobs;

public class ManageJobsTest extends Testbase
{
	Loginpage loginpage;
	ManageJobs managejobs;
	
	public ManageJobsTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		loginpage=new Loginpage();
		managejobs=new ManageJobs();
		managejobs=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		
		
		
	}
	
	@Test(priority=4)
	public void automatedjobTest() throws InterruptedException
	{   
		
		managejobs.verifyautomatedjobcreation();
		System.out.println("Test Case for Automated Job Creation Pass");
		
	}
	@Test(priority=5)
	public void manualJobTest()
	{
		managejobs.verifyManualJobCreation();
		System.out.println("Test Case for Manual Job Creation Pass");
	}
	@Test(priority=6)
	public void processJobTest() throws InterruptedException
	{
		managejobs.verifyProcessingofJob();
		System.out.println("Test Case for Processing of Job Pass");
	}
	
	@Test(priority=7)
	public void refreshManageJobsCorpus() throws InterruptedException
	{
		managejobs.verifyRefreshofCorpus();
		System.out.println("Test case for Refreshing the Manage Jobs Corpus Pass");
	}

	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
