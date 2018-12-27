package com.rqanrs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rqanrs.qa.base.Testbase;

public class Loginpage extends Testbase {
	
	//Page Factory -OR
	@FindBy(id="login-username")
	WebElement username;
    
	@FindBy(id="login-password")
	WebElement password;
	
	@FindBy(id="loginBtn")
	public
	WebElement loginbtn;
	
	//initializing the pageobject
	public Loginpage()
	{
		PageFactory.initElements(driver,this);
		
		}
	//Actions
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public ManageJobsPage login(String Username,String Password)
	{
		username.sendKeys(Username);
		password.sendKeys(Password);
		loginbtn.click();
		
		return new ManageJobsPage();
		
		
	}
	
}
