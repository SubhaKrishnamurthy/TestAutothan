package pages;

import actions.Wait;
import base.Keywords;
import gherkin.lexer.Th;

public class Dashboard_Home_Page extends Keywords {

	private String SendReceive = "onlineBanking.Dashboard.SendReceive";
	private String fx = "onlineBanking.Dashboard.ForeignExchange";
	private String AccountsManageBtn = "onlineBanking.Dashboard.AccountsMAnageBtn";
	private String AddAccounts = "onlineBanking.Dashboard.AddAccountsLink";
	private String AddExistingAccounts = "onlineBanking.Dashboard.AddExistingAcc";
	private String UITFAccount = "onlineBanking.Dashboard.UITFAccount";
	private String recentTransactionLbl = "onlineBanking.Dashboard.recentTransactionLbl";
	private String viewMoreBtn = "onlineBanking.Dashboard.UITFViewMoreBtn";
	private String TransacHisLbl = "onlineBanking.Dashboard.TransacHisLbl";
	private String SubscriptionsBtn = "onlineBanking.Dashboard.SubscriptionsBtn";
	private String RedemptionsBtn  = "onlineBanking.Dashboard.RedemptionsBtn";
	private String UITFAllBtn = "onlineBanking.Dashboard.UITFAllBtn";
	private String SubscriptionProduct = "onlineBanking.Dashboard.SubscriptionProduct";
	private String RedemptionProduct = "onlineBanking.Dashboard.RedemptionProduct";
	private String ReferenceNo = "onlineBanking.Dashboard.ReferenceNo";
	private String SettlementDate = "onlineBanking.Dashboard.SettlementDate";
	private String TransactionDate = "onlineBanking.Dashboard.TransactionDate";
	private String DescriptionSubs = "onlineBanking.Dashboard.DescriptionSubs";
	private String DescriptionRedemp = "onlineBanking.Dashboard.DescriptionRedemp";
	private String SubscriptionAmt = "onlineBanking.Dashboard.SubscriptionAmt";
	private String UITFElement = "onlineBanking.Dashboard.UITFElement";
	private String UITFLink = "onlineBanking.Dashboard.UITFLink";
	private String GetStartedBtn = "onlineBanking.Dashboard.GetStartedBtn";

	public void clickSendReceive() throws Throwable {
		Wait.forSeconds(5000);
		click.elementBy(SendReceive);
	}

	public void clickFX() throws Throwable {
		Wait.forSeconds(5000);
		click.elementBy(fx);
	}

	public void clickAccountsManageBtn() throws Throwable {
		Wait.forSeconds(5000);
		click.elementBy(AccountsManageBtn);
	}

	public void clickAddExistingAccount() throws Throwable {
		click.elementBy(AddAccounts);
		Wait.forSeconds(2000);
		click.elementBy(AddExistingAccounts);
	}

	public void clickUITFAccount() throws Throwable {
		Wait.forSeconds(4000);
		click.elementBy(UITFAccount);
	}

	public void verifyRecentTransacLbl_ViewMoreBtn() throws Throwable {
		Wait.forSeconds(2000);
		verify.elementIsEnabled(recentTransactionLbl);
		verify.elementIsEnabled(viewMoreBtn);
	}

	public void verifyOtherBtns_UITF() throws Throwable {
		Wait.forSeconds(1000);
		click.elementBy(viewMoreBtn);
		verify.elementIsEnabled(UITFAllBtn);
		verify.elementIsEnabled(SubscriptionsBtn);
		verify.elementIsEnabled(RedemptionsBtn);
		verify.elementIsEnabled(TransacHisLbl);
	}

	public void clickSubsProduct() throws Throwable {
		Wait.forSeconds(1000);
		click.elementBy(SubscriptionProduct);
	}

	public void clickRedempProduct() throws Throwable {
		Wait.forSeconds(1000);
		click.elementBy(RedemptionProduct);
	}

	public void verifySubsDetails() throws Throwable {
		Wait.forSeconds(2000);
		verify.elementIsPresent(ReferenceNo);
		verify.elementIsPresent(TransactionDate);
		verify.elementIsPresent(DescriptionSubs);
		verify.elementIsPresent(SubscriptionAmt);
		verify.elementIsPresent(SettlementDate);
	}

	public void verifyRedempDetails() throws Throwable {
		Wait.forSeconds(2000);
		verify.elementIsPresent(ReferenceNo);
		verify.elementIsPresent(TransactionDate);
		verify.elementIsPresent(DescriptionRedemp);
		verify.elementIsPresent(SettlementDate);
	}

	public void clickUITFElement() throws Throwable {
		Wait.forSeconds(2000);
		click.elementBy(UITFElement);
	}

	public void clickUITFLink() throws Throwable {
		Wait.forSeconds(2000);
		click.elementBy(UITFLink);
		Wait.forSeconds(3000);
	}

	public void clickGetStartedBtn() throws Throwable {
		Wait.forSeconds(1000);
		click.elementBy(GetStartedBtn);
	}
}
