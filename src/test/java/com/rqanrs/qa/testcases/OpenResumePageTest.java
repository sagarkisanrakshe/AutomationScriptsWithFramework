package com.rqanrs.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rqanrs.qa.base.Testbase;
import com.rqanrs.qa.pages.Loginpage;
import com.rqanrs.qa.pages.ManageJobsPage;
import com.rqanrs.qa.pages.ManageResumesPage;
import com.rqanrs.qa.pages.OpenJobToBeAnnotatedPage;
import com.rqanrs.qa.pages.OpenResumePage;

public class OpenResumePageTest extends Testbase{
	
	Loginpage loginpage;
	ManageJobsPage managejobs;
	ManageResumesPage manageresumes;
	OpenResumePage openresumepage;
	

	public OpenResumePageTest()
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
	openresumepage=new OpenResumePage();
	
	
	
	
	
	
	managejobs=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	
	managejobs.verifyTrackclick();
	manageresumes.verifyManageResumesClick();
	Thread.sleep(5000);
	manageresumes.verifyOpeningResume();
	Thread.sleep(5000);
	
	
}
	@Test(priority=34)
	public void backtoCorpusToBeAnnotatedTabResume() throws InterruptedException
	{
		openresumepage.verifyBackToCorpusClick();
		System.out.println("Test Case for Back To Corpus Click from TO Be Annotated Tab of Resume Pass");
		

	}
	@Test(priority=35)
	public void deleteAnnotationsToBeAnnotatedTabResume() throws InterruptedException
	{
		openresumepage.verifyDeletingAnnotations();
		System.out.println("Test Case For Deleting the Annotations from To Be Annotated Tab of Resume Pass");
	}
	
	@Test(priority=36)
	public void solrRedirectFromTobeAnnotatedTabofResume() throws InterruptedException
	{
		openresumepage.verifySolrRedirectFromToBeAnnotatedTabResume();
		System.out.println("Test Case for SolrRedirect From To Be Annotated Tab of Resume Pass");
		
	}
	@Test(priority=37)
	public void goldButtonClickFromToBeAnnotatedTabResume() throws InterruptedException
	{
		openresumepage.verifyGoldClick();
		System.out.println("Test Case for Verifying Gold Clicking Pass");
		
	}
	
  @Test(priority=38)
  public void logoutFromToBeAnnotatedTabResume() throws InterruptedException
  {
	  openresumepage.logoutClick();
	  System.out.println("Test Case for Logout From To Be Annotated Tab of Resume Pass");
	  
  }
  @AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}
}
