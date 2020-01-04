package com.testng.TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.sun.istack.internal.logging.Logger;

import junit.framework.Assert;

public class PracticeBaseClass1 {
	protected static Logger log = Logger.getLogger(PracticeBaseClass1.class);
	public static WebDriver driver;
	public static Properties p1;
	public static Properties p2;
	//public static  WebDriverWait wait;
	
	public PracticeBaseClass1()  {
		p1 = new Properties();
		try {
			FileInputStream fis1 = new FileInputStream("C:\\JavaClass\\WS\\TestNG\\src\\main\\resources\\loginPractice.properties");
			p1.load(fis1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

		p2 = new Properties();
		try {
		FileInputStream fis2 = new FileInputStream("C:\\JavaClass\\WS\\TestNG\\src\\main\\resources\\xpathPractice.properties");
		p2.load(fis2);

	}catch(IOException e)
		{
		e.printStackTrace();
		}
	}

	public static void Intialization() {
//		String BrowerName = p1.getProperty("browser");
//		if (BrowerName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Java Libraries\\Selenium\\New folder\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("incognito");
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		driver = new ChromeDriver(options);
		driver.get(p1.getProperty("url"));

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//wait = new WebDriverWait(driver,30);


	}
	
	
		
	public void mouseClick(WebElement element) {
	Actions action = new Actions(driver);
	action.moveToElement(element).click().build().perform();
			
		}
	
	
    public String  validateTitle() {
	return  driver.getTitle();
		 //Assert.assertEquals(expectedTitle, Title);
		
		 
	}
	
	
	
		
	}
	

