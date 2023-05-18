package loginAutomationTest;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import repository.Methods;

public class StepDefinition {
	WebDriver driver=null;
	Methods user=new Methods(driver);
	
	@Given ("^user go to (.+)$")
	public void user_go_to_url(String url)
	{
		user.goToLandingPage(url);
	}
	
	@When("^user login (.+) (.+)$")
	public void user_login_email_password(String email, String password)
	{
		user.login(email, password);
	}
	
	@Then("^write (.+)$")
	public void write_message(String message)
	{
		System.out.println(message);
	}

}
