package Utils;
import java.io.File;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
public class Customer_extent_reports 
{
	private ExtentHtmlReporter extentHtmlReporter;
	private ExtentReports extentReporter;
	public Customer_extent_reports(String reportLocation)
	{
		extentHtmlReporter = new ExtentHtmlReporter(new File(reportLocation));
		extentReporter = new ExtentReports();
		extentReporter.attachReporter(extentHtmlReporter);
	}
	public void crearetest(io.cucumber.java.Scenario scenario)
	{
		if (scenario!=null) 
		{
			String s1 = getScenarioName(scenario);
			switch (scenario.getStatus()) 
			{
			case PASSED:
				extentReporter.createTest(s1).pass("Passed");
				break;
			case FAILED:
				extentReporter.createTest(s1).fail("Failed");	
			default:
				extentReporter.createTest(s1).skip("Skipped");
				break;
			}
		}
	}
	public void writeToReport()
	{
		if (extentReporter!=null) {
			extentReporter.flush();
		}
	}
	private String getScenarioName(io.cucumber.java.Scenario scenario)
	{
		return scenario.getName().replace(" ","");
	}
}
