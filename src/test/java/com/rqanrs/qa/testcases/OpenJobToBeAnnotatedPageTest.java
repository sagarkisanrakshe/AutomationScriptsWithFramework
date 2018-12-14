package com.rqanrs.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rqanrs.qa.base.Testbase;
import com.rqanrs.qa.pages.Loginpage;
import com.rqanrs.qa.pages.ManageJobsPage;
import com.rqanrs.qa.pages.OpenJobPage;
import com.rqanrs.qa.pages.OpenJobToBeAnnotatedPage;

public class OpenJobToBeAnnotatedPageTest extends Testbase {
	
	Loginpage loginpage;
	ManageJobsPage managejobs;
	OpenJobPage openjobpage;
	OpenJobToBeAnnotatedPage openjobtobeannotatedpage;
	public OpenJobToBeAnnotatedPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
	loginpage=new Loginpage();
	managejobs=new ManageJobsPage();
	openjobpage=new OpenJobPage();
	openjobtobeannotatedpage =new OpenJobToBeAnnotatedPage();
	
	managejobs=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	
	managejobs.verifyOpeningJD();
	openjobtobeannotatedpage.verifyToBeAnnotatedTabClick();
	
	//openjobtobeannotatedpage.verifyToBeAnnotatedTabClick();
	
	
	}
	@Test(priority=15)
	public void savingJDTest() throws InterruptedException
	{
		
		openjobtobeannotatedpage.verifySavingJD();
		System.out.println("Test Case for Saving Job Description Pass");
	}
	
	@Test(priority=16)
	public void finishEditingJDTest() throws InterruptedException
	
	{
		openjobtobeannotatedpage.verifyFinishEditing();
		System.out.println("Test Case for Finish Editing Job Description Pass");
	}
	@Test(priority=17)
	public void standardizingJDTest() throws InterruptedException
	{
		openjobtobeannotatedpage.verifyStandardizingJD();
		System.out.println("Test Case for Standardizing Job Description Pass");
		
	}
	@Test(priority=18)
	public void updateJDFormTest() throws InterruptedException
	{
		openjobtobeannotatedpage.verifyUpdatingJDForm();
		System.out.println("Test Case for Updating JD Form Pass");
	}
	
	@Test(priority=19)
	public void backToCorpusFromToBeAnnotatedTabJDTest()
	{
		openjobtobeannotatedpage.verifyBackToCorpusClick();
		System.out.println("Test Case For Back To Corpus Click In JD Form Pass");
	}
	@Test(priority=20)
	public void moveToPipelineFromToBeAnnotatedTabJDTest()
	{
		openjobtobeannotatedpage.verifySolrRedirect();
		System.out.println("Test Case for Solr Redirect Pass");
	}
	@Test(priority=21)
	public void logoutFromToBeAnnotatedTabJDTest()
	{
		openjobtobeannotatedpage.verifylogout();
		System.out.println("Test Case for Logout from To Be Annotated Tab Pass");
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}

}
