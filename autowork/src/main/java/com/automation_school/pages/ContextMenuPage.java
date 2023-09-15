package com.automation_school.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver ;
    private By contextRect = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public void rightClickInContextRect(){
        Actions actions = new Actions(driver);

        actions.contextClick(driver.findElement(contextRect)).perform();
    }

    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }

    public String getAlertBodyText(){
        return driver.switchTo().alert().getText();
    }
}
