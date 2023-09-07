package com.automation_school;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }


    public DropdownPage clickDropdown(){
        navigateTo("Dropdown");
        return new DropdownPage(driver);
    }
    public void navigateTo(String linkText){
        driver.findElement(By.linkText(linkText)).click();;
    }
}
