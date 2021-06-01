package pages;

import actions.Wait;
import base.Keywords;
import helper.Tools;

public class BackOffice_FAQ extends Keywords {
		BackOffice_UsersPage usersPage = new BackOffice_UsersPage();

	private String keyManageFAQ = "onlineBanking.backoffice.FAQ.manageFAQ";
	private String keyAddFAQType = "onlineBanking.backoffice.FAQ.AddFAQType";
	private String keyAddNewFAQ = "onlineBanking.backoffice.FAQ.AddNewFAQ";
	private String keyAddFAQTitle = "onlineBanking.backoffice.FAQ.AddFAQTitle";
	private String keyAddFAQBody = "onlineBanking.backoffice.FAQ.AddFAQBody";
	private String keyAddFAQSubmitForApproval = "onlineBanking.backoffice.FAQ.AddFAQSubmitForApproval";
	private String keyApprovalForFAQ = "onlineBanking.backoffice.FAQ.ApprovalForFAQ";
	private String keyConfirmApprovalReason  =  "onlineBanking.backoffice.FAQ.ADDFAQ.ConfirmApprovalReason";
	private String keyAddFAQApprove = "onlineBanking.backoffice.FAQ.ADDFAQ.Approve";
	private String keyEditFAQ = "onlineBanking.backoffice.FAQ.EditFAQ";
	private String keyEditFAQTitle = "onlineBanking.backoffice.FAQ.EditFAQTitle";
	private String keyEditFAQBody = "onlineBanking.backoffice.FAQ.EditFAQBody";
	String storeValue= Tools.RANDOMTEXT("RANDOMTEXT",10);

	public void clickManageFAQ() throws Throwable {
		Wait.forSeconds(2000);
		click.elementBy(keyManageFAQ);
	}

	public void addFAQ() throws Throwable {
		Wait.forSeconds(2000);
		click.elementBy(keyAddNewFAQ);
		verify.IfElementExists(keyAddFAQType);
		select.backOffice_selectValueInAnyList(keyAddFAQType,"About UnionBank Online");
		verify.IfElementExists(keyAddFAQTitle);
		type.data(keyAddFAQTitle,storeValue);
		type.data(keyAddFAQBody,"TEXT FAQ Test Automation");

	}

	public void submitFAQ() throws Throwable {
		click.elementBy(keyAddFAQSubmitForApproval);
	}

	public void approveFAQ() throws Throwable {
		click.elementBy(keyApprovalForFAQ);
		usersPage.clickUsersApproveForID();
		type.data(keyConfirmApprovalReason,"Approved");
		click.elementBy(keyAddFAQApprove);
	}

	public void editFAQ() throws Throwable {
		Wait.forSeconds(4000);
		click.elementFromStoredData(keyEditFAQ,storeValue);
 		verify.elementTextMatching(keyAddFAQTitle,storeValue);
		verify.elementTextMatching(keyEditFAQBody,"TEXT FAQ Test Automation");
	}

}
