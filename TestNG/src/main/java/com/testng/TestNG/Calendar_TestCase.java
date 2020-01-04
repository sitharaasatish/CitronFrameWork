package com.testng.TestNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Calendar_TestCase extends PracticeBaseClass1 {

	protected Calendar_TestCase() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebElement invalidCalendar() {
		return driver.findElement(By.xpath("//div[text()='Please enter the correct date']"));

	}
	
	public WebElement addForm() {
		return driver.findElement(By.xpath("//div/div/ul/li[1]/button[1]"));
	}
	
	public WebElement  calendarClearField() {
		return driver.findElement(By.xpath("//tr[2]/td[4]/div/input"));
	}
	
	public WebElement openDatePicker() {
		return driver.findElement(By.xpath("//tr[2]/td[4]/div/span[1][@class='input-group-addon']"));
	}
	
	public WebElement calendarMonthText() {
		return driver
				.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']"));
		
	}
	
	public WebElement calendarPreviousbutton() {
		return driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='prev']"));
	}
}
