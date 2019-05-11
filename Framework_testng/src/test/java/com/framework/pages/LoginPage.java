package com.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	public  LoginPage(WebDriver ldriver) {
		//this is a commit from khushi
		this.driver=ldriver;
	}
   @FindBy(xpath="//input[@type='email']") WebElement uname;
   @FindBy(className="RveJvd snByac") WebElement nextbtn;
   @FindBy(name="password") WebElement pass;
   @FindBy(className="RveJvd snByac") WebElement nextbtn1;
   
   public void logintoGmail(String unamegmail,String passgmail) {
	   try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		
	}
	   uname.sendKeys("babydollkhushi420@gmail.com");
	   nextbtn.click();
	   pass.sendKeys("khushi@123");
	   nextbtn1.click();
   }
}
