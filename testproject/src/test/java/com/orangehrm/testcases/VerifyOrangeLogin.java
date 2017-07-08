/**
 * 
 */
package com.orangehrm.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.orangehrm.pagefactory.LoginPanelPage;
import com.orangehrm.utilities.BrowserInit;

/**
 * @author MANGESH
 *
 */
public class VerifyOrangeLogin {
	
	@Test
	public void verifyValidLogin(){
		WebDriver driver;
		driver = BrowserInit.initilizeBrowser("firefox",
				"http://localhost/orangehrm-3.3.3/orangehrm-3.3.3/symfony/web/index.php/auth/login");
		
		LoginPanelPage loginPanelPage = PageFactory.initElements(driver, LoginPanelPage.class);
		loginPanelPage.typeUsername("mangeshadmin");
		loginPanelPage.typePassword("mangeshadmin");
		loginPanelPage.clickLogin();
		System.out.println("Login Successful");
	}

}
