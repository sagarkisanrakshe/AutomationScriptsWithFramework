package com.rqanrs.qa.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.rqanrs.qa.base.Testbase;
import com.rqanrs.qa.util.TestUtil;

public class ManageJobsPage extends Testbase {
	

@FindBy(id="selectJob")
 WebElement selectjob;
@FindBy(id="selectTechnology")
WebElement selecttechnology;
@FindBy(id="createjobbuttonId")
WebElement createjob;
@FindBy(id="createjobid")
WebElement createjobid;
@FindBy(id="jdtextarea")
WebElement jobdescription;
@FindBy(xpath="//*[@id='manageJobs']")
WebElement table;
@FindBy(xpath="//*[@id='manageJobs']/tbody/tr")
List<WebElement>rows;
@FindBy(tagName="td")
List<WebElement>cols;
@FindBy(xpath="//*[@id='refreshbutton']")
WebElement refreshbutton;
@FindBy(xpath="/html/body/div[3]/div/div/div[3]/button[1]")
WebElement DeleteConfirmationpopup;
@FindBy(xpath="//*[@id='header']/div[1]/div[1]/button/span")
WebElement logout;
@FindBy(xpath="//button[contains(.,'Move To Pipeline')]")
WebElement MoveToPipeline;
@FindBy(xpath="//button[contains(.,'Gold')]")
WebElement GoldClick;






public ManageJobsPage()
{
	PageFactory.initElements(driver,this);
}

public void verifyautomatedjobcreation() throws InterruptedException
{
	Select job=new Select(selectjob);
    job.selectByVisibleText("Senior Dot Net Developer");
 
	Select technology=new Select(selecttechnology);
	technology.selectByVisibleText("Python");
	
	createjob.click();
	
	   
	  

}

public void verifyManualJobCreation()
{
	Select technology=new Select(selecttechnology);
	technology.selectByVisibleText("Javascript");
	createjobid.sendKeys("JavascriptDeveloper3-5"+(System.nanoTime()));
	jobdescription.sendKeys("Must have- Object Oriented Javascript, HTML, CSS.Should have- Exposure to at least one of the JS framework/ library Backbone/ Angular/ React.Good to have- NodeJs.");
	createjob.click();
}
public void verifyProcessingofJob() throws InterruptedException
{
	Select technology=new Select(selecttechnology);
	technology.selectByVisibleText("Javascript");
	createjobid.sendKeys("JavascriptDeveloper3-5");
	jobdescription.sendKeys("Must have- Object Oriented Javascript, HTML, CSS.Should have- Exposure to at least one of the JS framework/ library Backbone/ Angular/ React.Good to have- NodeJs.");
	createjob.click();
	
	System.out.println("Rows:"+rows.size());
	System.out.println("Columns"+cols.size());
	WebElement lastrow=rows.get(rows.size()-1);
	System.out.println("LastRow:"+lastrow);
	java.util.List<WebElement> lastrowCols =lastrow.findElements(By.tagName("td"));
    System.out.println("lastrowCols: " +lastrowCols.size());

    WebElement lastColoflastRow=lastrowCols.get(lastrowCols.size()-1);    
    java.util.List<WebElement> lastrowlastColsButtons =lastColoflastRow.findElements(By.tagName("button"));        
	System.out.println("lastrowlastColsButtons: " +lastrowlastColsButtons.size());
	
	Thread.sleep(6000);
	lastrowlastColsButtons.get(0).click();

}
public void verifyRefreshofCorpus() throws InterruptedException
{
	Thread.sleep(10000);
	
	refreshbutton.click();
}

public void verifyTrackclick() throws InterruptedException
{
	System.out.println("Rows:"+rows.size());
	System.out.println("Columns"+cols.size());
	WebElement lastrow=rows.get(rows.size()-1);
	System.out.println("LastRow:"+lastrow);
	java.util.List<WebElement> lastrowCols =lastrow.findElements(By.tagName("td"));
    System.out.println("lastrowCols: " +lastrowCols.size());

    WebElement lastColoflastRow=lastrowCols.get(lastrowCols.size()-1);    
    java.util.List<WebElement> lastrowlastColsButtons =lastColoflastRow.findElements(By.tagName("button"));        
	System.out.println("lastrowlastColsButtons: " +lastrowlastColsButtons.size());
	

	lastrowlastColsButtons.get(3).click();
	Thread.sleep(5000);
}
public void verifyDownloadClick()
{

	System.out.println("Rows:"+rows.size());
	System.out.println("Columns"+cols.size());
	WebElement lastrow=rows.get(rows.size()-1);
	System.out.println("LastRow:"+lastrow);
	java.util.List<WebElement> lastrowCols =lastrow.findElements(By.tagName("td"));
    System.out.println("lastrowCols: " +lastrowCols.size());

    WebElement lastColoflastRow=lastrowCols.get(lastrowCols.size()-1);    
    java.util.List<WebElement> lastrowlastColsButtons =lastColoflastRow.findElements(By.tagName("button"));        
	System.out.println("lastrowlastColsButtons: " +lastrowlastColsButtons.size());
	
	lastrowlastColsButtons.get(4).click();
	
}
public void verifyDeletingJob() throws InterruptedException
{

	System.out.println("Rows:"+rows.size());
	System.out.println("Columns"+cols.size());
	WebElement lastrow=rows.get(rows.size()-1);
	System.out.println("LastRow:"+lastrow);
	java.util.List<WebElement> lastrowCols =lastrow.findElements(By.tagName("td"));
    System.out.println("lastrowCols: " +lastrowCols.size());

    WebElement lastColoflastRow=lastrowCols.get(lastrowCols.size()-1);    
    java.util.List<WebElement> lastrowlastColsButtons =lastColoflastRow.findElements(By.tagName("button"));        
	System.out.println("lastrowlastColsButtons: " +lastrowlastColsButtons.size());
	
	lastrowlastColsButtons.get(2).click();
	Thread.sleep(2000);
	DeleteConfirmationpopup.click();
	Thread.sleep(5000);
	
	
}
public void verifyOpeningJD() throws InterruptedException
{

	System.out.println("Rows:"+rows.size());
	System.out.println("Columns"+cols.size());
	WebElement lastrow=rows.get(rows.size()-1);
	System.out.println("LastRow:"+lastrow);
	java.util.List<WebElement> lastrowCols =lastrow.findElements(By.tagName("td"));
    System.out.println("lastrowCols: " +lastrowCols.size());

    WebElement lastColoflastRow=lastrowCols.get(lastrowCols.size()-1);    
    java.util.List<WebElement> lastrowlastColsButtons =lastColoflastRow.findElements(By.tagName("button"));        
	System.out.println("lastrowlastColsButtons: " +lastrowlastColsButtons.size());
	
	lastrowlastColsButtons.get(1).click();
	Thread.sleep(2000);
	
	
}
public void logout() throws InterruptedException
{
	Thread.sleep(2000);
	logout.click();
	
}
public void movetopipeline() throws InterruptedException
{
	
	Thread.sleep(2000);
	MoveToPipeline.click();
}
public void goldbuttonclick() throws InterruptedException
{
	Thread.sleep(2000);
	GoldClick.click();
	
}
}
