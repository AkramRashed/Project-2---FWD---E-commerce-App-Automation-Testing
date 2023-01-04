package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class P03_Categories_page {
    WebDriver driver;

    public P03_Categories_page(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement categoryList()
    {
        return this.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
    }

}
