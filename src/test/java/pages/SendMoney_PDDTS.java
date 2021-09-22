package pages;

import actions.Wait;
import base.Keywords;
import org.openqa.selenium.By;

import static driver.DriverManager.Drivertype;
import static driver.DriverManager.EnvironmentType;

public class SendMoney_PDDTS extends Keywords {

	private String keyPDDTS="onlineBanking.Fundtransfer.LnkPDDTS";
	private String keyPDDTStext1="onlineBanking.Fundtransfer.LnkPDDTStext1";
	private String keyPDDTStext2="onlineBanking.Fundtransfer.LnkPDDTStext2";
	private String keyPDDTSAddresshousenumber="onlineBanking.Fundtransfer.txthosenumber";
	private String keyPDDTSStreetname="onlineBanking.Fundtransfer.txtStreetname";
	private String keyPDDTSSvillage="onlineBanking.Fundtransfer.txtVillage";
	private String keyPDDTSprovince="onlineBanking.Fundtransfer.txtAddressprovince";
	private String keyPDDTScity="onlineBanking.Fundtransfer.txtAddresscity";
	private String keyPDDTSpopmessage="onlineBanking.Fundtransfer.lblPDDTSpopupmessage";
	private String keygotit="onlineBanking.Fundtransfer.BtnGotit";
	private String keysendto="onlineBanking.Fundtransfer.lblTransferSendto";
	private String keythisfieldisrequired="onlineBanking.Fundtransfer.lblThisfieldisrequired";



	public void clickPDDTS() throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(keyPDDTS);
		Wait.forSeconds(3000);
	}
	public void verifyPDDTSisexist() throws Throwable {
		Wait.forSeconds(3000);
		verify.IfElementExists(keyPDDTS);
	}
	public void verifyPDDTStextvalidation(String text1,String text2) throws Throwable {
		Wait.forSeconds(3000);
		verify.elementTextMatching(keyPDDTStext1,text1);
		verify.elementTextMatching(keyPDDTStext2,text2);
	}

	public void entertheAddressfield() throws Throwable{
      type.data(keyPDDTSAddresshousenumber,"25");
      type.data(keyPDDTSStreetname,"MainStreet");
      type.data(keyPDDTSSvillage,"Manila");
		Wait.forSeconds(3000);
      //click.elementBy(keyPDDTSprovince);
		if(Drivertype.equalsIgnoreCase("safari") && EnvironmentType.equalsIgnoreCase("mac") ) {
			get.elementBy(keyPDDTSprovince).click();
		}
		else {
			click.elementBy(keyPDDTSprovince);
		}
       String Datatoselect;
		Datatoselect="Metro Manila";
		Wait.forSeconds(3000);
		String Datatoselectxpath= "("+"//*[text()="+"'"+Datatoselect+"'"+"]"+")"+"[1]";
      driver.findElement(By.xpath(Datatoselectxpath)).click();
		Wait.forSeconds(3000);
      //click.elementBy(keyPDDTScity);
		if(Drivertype.equalsIgnoreCase("safari") && EnvironmentType.equalsIgnoreCase("mac") ) {
			get.elementBy(keyPDDTScity).click();
		}
		else {
			click.elementBy(keyPDDTScity);
		}
		Datatoselect="Manila";
		Wait.forSeconds(3000);
		Datatoselectxpath= "("+"//*[text()="+"'"+Datatoselect+"'"+"]"+")"+"[1]";
		driver.findElement(By.xpath(Datatoselectxpath)).click();
	}

	public void verifyPDDTSpopuptextvalidation(String text1) throws Throwable {
		Wait.forSeconds(3000);
		verify.elementTextMatching(keyPDDTSpopmessage,text1);

	}

	public void verifytheGotitbutton() throws Throwable {
		//Wait.forSeconds(3000);
          verify.elementIsPresent(keygotit);
			Wait.forSeconds(2000);
		}
	public void verifySendto() throws Throwable {
		//Wait.forSeconds(3000);
		verify.elementIsPresent(keysendto);
		Wait.forSeconds(2000);
	}

	public void VerifytheAddressfieldwhenblank() throws Throwable{
		type.data(keyPDDTSAddresshousenumber,"");
		type.data(keyPDDTSStreetname,"MainStreet");
		verify.elementIsPresent(keythisfieldisrequired);
		type.data(keyPDDTSAddresshousenumber,"12");
		type.data(keyPDDTSStreetname,"");
		type.data(keyPDDTSAddresshousenumber,"12");
		verify.elementIsPresent(keythisfieldisrequired);
		type.data(keyPDDTSAddresshousenumber,"12");
		type.data(keyPDDTSStreetname,"MainStreet");
		type.data(keyPDDTSSvillage,"");
		type.data(keyPDDTSStreetname,"MainStreet");
		verify.elementIsPresent(keythisfieldisrequired);
		type.data(keyPDDTSSvillage,"Manila");
		Wait.forSeconds(3000);
//		click.elementBy(keyPDDTSprovince);
//		String Datatoselect;
//		Datatoselect="Metro Manila";
//		Wait.forSeconds(3000);
//		String Datatoselectxpath= "("+"//*[text()="+"'"+Datatoselect+"'"+"]"+")"+"[1]";
//		driver.findElement(By.xpath(Datatoselectxpath)).click();
//		Wait.forSeconds(3000);
//		click.elementBy(keyPDDTScity);
//		Datatoselect="Manila";
//		Wait.forSeconds(3000);
//		Datatoselectxpath= "("+"//*[text()="+"'"+Datatoselect+"'"+"]"+")"+"[1]";
//		driver.findElement(By.xpath(Datatoselectxpath)).click();
	}

}
