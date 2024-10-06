package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AvailableTrainsPage extends BasePage{

    @FindBy(xpath = "(//div[text()=\" Refresh \"])[2]")
    WebElement refreshBtn;

    @FindBy(xpath = "//strong[text()=\"Mon, 07 Oct\"]")
    WebElement selectDateBtn;

    @FindBy(xpath = "//button[@class=\"btnDefault train_Search ng-star-inserted\"]")
    WebElement bookNowBtn;

    @FindBy(xpath = "//div[@class=\"ng-trigger ng-trigger-animation ng-tns-c56-17 ui-dialog ui-confirmdialog ui-widget ui-widget-content ui-corner-all ui-shadow ng-star-inserted\"]")
    WebElement confirmationDialog;

    @FindBy(xpath = "//span[text()=\"Yes\"]")
    WebElement yesBtn;

    public void clickOn3A() {
        refreshBtn.click();
    }

    public void clickOnDate() {
        selectDateBtn.click();
    }

    public void clickOnBookNowBtn() {
        bookNowBtn.click();
    }

    public void clickOnYesBtn() {
        yesBtn.click();
    }

    public boolean confirmationBoxIsDisplayed() {
        return confirmationDialog.isDisplayed();
    }

    public boolean isAvailableTrainsPageDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        return refreshBtn.isDisplayed();
    }
}
