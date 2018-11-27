package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features = { "src/test/java/features/gherkin_new.feature" }, 
		glue = { "steps" }, 
		monochrome = true,
		//dryRun = true,
		tags = {"@tamilnadu", "not @kerala"}, 
		snippets = SnippetType.CAMELCASE)
@RunWith(Cucumber.class)
public class RunTest {

}
