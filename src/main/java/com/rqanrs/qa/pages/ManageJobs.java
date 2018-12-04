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

public class ManageJobs extends Testbase {
	

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





public ManageJobs()
{
	PageFactory.initElements(driver,this);
}

public void verifyautomatedjobcreation() throws InterruptedException
{
	Select job=new Select(selectjob);
    job.selectByVisibleText("Senior Dot Net Developer");
    //Thread.sleep(9000);
	Select technology=new Select(selecttechnology);
	technology.selectByVisibleText("Python");
	//Thread.sleep(3000);
	createjob.click();
	//Thread.sleep(3000);
	   
	  

}

public void verifyManualJobCreation()
{
	Select technology=new Select(selecttechnology);
	technology.selectByVisibleText("Javascript");
	createjobid.sendKeys("JavascriptDeveloper3-5"+(System.nanoTime()));
	jobdescription.sendKeys("Total Experience- 3-8 Years Must have- Object Oriented Javascript, HTML, CSS.Should have- Exposure to at least one of the JS framework/ library Backbone/ Angular/ React.Good to have- NodeJs.");
	createjob.click();
}
public void verifyProcessingofJob() throws InterruptedException
{
	Select technology=new Select(selecttechnology);
	technology.selectByVisibleText("Javascript");
	createjobid.sendKeys("JavascriptDeveloper3-5");
	jobdescription.sendKeys("Total Experience- 3-8 Years Must have- Object Oriented Javascript, HTML, CSS.Should have- Exposure to at least one of the JS framework/ library Backbone/ Angular/ React.Good to have- NodeJs.");
	createjob.click();
	
	//verifyManualJobCreation();
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
	//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	refreshbutton.click();
}



}
