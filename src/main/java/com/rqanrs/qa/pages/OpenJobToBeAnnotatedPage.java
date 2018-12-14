package com.rqanrs.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.rqanrs.qa.base.Testbase;

public class OpenJobToBeAnnotatedPage extends Testbase {
	@FindBy(xpath="//a[contains(text(),'To Be Annotated')]")
	WebElement ToBeAnnotatedTab;
	@FindBy(id="saveButtonId")
	WebElement Save;
	@FindBy(id="finishEditingButtonId")
    WebElement FinishEditing;
	@FindBy(xpath="/html/body/div[3]/div/div/div[3]/button[1]")
	WebElement FinishEditingPopup;
	@FindBy(id="standardizejdButtonId")
	WebElement Standardize;
	@FindBy(xpath="/html/body/div[3]/div/div/div[3]/button[1]")
	WebElement StandardizePopup;
	@FindBy(id="minimumexperience")
	WebElement MinimumExp;
	@FindBy(id="maximumexperience")
	WebElement MaximumExp;
	@FindBy(id="institute")
	WebElement Institute;
	@FindBy(id="branch")
	WebElement Branch;
	@FindBy(id="degree-tokenfield")
	WebElement Degree;
	@FindBy(xpath="//ul[contains(@class, 'ui-menu')]/li[3]")
	WebElement DegreeClick;
	@FindBy(id="saveButtonId")
	WebElement SaveJDForm;
	@FindBy(id="backtocorpusbuttonid")
	WebElement BackToCorpusJDForm;
	@FindBy(xpath="//button[contains(.,'Move To Pipeline')]")
	WebElement MoveToPipeline;
	@FindBy(xpath="//*[@id='header']/div[1]/div[1]/button/span")
	WebElement Logout;
	
	@FindBy(xpath="//*[@id='couldfId-tokenfield']")
	WebElement CouldFS;
	@FindBy(xpath="//ul[@id='ui-id-8']/li")
	WebElement CouldFSC;
	
	@FindBy(xpath="//*[@id='could-tokenfield']")
	WebElement CouldT;
	@FindBy(xpath="//ul[@id='ui-id-4']/li")
	WebElement CouldTC;
	
	@FindBy(xpath="//*[@id='goodfId-tokenfield']")
	WebElement GoodFS;
	@FindBy(xpath="//ul[@id='ui-id-6']/li")
	WebElement GoodFSC;
	
	@FindBy(xpath="//*[@id='good-tokenfield']")
	WebElement GoodT;
	@FindBy(xpath="//ul[@id='ui-id-5']/li")
	WebElement GoodTC;
	
	@FindBy(xpath="//*[@id='shouldfId-tokenfield']")
	WebElement ShouldFS;
	@FindBy(xpath="//ul[@id='ui-id-7']/li")
	WebElement ShouldFSC;
	
	@FindBy(xpath="//*[@id='should-tokenfield']")
	WebElement ShouldT;
	@FindBy(xpath="//ul[@id='ui-id-2']/li")
	WebElement ShouldTC;
	
	@FindBy(xpath="//*[@id='mustfId-tokenfield']")
	WebElement MustFS;
	@FindBy(xpath="//ul[@id='ui-id-9']/li")
	WebElement MustFSC;
	
	@FindBy(xpath="//*[@id='must-tokenfield']")
	WebElement MustT;
	@FindBy(xpath="//ul[@id='ui-id-3']/li")
	WebElement MustTC;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

public OpenJobToBeAnnotatedPage()
{
	PageFactory.initElements(driver,this);
}
	
	
	public void verifyToBeAnnotatedTabClick()
	{
		ToBeAnnotatedTab.click();
	}
	
	public void verifySavingJD() throws InterruptedException
	{
		Thread.sleep(5000);
		Save.click();
	}
	
	public void verifyFinishEditing() throws InterruptedException
	{   Thread.sleep(5000);
		FinishEditing.click();
		FinishEditingPopup.click();
		
	}
	
	public void verifyStandardizingJD() throws InterruptedException
	{
		Thread.sleep(15000);
		Standardize.click();
		Thread.sleep(5000);
		StandardizePopup.click();
		
}
	public void verifyUpdatingJDForm() throws InterruptedException
	{
	
		
		MinimumExp.sendKeys("3");
		MaximumExp.sendKeys("5");
		Select institutegrade=new Select(Institute);
	    institutegrade.selectByVisibleText("InstituteGrade-I");
	    Select branchname=new Select(Branch);
	    branchname.selectByVisibleText("IT");
	    //Thread.sleep(2000);
	    Degree.sendKeys("d");
	    Thread.sleep(2000);
	    DegreeClick.click();
	    
	    CouldFS.sendKeys("ja");
	    Thread.sleep(2000);
	    List <WebElement> alltech1=driver.findElements(By.xpath("//ul[@id='ui-id-8']/li"));
		for( WebElement tech : alltech1)
		{
			Thread.sleep(3000);
	
		alltech1.get(2).click();
		Thread.sleep(2000);
		System.out.println("Test Case for Functional Skill Click Pass");
		Thread.sleep(1000);
		break;
		}
		System.out.println("Test Case for Adding Functional Skill Inside the Could Pass");
		
		
		 CouldT.sendKeys("do");
		 Thread.sleep(2000);
	     List <WebElement> alltech2=driver.findElements(By.xpath("//ul[@id='ui-id-4']/li"));
			for( WebElement tech : alltech1)
			{
				Thread.sleep(3000);
		
			alltech2.get(2).click();
			Thread.sleep(2000);
			System.out.println("Test Case for Technology Click Pass");
            Thread.sleep(1000);
            break;
			}
			System.out.println("Test Case for Adding Technology Inside the Could Pass");
			
			GoodFS.sendKeys("de");
			Thread.sleep(2000);
			List <WebElement> alltech3=driver.findElements(By.xpath("//ul[@id='ui-id-6']/li"));
			for( WebElement tech : alltech1)
			{
				Thread.sleep(3000);
		
			alltech3.get(2).click();
			Thread.sleep(2000);
			System.out.println("Test Case for Functional Skill Click Pass");
            Thread.sleep(1000);
            break;
			}
			System.out.println("Test Case for Adding Functional Skill Inside the Good Pass");
			
			GoodT.sendKeys("se");
			Thread.sleep(2000);
		     List <WebElement> alltech4=driver.findElements(By.xpath("//ul[@id='ui-id-5']/li"));
				for( WebElement tech : alltech1)
				{
					Thread.sleep(3000);
			
				alltech4.get(2).click();
				Thread.sleep(2000);
				System.out.println("Test Case for Technology Click pass");
	            Thread.sleep(1000);
	            break;
				}
				System.out.println("Test Case for Adding Technology Inside the Good Pass");
		
			
			

			    
				
				 ShouldFS.sendKeys("do");
				 Thread.sleep(2000);
			     List <WebElement> alltech5=driver.findElements(By.xpath("//ul[@id='ui-id-7']/li"));
					for( WebElement tech : alltech1)
					{
						Thread.sleep(3000);
				
					alltech5.get(2).click();
					Thread.sleep(2000);
					System.out.println("Test Case for Functional Skill Click Pass");
		            Thread.sleep(1000);
		            break;
					}
					System.out.println("Test Case for Adding Functional Skill Inside the Should Pass");
					
					
					

					
					 ShouldT.sendKeys("dot");
					 Thread.sleep(2000);
				     List <WebElement> alltech6=driver.findElements(By.xpath("//ul[@id='ui-id-2']/li"));
						for( WebElement tech : alltech1)
						{
							Thread.sleep(3000);
					
						alltech6.get(2).click();
						Thread.sleep(2000);
						System.out.println("Test Case for Technology  Click Pass");
			            Thread.sleep(1000);
			            break;
						}
						System.out.println("Test Case for Adding Technology Inside the Should Pass");
						
		
	    
						
						 MustFS.sendKeys("ph");
						 Thread.sleep(2000);
					     List <WebElement> alltech7=driver.findElements(By.xpath("//ul[@id='ui-id-9']/li"));
							for( WebElement tech : alltech1)
							{
								Thread.sleep(3000);
						
							alltech7.get(1).click();
							Thread.sleep(2000);
							System.out.println("Test Case for Functional Skill Click Pass");
				            Thread.sleep(1000);
				            break;
							}
							System.out.println("Test Case for Adding Functional Skill Inside the Must Pass");
							
							
							

							
							 MustT.sendKeys("pro");
							 Thread.sleep(2000);
						     List <WebElement> alltech8=driver.findElements(By.xpath("//ul[@id='ui-id-3']/li"));
								for( WebElement tech : alltech1)
								{
									Thread.sleep(3000);
							
								alltech8.get(2).click();
								Thread.sleep(2000);
								System.out.println("Test Case for Technology Click Pass");
					            Thread.sleep(1000);
					            break;
								}
								System.out.println("Test Case for Adding Technology Inside the Must Pass");
	    
			
	    
	    
	    
	    SaveJDForm.click();
	    
	  }
	public void verifyBackToCorpusClick()
	{
		BackToCorpusJDForm.click();
	}
	public void verifySolrRedirect()
	{
		MoveToPipeline.click();
		
	}
	public void verifylogout()
	
	{
		Logout.click();
	}
	
}
