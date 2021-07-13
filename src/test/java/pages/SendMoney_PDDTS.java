package pages;

import actions.Wait;
import base.Keywords;
import org.openqa.selenium.By;

public class SendMoney_PDDTS extends Keywords {

	private String keyPDDTS="onlineBanking.Fundtransfer.LnkPDDTS";
	private String keyPDDTStext1="onlineBanking.Fundtransfer.LnkPDDTStext1";
	private String keyPDDTStext2="onlineBanking.Fundtransfer.LnkPDDTStext2";



	public void clickPDDTS() throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(keyPDDTS);
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
}
