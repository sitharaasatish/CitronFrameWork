package com.testng.TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class DashboardTestNG extends PracticeBaseClass1 {

	public DashboardTestNG() {
		super();
		// TODO Auto-generated constructor stub
	}

	LoginPage_TestCase login;
	Dashboard_Logic dashboard;

	@BeforeMethod
	public void setup() 
	{
		Intialization();
		login = new LoginPage_TestCase();
		dashboard = new Dashboard_Logic();
		login.username();
		log.info("Entered Username");
		login.password();
		log.info("Entered Password");
		login.signin();
		log.info("Clicked on Signin button");
	}
	
	@Test(priority=1)
	public void dashboard()
	{
		dashboard.hamburgerLogic();
		dashboard.hamburgerListLogic();
		dashboard.mouseActionToSales();
		dashboard.salesSubOptionLogic();
		dashboard.productNavigationLogic();

	}
	
	@Test(priority=1)
	public void dashboardTitle() {
		String dashboardTitle = validateTitle();
		System.out.println(dashboardTitle);
		Assert.assertEquals("Not a Dashboard Page","Dashboard",dashboardTitle);
		
		
		
	}
	
}
