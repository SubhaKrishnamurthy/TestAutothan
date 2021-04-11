package pages;

import actions.Wait;
import base.Keywords;
import com.github.javafaker.App;
import exceptions.ApplicationException;
import exceptions.EnvironmentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class LoginPage extends Keywords {

	private String Keyusername = "convergent.login.textboxUsername";
	private String Keypassword = "convergent.login.textboxPassword";
	private String KeySignUpNow = "convergent.login.btnSignup";
	private String keyBOUserName="onlineBanking.backoffice.login.username";
	private String keyBOPassword="onlineBanking.backoffice.login.password";
	private String keyLoginBtn="onlineBanking.backoffice.login.loginBtn";


	public void enterUsernme(String usernmae) throws ApplicationException {
		type.data(Keyusername,usernmae);
	}
	public void enterPassword(String password) throws ApplicationException {
		type.data(Keypassword,password);
	}

	public void clickSignupnow() throws ApplicationException {
		click.elementBy(KeySignUpNow);
	}

	public void launchnewapplication() throws ApplicationException, EnvironmentException {
		launchApplication();
	}

	public void enterBOUserName(String username) throws ApplicationException, InterruptedException {
		actions.Wait.forSeconds(2000);
		//Wait.forSeconds(2000);
		//Thread.sleep(2000);
		type.data(keyBOUserName,username);
	}

	public void enterBOPassword(String password) throws ApplicationException, InterruptedException {
		actions.Wait.forSeconds(1000);
		//Wait.forSeconds(2000);
		//Thread.sleep(2000);
		type.data(keyBOPassword,password);
	}

	public void enterBOLogin() throws ApplicationException {
		actions.Wait.forSeconds(3000);
		//Wait.forSeconds(2000);
		WebElement element = driver.findElement(By.xpath("//*[text()='Login']/parent::button"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		Wait.forSeconds(5000);
	}
}
