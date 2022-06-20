package Runner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;

import Org.Sample.JvmReport;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = "Org\\Sample", dryRun = false, monochrome = true, strict = false
,plugin= {"html:C:\\Users\\ELCOT\\eclipse-workspace\\Cucumber2\\AllReports\\HTMLReport",
		"json:C:\\Users\\ELCOT\\eclipse-workspace\\Cucumber2\\AllReports\\JSONReport\\facebook.json",
		"junit:C:\\Users\\ELCOT\\eclipse-workspace\\Cucumber2\\AllReports\\JunitReport\\fb.xml"})

public class TestRunner {
	@AfterClass
	
	public static void report() {
		JvmReport.generateReporting(System.getProperty("user.dir")+"\\AllReports\\JSONReport\\facebook.json");
	}
	
}
