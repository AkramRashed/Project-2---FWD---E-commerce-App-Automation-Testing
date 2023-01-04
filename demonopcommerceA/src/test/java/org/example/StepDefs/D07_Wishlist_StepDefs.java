package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P05_HomeSlider_page;
import org.example.pages.P07_Wishlist_page;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class D07_Wishlist_StepDefs {
    P05_HomeSlider_page homepage;
    P07_Wishlist_page wish;
    int num;

    public D07_Wishlist_StepDefs() {
    }

    @Given("user add item to wishlist")
    public void user_add_item_to_wishlist()
    {
        this.homepage = new P05_HomeSlider_page(Hooks.driver);
        this.wish = new P07_Wishlist_page(Hooks.driver);
        ((WebElement)this.homepage.add_button().get(2)).click();
    }

    @Then("wishlist success operation massage is visible")
    public void success_notification()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(this.homepage.wishSuccessMsg().isDisplayed(), "Success Message");
        String actual = this.homepage.wishSuccessMsg().getCssValue("background-color");
        String expected = "rgba(75, 176, 122, 1)";
        soft.assertEquals(actual, expected, "Message color");
        soft.assertAll();
    }

    @And("user can get the number of wishlist items added")
    public void items_increased()
    {
        String text = this.homepage.wishList().getText();
        text = text.replaceAll("[^0-9]", "");
        this.num = Integer.parseInt(text);
    }

    @Then("the number of wishlist increased")
    public void number_of_items_of_wishlist() throws InterruptedException
    {
        Assert.assertTrue(this.num > 0, "count of wishlist items");
    }

    @And("user can go to wishlist page")
    public void user_go_to_wishlist() throws InterruptedException
    {
        this.homepage.closeB().click();
        Thread.sleep(3000);
        this.homepage.wishList().click();
    }

    @Then("the number of items greater than zero in wishlist page")
    public void wishlist_Page_Assertion()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/wishlist"), "wishlist URL");
        int size = this.wish.wishListItems();
        soft.assertTrue(size > 0, "wishlist items");
        soft.assertAll();
    }

}
