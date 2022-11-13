package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/signin/user.feature"},glue = {"definition_new"},tags = "@NegativeTesting")
public class runner_new extends AbstractTestNGCucumberTests {
	

}
