package com.automation.test;

import com.automation.pages.AvailableTrainsPage;
import com.automation.pages.HomePage;
import com.automation.pages.LandingPage;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {

    LandingPage landingPage;
    HomePage homePage;
    AvailableTrainsPage availableTrainsPage;

    @BeforeMethod
    public void setUp(){
        ConfigReader.initConfig();
        DriverManager.createDriver();
        landingPage = new LandingPage();
        homePage = new HomePage();
        availableTrainsPage = new AvailableTrainsPage();
    }

    @AfterMethod
    public void cleanUp(){
//        DriverManager.getDriver().quit();
    }
}
