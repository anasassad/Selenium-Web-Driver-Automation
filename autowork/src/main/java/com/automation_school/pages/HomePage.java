package com.automation_school.pages;

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

    public HoversPage clickHoversPage(){
        navigateTo("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPressesPage(){
        navigateTo("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSliderPage(){
        navigateTo("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public AlertsPage clickAlertsPage(){
        navigateTo("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUploadPage clickFileUploadPage(){
        navigateTo("File Upload");
        return new FileUploadPage(driver);
    }

    public ContextMenuPage clickContextMenuPage(){
        navigateTo("Context Menu");
        return new ContextMenuPage(driver);
    }

    private void navigateTo(String linkText){
        driver.findElement(By.linkText(linkText)).click();;
    }
}
