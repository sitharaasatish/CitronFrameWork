package com.testng.TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductTestNG extends PracticeBaseClass1 {
	
	public ProductTestNG() {
		super();
	}
	
	LoginPage_TestCase login;
	Dashboard_Logic dashboard;
	Product_Logic product;

	@BeforeMethod
	public void setup() 
	{
		Intialization();
		login = new LoginPage_TestCase();
		dashboard = new Dashboard_Logic();
		product = new Product_Logic();
		login.username();
		login.password();
		login.signin();
		dashboard.hamburgerLogic();
		dashboard.hamburgerListLogic();
		dashboard.mouseActionToSales();
		dashboard.salesSubOptionLogic();
		dashboard.productNavigationLogic();
	}
	
	@Test
	public void Product()
	{
		product.expandingSlider();
		//product.listNameTextFieldLogic();
		//product.myListLogic();
		//product.deleteOptionLogic();
	}
	

}
