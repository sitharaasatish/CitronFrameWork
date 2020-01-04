package com.testng.TestNG;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Product_Logic extends Product_TestCase {

	protected static Logger log = Logger.getLogger(Product_Logic.class);

	protected Product_Logic()  {
		super();
		// TODO Auto-generated constructor stub
	}

	public void expandingSlider() {
		if (driver.findElement(By.xpath("//div[@id='sidebar-essentials']")).isDisplayed()) {
			createNewList().click();

		} else {
			sliderExpandCollapse().click();

			System.out.println("Panel Expanded");
			createNewList().click();

		}

		System.out.println("Create Filter Form opened");

	}

	public void listNameTextFieldLogic() {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement listnameTextField = driver.findElement(By.xpath("//div[@class='row']/div/input"));
		listnameTextField = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='row']/div/input")));
		listnameTextField.sendKeys("Sithara");
		System.out.println("Entered List Name");

		listNameTextField().sendKeys(Keys.ENTER);
		log.info("Entered the form name and saved");

	}

	public void myListLogic() {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement myList = driver.findElement(By.xpath("//div[@id='myList']/ul"));
		myList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='myList']/ul")));
		log.info(myList());
		List<WebElement> myListTest = myList();
		for (WebElement allmylist : myListTest) {
			System.out.println("All My list " + allmylist.getText());
		}
		WebElement mylistdisplay = driver.findElement(By.xpath("//div[@id='myList']/ul"));
			//if (mylistdisplay.getText().contentEquals("Sithara")) {
				mouseClick(driver.findElement(By.xpath("//div[@id='myList']/ul//a[text()='Sithara']")));
				log.info("Mouse action performed");
				
				WebElement expandIcon = driver.findElement(By.xpath("//div[@id='myList']/ul//a[text()='Sithara']//following-sibling::div/span[@class='js-popover-container']/span"));
				expandIcon = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//div[@id='myList']/ul//a[text()='Sithara']//following-sibling::div/span[@class='js-popover-container']/span")));
				expandIcon.click();
				log.info("Expand icon clicked");
			//}
//				else {
//					driver.quit();
//					}
		}
		



	public void deleteOptionLogic() {

		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement delete = driver.findElement(By.xpath("//div[@class='popover-content']/ul/li[2]"));
		delete = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='popover-content']/ul/li[2]")));
		deleteOption().click();
		deleteAlertPopup();

		deleteYes().click();
	}

	

}
