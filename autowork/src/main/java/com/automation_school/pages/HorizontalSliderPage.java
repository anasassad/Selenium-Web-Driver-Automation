package com.automation_school.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSliderPage {
    private WebDriver driver ;
    private By sliderContainer = By.className("sliderContainer");
    private By resultText = By.id("range");

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver ;
    }

    public void tapSlider(){
        focusOnSlider();
        Actions actions = new Actions(driver);
        actions
            .sendKeys(Keys.ARROW_RIGHT)
            .sendKeys(Keys.ARROW_RIGHT)
            .sendKeys(Keys.ARROW_RIGHT)
            .build()
            .perform();
    }

    private void focusOnSlider(){
        driver.findElement(sliderContainer).findElement(By.tagName("input")).click();
    }

    public String getResult(){
        return driver.findElement(resultText).getText();
    }
}
