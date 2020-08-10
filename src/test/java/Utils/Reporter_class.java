package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Reporter_class 
{
	public String getReportConfigPath() throws FileNotFoundException{
		
		FileInputStream f1 = new FileInputStream("D:\\API_FRAMEWORK\\REST_API\\extent-config.xml");
		Properties pro = new Properties();
		 String reportConfigPath = pro.getProperty("reportConfigPath");
		 if(reportConfigPath!= null) return reportConfigPath;
		 else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath"); 
		}
}
