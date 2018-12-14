package com.rqanrs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rqanrs.qa.base.Testbase;

public class OpenJobPage extends Testbase {

	@FindBy(id="backtocorpusbuttonid")
	WebElement Backtocorpus;
	@FindBy(xpath="//*[@id='header']/div[1]/div[1]/button/span")
	WebElement Logout;
	@FindBy(xpath="//button[contains(.,'Move To Pipeline')]")
	WebElement MoveToPipelineClick;
	
	

public OpenJobPage()
{
	PageFactory.initElements(driver,this);
}

public void verifyBacktoCorpusClick()
{
	Backtocorpus.click();
}
	
public void verifyLogout() throws InterruptedException
{
    Thread.sleep(2000);	
	Logout.click();
}
public void verifySolrRedirect() throws InterruptedException
{
	Thread.sleep(2000);
	MoveToPipelineClick.click();
}
}

