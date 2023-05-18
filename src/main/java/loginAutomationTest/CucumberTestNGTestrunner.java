package loginAutomationTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/loginAutomationTest", glue = "loginAutomationTest", monochrome = true, plugin = {"html:target/cucumber.html"})
public class CucumberTestNGTestrunner extends AbstractTestNGCucumberTests{

}
