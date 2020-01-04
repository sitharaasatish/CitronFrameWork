package com.testng.TestNG;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginPage_TestCase extends PracticeBaseClass1 {
	protected static Logger log = Logger.getLogger(LoginPage_TestCase.class);

	public LoginPage_TestCase() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public WebElement username() {
		WebElement username = driver.findElement(By.xpath(p2.getProperty("usernametextfield")));
		username.sendKeys(p1.getProperty("username"));
		return username;
	}

	public WebElement password() {
		WebElement password = driver.findElement(By.xpath(p2.getProperty("passwordtextfield")));
		password.sendKeys(p1.getProperty("password"));
		return password;
	}

	public WebElement signin() {
		WebElement signin = driver.findElement(By.xpath(p2.getProperty("signinbutton")));
		signin.click();
		return signin;

	}

//	public static void main(String[] args) throws IOException {
//
//		LoginPage_TestCase login = new LoginPage_TestCase();
//		PracticeBaseClass1.Intialization();
//		login.username();
//		log.info("Entered Username");
//		login.password();
//		log.info("Entered Password");
//		login.signin();
//		log.info("Clicked on Signin button");
//		driver.quit();
//
//	}

}
