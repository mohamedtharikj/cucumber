package Runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import Org.Sample.JvmReport;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="@rerun\\failed.txt",glue="Org\\Sample",
plugin= {"html:C:\\Users\\ELCOT\\eclipse-workspace\\Cucumber1\\Allreports\\Html report"
	,"rerun:C:\\Users\\ELCOT\\eclipse-workspace\\Cucumber1\\rerun\\failed.txt"})
public class TestRerunner {
	@AfterClass
	public static void report() {
		JvmReport.generateReporting(System.getProperty("user.dir")+"\\AllReports\\JSONReport\\facebook.json");
	}

}
