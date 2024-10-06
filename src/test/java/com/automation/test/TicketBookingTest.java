package com.automation.test;

import com.automation.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TicketBookingTest extends BaseTest{

    @Test
    public void verifyTicketBooking() throws InterruptedException {

        landingPage.openWebsite();

        landingPage.clickOnLoginBtn();

//        Assert.assertTrue(landingPage.isLoginPageDisplayed());
        landingPage.doLogin(ConfigReader.getConfigValue("login.username"), ConfigReader.getConfigValue("login.password"));

        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.fillDetails();
        homePage.clickOnSearchBtn();

        Assert.assertTrue(availableTrainsPage.isAvailableTrainsPageDisplayed());
        availableTrainsPage.clickOn3A();
        availableTrainsPage.clickOnDate();
        availableTrainsPage.clickOnBookNowBtn();

        if(availableTrainsPage.confirmationBoxIsDisplayed()){
            availableTrainsPage.clickOnYesBtn();
        }

    }

}
