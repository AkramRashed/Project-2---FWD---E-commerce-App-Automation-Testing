package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class P02_Login_page {

    WebDriver driver;

    public P02_Login_page(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement emailE()
    {
        return this.driver.findElement(By.id("Email"));
    }

    public WebElement passwordE()
    {
        return this.driver.findElement(By.id("Password"));
    }

    public void LoginSteps(String email, String password)
    {
        this.emailE().clear();
        this.passwordE().clear();
        this.emailE().sendKeys(email);
        this.passwordE().sendKeys(password);
    }

    public WebElement myAccount()
    {
        return this.driver.findElement(By.cssSelector("a[class=\"ico-account\"]"));
    }

    public WebElement wrongMsg()
    {
        return this.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
    }
}


