package com.framework.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	public static WebDriver startAppl(WebDriver driver, String browsername, String urlAppl) {
		
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
			driver= new ChromeDriver();
			
		}
		
		else if(browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if (browsername.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "./drivers//IEDriverServer.exe");
			driver= new InternetExplorerDriver();
		}
		else {
			System.out.println(" we do not foind any browser");
		}
		
		
		
		
		
		return driver;
	}

	
}
