package org.example.TestRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src\\main\\resources\\features"},
        glue = {"org.example.StepDefs"},
        tags = "@smoke",
        plugin = {"html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"}
)
public class Runners extends AbstractTestNGCucumberTests {
        public Runners()
        {

        }
}
