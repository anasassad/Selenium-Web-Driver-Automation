package com.automation_school;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {

    private WebDriver driver ;
    private By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver){
        this.driver = driver ;
    }

    public void selectFromDropdown(String option){
        findDropdownElement().selectByVisibleText(option);
    }

    public String getSelectedOption(){
         List<WebElement> selectedElements = findDropdownElement().getAllSelectedOptions();
         return selectedElements.get(0).getText();
         //return selectedElements.stream().map(e-> e.getText()).collect(Collectors.toList());
    }

    // Helper method
    private Select findDropdownElement(){
        return new Select(driver.findElement(dropdown));
    }
}
