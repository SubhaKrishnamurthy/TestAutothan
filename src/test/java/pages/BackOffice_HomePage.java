package pages;

import actions.Wait;
import base.Keywords;
import exceptions.ApplicationException;
import exceptions.EnvironmentException;
import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class BackOffice_HomePage extends Keywords {

	private String keyAccountsTab = "onlineBanking.backoffice.homePage.accounts";
	private String keyLogoutBtn = "onlineBanking.backoffice.homepage.logout";

	public void clickAccounts() throws Throwable {
		actions.Wait.forSeconds(3000);
		jsClick.elementBy(keyAccountsTab);
	}

	public void clickLogoutBtn() throws Throwable {
		actions.Wait.forSeconds(1000);
		jsClick.elementBy(keyLogoutBtn);
		actions.Wait.forSeconds(2000);
	}
}
