package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//p-autocomplete[@id=\"origin\"]//input")
    WebElement fromInput;

    @FindBy(xpath = "(//span[@class=\"ng-star-inserted\"])[1]")
    WebElement selectFirstFrom;

    @FindBy(xpath = "//p-autocomplete[@id=\"destination\"]//input")
    WebElement toInput;

    @FindBy(xpath = "(//span[@class=\"ng-star-inserted\"])[1]")
    WebElement selectFirstTo;

    @FindBy(xpath = "//p-calendar[@id=\"jDate\"]//input")
    WebElement dateInput;

    @FindBy(xpath = "//a[@class=\"ui-state-default ng-tns-c58-10 ng-star-inserted\" and text()=\"8\"]")
    WebElement selectDate;

    @FindBy(xpath = "//p-dropdown[@id=\"journeyQuota\"]")
    WebElement journeyQuotaInput;

    @FindBy(xpath = "//span[text()=\"TATKAL\"]")
    WebElement tatkalBooking;

    @FindBy(xpath = "//button[@class=\"search_btn train_Search\" and text()=\"Search\"]")
    WebElement searchBtn;


    public void fillDetails() throws InterruptedException {
        fromInput.sendKeys(ConfigReader.getConfigValue("station.from"));
        Thread.sleep(1000);
        selectFirstFrom.click();
        toInput.sendKeys(ConfigReader.getConfigValue("station.to"));
        Thread.sleep(1000);
        selectFirstTo.click();
        dateInput.click();
        Thread.sleep(1000);
        selectDate.click();
        journeyQuotaInput.click();
        Thread.sleep(1000);
        tatkalBooking.click();
    }

    public void clickOnSearchBtn() {
        js.executeScript("arguments[0].click();", searchBtn);
//        searchBtn.click();
    }

    public boolean isHomePageDisplayed() {
        return searchBtn.isDisplayed();
    }
}
