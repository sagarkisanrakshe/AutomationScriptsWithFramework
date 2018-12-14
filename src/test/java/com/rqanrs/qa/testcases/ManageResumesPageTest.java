package com.rqanrs.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rqanrs.qa.base.Testbase;
import com.rqanrs.qa.pages.Loginpage;
import com.rqanrs.qa.pages.ManageJobsPage;
import com.rqanrs.qa.pages.ManageResumesPage;
import com.rqanrs.qa.pages.OpenJobPage;
import com.rqanrs.qa.pages.OpenJobToBeAnnotatedPage;

public class ManageResumesPageTest extends Testbase{
	
	Loginpage loginpage;
	ManageJobsPage managejobs;
	OpenJobPage opejobpage;
	OpenJobToBeAnnotatedPage openjobtobeannotatedpage;
	ManageResumesPage manageresumes;
	
	public ManageResumesPageTest()
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
	openjobtobeannotatedpage=new OpenJobToBeAnnotatedPage();
	manageresumes=new ManageResumesPage();
	
	
	
	
	managejobs=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	
	managejobs.verifyTrackclick();
	manageresumes.verifyManageResumesClick();
	Thread.sleep(5000);
	
	
}
	@Test(priority=22)
	public void folderUploadTest() throws InterruptedException
	{
	manageresumes.verifyFolderUpload();
	System.out.println("Test Case for Uploading the Folder Of Candidates Pass");
	
	}
	@Test(priority=23)
	public void singleUploadTest() throws InterruptedException
	{
		manageresumes.verifySingleUpload();
		System.out.println("Test Case for Uploading the Single Candidate Pass");
	
		
	}
	@Test(priority=24)
    public void refreshManageResumesCorpusTest() throws InterruptedException
    {
		manageresumes.verifyrefreshmanageresumescorpus();
		System.out.println("Test Case for Refreshing Manage Resumes Corpus Pass");
    }
	
	@Test(priority=25)
	public void quickTrackerDownloadTest() throws InterruptedException
	{
		manageresumes.verifyQuickTrackerDownload();
		System.out.println("Test Case for Downloading Quick Tracker Pass");
		
	}
	@Test(priority=26)
	public void suitabilityTrackerDownloadTest() throws InterruptedException
	{
		manageresumes.verifySuitabilityTrackerDownload();
		System.out.println("Test Case for Downloading Suitability Tracker Pass");
		
	}
	@Test(priority=27)
	public void addToTrackerTest() throws InterruptedException
	{
		manageresumes.verifyAddtoTracker();
		System.out.println("Test Case for Adding Candidate to Tracker Pass");
	}
	@Test(priority=28)
	public void deleteResumeTest() throws InterruptedException
	{
		manageresumes.verifyDeletingResume();
		System.out.println("Test Case for Deleting Resume Pass");
	}
	@Test(priority=29)
	public void moveToGoldTest() throws InterruptedException
	{
		manageresumes.verifyMoveToGOldStandard();
		System.out.println("Test Case for Moving to Gold Standard Pass");
	}
	@Test(priority=30)
	public void opeingResumeTest() throws InterruptedException
	{
		manageresumes.verifyOpeningResume();
		System.out.println("Test Case for Opening Resume Pass");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}
	
}
