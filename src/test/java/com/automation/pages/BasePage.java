package com.automation.pages;

import com.automation.utils.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    WebDriverWait wait;
    JavascriptExecutor js;

    public BasePage(){
        PageFactory.initElements(DriverManager.getDriver(), this);
        wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        js = (JavascriptExecutor) DriverManager.getDriver();
    }
}
