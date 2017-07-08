package com.orangehrm.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserInit {

	static WebDriver driver;
	
	public static WebDriver initilizeBrowser(String browserName, String URL){
		if(browserName.equalsIgnoreCase("firefox")){
			driver =  new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("ie")){
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get(URL);
		return driver;
	}
}
