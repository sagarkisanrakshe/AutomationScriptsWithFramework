package com.rqanrs.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rqanrs.qa.base.Testbase;
import com.rqanrs.qa.pages.Loginpage;
import com.rqanrs.qa.pages.ManageJobsPage;
import com.rqanrs.qa.pages.ManageResumesPage;
import com.rqanrs.qa.pages.OpenResumeModelHtmlPage;
import com.rqanrs.qa.pages.OpenResumePage;

public class OpenResumeModelHtmlPageTest extends Testbase{
	
	Loginpage loginpage;
	ManageJobsPage managejobs;
	ManageResumesPage manageresumes;
	OpenResumePage openresumepage;
	OpenResumeModelHtmlPage openresumemodelhtmlpage;
	
	
	public OpenResumeModelHtmlPageTest()
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
	openresumemodelhtmlpage=new OpenResumeModelHtmlPage();
	managejobs=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	managejobs.verifyTrackclick();
	manageresumes.verifyManageResumesClick();
	Thread.sleep(5000);
	manageresumes.verifyOpeningResume();
	Thread.sleep(5000);
	openresumemodelhtmlpage.verifyModelHtmlClick();
	
}

	@Test(priority=36)
	public void fillupCandidateInformationTest() throws InterruptedException
	{
		openresumemodelhtmlpage.verifyCandidateInfoFillUp();
		System.out.println("Test Case for Updating the Candidate Information Pass");
	}
	
	@Test(priority=37)
	public void fillupMissingInformationTest() throws InterruptedException
	{
		
		openresumemodelhtmlpage.verifyMissingInformationUpdate();
		System.out.println("Test Case for Filling Up the Missing Information Pass");
		
	}
	@Test(priority=38)
	public void backtoCorpusFromModelHtmlTabTest()
	{
		openresumemodelhtmlpage.verifybacktocorpus();
		System.out.println("Test Case for Back To Corpus Click From The Model Html Tab of Resume Pass");
	}
	@Test(priority=39)
	public void exportDocumenttoSolrTest() throws InterruptedException
	{
		openresumemodelhtmlpage.verifyExporttoSolr();
		System.out.println("Test Case for Exporting the Document To Solr From Model Html Tab Pass");
		
		
	}
	@Test(priority=40)
	public void logoutFromModelHtmlTabTest() throws InterruptedException
	{
		
		openresumemodelhtmlpage.logout();
		System.out.println("Test Case For Logout From Model Html Tab Pass");
		
		
	}
	@Test(priority=41)
	public void redirecttosolrFromModelHtmlTabTest() throws InterruptedException
	{
		
		openresumemodelhtmlpage.moveToPipeline();
		System.out.println("Test Case For Redirecting to the Solr from Model Html Tab Pass");
		
	}
	@Test(priority=42)
	public void goldClickFromModelHtmlTabTest() throws InterruptedException
	{
		
		openresumemodelhtmlpage.goldclick();
		System.out.println("Test Case for Clicking Gold Button From Model HTML Tab Pass");
	}
	
}
