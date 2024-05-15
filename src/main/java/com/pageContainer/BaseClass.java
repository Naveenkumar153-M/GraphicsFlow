package com.pageContainer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BaseClass extends DriverClass{
   
    public static GfLogin gfLogin;
    public BaseClass(WebDriver driver){
        driver=this.driver;
    }
    public static WebElement waitForElement(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }
    public static WebElement waitForElementToBeClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

    public static void waitAndClick(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public static void waitUntillDisappear(WebElement element){
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public static void waitForAppearAndlDisappear(WebElement element){
        waitForElement(element);
        waitUntillDisappear(element);
    }

    
}
