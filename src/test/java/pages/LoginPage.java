package pages;

import actions.Wait;
import base.Keywords;
import com.github.javafaker.App;
import exceptions.ApplicationException;
import exceptions.EnvironmentException;
import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class LoginPage extends Keywords {

	private String keyBOUserName="onlineBanking.backoffice.login.username";
	private String keyBOPassword="onlineBanking.backoffice.login.password";
	private String keyLoginBtn="onlineBanking.backoffice.login.loginBtn";
	private String keepmeloggedinbtn = "convergent.login.keepmeloggedinbtn";
	private String Version = "convergent.login.Version";
	private String ZAPPopup = "onlineBanking.ZAPPopup";



	public void enterBOUserName(String username) throws ApplicationException, InterruptedException {
		actions.Wait.forSeconds(14000);
		type.data(keyBOUserName,username);
		actions.Wait.forSeconds(14000);
	}

	public void enterBOPassword(String password) throws ApplicationException, InterruptedException {
		actions.Wait.forSeconds(2000);
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

	public void clickRecaptcha() throws ApplicationException {
/*
		Wait.forSeconds(2000);
		if(verify.IfElementExistsboolean(ZAPPopup))
		{
			jsClick.elementBy(ZAPPopup);
		}
*/
		WebElement iframeSwitch = driver.findElement(By.xpath("(//div/iframe)[1]"));
		actions.Wait.forSeconds(3000);
		driver.switchTo().frame(iframeSwitch);
		actions.Wait.forSeconds(5000);
		element=driver.findElement(By.xpath("//span[@id='recaptcha-anchor']/div[1]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		actions.Wait.forSeconds(3000);
		driver.switchTo().defaultContent();
		actions.Wait.forSeconds(5000);
	}

}
