package Org.Sample;



import Helper.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
	
	@Before
	public void bef() {
		System.out.println("bef scenario ...");
		lanuchBrowser();
		lanuchUrl("https://www.facebook.com/");
		maxWindow();
		
	}
	@After
	public void aft() {
		toclose();
		
	}

}
