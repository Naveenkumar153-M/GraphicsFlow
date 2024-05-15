package com.pageContainer;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverClass {


    public static GfLogin lg;
    public static BaseClass baseClass;

public static WebDriver driver;
public static WebDriverWait wait;


public static void init() {
    // driver = new ChromeDriver();
    ChromeOptions options=new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        baseClass=new BaseClass(driver);
        // lg = new gfLogin(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));


} 

}
