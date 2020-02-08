package com.cmc.cucumber;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "com.cmc.cucumber"
//        tags = "@SignUpFeature"
)
public class CucumberTest {
}
