package pages;

import actions.Wait;
import base.Keywords;
import helper.Tools;
import org.openqa.selenium.By;

public class SendMoney_Ownaccount extends Keywords {

	private String keyOwnaccounts = "onlineBanking.Fundtransfer.Ownaccounts";
	private String keyFromaccount="onlineBanking.Fundtransfer.Fromaccountnumber";
	private String keyToaccount="onlineBanking.Fundtransfer.Toaccountnumber";
	private String keyAmount="onlineBanking.Fundtransfer.TxtAmount";
	private String KeyRemarks="onlineBanking.Fundtransfer.TxtMessage_Ownaccounts";
	private String KeyNext="onlineBanking.Fundtransfer.BtnNext";
	private String keygotit="onlineBanking.Fundtransfer.BtnGotit";
	private String keytransfer="onlineBanking.Fundtransfer.Btntransfer";
	private String keyOTPfield="onlineBanking.Fundtransfer.ElmOTP";
	private String keyOTPtxt="onlineBanking.Fundtransfer.txtOTP";
	private String keysubmit="onlineBanking.Fundtransfer.btnSubmit";
	private String keytransfersuccessful="onlineBanking.Fundtransfer.Lbltransfersuccessful";
	private String keytransfersuccessfulfromacct="onlineBanking.Fundtransfer.Lbltransfersuccessfulfromaccount";
	private String keytransfersuccessfultoacct="onlineBanking.Fundtransfer.Lbltransfersuccessfultoaccount";
	private String keytransfersuccessfulamt="onlineBanking.Fundtransfer.Lblamount";
	private String keytransfersuccessfulrepeat="onlineBanking.Fundtransfer.LblRepeat";
	private String keytransfersuccessfulnewtransaction="onlineBanking.Fundtransfer.BtnNewtransaction";
	private String keyLogout="onlineBanking.Fundtransfer.BtnLogout";
	private String keycancel="onlineBanking.Fundtransfer.BtnCancel";
	private String keyYes="onlineBanking.Fundtransfer.BtnYes";
	private String keyrepeat="onlineBanking.Fundtransfer.BtnRepeat";
	private String keyfrequency="onlineBanking.Fundtransfer.LstFrequency";
	private String keyfrequency1="onlineBanking.Fundtransfer.LstFrequency1";
	private String keyupdate="onlineBanking.Fundtransfer.BtnUpdate";
	private String keyfromaccountedit="onlineBanking.Fundtransfer.BtnFromaccountedit";
	private String keytoaccountedit="onlineBanking.Fundtransfer.BtnToaccountedit";
	private String keyamountedit="onlineBanking.Fundtransfer.Btnamountedit";
	private String keytxndatetransfersuccessful="onlineBanking.Fundtransfer.lbltxndatetransfersuccessful";
	private String keyReferenceNumbertransfersuccessful="onlineBanking.Fundtransfer.lblReferenceNumbertransfersuccessful";

   public String txndate;
   public String ReferenceNumber;



	public void verifyOwnaccountsNotexist() throws Throwable {
		Wait.forSeconds(3000);
		verify.IfElementNotExists(keyOwnaccounts);
	}
	public void clickOwnaccount() throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(keyOwnaccounts);
	}
	public void clickFromaccount() throws Throwable {
		Wait.forSeconds(10000);
		click.elementBy(keyFromaccount);
	}
	public void clickToaccount() throws Throwable {
		Wait.forSeconds(5000);
		click.elementBy(keyToaccount);
	}
	public void enterthAmountandRemarks(String Amt,String Remarks) throws Throwable {
		Wait.forSeconds(3000);
		type.data(keyAmount,Amt);
		type.data(KeyRemarks,Remarks);
	}
	public void clickNextbutton() throws Throwable {
		Wait.forSeconds(3000);
		//verify.elementIsEnabled(KeyNext);
		click.elementBy(KeyNext);
		Wait.forSeconds(3000);
	}
	public void verifytheGotitbutton() throws Throwable {
		//Wait.forSeconds(3000);
		if(verify.IfElementExistsboolean(keygotit)){
			Wait.forSeconds(2000);
			click.elementBy(keygotit);
			Wait.forSeconds(2000);
		}
	}
	public void clickTransferbutton() throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(keytransfer);
	}
	public void verifyOTPpageisdisplayed() throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(keyOTPfield);
	}
	public void entertheOTPOTPpage(String OTP) throws Throwable {
		Wait.forSeconds(3000);
      type.data(keyOTPtxt,OTP);
		Wait.forSeconds(3000);
	}
	public void clickSubmit() throws Throwable {
		Wait.forSeconds(2000);
		click.elementBy(keysubmit);
	}

	public void verifytransfersuccessfulisdisplayed() throws Throwable {
		Wait.forSeconds(3000);
		verify.IfElementExists(keytransfersuccessful);
		}
	public void verifytransferdetailsinsuccessfulpage(String Fromacc,String Toacc,String Amount) throws Throwable {
		Wait.forSeconds(3000);
		verify.elementTextMatching(keytransfersuccessfultoacct,Toacc);
		verify.elementTextMatching(keytransfersuccessfulfromacct,Fromacc);
		verify.elementTextMatching(keytransfersuccessfulamt,Amount);

	}
	public void clickNewtransaction() throws Throwable {
		Wait.forSeconds(1000);
		click.elementBy(keytransfersuccessfulnewtransaction);
	}

	public void verifyOwnaccountsexist() throws Throwable {
		Wait.forSeconds(3000);
		verify.IfElementExists(keyOwnaccounts);
	}
	public void clickLogout() throws Throwable {
		Wait.forSeconds(1000);
		click.elementBy(keyLogout);
	}
	public void clickYes() throws Throwable {
		Wait.forSeconds(1000);
		click.elementBy(keyYes);
	}
	public void clickCancel() throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(keycancel);
	}
	public void navigatetoBack() throws Throwable {
		Wait.forSeconds(1000);
		driver.navigate().back();
	}

	public void verifyFromaccountnumberisexist() throws Throwable {
		Wait.forSeconds(3000);
		verify.IfElementExists(keyFromaccount);
	}

	public void selectFrequency(String Frequency) throws Throwable {
		Wait.forSeconds(5000);
		click.elementBy(keyrepeat);
		click.elementBy(keyfrequency);
		Wait.forSeconds(2000);
		driver.findElement(By.xpath("("+"//*[text()="+"'"+Frequency+"'"+"]"+")"+"[1]" +"|"+ "("+"//*[text()="+"'"+Frequency+"'"+"]"+")"+"[1]" +"|"+ "("+"//*[text()="+"'"+Frequency+"'"+"]"+")"+"[1]")).click();
		Wait.forSeconds(3000);
	}
	public void clickFromaccountedit() throws Throwable {
		Wait.forSeconds(1000);
		click.elementBy(keyfromaccountedit);
	}
	public void clickToaccountedit() throws Throwable {
		Wait.forSeconds(1000);
		click.elementBy(keytoaccountedit);
	}
	public void clickamountedit() throws Throwable {
		Wait.forSeconds(1000);
		click.elementBy(keyamountedit);
	}
	public void clickUpdate() throws Throwable {
		Wait.forSeconds(1000);
		click.elementBy(keyupdate);
	}
	public void selectFrequencyonly(String Frequency) throws Throwable {
		Wait.forSeconds(3000);

		click.elementBy(keyfrequency1);
		driver.findElement(By.xpath("("+"//div[text()="+"'"+Frequency+"'"+"]"+")"+"[1]" +"|"+ "("+"//li[text()="+"'"+Frequency+"'"+"]"+")"+"[1]" +"|"+ "("+"//a[text()="+"'"+Frequency+"'"+"]"+")"+"[1]")).click();

	}

	public void enterthAmountandRemarkswith256chars(String Amt,String Remarks) throws Throwable {
		Wait.forSeconds(3000);
		type.data(keyAmount,Amt);
		type.data(KeyRemarks, Tools.RANDOMTEXT("RANDOMTEXT",258));
	}

	public void VerifyNextisenabled() throws Throwable {
		Wait.forSeconds(3000);
		verify.elementIsEnabled(KeyNext);
		Wait.forSeconds(3000);
	}

	public void StoreTxndateandReferencenumber() throws Throwable {
		Wait.forSeconds(3000);
		txndate=driver.findElement(By.xpath("//*[text()='Transaction Date']/following-sibling::output")) .getText();
		ReferenceNumber=driver.findElement(By.xpath("//*[text()='Reference Number']/following-sibling::output")) .getText();
	}


}
