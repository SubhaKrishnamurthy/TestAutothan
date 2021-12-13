package pages;

import actions.Wait;
import base.Keywords;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CardControl_Page extends Keywords {

    private String AccountsNextslide  = "onlineBanking.CC.AccountsNextslide";
    private String CreditCard = "onlineBanking.CC.CreditCard";
    private String Transaction_Controls = "onlineBanking.CC.Transaction_Controls";
    private String Card_Status = "onlineBanking.CC.Card_Status";
    private String lockunlock_status = "onlineBanking.CC.lockunlock_status";
    private String CardlockandUnlock_off = "onlineBanking.CC.CardlockandUnlock_off";
    private String CardlockandUnlock_on = "onlineBanking.CC.CardlockandUnlock_on";
    private String DashboardLink = "onlineBanking.HomePage.DashboardLink";
    private String Unlock = "onlineBanking.CC.Unlock";
    private String Lock = "onlineBanking.CC.Lock";
    private String ManageCard = "onlineBanking.CC.ManageCard";
    private String ManageCards = "onlineBanking.CC.ManageCards";

    LoginPage login = new LoginPage();
    SendMoney_Ownaccount Ownaccount = new SendMoney_Ownaccount();
    public static String status ;


    public void selectCard() throws Throwable {
        Wait.forSeconds(4000);
        //jsClick.elementBy(AccountsNextslide);
        //jsClick.elementBy(AccountsNextslide);
        click.elementBy(CreditCard);
        }

    public void clickTransactionControls() throws Throwable {
        click.elementBy(Transaction_Controls);
    }

    public void unlockCard() throws Throwable {
       Wait.forSeconds(10000);
       verify.IfElementExists(Card_Status);
        element = driver.findElement(By.xpath("//div[@class='w-100']/br"));
        status=element.getText();
      try {
          if (status.equalsIgnoreCase("Card is unlocked")) {
              //click.elementBy(Transaction_Controls);
              verify.elementIsPresent(CardlockandUnlock_off);
          } else {
              //click.elementBy(DashboardLink);
              //click.elementBy(Transaction_Controls);
              click.elementBy(CardlockandUnlock_on);
              click.elementBy(Unlock);
              login.enterOTP("111111");
              Ownaccount.clickSubmit();
              Wait.forSeconds(3000);
              verify.elementTextContains(Card_Status, "Card is unlocked");
          }
      } catch (Throwable throwable) {
          throwable.printStackTrace();
      }

    }

    public void verifyCardStatus_ValidateFunctionality() throws Throwable
    {
        Wait.forSeconds(12000);
        //login.clickkeepmeloggedinbtn();
        verify.IfElementExists(Card_Status);
        element = driver.findElement(By.xpath("//small[@class='text-muted mt-1']"));
        status=element.getText();

        if(status.equalsIgnoreCase("Control is Enabled")){
            click.elementBy(Transaction_Controls);
            click.elementBy(CardlockandUnlock_off);
            click.elementBy(Lock);
            click.elementBy(CardlockandUnlock_on);
            click.elementBy(Unlock);
            Wait.forSeconds(8000);
            click.elementBy(DashboardLink);
            click.elementBy(CreditCard);
            verify.elementTextContains(lockunlock_status,"Card is unlocked");
        }
        else if(status.equalsIgnoreCase("Control is Locked")) {
            click.elementBy(Transaction_Controls);
            click.elementBy(CardlockandUnlock_on);
            click.elementBy(Unlock);
            Wait.forSeconds(8000);
            click.elementBy(DashboardLink);
            click.elementBy(CreditCard);
            verify.elementTextContains(lockunlock_status,"Card is unlocked");
        }
        else if(status.equalsIgnoreCase("Control is Unlocked")) {
            driver.findElement(By.cssSelector("div > div > div.header-foreground > div > div.left.part > a > svg")).click();
            click.elementBy(DashboardLink);
            click.elementBy(CreditCard);
            verify.elementTextContains(lockunlock_status,"Card is unlocked");
        }
    }

    public void ManageCard() throws Throwable {
        Wait.forSeconds(4000);
        jsClick.elementBy(ManageCards);
        //click.elementBy(ManageCards);
    }
}
