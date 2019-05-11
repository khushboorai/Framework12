package com.framework.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.pages.LoginPage;
import com.framework.utility.BrowserFactory;

public class  LoginTestCRM {
	 WebDriver driver;
   @BeforeTest
	public void setUp() 
	{
	driver = BrowserFactory.startAppl(driver, "chrome", "https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	}
	
	 @Test
	 public void loginPage() {
	LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
	loginpage.logintoGmail("babydollkhushi420@gmail.com", "khushi@123");
    }
	
	}

