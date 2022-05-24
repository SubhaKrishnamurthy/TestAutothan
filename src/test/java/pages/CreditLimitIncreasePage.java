package pages;

import actions.Wait;
import base.Keywords;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CreditLimitIncreasePage extends Keywords {

    private String CreditcardAccount  = "onlineBanking.CreditLimit.CreditcardAccount";
    private String RequestIncreaseButton  = "onlineBanking.CreditLimit.RequestIncreaseButton";
    private String RIPopupMessage  = "onlineBanking.CreditLimit.RIPopupMessage";
    private String keygotit="onlineBanking.Fundtransfer.BtnGotit";

    public void click_CreditCardAccount() throws Throwable {
        Wait.forSeconds(5000);
        click.elementBy(CreditcardAccount);
    }
    public void click_RequestIncrease() throws Throwable {
        Wait.forSeconds(3000);
        jsClick.elementBy(RequestIncreaseButton);
    }
    public void Verify_RIPopupMessage() throws Throwable {
        Wait.forSeconds(5000);
        verify.elementIsPresent(RIPopupMessage);
    }
    public void click_GotIt() throws Throwable {
        Wait.forSeconds(2000);
        jsClick.elementBy(keygotit);
    }
    public void click_Slider() throws Throwable {
        Wait.forSeconds(2000);
        WebElement slider = driver.findElement(By.xpath("//div[@class='ant-slider-handle']"));
//        Actions move = new Actions(driver);
//        Actions action = (Actions) move.dragAndDropBy(slider, 30, 0).build();
//        action.perform();
        Actions move = new Actions(driver);
        move.moveToElement(slider).clickAndHold().moveByOffset(0,250).release().perform();
    }

}
