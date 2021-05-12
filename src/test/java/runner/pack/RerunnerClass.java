package runner.pack;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import reports.pack.JvmReport;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources", glue="org.stepdefenition",snippets=SnippetType.CAMELCASE,plugin= {"@rerun:src\\test\\resources\\Rerun\\failures.txt"},dryRun=false,monochrome=true)
public class RerunnerClass {

	
}
