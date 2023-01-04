package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P05_HomeSlider_page;
import org.example.pages.P04_Search_page;
import org.testng.asserts.SoftAssert;


public class D04_Search_StepDefs {
    P05_HomeSlider_page HomePage;
    P04_Search_page search;

    public D04_Search_StepDefs()
    {
        this.HomePage = new P05_HomeSlider_page(Hooks.driver);
        this.search = new P04_Search_page(Hooks.driver);
    }

    @Given("user clicks on search field")
    public void search_field()
    {
        this.HomePage.search().click();
    }

    @When("user search for product name like \"(.*)\"$")
    public void search_for_product(String search)
    {
        this.HomePage.search().sendKeys(search);
    }

    @And("user click on search Button")
    public void search_Button()
    {
        this.HomePage.search_Button().click();
    }

    @Then("user could search successfully and go to search page")
    public void search_successfully()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q=Nokia"), "search URL");
        int size = this.search.productsList();
        soft.assertTrue(size > 0, "Search Result");
        soft.assertAll();
    }

    @Then("user could search successfully with SKU code")
    public void successfully_with_SKU_code()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q=AP_MBP_13"), "URL after search");
        int size = this.search.productsList();
        soft.assertTrue(size > 0, "Search Result");
        soft.assertAll();
    }

    @Then("user could not search for the product")
    public void unable_to_search()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(this.search.noProducts().isDisplayed(), "No products");
    }

}
