package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class P07_Wishlist_page {
    WebDriver driver;

    public P07_Wishlist_page(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public int wishListItems()
    {
        int size = this.driver.findElements(By.cssSelector("div[class=\"wishlist-content\"]")).size();
        return size;
    }

}
