package Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.BaseClass;

public class ForgotPas extends BaseClass {
	public ForgotPas() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//[text()='Forgotten password?']")
	private WebElement btnForgotpass;
	
	@FindBy(xpath="//input[@placeholder='Email or phone']")
	private WebElement txtemail;
	
	@FindBy(xpath="//button[text()='Search']")
	private WebElement btnsearch;

	public WebElement getBtnForgotpass() {
		return btnForgotpass;
	}

	public WebElement getTxtemail() {
		return txtemail;
	}

	public WebElement getBtnsearch() {
		return btnsearch;
	}
	

}
