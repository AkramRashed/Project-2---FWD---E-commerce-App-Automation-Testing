package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P05_HomeSlider_page;
import org.example.pages.P01_Register_page;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_Register_StepDef {
    P05_HomeSlider_page homepage;
    P01_Register_page register;

    public D01_Register_StepDef()
    {
        this.homepage = new P05_HomeSlider_page(Hooks.driver);
        this.register = new P01_Register_page(Hooks.driver);
    }

    @Given("user navigate to register page")
    public void register_page() {
        this.homepage.Navigate_to_RegisterPage().click();
    }

    @And("user select gender type")
    public void Gender() {
        this.register.maleGender().click();
    }

    @And("user enter valid data")
    public void user_enter_first_name()
    {
        this.register.firstName().sendKeys("Akram");
        this.register.lastName().sendKeys("Rashed");
        Select select = new Select(this.register.birthDay());
        select.selectByIndex(30);
        select = new Select(this.register.birthMonth());
        select.selectByVisibleText("March");
        select = new Select(this.register.birthYear());
        select.selectByValue("1993");
        this.register.email().sendKeys("akram_rashed5@yahoo.com");
        this.register.companyName().sendKeys("Udacity");
        this.register.password().sendKeys("Udacity@1112");
        this.register.confirmPassword().sendKeys("Udacity@1112");
    }

    @Then("user click on register button")
    public void register_button() {
        this.register.registerB().click();
    }

    @Then("success message is displayed")
    public void register_successfully()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(this.register.successfulMsg().isDisplayed(), "Success Message");
        String actual = this.register.successfulMsg().getCssValue("color");
        String expected = "rgba(76, 177, 124, 1)";
        soft.assertEquals(actual, expected, "color is correct");
        soft.assertAll();
    }
}
