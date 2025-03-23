package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/*
 src/test/resources/features/user-signup.feature
 src/test/resources/features/user-login.feature
 */
@CucumberOptions( features = "src/test/resources/features", 
					glue = {"stepDefinitions", "hooks"}, 
					plugin = {"pretty" ,"html:target/cucumber-reports.html", "json:target/cucumber.json"},
					monochrome = true
		
					)


public class TestRunner extends AbstractTestNGCucumberTests{

}
