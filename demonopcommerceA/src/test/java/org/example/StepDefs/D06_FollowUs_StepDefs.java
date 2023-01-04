package org.example.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import java.util.ArrayList;
import org.example.pages.P05_HomeSlider_page;
import org.testng.Assert;


public class D06_FollowUs_StepDefs {
    P05_HomeSlider_page HomePage;

    public D06_FollowUs_StepDefs()
    {
        this.HomePage = new P05_HomeSlider_page(Hooks.driver);
    }

    @Given("user opens facebook link")
    public void user_opens_facebook()
    {
        this.HomePage.facebook().click();
    }

    @Then("^\"([^\"]*)\" is opened in new tab$")
    public void opens_new_tab(String linkType) throws InterruptedException {
        Thread.sleep(3000);
        ArrayList<String> Tabs = new ArrayList(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window((String)Tabs.get(1));
        byte var4 = -1;
        switch(linkType.hashCode())
        {
            case -906745036:
                if (linkType.equals("twitter-Link")) {
                    var4 = 1;
                }
                break;
            case -863097163:
                if (linkType.equals("rss-Link"))
                {
                    var4 = 2;
                }
                break;
            case 1573680833:
                if (linkType.equals("facebook-Link"))
                {
                    var4 = 0;
                }
                break;
            case 1874303108:
                if (linkType.equals("youtube-Link"))
                {
                    var4 = 3;
                }
        }

        switch(var4)
        {
            case 0:
                Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://www.facebook.com/nopCommerce", "facebook link");
                break;
            case 1:
                Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://twitter.com/nopCommerce", "twitter link");
                break;
            case 2:
                Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/new-online-store-is-open", "rss link");
                break;
            case 3:
                Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://www.youtube.com/user/nopCommerce", "youtube link");
        }

        Hooks.driver.close();
        Hooks.driver.switchTo().window((String)Tabs.get(0));
    }

    @Given("user opens twitter link")
    public void user_opens_twitter()
    {
        this.HomePage = new P05_HomeSlider_page(Hooks.driver);
        this.HomePage.twitter().click();
    }

    @Given("user opens rss link")
    public void user_opens_rss()
    {
        this.HomePage = new P05_HomeSlider_page(Hooks.driver);
        this.HomePage.rss().click();
    }

    @Given("user opens youtube link")
    public void user_opens_youtube()
    {
        this.HomePage = new P05_HomeSlider_page(Hooks.driver);
        this.HomePage.youtube().click();
    }

}
