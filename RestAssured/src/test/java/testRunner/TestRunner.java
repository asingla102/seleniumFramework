package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "stepDef",
        plugin = {
                "json:target/cucumber/cucumber.json"
        },
        monochrome = true

)
public class TestRunner {

}
