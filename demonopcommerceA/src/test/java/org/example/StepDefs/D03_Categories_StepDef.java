package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P05_HomeSlider_page;
import org.example.pages.P03_Categories_page;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class D03_Categories_StepDef {

    P05_HomeSlider_page HomePage;
    P03_Categories_page category;
    String subCategoryName;

    public D03_Categories_StepDef()
    {
        this.HomePage = new P05_HomeSlider_page(Hooks.driver);
        this.category = new P03_Categories_page(Hooks.driver);
    }

    @When("user select category and subcategory")
    public void select_category() throws InterruptedException
    {
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(this.HomePage.computers()).perform();
        action.moveToElement(this.HomePage.computers()).perform();
        this.subCategoryName = this.HomePage.desktops().getText().toLowerCase();
        Thread.sleep(3000);
    }

    @And("user click on subcategory")
    public void user_clicks_subcategory()
    {
        this.HomePage.desktops().click();
    }

    @Then("user find relative product page")
    public void product_found()
    {
        Assert.assertEquals(this.category.categoryList().getText().toLowerCase(), this.subCategoryName, "subcategory");
    }

}
