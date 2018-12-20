package com.rqanrs.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rqanrs.qa.base.Testbase;

public class OpenResumePage extends Testbase{
	
@FindBy(id="backtocorpusbuttonid")
WebElement BackToCorpus;
@FindBy(id="standardizeButtonId")
WebElement SaveAnnotations;
@FindBy(xpath="/html/body/div[3]/div/div/div[3]/button[1]")
WebElement SaveAnnotationConfirmationPopUp;
@FindBy(xpath="//button[contains(.,'Move To Pipeline')]")
WebElement MoveToPipeline;
@FindBy(xpath="//button[contains(.,'Gold')]")
WebElement GoldButton;
@FindBy(xpath="//*[@id='header']/div[1]/div[1]/button/span")
WebElement Logout;

public OpenResumePage()
{
	PageFactory.initElements(driver,this);
}
	
public void verifyBackToCorpusClick() throws InterruptedException
{
	Thread.sleep(3000);
	BackToCorpus.click();
}

public void verifyDeletingAnnotations() throws InterruptedException

{
	Thread.sleep(5000);
	if(driver.findElements(By.xpath("//span[@class='full']")).size() != 0)
	{
		WebElement fullname=driver.findElement(By.xpath("//span[@class='full']"));
		System.out.println("Element is Present");
		Actions action= new Actions(driver);
		action.moveToElement(fullname).perform();
		action.contextClick().perform();
		Thread.sleep(5000);
		WebElement fullnamedeletion=driver.findElement(By.xpath("//*[@id='projectAnnotation']/li/a/span"));
		fullnamedeletion.click();
		Thread.sleep(3000);
		System.out.println("Test Case for Deleting the FullName Pass ");
		}else
		{
		System.out.println("FullName is Absent inside the document");
		}
	
	if(driver.findElements(By.xpath("//span[@class='emai']")).size() != 0)
	{
		WebElement emailid=driver.findElement(By.xpath("//span[@class='emai']"));
		System.out.println("Element is Present");
		Actions action= new Actions(driver);
		action.moveToElement(emailid).perform();
		action.contextClick().perform();
		Thread.sleep(3000);
		WebElement emailiddeletion=driver.findElement(By.xpath("//*[@id='projectAnnotation']/li/a/span"));
		emailiddeletion.click();
		Thread.sleep(2000);
		System.out.println("Test Case for Deleting the Email-Id Pass ");
		}else
		{
		System.out.println("Email-Id is Absent inside the document");
		}
	
	if(driver.findElements(By.xpath("//span[@class='tele']")).size() != 0)
	{
		WebElement telephoneno=driver.findElement(By.xpath("//span[@class='tele']"));
		System.out.println("Element is Present");
		Actions action= new Actions(driver);
		action.moveToElement(telephoneno).perform();
		action.contextClick().perform();
		Thread.sleep(3000);
		WebElement telephonenodeletion=driver.findElement(By.xpath("//*[@id='projectAnnotation']/li/a/span"));
		telephonenodeletion.click();
		Thread.sleep(2000);
		System.out.println("Test Case for Deleting the Telephone No Pass ");
		}else
		{
		System.out.println("Telephone is Absent inside the document");
		}
	
	if(driver.findElements(By.xpath("//span[@class='obje']")).size() != 0)
	{
		WebElement objective=driver.findElement(By.xpath("//span[@class='obje']"));
		System.out.println("Element is Present");
		Actions action= new Actions(driver);
		action.moveToElement(objective).perform();
		action.contextClick().perform();
		Thread.sleep(3000);
		WebElement objectivedeletion=driver.findElement(By.xpath("//*[@id='projectAnnotation']/li/a/span"));
		objectivedeletion.click();
		Thread.sleep(2000);
		System.out.println("Test Case for Deleting the Objective Pass ");
		}else
		{
		System.out.println("Objective is Absent inside the document");
		}
	
	if(driver.findElements(By.xpath("//span[@class='over']")).size() != 0)
	{
		WebElement overview=driver.findElement(By.xpath("//span[@class='over']"));
		System.out.println("Element is Present");
		Actions action= new Actions(driver);
		action.moveToElement(overview).perform();
		action.contextClick().perform();
		Thread.sleep(3000);
		WebElement overviewdeletion=driver.findElement(By.xpath("//*[@id='projectAnnotation']/li/a/span"));
		overviewdeletion.click();
		Thread.sleep(2000);
		System.out.println("Test Case for Deleting the Telephone No Pass ");
		}else
		{
		System.out.println("Telephone is Absent inside the document");
		}
	
	if(driver.findElements(By.xpath("//span[@class='tota']")).size() != 0)
	{
		WebElement totalexp=driver.findElement(By.xpath("//span[@class='tota']"));
		System.out.println("Element is Present");
		Actions action= new Actions(driver);
		action.moveToElement(totalexp).perform();
		action.contextClick().perform();
		Thread.sleep(3000);
		WebElement totalexpdeletion=driver.findElement(By.xpath("//*[@id='projectAnnotation']/li/a/span"));
		totalexpdeletion.click();
		Thread.sleep(2000);
		System.out.println("Test Case for Deleting the Total Exp Pass ");
		}else
		{
		System.out.println("Total Exp is Absent inside the document");
		}
	
	if(driver.findElements(By.xpath("//span[@class='skil']")).size() != 0)
	{
		WebElement skillset=driver.findElement(By.xpath("//span[@class='skil']"));
		System.out.println("Element is Present");
		Actions action= new Actions(driver);
		action.moveToElement(skillset).perform();
		action.contextClick().perform();
		Thread.sleep(3000);
		WebElement skillsetdeletion=driver.findElement(By.xpath("//*[@id='projectAnnotation']/li/a/span"));
		skillsetdeletion.click();
		Thread.sleep(2000);
		System.out.println("Test Case for Deleting the SkillSet Pass ");
		}else
		{
		System.out.println("SkillSet is Absent inside the document");
		}
	
	if(driver.findElements(By.xpath("//span[@class='addr']")).size() != 0)
	{
		WebElement address=driver.findElement(By.xpath("//span[@class='addr']"));
		System.out.println("Element is Present");
		Actions action= new Actions(driver);
		action.moveToElement(address).perform();
		action.contextClick().perform();
		Thread.sleep(3000);
		WebElement addressdeletion=driver.findElement(By.xpath("//*[@id='projectAnnotation']/li/a/span"));
		addressdeletion.click();
		Thread.sleep(2000);
		System.out.println("Test Case for Deleting the Address Pass ");
		}else
		{
		System.out.println("Address is Absent inside the document");
		
		}
	if(driver.findElements(By.xpath("//span[@class='foot']")).size() != 0)
	{
		WebElement footnote=driver.findElement(By.xpath("//span[@class='foot']"));
		System.out.println("Element is Present");
		Actions action= new Actions(driver);
		action.moveToElement(footnote).perform();
		action.contextClick().perform();
		Thread.sleep(3000);
		WebElement footnotedeletion=driver.findElement(By.xpath("//*[@id='projectAnnotation']/li/a/span"));
		footnotedeletion.click();
		Thread.sleep(2000);
		System.out.println("Test Case for Deleting the FootNote Pass ");
		}else
		{
		System.out.println("FootNote is Absent inside the document");
		}
	if(driver.findElements(By.xpath("//span[@class='awar']")).size() != 0)
	{
		WebElement award=driver.findElement(By.xpath("//span[@class='awar']"));
		System.out.println("Element is Present");
		Actions action= new Actions(driver);
		action.moveToElement(award).perform();
		action.contextClick().perform();
		Thread.sleep(3000);
		WebElement awarddeletion=driver.findElement(By.xpath("//*[@id='projectAnnotation']/li/a/span"));
		awarddeletion.click();
		Thread.sleep(2000);
		System.out.println("Test Case for Deleting the Award And Recognition Pass ");
		}else
		{
		System.out.println("Award and Recognition is Absent inside the document");
		}
	if(driver.findElements(By.xpath("//span[@class='cert']")).size() != 0)
	{
		WebElement certification=driver.findElement(By.xpath("//span[@class='cert']"));
		System.out.println("Element is Present");
		Actions action= new Actions(driver);
		action.moveToElement(certification).perform();
		action.contextClick().perform();
		Thread.sleep(3000);
		WebElement certificationdeletion=driver.findElement(By.xpath("//*[@id='projectAnnotation']/li/a/span"));
		certificationdeletion.click();
		Thread.sleep(2000);
		System.out.println("Test Case for Deleting the Certification Pass ");
		}else
		{
		System.out.println("Certification is Absent inside the document");
		}
	
	if(driver.findElements(By.xpath("//span[@class='educ']")).size() != 0)
	{
		WebElement education=driver.findElement(By.xpath("//span[@class='educ']"));
		System.out.println("Element is Present");
		Actions action= new Actions(driver);
		action.moveToElement(education).perform();
		action.contextClick().perform();
		Thread.sleep(3000);
		WebElement educationdeletion=driver.findElement(By.xpath("//*[@id='projectAnnotation']/li/a/span"));
		educationdeletion.click();
		Thread.sleep(2000);
		System.out.println("Test Case for Deleting the Education Pass ");
		}else
		{
		System.out.println("Education is Absent inside the document");
		}
	
	if(driver.findElements(By.xpath("//span[@class='Proj']")).size() != 0)
	{
		WebElement education=driver.findElement(By.xpath("//span[@class='Proj']"));
		System.out.println("Element is Present");
		Actions action= new Actions(driver);
		action.moveToElement(education).perform();
		action.contextClick().perform();
		Thread.sleep(3000);
		WebElement educationdeletion=driver.findElement(By.xpath("//*[@id='projectAnnotation']/li/a/span"));
		educationdeletion.click();
		Thread.sleep(2000);
		System.out.println("Test Case for Deleting the Project Pass ");
		}else
		{
		System.out.println("Project is Absent inside the document");
		}
	
	if(driver.findElements(By.xpath("//span[@class='comp']")).size() != 0)
	{
		WebElement education=driver.findElement(By.xpath("//span[@class='comp']"));
		System.out.println("Element is Present");
		Actions action= new Actions(driver);
		action.moveToElement(education).perform();
		action.contextClick().perform();
		Thread.sleep(3000);
		WebElement educationdeletion=driver.findElement(By.xpath("//*[@id='projectAnnotation']/li/a/span"));
		educationdeletion.click();
		Thread.sleep(2000);
		System.out.println("Test Case for Deleting the Company Exp Pass ");
		}else
		{
		System.out.println("Company Exp is Absent inside the document");
		}

	SaveAnnotations.click();
	Thread.sleep(2000);
	SaveAnnotationConfirmationPopUp.click();
	
}

public void verifySolrRedirectFromToBeAnnotatedTabResume() throws InterruptedException
{
	Thread.sleep(5000);
	MoveToPipeline.click();
	
}
public void verifyGoldClick() throws InterruptedException
{
	
	Thread.sleep(5000);
	GoldButton.click();
	
	
}
public void logoutClick() throws InterruptedException
{
	Thread.sleep(5000);
	Logout.click();
	
	
	
}


}
