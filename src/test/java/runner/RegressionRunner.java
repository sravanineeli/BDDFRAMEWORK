package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		glue="steps",
		features="D:\\eclipseworkspacefortesting\\BDDframework\\src\\test\\resources\\features\\regression\\loginvalidation2.feature",
		dryRun=true,
		stepNotifications=true
		
		)

public class RegressionRunner {

}
