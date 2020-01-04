package com.testng.TestNG;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestNG extends PracticeBaseClass1 {
	protected static Logger log = Logger.getLogger(LoginTestNG.class);
  public LoginTestNG() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
  
  LoginPage_TestCase login;
@BeforeMethod
public void setup() 
{
	Intialization();
	login = new LoginPage_TestCase(); 
}
@Test
 public void test1() {
		login.username();
	log.info("Entered Username");
	login.password();
	log.info("Entered Password");
	login.signin();
	log.info("Clicked on Signin button");
	//driver.quit();
  }
}
