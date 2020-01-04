package com.testng.TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalendarTestNG extends PracticeBaseClass1 {
	
	public CalendarTestNG() {
		super();
	}
	
	LoginPage_TestCase login;
	Dashboard_Logic dashboard;
	Product_Logic product;
	Calender calendar;

	@BeforeMethod
	public void setup() 
	{
		Intialization();
		login = new LoginPage_TestCase();
		dashboard = new Dashboard_Logic();
		product = new Product_Logic();
		calendar = new Calender();
		login.username();
		login.password();
		login.signin();
		dashboard.hamburgerLogic();
		dashboard.hamburgerListLogic();
		dashboard.mouseActionToSales();
		dashboard.salesSubOptionLogic();
		dashboard.productNavigationLogic();
		//product.expandingSlider();
		calendar.addForm().click();
		
	}
	
	@Test(priority=1)
	public void calendarInvalid()
	{
		
//		calendarLogic.pageTitle();
		calendar.invalidTextDateEntry();
		calendar.invalidInputAlert();
		driver.quit();
	}
	
	@Test(priority=2)
	public void calendarValid()
	{
		
		calendar.selectPreviousDate();
		calendar.selectRequiredMonthandDate();
		driver.quit();
	}
	
}
