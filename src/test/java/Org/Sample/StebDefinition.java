package Org.Sample;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Helper.BaseClass;
import Pom.ForgotPas;
import Pom.LoginPojo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StebDefinition extends BaseClass {
	
	
		
	    
	
	@When("User enter username  and password")
	public void user_enter_username_and_password() {
	   LoginPojo l=new LoginPojo();
	   fillTxtBox(l.getTxtEmail(), "tharik543");
	   fillTxtBox(l.getTxtPass(), "19189871");
	}
		
	   
	

	@When("user enter vinvalid username and password")
	public void user_enter_vinvalid_username_and_password() {
 
		
		
		
		LoginPojo l=new LoginPojo();
		fillTxtBox(l.getTxtEmail(), "azeem");
		fillTxtBox(l.getTxtPass(), "355433");
	   
	}

	

	@When("user click the login button")
	public void user_click_the_login_button() {
		LoginPojo l=new LoginPojo();
		btnclk(l.getBtnlogin());
		
	}

	@Then("user should be in a invalid credentials page")
	public void user_should_be_in_a_invalid_credentials_page() {
		toclose();
	}
	
	   
	

	@Given("User have click the forgotpassword")
	public void user_have_click_the_forgotpassword() throws InterruptedException {
		ForgotPas f=new ForgotPas();
		btnclk(f.getBtnForgotpass());
		Thread.sleep(3000);
	  
	}

	@When("user have email or mobile no")
	public void user_have_email_or_mobile_no() {
		ForgotPas f=new ForgotPas();
	   fillTxtBox(f.getTxtemail(), "8608636741");
	}

	@Then("user have  to click the search Button")
	public void user_have_to_click_the_search_Button() {
		ForgotPas f=new ForgotPas();
	   btnclk(f.getBtnsearch());
	}





}
