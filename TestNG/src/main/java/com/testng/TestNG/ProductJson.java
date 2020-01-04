package com.testng.TestNG;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProductJson extends PracticeBaseClass1

{
	LoginPage_TestCase login;
	Dashboard_Logic dashboard;
	Product_Logic product;


        ProductJson() {
                super();
        }

        @BeforeMethod
        public void setup() {
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

        @DataProvider(name = "product")
        public Object[][] passData() throws IOException, ParseException {

                return JsonReader.getJSONdata("C:\\JavaClass\\WS\\TestNG\\src\\main\\resources\\product.json",
                                "organization", 1);
//                File file = new File("C:\\JavaClass\\WS\\TestNG\\src\\main\\resources\\product.json");
//                file.exists();
        
        
        }
        
        

        // @Test(dataProvider = "organization")
        // public void userRegistration(String userId,String pwd, String confirmPwd)
        // throws Exception
        // {
        //

        @Test(dataProvider = "product")
        public void userRegistration(String userId) throws Exception {

//                DashboardPage.Handburgerclick();
//                DashboardPage.MouseHoverClick();
//                DashboardPage.MouseHoverClick_Product();
//                DashboardPage.AddProductlink_click();
//                DashboardPage.AddProductlink_List(userId);

        }
}