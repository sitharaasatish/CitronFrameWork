package com.testng.TestNG;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Calender extends Calendar_TestCase {
	//private static final int String = 0;
	Calender()  {
		super();
		// TODO Auto-generated constructor stub
	}
	protected static Logger log = Logger.getLogger(Calender.class);
	
	
		public String getDateForDays(int days) {
			SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
			Date date = new Date();
			Calendar calendar = Calendar.getInstance();
			calendar.add(calendar.DATE, days);
			date = calendar.getTime();
			String format1 = dateformat.format(date);
			String datedigit = format1.substring(8, 10);
			return datedigit;
		}

	

	
	
//	public void pageTitle() {
//		validateTitle("Products");
//		log.info("Page title Validated");
//	}

	public void invalidTextDateEntry() {
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-dd");
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.add(calendar.DATE, 2);
		date = calendar.getTime();
		String format = dateformat.format(date);
		System.out.println("date " + format);
		calendarClearField().sendKeys(format);
		log.info("Entered Invalid Date Format");
	}

	public void invalidInputAlert() {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement errorFormat = invalidCalendar();
		errorFormat = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[text()='Please enter the correct date']")));
		if (errorFormat.isDisplayed()) {
			System.out.println("Error in Format " + errorFormat.getText());
			log.info("Format Alert message is displayed");
		}
	}

	public void selectPreviousDate() {
		calendarClearField().clear();
		openDatePicker().click();
		Calender ref1 = new Calender();
		String dateValue1 = ref1.getDateForDays(-2);
		String formattedDate = dateValue1.substring(1, 2);

		driver.findElement(
				By.xpath("//div/div[1][@class='datepicker-days']/table/tbody//td[text()='" + formattedDate + "']"))
				.click();
		log.info("2 days pervious date selected from present date");
	}

	public void selectRequiredMonthandDate() {
		calendarClearField().clear();
		WebElement selectMonth = calendarMonthText();
		String monthName = selectMonth.getText();
		if (!monthName.contentEquals("May 2019")) {
			do {
				calendarPreviousbutton().click();
			} while (!calendarMonthText().getText().contentEquals("May 2019"));
		}
		log.info("Selected required month");
		Calender ref2 = new Calender();
		monthName = ref2.getDateForDays(-2);
		String selectMonthDate = monthName.substring(1, 2);
		driver.findElement(
				By.xpath("//div/div[1][@class='datepicker-days']/table/tbody//td[text()='" + selectMonthDate + "']"))
				.click();
		log.info("Selected required date");
	}
	
	
	

	public static void main(String[] args) throws IOException {
		
		Calender calendarLogic = new Calender();
		Intialization();
//		calendarLogic.loginmethod();
//		calendarLogic.hamburgerLogic();
//		calendarLogic.hamburgerListLogic();
//		calendarLogic.mouseActionToSales();
//		calendarLogic.salesSubOptionLogic();
//		calendarLogic.productNavigationLogic();
//		calendarLogic.expandingSlider();
//		calendarLogic.listNameTextFieldLogic();
//		calendarLogic.myListLogic();
//		calendarLogic.deleteOptionLogic();
		
		calendarLogic.addForm().click();
//		calendarLogic.pageTitle();
		calendarLogic.invalidTextDateEntry();
		calendarLogic.invalidInputAlert();
		calendarLogic.selectPreviousDate();
		calendarLogic.selectRequiredMonthandDate();
		driver.quit();
		
		
	}
}


