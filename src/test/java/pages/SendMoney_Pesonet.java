package pages;

import actions.Wait;
import base.Keywords;
import exceptions.ApplicationException;
import helper.Tools;
import org.openqa.selenium.By;

public class SendMoney_Pesonet extends Keywords {

	private String keyPesonet="onlineBanking.Fundtransfer.LnkPesonet";
	private String keyPesonetreason="onlineBanking.Fundtransfer.FundtransferreasonPesonet";
	private String keyproceedwithPesonet="onlineBanking.Fundtransfer.FundproceedwithPesonet";
	private String keyPesonetAmterror="onlineBanking.Fundtransfer.Amterrormessage";
	private String keyPesonetreason2="onlineBanking.Fundtransfer.FundtransferreasonPesonet2";
	private String keypesonetpurpose="onlineBanking.Fundtransfer.FundtransferleavepurposePesonet2";


	public void clickPesonet() throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(keyPesonet);
	}

	public void selectthereason(String Reason) throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(keyPesonetreason);

		Wait.forSeconds(5000);
		driver.findElement(By.xpath("("+"//*[text()="+"'"+Reason+"'"+"]"+")"+"[1]" +"|"+ "("+"//*[text()="+"'"+Reason+"'"+"]"+")"+"[1]" +"|"+ "("+"//*[text()="+"'"+Reason+"'"+"]"+")"+"[1]")).click();
		Wait.forSeconds(2000);
	}

	public void clickproceedwithPesonet() throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(keyproceedwithPesonet);
	}

	public void verifyAmounterror() throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(keyPesonetAmterror);
	}

	public void selectthereason2(String Reason) throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(keyPesonetreason2);

		Wait.forSeconds(5000);
		driver.findElement(By.xpath("("+"//*[text()="+"'"+Reason+"'"+"]"+")"+"[1]" +"|"+ "("+"//*[text()="+"'"+Reason+"'"+"]"+")"+"[1]" +"|"+ "("+"//*[text()="+"'"+Reason+"'"+"]"+")"+"[1]")).click();
		Wait.forSeconds(2000);
	}

	public void entertheLeaveaPurpose(String LeaveaPurpose) throws Throwable {
		Wait.forSeconds(3000);
		type.data(keypesonetpurpose,LeaveaPurpose);

	}
}
