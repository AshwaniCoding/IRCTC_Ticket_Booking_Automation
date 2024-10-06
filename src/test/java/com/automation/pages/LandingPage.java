package com.automation.pages;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage{

    @FindBy(xpath = "//a[@class=\"search_btn loginText ng-star-inserted\"]")
    WebElement loginBtn;

    @FindBy(xpath = "//input[@placeholder=\"User Name\"]")
    WebElement usernameInput;

    @FindBy(xpath = "//input[@placeholder=\"Password\"]")
    WebElement passwordInput;

    @FindBy(xpath = "//input[@id=\"captcha\"]")
    WebElement captchaInput;

    @FindBy(xpath = "//button[@class=\"search_btn train_Search\" and text()=\"SIGN IN\"]")
    WebElement signInBtn;

    public void clickOnLoginBtn(){
        loginBtn.click();
    }

    public void doLogin(String username, String password) throws InterruptedException {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        captchaInput.click();
        Thread.sleep(10000);
        signInBtn.click();
    }

    public void openWebsite(){
        DriverManager.getDriver().get(ConfigReader.getConfigValue("application.url"));
    }

    public boolean isLoginPageDisplayed() {
        return usernameInput.isDisplayed();
    }
}
