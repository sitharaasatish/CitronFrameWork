package com.testng.TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Product_TestCase extends PracticeBaseClass1 {

	protected Product_TestCase()  {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public WebElement sliderExpandCollapse()
	{
		return driver.findElement(By.xpath("//div[@title='Left Panel Show/Hide']"));
	}
	
	public WebElement createNewList()
	{
	return	driver.findElement(By.xpath("//button[@id='createFilter']"));
	}
	
	public WebElement listNameTextField()
	{
	return	driver.findElement(By.xpath("//div[@class='row']/div/input"));
	}
	
	public List<WebElement> myList()
	{
		    List<WebElement> myList = driver.findElements(By.xpath("//div[@id='myList']/ul"));
		    return myList;
		  
	}
	
		public WebElement deleteOption()
		{
		return driver.findElement(By.xpath("//div[@class='popover-content']/ul/li[2]"));
		}
		
		public WebElement deleteAlertPopup()
		{
			WebElement alertMessage = driver.findElement(By.xpath("//div[@class='modal-content']/div[1]/div"));
			System.out.println(alertMessage.getText());
			return alertMessage;
		}
		
		public WebElement deleteYes()
		{
			return driver.findElement(By.xpath("//div[@class='modal-content']/div[2]/button[2]"));
		}

}
