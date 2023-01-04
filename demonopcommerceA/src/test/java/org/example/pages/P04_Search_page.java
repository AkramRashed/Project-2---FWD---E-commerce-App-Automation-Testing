package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class P04_Search_page {
    WebDriver driver;

    public P04_Search_page(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public int productsList()
    {
        int size = this.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).size();
        return size;
    }

    public WebElement noProducts()
    {
        return this.driver.findElement(By.cssSelector("div[class=\"no-result\"]"));
    }

}
