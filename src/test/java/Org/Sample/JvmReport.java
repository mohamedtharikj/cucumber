package Org.Sample;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;






public class JvmReport {
	public static  void generateReporting(String jsonpath) {
		
	
	
	//mention the file
	File f=new File(System.getProperty("user.dir")+"\\"
			+ "AllReports\\JVMreport");
	
	//configuration class
	Configuration c =new Configuration(f,"FACEBOOK APPLICATION");
	c.addClassifications("JDK", "1.8");
	c.addClassifications("plateform", "Windows");
	
	//to ad the json file path
	List<String> li=new ArrayList<String>();
	li.add(jsonpath);
	
	//reportbuilder
	ReportBuilder r=new ReportBuilder(li, c);
	r.generateReports();
	

	
	}	
		
		
	

}
