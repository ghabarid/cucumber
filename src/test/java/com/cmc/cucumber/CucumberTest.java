package com.cmc.cucumber;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources",
    glue = "com.cmc.cucumber",
    plugin = {"pretty",
        "json:target/cucumber-json/cucumber.json",
        "junit:target/cucumber-reports/Cucumber.xml",
        "html:target/cucumber-reports"}

//        tags = "@SignUpFeature"
)
public class CucumberTest {

}
