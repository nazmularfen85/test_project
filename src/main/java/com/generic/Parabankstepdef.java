package com.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Parabankstepdef {
	WebDriver driver;
	SeleniumPagefactory pf;
	SoftAssert sa;
	
	@Given("Open Browser")
	public void open_Browser() {
       driver = new ChromeDriver();
       driver.manage().window().maximize();
	}

	@Given("Go to Para Bank applicatio login page")
	public void go_to_Para_Bank_applicatio_login_page() {
       driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@When("Put Valid User")
	public void put_Valid_User() {

	    pf = new SeleniumPagefactory(driver);
		pf.getUserName().sendKeys("Test2024");
	}

	@When("Put Valid Password")
	public void put_Valid_Password() {
       pf.getPassWord().sendKeys("pass2024");
	}

	@When("Click login button")
	public void click_login_button() {
	    pf.getLoginBtn().click();
	}

	@Then("Check login status should pass and log out button should visibe")
	public void check_login_status_should_pass_and_log_out_button_should_visibe() {

		 pf = new SeleniumPagefactory(driver);
	    sa = new SoftAssert();
		sa.assertTrue(pf.getLogoutBtn().isDisplayed());
		sa.assertAll();
		
		driver.close();;
		
	}

	@When("Put invalid User")
	public void put_invalid_User() {
		pf = new SeleniumPagefactory(driver);
		pf.getUserName().sendKeys("rock1234");
	}

	@When("Put invalid Password")
	public void put_invalid_Password() {
    
		 pf.getPassWord().sendKeys("1234567");
	}

	@Then("Check login status should fail and error massage contain The username and password could not be verified")
	public void check_login_status_should_fail_and_error_massage_contain_The_username_and_password_could_not_be_verified() {

		
	    sa = new SoftAssert();
		sa.assertTrue(pf.getErrorMassageWithInvalidCredential().isDisplayed());
		sa.assertAll();
		driver.quit();
	}

	@When("Put null User")
	public void put_null_User() {
 
		pf = new SeleniumPagefactory(driver);
		pf.getUserName().sendKeys("");
	}

	@When("Put null Password")
	public void put_null_Password() {

		pf.getPassWord().sendKeys("");
		
	}

	@Then("Check login status should fail and error massage contain Please enter a username and password.")
	public void check_login_status_should_fail_and_error_massage_contain_Please_enter_a_username_and_password() {

		
		
	    sa = new SoftAssert();
		sa.assertTrue(pf.getErrorMassageWithNullCredential().isDisplayed());
		sa.assertAll();
		driver.quit();
	}


}
