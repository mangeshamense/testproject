/**
 * 
 */
package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author MANGESH
 *
 */
public class LoginPage {

WebDriver driver;
	
	By userlogin = By.id("txtUsername");
	By password = By.name("txtPassword");
	By loginButton = By.id("btnLogin");
	
	public LoginPage(WebDriver driver){
		this.driver=driver;		
	}
	
	public void typeUserlogin(String username){
		driver.findElement(userlogin).sendKeys(username);
	}
	
	public void typePassword(String pass){
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickLoginButton(){
		driver.findElement(loginButton).click();
	}
}
