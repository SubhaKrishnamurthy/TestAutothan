package pages;

import actions.Wait;
import base.Keywords;
import cucumber.api.java.es.Y;
import gherkin.lexer.Th;
import helper.PropertyReader;
//

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import stepdefinitions.RequestPayment;

public class RequestPayment_Page extends Keywords {

    private String AnotherUnionBackAcc = "onlineBanking.RequestPayment.AnotherUnionBackAcc";
    private String RequestPaymentLink = "onlineBanking.RequestPayment.RequestPaymentLink";
    private String SearchIcon_RequestPayment = "onlineBanking.RequestPayment.SearchIcon_RequestPayment";
    private String RequestingFrom_amount2 = "onlineBanking.RequestPayment.RequestingFrom_amount2";
    private String Depositto_accountnumber = "onlineBanking.RequestPayment.Depositto_accountnumber";
    private String NewRequest = "onlineBanking.RequestPayment.NewRequest";
    private String TotalAmount_ErrorMsg = "onlineBanking.RequestPayment.TotalAmount_ErrorMsg";
    private String RequestPayment_CancelRequest = "onlineBanking.RequestPayment.RequestPayment_CancelRequest";
    private String Update= "onlineBanking.RequestPayment.Update";
    private String Next_RequestPayment= "onlineBanking.RequestPayment.Next_RequestPayment";
    private String EvenOrUneven = "onlineBanking.RequestPayment.EvenOrUneven";
    private String RequestingFrom_Input2 = "onlineBanking.RequestPayment.RequestingFrom_Input2";
    private String RequestingFrom_amount1 = "onlineBanking.RequestPayment.RequestingFrom_amount1";
    private String DeleteRecipient_RequestPayment = "onlineBanking.RequestPayment.DeleteRecipient_RequestPayment";
    private String Totalamount = "onlineBanking.RequestPayment.Totalamount";
    private String Requesingfrom_accountname = "onlineBanking.RequestPayment.Requesingfrom_accountname";
    private String EvenOrUneven_new = "onlineBanking.RequestPayment.EvenOrUneven_new";
    private String ADDPATRICIPANT  = "onlineBanking.RequestPayment.ADDPATRICIPANT";
    private String Requestpayment_message = "onlineBanking.RequestPayment.RequestPayment_message";
    private String ReqPayMsg_Fnal = "onlineBanking.RequestPayment.RequestPaymentMsgFinal";
    private String Select_Account = "onlineBanking.RequestPayment.Select_Account";

    private String SelectionofParticipant =  "onlineBanking.RequestPayment.AddParticipant.SelectionofParticipant";
    private String ADD = "onlineBanking.RequestPayment.AddParticipant.ADD";
    private String SearchContacts = "onlineBanking.RequestPayment.AddParticipant.SearchContacts";
    private String NewTransaction = "onlineBanking.RequestPayment.NewTransaction";
    private String Requesingfrom_accountnumber = "onlineBanking.RequestPayment.Requesingfrom_accountnumber";
    private String Congratulations = "onlineBanking.RequestPayment.Congratulations";
    private String YourPortionAmt = "onlineBanking.RequestPayment.YourPortionAmt";
    private String GoToDashboard = "onlineBanking.RequestPayment.GoToDashboard";
    private String RequestPayment_home = "onlineBanking.RequestPayment.RequestPayment_home";
    private String RequestingFrom_name2 = "onlineBanking.RequestPayment.RequestingFrom_name2";
    private String Depositto_accountname = "onlineBanking.RequestPayment.Depositto_accountname";
    private String RequestingFrom_mobile1 = "onlineBanking.RequestPayment.RequestingFrom_mobile1";
    private String Header_RequestPayment = "onlineBanking.RequestPayment.Header_RequestPayment";
    private String Edit_RequestPayment = "onlineBanking.RequestPayment.Edit_RequestPayment";
    private String RequestSuccessMessage = "onlineBanking.RequestPayment.RequestSuccessMessage";
    private String Errormsg_amountexceed = "onlineBanking.RequestPayment.Errormsg_amountexceed";
    private String RequestPayment_2 = "onlineBanking.RequestPayment.RequestPayment_2";
    private String TotalBillAmt = "onlineBanking.RequestPayment.TotalBillAmt";
    private String Description_RequestPayment = "onlineBanking.RequestPayment.Description_RequestPayment";
    private String RequestingFrom_Input1 = "onlineBanking.RequestPayment.RequestingFrom_Input1";
    private String Hangon = "onlineBanking.RequestPayment.Hangon";
    private String Amount2 = "onlineBanking.RequestPayment.amount2";
    private String RequesingFrom_amount = "onlineBanking.RequestPayment.RequesingFrom_amount";
    private String RequestingFrom_mobile2 = "onlineBanking.RequestPayment.RequestingFrom_mobile2";
    private String RequestingFrom_name1 = "onlineBanking.RequestPayment.RequestingFrom_name1";
    private String keyAmount="onlineBanking.Fundtransfer.TxtAmount";
    private String TRANSFERPHPXXXX = "onlineBanking.RequestPayment.Review.TRANSFERPHPXXXX";
    private String Amount1 = "onlineBanking.RequestPayment.amount1";
    private String AddPeople_Name = "onlineBanking.RequestPayment.AddPeople.Name";
    private String AddPeople_MobileNumber= "onlineBanking.RequestPayment.AddPeople.MobileNumber";
    private String Search = "onlineBanking.SENDREQUEST_MANAGEDTRANSFERS.Search";
    private String SplitBills = "onlineBanking.RequestPayment.SplitBills";


    public void clickRequestPaymentLink() throws Throwable
    {
        click.elementBy(AnotherUnionBackAcc);
        click.elementBy(RequestPaymentLink);
    }

    public void clickSplitBillsLink() throws Throwable {
        click.elementBy(AnotherUnionBackAcc);
        click.elementBy(SplitBills);
    }
    public void selectOption(String option) throws Throwable {
        Wait.forSeconds(2000);
        select.backOffice_selectValueInAnyList(EvenOrUneven_new,option);
    }

    public void AddParticipant(String name) throws Throwable {
        Wait.forSeconds(2000);
        jsClick.elementBy(ADDPATRICIPANT);
        type.data(SearchContacts,name);
        click.elementBy(SelectionofParticipant);
        click.elementBy(ADD);
    }

    public void enterRequestMessage(String msg) throws Throwable {
        type.data(Requestpayment_message,msg);
    }

    public void SelectAccount() throws Throwable{
        click.elementBy(Select_Account);
    }

    public void verifyNextBtnDisabled() throws Throwable {
        verify.elementIsDisabled(Next_RequestPayment);
    }

    public void verifyAmountValue(String amt) throws Throwable {
        verify.elementTextContains(keyAmount,amt);
    }

    public void verifyAmountErrMsg(String msg) throws Throwable {
        click.elementBy(Header_RequestPayment);
        verify.elementTextMatching(Errormsg_amountexceed,msg);
    }

    public void clickNextButton() throws Throwable {
        click.elementBy(Next_RequestPayment);
    }

    public void clickPHPBtn() throws Throwable {
        click.elementBy(TRANSFERPHPXXXX);
    }

    public void verifyCongMsg_OtherDetails() throws Throwable {
        Wait.forSeconds(2000);
        verify.IfElementExists(Congratulations);
        verify.elementTextMatching(Requesingfrom_accountname, PropertyReader.testDataOf("Requesingfrom_accountname"));
        verify.elementTextMatching(Requesingfrom_accountnumber,PropertyReader.testDataOf("Requesingfrom_accountnumber"));
        verify.elementTextMatching(RequesingFrom_amount,PropertyReader.testDataOf("RequesingFrom_amount"));
        verify.elementTextMatching(Totalamount,PropertyReader.testDataOf("Totalamount"));
        verify.elementTextMatching(ReqPayMsg_Fnal,PropertyReader.testDataOf("Requestpayment_message"));
        verify.elementTextContains(Depositto_accountname,PropertyReader.testDataOf("Depositto_accountname"));
        verify.elementTextContains(Depositto_accountnumber,PropertyReader.testDataOf("Depositto_accountnumber"));
        }

    public void verifyCongMsg_OtherDetails1() throws Throwable {
        Wait.forSeconds(2000);
        verify.IfElementExists(Congratulations);
        verify.elementTextMatching(Requesingfrom_accountname, PropertyReader.testDataOf("Requesingfrom_accountname"));
        verify.elementTextMatching(Requesingfrom_accountnumber,PropertyReader.testDataOf("Requesingfrom_accountnumber"));
        verify.elementTextMatching(RequesingFrom_amount,PropertyReader.testDataOf("RequesingFrom_amount"));
        verify.elementTextMatching(Totalamount,PropertyReader.testDataOf("Totalamount"));
        verify.elementTextMatching(ReqPayMsg_Fnal,PropertyReader.testDataOf("Requestpayment_message"));
        verify.elementTextContains(Depositto_accountname,PropertyReader.testDataOf("Depositto_accountname1"));
        verify.elementTextContains(Depositto_accountnumber,PropertyReader.testDataOf("Depositto_accountnumber1"));
    }
        public void verifyCongMsg_OtherDetails_2Participants(String amount1,String amount2,String totalAmt) throws Throwable{
        Wait.forSeconds(2000);
        verify.IfElementExists(Congratulations);
        verify.elementTextMatching(RequestingFrom_name2, PropertyReader.testDataOf("Requestingfrom_name2"));
        verify.elementTextMatching(RequestingFrom_mobile2,PropertyReader.testDataOf("Requestingfrom_mobile2"));
        verify.elementTextMatching(RequestingFrom_amount2,amount2);
        verify.elementTextMatching(RequestingFrom_name1, PropertyReader.testDataOf("Requestingfrom_name1"));
        verify.elementTextMatching(RequestingFrom_mobile1,PropertyReader.testDataOf("Requestingfrom_mobile1"));
        verify.elementTextMatching(RequestingFrom_amount1,amount1);
        verify.elementTextMatching(Totalamount,totalAmt);
        verify.elementTextMatching(ReqPayMsg_Fnal,PropertyReader.testDataOf("Requestpayment_message"));
        verify.elementTextContains(Depositto_accountname,PropertyReader.testDataOf("Depositto_accountname"));
        verify.elementTextContains(Depositto_accountnumber,PropertyReader.testDataOf("Depositto_accountnumber"));
    }

    public void verifyDescription(String msg) throws Throwable {
        Wait.forSeconds(1000);
        verify.elementTextMatching(Description_RequestPayment,msg);
    }

    public void enterAmount1(String amt) throws Throwable {
        type.data(Amount1,amt);
    }

    public void clickAddIcon() throws Throwable {
       click.elementBy(ADDPATRICIPANT);
        Wait.forSeconds(2000);
        WebElement element = driver.findElement(By.cssSelector("div > div > div.header-foreground > div > div.right.part > a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
        Wait.forSeconds(2000);
    }

    public void enterName(String name) throws Throwable {
        type.data(AddPeople_Name,name);
    }

    public void enterMobileNumber(String monileNo) throws Throwable {
        type.data(AddPeople_MobileNumber,monileNo);
    }

    public void splitAmount(String amt1,String amt2) throws Throwable {
        click.elementBy(RequestPayment_2);
        selectOption("Unevenly");
        type.data(RequestingFrom_Input1,amt1);
        type.data(RequestingFrom_Input2,amt2);
    }

    public void verifyTotalAmtErrMsg() throws Throwable {
        verify.elementIsPresent(TotalAmount_ErrorMsg);
    }

    public void verifyAmountDisabled(String amt1, String amt2) throws Throwable {
        Wait.forSeconds(4000);
       /*
        // verify.elementTextContains(RequestingFrom_Input1,amt1);
       // verify.elementTextContains(RequestingFrom_Input2,amt2);
        String input1= driver.findElement(By.xpath("(//span[@class=\"ant-input-wrapper ant-input-group\"]/span/input)[1]")).getText();
        verify.elementTextMatching(input1,amt1);
        String input2 = driver.findElement(By.xpath("(//span[@class=\"ant-input-wrapper ant-input-group\"]/span/input)[2]")).getText();
        verify.elementTextMatching(input2,amt2);
        */
        verify.elementIsDisabled(RequestingFrom_Input1);
        verify.elementIsDisabled(RequestingFrom_Input2);
    }

    public void verifyAmountEnabled(String amt1,String amt2) throws Throwable {
        Wait.forSeconds(4000);
        //verify.elementTextContains(RequestingFrom_Input1,amt1);
        //verify.elementTextMatching(RequestingFrom_Input1,amt1);
        //verify.elementTextContains(RequestingFrom_Input2,amt2);
        verify.elementIsEnabled(RequestingFrom_Input1);
        verify.elementIsEnabled(RequestingFrom_Input2);
    }

    public void confirmCancelRequest() throws Throwable {
        click.elementBy(RequestPayment_CancelRequest);
    }

    public void verifyAccountName_Number() throws Throwable {
        verify.elementTextMatching(Requesingfrom_accountname, PropertyReader.testDataOf("Requesingfrom_accountname"));
        verify.elementTextMatching(Requesingfrom_accountnumber,PropertyReader.testDataOf("Requesingfrom_accountnumber"));
    }

    public void clickDepositToAccNum() throws Throwable{
        click.elementBy(Depositto_accountnumber);
    }

    public void verifyDepositToAccNum() throws Throwable {
        Wait.forSeconds(2000);
        verify.elementTextContains(Depositto_accountnumber,PropertyReader.testDataOf("Depositto_accountnumberFull"));
    }

    public void clickEditBtn() throws Throwable {
        Wait.forSeconds(2000);
        click.elementBy(Edit_RequestPayment);
    }

    public void verifyCongMsg_OtherDetails_SplitBills(String fromAccName,String FromAccNumber,String RequesingAmount,String TotalBill,String YourAmount,String message,String DepositToAccName,String DepositToAccNumber) throws Throwable {
        verify.IfElementExists(Congratulations);
        verify.elementTextMatching(Requesingfrom_accountname,fromAccName);
        verify.elementTextMatching(Requesingfrom_accountnumber,FromAccNumber);
        verify.elementTextMatching(RequesingFrom_amount,RequesingAmount);
        verify.elementTextMatching(TotalBillAmt,TotalBill);
        verify.elementTextMatching(YourPortionAmt,YourAmount);
        //verify.elementTextMatching(Requestpayment_message,message);
        verify.elementTextMatching(Depositto_accountname,DepositToAccName);
        verify.elementTextMatching(Depositto_accountnumber,DepositToAccNumber);
    }

    public void clickGoToDashboard() throws Throwable {
        click.elementBy(GoToDashboard);
    }

    public void splitYourPortionAmt_RequesingAmt(String YourPortionAmt,String RequesingAmt) throws Throwable {
        type.data(Amount1,YourPortionAmt);
        type.data(Amount2,RequesingAmt);
    }
}
