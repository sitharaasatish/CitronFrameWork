package com.testng.TestNG;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Dashboard_Logic extends Dashboard_TestCase {

	public Dashboard_Logic()  {
		super();

	}

	public void hamburgerLogic() {
		hamburger().click();

	}

	public void hamburgerListLogic() {

		for (int i = 0; i < hamburgerList().size(); i++) {
			System.out.println("Hamburger List Options " + hamburgerList().get(i).getText());
		}
	}

	public void mouseActionToSales() {
		try {
			mouseClick(moveToSales());
		}

		catch (Exception e) {
			System.out.println("Unable to perform mouse action");
			driver.quit();
		}

	}

	public void salesSubOptionLogic() {
		for (WebElement optionsName : salesSubOption()) {
			System.out.println("Sub Sale Options " + optionsName.getText());
		}
	}

	public void productNavigationLogic() {
		try {
			productNavigation().click();
			System.out.println("Navigated to Product option");
		} catch (Exception e) {
			driver.quit();
		}
	}

}
