package com.generic;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPagefactory {
	
	public SeleniumPagefactory(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	

	
	@FindBy(xpath="//*[@name='username']")
	private WebElement UserName;
	@FindBy(xpath="//*[@name='password']")
	private WebElement PassWord;
	@FindBy(xpath="//*[@type='submit']")
	private WebElement LoginBtn;
	@FindBy(xpath="//*[text() ='Log out']")
	private WebElement LogoutBtn;
	//@FindBy(xpath="//*[text() ='The username and password could not be verified']")
	
	@FindBy(xpath="//*[text()='An internal error has occurred and has been logged.']")
	private WebElement errorMassageWithInvalidCredential;
	
	@FindBy(xpath="//*[text() ='Please enter a username and password.']")
	private WebElement errorMassageWithNullCredential;
	
	
	public WebElement getUserName() {
		return UserName;
	}
	public WebElement getPassWord() {
		return PassWord;
	}
	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	public WebElement getLogoutBtn() {
		return LogoutBtn;
	}
	public WebElement getErrorMassageWithInvalidCredential() {
		return errorMassageWithInvalidCredential;
	}
	public WebElement getErrorMassageWithNullCredential() {
		return errorMassageWithNullCredential;
	}
	
	
	
}
