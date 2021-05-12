package runner.pack;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import reports.pack.JvmReport;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources", glue="org.stepdefenition",
snippets=SnippetType.CAMELCASE,strict=false,plugin= {"pretty","html:src\\test\\resources\\Reports",
		"json:src\\test\\resources\\Reports\\out.json",
		"rerun:src\\test\\resources\\Rerun\\failures.txt",
		"junit:src\\test\\resources\\Reports\\out.xml"},tags={"@smoke"},
		dryRun=false,monochrome=true)

public class TestRunner {
	@AfterClass
	public static  void generateJvmReport() {
		JvmReport.generateJvmReport(System.getProperty("user.dir")+ "\\src\\test\\resources\\Reports\\out.json");
	}
}
