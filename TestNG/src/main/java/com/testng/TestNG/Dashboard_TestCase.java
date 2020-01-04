package com.testng.TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Dashboard_TestCase extends PracticeBaseClass1 {

	public Dashboard_TestCase()  {
		super();

	}

	public WebElement hamburger() {
		return driver.findElement(By.xpath(p2.getProperty("hamburgericon")));
	}

	public List<WebElement> hamburgerList() {
		List<WebElement> hamburgerList = driver.findElements(By.xpath(p2.getProperty("hamburgericonList")));
		return hamburgerList;
	}

	public WebElement moveToSales() {
		WebElement moveToSales = driver.findElement(By.xpath(p2.getProperty("moveToSales")));
		return moveToSales;
	}

	public List<WebElement> salesSubOption() {
		List<WebElement> salesSubOption = driver.findElements(By.xpath(p2.getProperty("salesSubOption")));
		return salesSubOption;
	}

	public WebElement productNavigation() {
		return driver.findElement(By.xpath(p2.getProperty("productNavigation")));
	}

}
