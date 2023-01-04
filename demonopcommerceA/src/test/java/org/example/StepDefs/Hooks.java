package org.example.StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    public static WebDriver driver;

    public Hooks() {
    }

    @Before
    public static void openBrowser() {
        driver.manage().timeouts().implicitlyWait(50L, TimeUnit.MINUTES);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\soma\\IdeaProjects\\Udacity\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(50L, TimeUnit.MINUTES);
    }

    @After
    public static void closeBrowser() throws InterruptedException {
        Thread.sleep(3000L);
        driver.quit();
    }
}
