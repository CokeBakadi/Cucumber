package org.stepdefenition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import reusable.pack.BaseClass;

public class Hooks extends BaseClass {

	
		@Before("@smoke")
		public void beforeScenario() {
			launchBrows();
		}
		
	@After("@smoke")
	public  void afterScenario(Scenario s) throws IOException {
//       TakesScreenshot ts = (TakesScreenshot)driver;
//      File src = ts.getScreenshotAs(OutputType.FILE);
//      File dest = new File("C:\\Users\\Daniel\\eclipse-workspace\\Cucumber2\\src\\test\\resources\\Screenshot"+"ad.png");
//      FileUtils.copyFile(src, dest);
		if(s.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot)driver;
			 byte[] sc = ts.getScreenshotAs(OutputType.BYTES);
		s.embed(sc,"image/png");
	}}
}
