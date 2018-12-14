package com.rqanrs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rqanrs.qa.base.Testbase;

public class ManageResumesPage extends Testbase{
	
@FindBy(linkText="Manage Resumes")
WebElement ManageResumes;
@FindBy(id="uploadId")
WebElement UploadFolder;
@FindBy(xpath="//*[@id='resume-panel']/div/div[1]/span/button")
WebElement UploadButton;
@FindBy(xpath="//*[@id='resume-panel']/div/div[1]/span/div[2]/input")
WebElement UploadSingle;
@FindBy(xpath="//*[@id='resume-panel']/div/div[3]/div[2]/div[1]/div/div[2]/div[1]/button/span")
WebElement RefreshButton;
@FindBy(id="quickTrackerId")
WebElement QuickTrackerButton;
@FindBy(id="suitabilityId")
WebElement SuitabilityTrackerButton;
@FindBy(id="addToTrackerId")
WebElement AddToTrackerButton;
@FindBy(id="deleteResumeId")
WebElement DeleteResumeButton;
@FindBy(id="goldButtonId")
WebElement MoveToGoldButton;
@FindBy(id="openDocumentId")
WebElement OpenResumeButton;



public ManageResumesPage()
{
	PageFactory.initElements(driver,this);
}
	


public void verifyManageResumesClick()
{
	ManageResumes.click();

	
}
public void verifyFolderUpload() throws InterruptedException
{
	Thread.sleep(5000);
	UploadFolder.sendKeys("/home/synerzip/Desktop/WithOwnMailId");
	Thread.sleep(1000);
	UploadButton.click();
	Thread.sleep(80000);
	
}
public void verifySingleUpload() throws InterruptedException
{
	Thread.sleep(5000);
	UploadSingle.sendKeys("/home/synerzip/Desktop/WithOwnMailId/Abhijeet Shinde -- UI Dev informex (1)(1) (2).doc");
	Thread.sleep(1000);
	UploadButton.click();
	Thread.sleep(30000);
}

public void verifyrefreshmanageresumescorpus() throws InterruptedException

{   Thread.sleep(5000);
	RefreshButton.click();
	Thread.sleep(1000);
}

public void verifyQuickTrackerDownload() throws InterruptedException
{
	Thread.sleep(5000);
	QuickTrackerButton.click();
	Thread.sleep(1000);
	
}
public void verifySuitabilityTrackerDownload() throws InterruptedException
{
	Thread.sleep(5000);
	SuitabilityTrackerButton.click();
	Thread.sleep(1000);
	
}

public void verifyAddtoTracker() throws InterruptedException
{
	Thread.sleep(5000);
	AddToTrackerButton.click();
	Thread.sleep(1000);
	
	
	
}
public void verifyDeletingResume() throws InterruptedException
{   Thread.sleep(5000);
	DeleteResumeButton.click();
	Thread.sleep(1000);
}

public void verifyMoveToGOldStandard() throws InterruptedException
{
	Thread.sleep(5000);
	MoveToGoldButton.click();
	Thread.sleep(1000);
	
}
public void verifyOpeningResume() throws InterruptedException
{
	Thread.sleep(5000);
	OpenResumeButton.click();
	Thread.sleep(1000);
	
}
}

