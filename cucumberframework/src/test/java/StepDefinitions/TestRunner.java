package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/deept/eclipse-workspace/cucumberframework/src/test/resources/Features",glue={"StepDefinitions"},
monochrome = true)

public class TestRunner {

}
