package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P05_HomeSlider_page;
import org.example.pages.P02_Login_page;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;


public class D02_Login_StepDefs {

    P05_HomeSlider_page HomePage;
    P02_Login_page login;

    public D02_Login_StepDefs() {
        this.HomePage = new P05_HomeSlider_page(Hooks.driver);
        this.login = new P02_Login_page(Hooks.driver);
    }

    @When("user navigate to login page")
    public void user_navigate_to_login_page() {
        this.HomePage.Navigate_to_LoginPage().click();
    }

    @And("user enter \"(.*)\" and \"(.*)\"$")
    public void vaild_data(String email, String password) throws InterruptedException {
        this.login.LoginSteps(email, password);
        Thread.sleep(3000);
    }

    @Then("user click on login button")
    public void click_button()
    {
        this.login.passwordE().sendKeys(Keys.ENTER);
    }

    @And("user could login successfully and go to home page")
    public void login_successfully()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/", "URL login");
        Hooks.driver.findElement(By.cssSelector("a[class=\"ico-account\"]")).isDisplayed();
        soft.assertTrue(this.login.myAccount().isDisplayed(), "My Account");
        soft.assertAll();
    }

    @And("user could not login successfully and go to home page")
    public void unable_to_login()
    {
        SoftAssert soft = new SoftAssert();
        this.login.wrongMsg().isDisplayed();
        String actual = this.login.wrongMsg().getText();
        soft.assertEquals(actual, "Login was unsuccessful. Please correct the errors and try again.\nThe credentials provided are incorrect", "Wrong Message");
        actual = this.login.wrongMsg().getCssValue("color");
        String expected = "rgba(228, 67, 75, 1)";
        soft.assertEquals(actual, expected, "color");
        soft.assertAll();
    }

}
