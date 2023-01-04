package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P01_Register_page {
    WebDriver driver;

    public P01_Register_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement Navigate_to_RegisterPage() {
        return this.driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
    }

    public WebElement maleGender() {
        return this.driver.findElement(By.id("gender-male"));
    }

    public WebElement firstName() {
        return this.driver.findElement(By.id("FirstName"));
    }

    public WebElement lastName() {
        return this.driver.findElement(By.id("LastName"));
    }

    public WebElement birthDay() {
        return this.driver.findElement(By.name("DateOfBirthDay"));
    }

    public WebElement birthMonth() {
        return this.driver.findElement(By.name("DateOfBirthMonth"));
    }

    public WebElement birthYear() {
        return this.driver.findElement(By.name("DateOfBirthYear"));
    }

    public WebElement email() {
        return this.driver.findElement(By.id("Email"));
    }

    public WebElement companyName() {
        return this.driver.findElement(By.id("Company"));
    }

    public WebElement password() {
        return this.driver.findElement(By.id("Password"));
    }

    public WebElement confirmPassword() {
        return this.driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement registerB() {
        return this.driver.findElement(By.id("register-button"));
    }

    public WebElement successfulMsg() {
        return this.driver.findElement(By.xpath("//div[@class=\"result\"]"));
    }
}
