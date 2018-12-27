package com.rqanrs.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.rqanrs.qa.base.Testbase;

public class OpenResumeModelHtmlPage extends Testbase{

	
@FindBy(xpath="/html/body/div/div/div[2]/div[2]/div/div/div[1]/div/ul/li[3]/a")
WebElement ModelHtmlTab;
@FindBy(xpath="//span[contains(text(),'CandidateDetails')]")
WebElement CandidateInfoMissingMessage;
@FindBy(id="saveButtonId")
WebElement Save;
@FindBy(id="NoticePeriod")
WebElement NoticePeriod;
@FindBy(id="CurrentCTC")
WebElement CurrentCTC;
@FindBy(id="ExpectedCTC")
WebElement ExpectedCTC;
@FindBy(xpath="//*[@id='missingInfoModal']/div/div/div[3]/button[2]")
WebElement SaveChanges;
@FindBy(id="backtocorpusbuttonid")
WebElement BackToCorpus;
@FindBy(id="exportToSolrButtonId")
WebElement ExportToSolr;
@FindBy(xpath="/html/body/div[3]/div/div/div[3]/button[1]")
WebElement ExportToSolrConfirmationPopUp;
@FindBy(xpath="//*[@id='header']/div[1]/div[1]/button/span")
WebElement logout;
@FindBy(xpath="//button[contains(.,'Move To Pipeline')]")
WebElement MoveToPipeline;
@FindBy(xpath="//button[contains(.,'Gold')]")
WebElement GoldClick;







public OpenResumeModelHtmlPage()

{
	PageFactory.initElements(driver,this);
}

public void verifyModelHtmlClick() throws InterruptedException
{   
	Thread.sleep(2000);
	ModelHtmlTab.click();
}

public void verifyCandidateInfoFillUp() throws InterruptedException
{   
	Thread.sleep(5000);
	Select communication=new Select(driver.findElement(By.id("communication")));
	communication.selectByVisibleText("Good");
	Thread.sleep(2000);
	Select agency=new Select(driver.findElement(By.id("selectAgency")));
	agency.selectByVisibleText("HR");
	Thread.sleep(2000);
	Save.click();
	
}
public void verifyMissingInformationUpdate() throws InterruptedException
{
	CandidateInfoMissingMessage.click();
	NoticePeriod.sendKeys("30");
	Thread.sleep(1000);
	CurrentCTC.sendKeys("12");
	Thread.sleep(1000);
	ExpectedCTC.sendKeys("15");
	Thread.sleep(2000);
	SaveChanges.click();
	
}
public void verifybacktocorpus()
{
	BackToCorpus.click();
	
}

public void verifyExporttoSolr() throws InterruptedException
{
	Thread.sleep(5000);
	ExportToSolr.click();
	Thread.sleep(2000);
	ExportToSolrConfirmationPopUp.click();
	
}
public void logout() throws InterruptedException
{
	Thread.sleep(5000);
	logout.click();
	
}

public void moveToPipeline() throws InterruptedException
{
	Thread.sleep(5000);
	MoveToPipeline.click();
	
	
}
public void goldclick() throws InterruptedException
{
	Thread.sleep(5000);
	GoldClick.click();
	
}
}
