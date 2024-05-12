package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class GfLogin extends BaseClass{


    
    public GfLogin(WebDriver driver) {
        super(driver);
    }

    static String email="naveenkumar.m+3452@inksoft.com";
    static String password = "Naveen@123";
    
    public static void main(String[]args){
        init();
        login(); 
        createAA();
        closeBrowser();  
    }

    public static void closeBrowser(){
        driver.close();
        driver.quit();
    }


    
    public static boolean login(){
        boolean blResult=false;
        driver.get("https://qa.graphicsflow.com/signin");
        WebElement gfLogo = driver.findElement(By.cssSelector("[src='/assets/images/logo-graphics-flow.svg']"));

        WebElement emailInputBox = driver.findElement(By.cssSelector("#email"));
        WebElement passwordInputBox = driver.findElement(By.cssSelector("#passwordInput"));
        WebElement signBtn = driver.findElement(By.cssSelector("#signInButton"));


        
        if(gfLogo.isDisplayed()){
            emailInputBox.click();
            emailInputBox.sendKeys(email);
            passwordInputBox.click();
            passwordInputBox.sendKeys(password);
            signBtn.click();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebElement gfSideBar = driver.findElement(By.cssSelector(".logo.graphics-flow"));
            waitForElement(gfSideBar);
            return gfSideBar.isDisplayed();
        }else{
            return blResult;
        }

        

    
    }
    public static boolean createAA(){
        boolean blResult=false;

        try {
            WebElement artaApprovalBtn = driver.findElement(By.cssSelector("#approvalsLink"));
            waitAndClick(artaApprovalBtn);
            Thread.sleep(4000);
            WebElement createBtn = driver.findElement(By.xpath("(//span[text()=' Create New ']/..)[2]"));
            waitAndClick(createBtn);
            WebElement spinner = driver.findElement(By.cssSelector("mat-spinner"));
            waitForAppearAndlDisappear(spinner);
            // waitForElement(spinner);
            // waitUntillDisappear(spinner);

            WebElement input=driver.findElement(By.cssSelector("gf-file-input input"));
            input.sendKeys("/Users/calibraintpvt/Documents/BDD_Java_Selnenium/bdd_java_selenium/src/main/java/TestData/TWEDAerwrewdeewd@4retrtferf_rferfr.png");
            WebElement uploadSpinner = driver.findElement(By.cssSelector("mat-spinner"));

            waitForAppearAndlDisappear(uploadSpinner);
            // waitForElement(uploadSpinner);
            // waitUntillDisappear(uploadSpinner);

            WebElement art = driver.findElement(By.cssSelector("gf-approval-detail-item"));
            waitForElement(art);
            return art.isDisplayed();

        } catch (Exception e) {
            e.printStackTrace();
            return blResult;
        }
       
        
        
    }
}

