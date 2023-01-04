package org.example.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class P05_HomeSlider_page {
    WebDriver driver;

    public P05_HomeSlider_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement Navigate_to_LoginPage() {
        return this.driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
    }

    public WebElement Navigate_to_RegisterPage() {
        return this.driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
    }

    public WebElement search() {
        return this.driver.findElement(By.id("small-searchterms"));
    }

    public WebElement search_Button() {
        return this.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }

    public WebElement currency_symbol() {
        return this.driver.findElement(By.id("customerCurrency"));
    }

    public WebElement currencyEuro() {
        return this.driver.findElement(By.xpath("//option[@value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]"));
    }

    public WebElement twitter() {
        return this.driver.findElement(By.xpath("//a[@href=\"https://twitter.com/nopCommerce\"]"));
    }

    public WebElement rss() {
        return this.driver.findElement(By.xpath("//a[@href=\"/news/rss/1\"]"));
    }

    public WebElement slider(String sliderNum) {
        return this.driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])[" + sliderNum + "]"));
    }

    public WebElement wishList() {
        return this.driver.findElement(By.cssSelector("div[class=\"header-links\"] [href=\"/wishlist\"]"));
    }

    public List<WebElement> add_button() {
        return this.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));
    }

    public WebElement productPrices() {
        return this.driver.findElement(By.cssSelector("span[class=\"price actual-price\"]"));
    }

    public WebElement facebook() {
        return this.driver.findElement(By.xpath("//a[@href=\"http://www.facebook.com/nopCommerce\"]"));
    }

    public WebElement wishSuccessMsg() {
        return this.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }

    public WebElement closeB() {
        return this.driver.findElement(By.cssSelector("span[class=\"close\"]"));
    }

    public WebElement computers() {
        return this.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] [href=\"/computers\"]"));
    }

    public WebElement desktops() {
        return this.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] [href=\"/desktops\"]"));
    }

    public WebElement youtube() {
        return this.driver.findElement(By.xpath("//a[@href=\"http://www.youtube.com/user/nopCommerce\"]"));
    }

}
