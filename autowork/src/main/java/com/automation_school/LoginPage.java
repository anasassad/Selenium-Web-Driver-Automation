package com.automation_school;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private By formauth = By.linkText("Form Authentication");
    private By username = By.id("username");
    private By password = By.id("password");
    private By login_button = By.cssSelector("#login button");
    private WebDriver driver ;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public String fillInForm(){

        driver.findElement(formauth).click();

        setCredentials(driver, username, password);

        driver.findElement(login_button).click();

        return driver.findElement(By.id("flash")).getText();
    }

    private void setCredentials(WebDriver driver,By username,By password){
        driver.findElement(username).sendKeys("tomsmith");
        driver.findElement(password).sendKeys("SuperSecretPassword!");
    }
}
