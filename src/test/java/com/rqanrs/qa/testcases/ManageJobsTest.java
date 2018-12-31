package com.rqanrs.qa.testcases;


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
import com.rqanrs.qa.pages.ManageJobsPage;
import com.rqanrs.qa.pages.ManageJobsPage;

public class ManageJobsTest extends Testbase
{
	Loginpage loginpage;
	ManageJobsPage managejobs;
	
	public ManageJobsTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		loginpage=new Loginpage();
		managejobs=new ManageJobsPage();
		managejobs=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		
		
		
	}
	
	@Test(priority=4)
	public void automatedJobCreationTest() throws InterruptedException
	{   
		
		managejobs.verifyautomatedjobcreation();
		System.out.println("Test Case for Automated Job Creation Pass");
		
	}
	@Test(priority=5)
	public void manualJobCreationTest()
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
	public void refreshManageJobsCorpusTest() throws InterruptedException
	{
		managejobs.verifyRefreshofCorpus();
		System.out.println("Test case for Refreshing the Manage Jobs Corpus Pass");
	}

	@Test(priority=8)
	public void trackJobTest() throws InterruptedException
	{
	managejobs.verifyTrackclick();
	System.out.println("Test Case for Tracking the Job Description Pass");
	
	}
	@Test(priority=9)
	public void downloadTrackerTest()
	{
		managejobs.verifyDownloadClick();
		System.out.println("Test Case for Downloading the Blank Suitability Tracker Pass");
	}
	/*
	@Test(priority=10)
	public void deletingJobTest() throws InterruptedException
	{
		managejobs.verifyDeletingJob();
		System.out.println("Test Case for Deleting the Job Description Pass");
	}
	*/
	@Test(priority=11)
	public void openingJobTest() throws InterruptedException
	{
		managejobs.verifyOpeningJD();
		System.out.println("Tes Case for Opening Job Description Pass");
		
	}
	@Test(priority=12)
	public void logoutFromManageJobsCorpusTest() throws InterruptedException
	{
		managejobs.logout();
		System.out.println("Test Case For Logout From Manage Jobs Corpus Pass");
	}
	@Test(priority=13)
	public void solrRedirectFromManageJobsCorpusTest() throws InterruptedException
	
	{   managejobs.verifyTrackclick();
	    Thread.sleep(2000);
		managejobs.movetopipeline();
		System.out.println("Test Case For Solr Redirect From Manage Jobs Corpus Pass");
	}
	@Test(priority=14)
	public void goldClickFromManageJobsCorpusTest() throws InterruptedException
	{
		managejobs.goldbuttonclick();
		System.out.println("Test Case For Gold Button Click From Manage Jobs Corpus Pass");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
