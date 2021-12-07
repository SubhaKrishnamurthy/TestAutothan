package pages;

import actions.Wait;
import base.Keywords;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.awt.*;
import java.awt.event.KeyEvent;

import static driver.DriverManager.Drivertype;
import static driver.DriverManager.EnvironmentType;

public class SendMoney_Remittancecenter extends Keywords {

	private String keyRemittancecenter="onlineBanking.Fundtransfer.lnkRemittancecenter";
	private String KeyGetstarted="onlineBanking.Fundtransfer.btnRemittancecenterGetstarted";
	private String KeyRemittancecenterheader="onlineBanking.Fundtransfer.lblRemittancecenterheader";
	private String keyPalawanexpress="onlineBanking.Fundtransfer.btnRemittancecenterpalawanexpress";
	private String keyRemittancecenterproceed="onlineBanking.Fundtransfer.btnRemittancecenterproceed";
	private String keyRemittancecenteramount="onlineBanking.Fundtransfer.txtRemittancecenteramount";
	private String keyRemittancecenterpurpose="onlineBanking.Fundtransfer.lstRemittancecenterpurpose";
    private String keyRemittancecenterselectaccount="onlineBanking.Fundtransfer.btnRemittancecenterselectaccount";
	private String keyRemittancecentersavingsaccount="onlineBanking.MyGoals.Savingsaccount1";
    private String keyRemittancecenterNext="onlineBanking.Fundtransfer.btnRemittancecenterNext";
	private String keyRemittancecenterServicefee="onlineBanking.Fundtransfer.lblRemittancecenterServicefee";
	private String keyRemittancecenterServicefeebtn="onlineBanking.Fundtransfer.btnRemittancecenterServicefee";
	private String keyRemittancecenterCancel="onlineBanking.Fundtransfer.btnRemittancecenterCancel";
	private String keyRemittancecenterproceedwithtransfer="onlineBanking.Fundtransfer.btnRemittancecenterproceedwithtransfer";
    private String keyRemittancecentersendmoneyto="onlineBanking.Fundtransfer.btnRemittancecentersendmoneyto";
    private String keybirthdate="onlineBanking.Fundtransfer.btnBirthdate";
	private String keybirthcalendardate="onlineBanking.Fundtransfer.btnBirthcalendardate";
	private String keynationality="onlineBanking.Fundtransfer.lstNationality";
	private String keyfname= "onlineBanking.Fundtransfer.txtfname";
	private String keymname= "onlineBanking.Fundtransfer.txtmname";
	private String keylname= "onlineBanking.Fundtransfer.txtlname";
	private String keyRemittanceCenterReviewandsendheader="onlineBanking.Fundtransfer.lblRemittanceCenterReviewandsendheader";
	private String keyRemittanceCenterReviewandsendFromaccountno="onlineBanking.Fundtransfer.lblRemittanceCenterReviewandsendFromaccountno";
	private String keyRemittanceCenterReviewandsendFromaccountname="onlineBanking.Fundtransfer.RemittanceCenterReviewandsendFromaccountname";
	private String keyRemittanceCenterReviewandsendAmount="onlineBanking.Fundtransfer.RemittanceCenterReviewandsendtransferamt";
	private String keyRemittanceCenterReviewandsendservicefee="onlineBanking.Fundtransfer.RemittanceCenterReviewandsendservicefee";
	private String keyRemittanceCenterReviewandsendpurpose="onlineBanking.Fundtransfer.RemittanceCenterReviewandsendpurpose";
	private String keyRemittanceCenterReviewandsendReceipientname="onlineBanking.Fundtransfer.RemittanceCenterReviewandsendReceipientname";
	private String keyRemittanceCenterReviewandsendReceipientbirthdate="onlineBanking.Fundtransfer.RemittanceCenterReviewandsendReceipientbirthdate";
	private String keyRemittanceCenterReviewandsendReceipientnationality="onlineBanking.Fundtransfer.RemittanceCenterReviewandsendReceipientnationality";
	private String keyRemittanceCenterReviewandsendReceipientmobileno="onlineBanking.Fundtransfer.RemittanceCenterReviewandsendReceipientmobileno";
	private String keyRemittanceCenterReviewandsendReceipientmailid="onlineBanking.Fundtransfer.RemittanceCenterReviewandsendReceipientmailid";
	private String keyRemittanceCenterReviewandsendReceipientAddress="onlineBanking.Fundtransfer.RemittanceCenterReviewandsendReceipientAddress";
	private String keyRemittanceCenterReviewandsendcheckbox="onlineBanking.Fundtransfer.RemittanceCenterReviewandsendcheckbox";
	private String keyRemittanceCenterReviewandsendSendPhp="onlineBanking.Fundtransfer.RemittanceCenterReviewandsendSendPhp";
	private String keyRemittanceCenterReviewandsendSendcancel="onlineBanking.Fundtransfer.RemittanceCenterReviewandsendSendcancel";
	private String keyRemittanceCenterReviewandsendSendproceedwithtransfer="onlineBanking.Fundtransfer.RemittanceCenterReviewandsendSendproceedwithtransfer";
	private String keyRemittanceCentertransfersuccessful="onlineBanking.Fundtransfer.RemittanceCentertransfersuccessful";
	private String keyRemittanceCenterSubmit="onlineBanking.Fundtransfer.btnRemittanceCenterSubmit";
	private String keyRemittanceCenterEdit="onlineBanking.Fundtransfer.btnRemittanceCenterEdit";
	private String keyRemittanceCenterUpdate="onlineBanking.Fundtransfer.btnRemittanceCenterUpdate";


	public void clickRemittancecenter() throws Throwable {
		Wait.forSeconds(3000);
		jsClick.elementBy(keyRemittancecenter);
		//click.elementBy(keyRemittancecenter);
		Wait.forSeconds(3000);
	}
	public void verifyRemittancecenterisexist() throws Throwable {
		Wait.forSeconds(3000);
		verify.IfElementExists(keyRemittancecenter);
	}

	public void clickBtnGetstarted() throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(KeyGetstarted);
		Wait.forSeconds(3000);
	}

	public void verifyRemittancecenterheaderisexist() throws Throwable {
		Wait.forSeconds(3000);
		verify.IfElementExists(KeyRemittancecenterheader);
	}
	public void clickpalawanexpress() throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(keyPalawanexpress);
		Wait.forSeconds(3000);
	}
	public void clickRemittancecenterproceed() throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(keyRemittancecenterproceed);
		Wait.forSeconds(3000);
	}

	public void entertheamountandpurpose(String amount,String purpose) throws Throwable{
        type.data(keyRemittancecenteramount,amount);
		type.data(keyRemittancecenterpurpose,purpose);

	}

	public void clickSelectaccount() throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(keyRemittancecenterselectaccount);
		Wait.forSeconds(3000);
		click.elementBy(keyRemittancecentersavingsaccount);
	}
	public void verifyServicefeeisexist() throws Throwable {
		Wait.forSeconds(3000);
		if(Drivertype.equalsIgnoreCase("safari") && EnvironmentType.equalsIgnoreCase("mac") ) {
			verify.elementISPresent_MacSafari(keyRemittancecenterServicefee);
		}
		else {
			verify.IfElementExists(keyRemittancecenterServicefee);
		}
	}
	public void verifyCancelandproceedisexist() throws Throwable {
		Wait.forSeconds(3000);
		verify.IfElementExists(keyRemittancecenterproceedwithtransfer);
		verify.IfElementExists(keyRemittancecenterCancel);
	}

	public void clickProceed() throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(keyRemittancecenterproceedwithtransfer);
		Wait.forSeconds(3000);

	}

	public void verifyRemittancecentersendmoneyto() throws Throwable {
		Wait.forSeconds(3000);
		verify.IfElementExists(keyRemittancecentersendmoneyto);
		}

	public void clickCalendatdate() throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(keybirthdate);
		Wait.forSeconds(3000);
		click.elementBy(keybirthcalendardate);

	}

	public void selectNationality() throws Throwable {
		Wait.forSeconds(5000);

		if(Drivertype.equalsIgnoreCase("safari") && EnvironmentType.equalsIgnoreCase("mac") ) {
			get.elementBy(keynationality).click();
			Wait.forSeconds(2000);
			driver.findElement(By.xpath("(//*[@class='ant-select-selection-search-input'])[1]")).sendKeys("Filipino");
			driver.findElement(By.xpath("(//*[@class='ant-select-selection-search-input'])[1]")).sendKeys(Keys.RETURN);
		}
		else if(Drivertype.equalsIgnoreCase("firefox") && EnvironmentType.equalsIgnoreCase("windows") ){
			get.elementBy(keynationality).click();
			Wait.forSeconds(2000);
			driver.findElement(By.xpath("(//*[@class='ant-select-selection-search-input'])[1]")).sendKeys("Filipino");
			driver.findElement(By.xpath("(//*[@class='ant-select-selection-search-input'])[1]")).sendKeys(Keys.RETURN);

		}
		else {

			type.data(keynationality, "Filipino");
			Wait.forSeconds(2000);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_TAB);
			String Datatoselect = "Filipino";
			String Datatoselectxpath = "(" + "//*[text()=" + "'" + Datatoselect + "'" + "]" + ")" + "[1]";
			//driver.findElement(By.xpath(Datatoselectxpath)).click();
			//driver.findElement(By.xpath("(//*[text()=\"Filipino\"])[1]"));
		}
		if(Drivertype.equalsIgnoreCase("safari") && EnvironmentType.equalsIgnoreCase("mac") ) {
			get.elementBy(keybirthcalendardate).click();
		}
		else{
			click.elementBy(keybirthcalendardate);
		}

		String Datatoselect="2";
		Wait.forSeconds(3000);
		String Datatoselectxpath= "("+"//*[text()="+"'"+Datatoselect+"'"+"]"+")"+"[1]";
        driver.findElement(By.xpath(Datatoselectxpath)).click();

	}

	public void entertheNames(String fname,String mname,String lname) throws Throwable{
		type.data(keyfname,fname);
		type.data(keymname,mname);
		type.data(keylname,lname);

	}
	public void verifyAccountdetails(String accountnumber,String accountname,String Amount) throws Throwable {
		Wait.forSeconds(3000);
		verify.elementText(keyRemittanceCenterReviewandsendFromaccountno,accountnumber);
		verify.elementText(keyRemittanceCenterReviewandsendFromaccountname,accountname);
		verify.elementText(keyRemittanceCenterReviewandsendAmount,Amount);
	}
	public void verifynamedetails(String name,String DOB,String Nationality) throws Throwable {
		Wait.forSeconds(3000);
		verify.elementText(keyRemittanceCenterReviewandsendReceipientname,name);
		verify.elementText(keyRemittanceCenterReviewandsendReceipientbirthdate,DOB);
		verify.elementText(keyRemittanceCenterReviewandsendReceipientnationality,Nationality);
	}
	public void verifyEmailMobileandaddress(String Mobile,String Email,String Address) throws Throwable {
		Wait.forSeconds(3000);
		verify.elementText(keyRemittanceCenterReviewandsendReceipientmobileno,Mobile);
		verify.elementText(keyRemittanceCenterReviewandsendReceipientmailid,Email);
		verify.elementText(keyRemittanceCenterReviewandsendReceipientAddress,Address);
	}

	public void clickRemittanceCenterReviewandsendcheckbox() throws Throwable {
		Wait.forSeconds(5000);
		click.elementBy(keyRemittanceCenterReviewandsendcheckbox);
		Wait.forSeconds(3000);

	}
	public void clickRemittanceCenterReviewandsendSendPhp() throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(keyRemittanceCenterReviewandsendSendPhp);
		Wait.forSeconds(3000);

	}
	public void clickRemittanceCenterReviewandsendSendcancel() throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(keyRemittanceCenterReviewandsendSendcancel);
		Wait.forSeconds(3000);

	}
	public void clickRemittanceCenterReviewandsendSendproceedwithtransfer() throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(keyRemittanceCenterReviewandsendSendproceedwithtransfer);
		Wait.forSeconds(3000);

	}
	public void clickRemittanceCentertransfersuccessful() throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(keyRemittanceCentertransfersuccessful);
		Wait.forSeconds(3000);

	}
	public void clickRemittanceCenterSubmit() throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(keyRemittanceCenterSubmit);
		Wait.forSeconds(3000);

	}
	public void Verifypalawanexpressexist() throws Throwable {
		Wait.forSeconds(3000);
		verify.elementIsPresent(keyPalawanexpress);
		Wait.forSeconds(3000);
	}

	public void clickRemittanceCenterEdit() throws Throwable {
		Wait.forSeconds(5000);
		click.elementBy(keyRemittanceCenterEdit);
		Wait.forSeconds(3000);
	}
	public void clickRemittanceCenterUpdate() throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(keyRemittanceCenterUpdate);
		Wait.forSeconds(3000);
	}
}
