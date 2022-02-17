package pages;

import actions.Wait;
import base.Keywords;
import com.aventstack.extentreports.model.TestAttribute;
import cucumber.deps.com.thoughtworks.xstream.mapper.Mapper;
import exceptions.ApplicationException;
import helper.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import static driver.DriverManager.Drivertype;
import static driver.DriverManager.EnvironmentType;

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
	private String keyManageTransfers="onlineBanking.Fundtransfer.txtManageTransfers";
	private String keySearchRecent="onlineBanking.Fundtransfer.txtSearchRecent";
	private String keySearchButton="onlineBanking.Fundtransfer.txtSearchRecent";

//   public String txndate;
//   public String ReferenceNumber;
	private LoginPage loginPage = new LoginPage();
	private GreenPinPage greenPinPage = new GreenPinPage();

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
		Wait.forSeconds(8000);
		jsClick.elementBy(KeyNext);
	}
//	public void verifytheGotitbutton() throws Throwable {
//		try{
//		if(keygotit!=null)
//		{
//			jsClick.elementBy(keygotit);
//		}
//		}
//		catch (ApplicationException e) {
//			e.printStackTrace();
//		}
//		Wait.forSeconds(8000);
//		loginPage.clickkeepmeloggedinbtn();
//	}
    public void verifytheGotitbutton_new() throws Throwable {
	if(verify.IfElementExistsboolean(keygotit))
	{
		jsClick.elementBy(keygotit);
	}
    }
	public void clickTransferbutton() throws Throwable {
		Wait.forSeconds(5000);
		click.elementBy(keytransfer);
	}

	public void verifyOTPpageisdisplayed() throws Throwable {
		Wait.forSeconds(3000);
		//click.elementBy(keyOTPfield);
		verify.elementIsPresent(keyOTPfield);
	}

	public void entertheOTPOTPpage(String OTP) throws Throwable {
		Wait.forSeconds(3000);
		char[] ch=OTP.toCharArray();
		greenPinPage.enter_Pin(String.valueOf(ch[0]),String.valueOf(ch[1]),String.valueOf(ch[2]),
				String.valueOf(ch[3]),String.valueOf(ch[4]),String.valueOf(ch[5]));
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
		if(Drivertype.equalsIgnoreCase("safari") && EnvironmentType.equalsIgnoreCase("mac") )
		{
			verify.elementTextMatching_MacSafari(keytransfersuccessfultoacct, Toacc);
			verify.elementTextMatching_MacSafari(keytransfersuccessfulfromacct, Fromacc);
			verify.elementTextMatching_MacSafari(keytransfersuccessfulamt, Amount);

		}
		else {
			verify.elementTextMatching(keytransfersuccessfultoacct, Toacc);
			verify.elementTextMatching(keytransfersuccessfulfromacct, Fromacc);
			verify.elementTextMatching(keytransfersuccessfulamt, Amount);
		}

	}
	public void clickNewtransaction() throws Throwable {
		Wait.forSeconds(2000);
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
        Wait.forSeconds(4000);

		if(Drivertype.equalsIgnoreCase("safari") && EnvironmentType.equalsIgnoreCase("mac") ){

			get.elementBy(keyfrequency).click();
			Wait.forSeconds(3000);
            String Datatoselectxpath= "("+"//*[text()="+"'"+Frequency+"'"+"]"+")"+"[1]";
            driver.findElement(By.xpath(Datatoselectxpath)).click();

		}
		else {

            click.elementBy(keyfrequency);
            Wait.forSeconds(4000);
		    driver.findElement(By.xpath("(" + "//*[text()=" + "'" + Frequency + "'" + "]" + ")" + "[1]" + "|" + "(" + "//*[text()=" + "'" + Frequency + "'" + "]" + ")" + "[1]" + "|" + "(" + "//*[text()=" + "'" + Frequency + "'" + "]" + ")" + "[1]")).click();
			Wait.forSeconds(3000);
		}

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
		String ReferenceNumber=driver.findElement(By.xpath("//*[text()='Reference Number']/following-sibling::output")).getText();
	}

	public void verifytheRecenttransactionPage(String Amount,String fromacc,String toacc) throws Throwable {
		String ReferenceNumber=driver.findElement(By.xpath("//*[text()='Reference Number']/following-sibling::output")).getText();
		String txndate=driver.findElement(By.xpath("//*[text()='Transaction Date']/following-sibling::output")).getText();
		System.out.println(ReferenceNumber);
		Wait.forSeconds(5000);
		click.elementBy(keytransfersuccessfulnewtransaction);
		Wait.forSeconds(3000);
		click.elementBy(keyManageTransfers);
//		Wait.forSeconds(3000);
//		click.elementBy(keySearchRecent);
//		type.data(keySearchRecent,ReferenceNumber);
//		click.elementBy(keySearchButton);
		Wait.forSeconds(7000);
		String txndateval=txndate;
		String txndatevalout[]=txndateval.split(" ");
		String monthval1=txndatevalout[0].substring(0, 1);
		String monthval2=txndatevalout[0].substring(1, 3);
		String monthval=monthval1.toUpperCase()+monthval2.toLowerCase();
		String time=txndatevalout[3].substring(0, 2);
		if(time.contains(":"))
		{
			txndatevalout[3]="0"+txndatevalout[3];

		}

		txndateval=monthval+" "+txndatevalout[1]+" "+txndatevalout[2]+","+" "+txndatevalout[3]+" "+txndatevalout[4];
		String dbval="//*[contains(text(),'"+txndateval+"')]";
		driver.findElement(By.xpath(dbval)).click();
		Wait.forSeconds(3000);

		if(Drivertype.equalsIgnoreCase("safari") && EnvironmentType.equalsIgnoreCase("mac") )
		{
			verify.elementTextMatching_MacSafari(keytransfersuccessfultoacct, toacc);
			verify.elementTextMatching_MacSafari(keytransfersuccessfulfromacct, fromacc);
			verify.elementTextMatching_MacSafari(keytransfersuccessfulamt, Amount);

		}
		else
		{
			verify.elementTextMatching(keytransfersuccessfultoacct, toacc);
			verify.elementTextMatching(keytransfersuccessfulfromacct, fromacc);
			verify.elementTextMatching(keytransfersuccessfulamt, Amount);
		}
	}

	}
