/**
 * 
 */
package com.orangehrm.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author MANGESH
 *
 */
public class LoginPanelPage {
	
	WebDriver driver;

	@FindBy(id= "txtUsername")
	@CacheLookup
	WebElement username;
	
	@FindBy(how=How.ID, using = "txtPassword")
	@CacheLookup
	WebElement password;
	
	@FindBy (how=How.NAME, using = "Submit")
	WebElement loginBtn;
	
	
	public LoginPanelPage (WebDriver driver){
		this.driver = driver;
	}
	public void typeUsername(String uname){
		username.clear();
		username.sendKeys(uname);
	}
	
	public void typePassword(String pwd){
		password.clear();
		password.sendKeys(pwd);
		
	}
	
	public void clickLogin(){
		loginBtn.click();
	}
}
