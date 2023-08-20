package pages;

import actions.Wait;
import base.Keywords;
import exceptions.ApplicationException;
import helper.PropertyReader;
import org.openqa.selenium.By;

public class LoginOrangeHrm_Page extends Keywords {

    private static String UserNameTxtBox = "OrangeHRM.Login.UsernameTxtBox";

    private static String PasswordTxtBox = "OrangeHRM.Login.PasswordTxtBox";

    private static String LoginBtn = "OrangeHRM.Login.LoginBtn";


    public static void EnterUserNameAndPassword() throws ApplicationException {
        Wait.forSeconds(17000);
       // Wait.forSeconds(20000);
        driver.findElement(By.xpath("//input[@name='username']")).click();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
       // type.data(UserNameTxtBox, PropertyReader.testDataOf("UserName"));
       // type.data(PasswordTxtBox, PropertyReader.testDataOf("Password"));
        driver.findElement(By.xpath("//input[@name='password']")).click();
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
    }
    public static void ClickLoginBtn() throws Throwable{
        Wait.forSeconds(1000);
        click.elementBy(LoginBtn);
    }
}


