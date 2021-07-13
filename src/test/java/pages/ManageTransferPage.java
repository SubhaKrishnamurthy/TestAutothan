package pages;

import base.Keywords;

public class ManageTransferPage extends Keywords {

	private String Search = "onlineBanking.SENDREQUEST_MANAGEDTRANSFERS.Search";


	public void searchForParticipant(String searchname) throws Throwable {
		type.data(Search,searchname);
		aReturn.clickEnter(Search);
		aReturn.clickEnter(Search);
	}




}
