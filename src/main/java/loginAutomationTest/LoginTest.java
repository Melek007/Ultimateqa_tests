package loginAutomationTest;

import org.openqa.selenium.WebDriver;

import repository.Methods;

public class LoginTest {
	public static void main(String[] args) {
		//Test data
		String url="https://ultimateqa.com/automation";
		String email="eric@test.com";
		String password="12345678";
		
		WebDriver driver=null;
		Methods user=new Methods(driver);
		user.goToLandingPage(url);
		user.login(email, password);
	}
}
