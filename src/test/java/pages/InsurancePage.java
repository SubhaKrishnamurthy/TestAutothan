package pages;

import base.Keywords;
import base.Test;
import actions.Wait;
import exceptions.ApplicationException;
import org.apache.log4j.Logger;

import static driver.DriverManager.Drivertype;
import static driver.DriverManager.EnvironmentType;

public class InsurancePage extends Keywords {

    private String ReferenceNumber  =  "onlineBanking.Insurance.ReferenceNumber";
    private String PurchasedOn  =  "onlineBanking.Insurance.PurchasedOn";
    private String Coverage  =  "onlineBanking.Insurance.Coverage";
    private String Status  =  "onlineBanking.Insurance.Status";
    private String FromAccount  =  "onlineBanking.Insurance.FromAccount";
    private String Amount  =  "onlineBanking.Insurance.Amount";
    private String ViewReminders  =  "onlineBanking.Insurance.ViewReminders";
    private String PurchaseSuccessfulTitle  =  "onlineBanking.Insurance.PurchaseSuccessfulTitle";
    private String ReferenceNumberValue  =  "onlineBanking.Insurance.ReferenceNumberValue";
    private String ActivationPopUpCloseBtn  =  "onlineBanking.Insurance.ActivationPopUpCloseBtn";
    private String CancelInsuranceBtn  =  "onlineBanking.Insurance.CancelInsuranceBtn";
    private String CancelPurchasePopUpTilte  =  "onlineBanking.Insurance.CancelPurchasePopUpTilte";
    private String CancelReason  =  "onlineBanking.Insurance.CancelReason";
    private String CancelPurchaseBtn  =  "onlineBanking.Insurance.CancelPurchaseBtn";
    private String InsuranceMarketplaceTitle  =  "onlineBanking.Insurance.InsuranceMarketplaceTitle";
    private String AccidentInsurance4  =  "onlineBanking.Insurance.AccidentInsurance4";
    private String LifeInsurance1  =  "onlineBanking.Insurance.LifeInsurance1";
    private String LifeInsurance2  =  "onlineBanking.Insurance.LifeInsurance2";
    private String LifeInsurance3  =  "onlineBanking.Insurance.LifeInsurance3";
    private String LifeInsurance4  =  "onlineBanking.Insurance.LifeInsurance4";
    private String PurchaseFor  =  "onlineBanking.Insurance.PurchaseFor";
    private String PurchaseFormTitle  =  "onlineBanking.Insurance.PurchaseFormTitle";
    private String HeresyourtransactionsummaryTitle  =  "onlineBanking.Insurance.HeresyourtransactionsummaryTitle";
    private String TermsandConditions  =  "onlineBanking.Insurance.TermsandConditions";
    private String MyInsurancesTitle  =  "onlineBanking.Insurance.MyInsurancesTitle";
    private String LifeProductUnderMyInsurances  =  "onlineBanking.Insurance.LifeProductUnderMyInsurances";
    private String PurchaseDetailsTitle  =  "onlineBanking.Insurance.PurchaseDetailsTitle";
    private String PurchaseCancelledTitle  =  "onlineBanking.Insurance.PurchaseCancelledTitle";
    private String ContinueBrowsingBtn  =  "onlineBanking.Insurance.ContinueBrowsingBtn";
    private String ProductUnderMyInsurance1  =  "onlineBanking.Insurance.ProductUnderMyInsurance1";
    private String ProductUnderMyInsurance2  =  "onlineBanking.Insurance.ProductUnderMyInsurance2";
    private String WhatdouwanttoInsureTitle  =  "onlineBanking.Insurance.WhatdouwanttoInsureTitle";
    private String Accident  =  "onlineBanking.Insurance.Accident";
    private String Life  =  "onlineBanking.Insurance.Life";
    private String ViewMore  =  "onlineBanking.Insurance.ViewMore";
    private String AccidentInsurance1  =  "onlineBanking.Insurance.AccidentInsurance1";
    private String AccidentInsurance2  =  "onlineBanking.Insurance.AccidentInsurance2";
    private String AccidentInsurance3  =  "onlineBanking.Insurance.AccidentInsurance3";
    private String ViewInsurance  =  "onlineBanking.Insurance.ViewInsurance";
    private String InsurancePurchaseSuccessful  =  "onlineBanking.Insurance.InsurancePurchaseSuccessful";
    private String InsuranceCancelled  =  "onlineBanking.Insurance.InsuranceCancelled";
    private String GetProtected = "onlineBanking.Insurance.GetProtected";
    private String ImpPopupLabel = "onlineBanking.UITF.ImpPopupLabel";
    private String ProceedBtn = "onlineBanking.UITF.ProceedBtn";
    private String Inbox = "onlineBanking.Insurance.Inbox";
    private String Transactions = "onlineBanking.Insurance.Transactions";
    private String SubmitBtn = "onlineBanking.Insurance.SubmitBtn";

    CommonMethodsPage commonMethods = new CommonMethodsPage();
    SendMoney_Ownaccount Ownaccount = new SendMoney_Ownaccount();
   // private Wait ;

    public void click_viewInsuranceBtn() throws Throwable {
        verify.elementIsPresent(GetProtected);
        verify.elementIsPresent(ViewInsurance);
        jsClick.elementBy(ViewInsurance);
    }

    public void Verify_MarketPlacePage() throws Throwable {
        verify.elementIsPresent(Accident);
        verify.elementIsPresent(Life);
        verify.elementIsPresent(ViewMore);
        jsClick.elementBy(Accident);
        verify.elementIsPresent(AccidentInsurance1);
        verify.elementIsPresent(AccidentInsurance2);
        verify.elementIsPresent(AccidentInsurance3);
        verify.elementIsPresent(AccidentInsurance4);
        jsClick.elementBy(Life);
        verify.elementIsPresent(LifeInsurance1);
        verify.elementIsPresent(LifeInsurance2);
        verify.elementIsPresent(LifeInsurance3);
      //  verify.elementIsPresent(LifeInsurance4);
        jsClick.elementBy(ViewInsurance);
    }

    public void verify_InlifePurchasedProduct() throws ApplicationException {
        verify.elementIsPresent(Accident);
        verify.elementIsPresent(Life);
        verify.elementIsPresent(ViewMore);
        jsClick.elementBy(ViewMore);
        Wait.forSeconds(2000);
        if (Drivertype.equalsIgnoreCase("safari") && EnvironmentType.equalsIgnoreCase("mac")) {
            verify.elementISPresent_MacSafari(MyInsurancesTitle);
        } else {
            Wait.forSeconds(2000);
            verify.elementIsPresent(MyInsurancesTitle);
        }
        click.elementBy(LifeProductUnderMyInsurances);
        Wait.forSeconds(2000);

        if (Drivertype.equalsIgnoreCase("safari") && EnvironmentType.equalsIgnoreCase("mac")) {
            verify.elementISPresent_MacSafari(PurchaseDetailsTitle);
            verify.elementISPresent_MacSafari(ReferenceNumber);
            verify.elementISPresent_MacSafari(PurchasedOn);
            verify.elementISPresent_MacSafari(FromAccount);
            verify.elementISPresent_MacSafari(Coverage);
            verify.elementISPresent_MacSafari(Status);
            verify.elementISPresent_MacSafari(Amount);
            verify.elementISPresent_MacSafari(ViewReminders);
            jsClick.elementBy(ViewInsurance);
        }
        else {
            verify.elementIsPresent(PurchaseDetailsTitle);
            verify.elementIsPresent(ReferenceNumber);
            verify.elementIsPresent(PurchasedOn);
            verify.elementIsPresent(FromAccount);
            verify.elementIsPresent(Coverage);
            verify.elementIsPresent(Status);
            verify.elementIsPresent(Amount);
            verify.elementIsPresent(ViewReminders);
            jsClick.elementBy(ViewInsurance);
        }
    }

    public void cancelPreviousAccident() throws Throwable{
        click.elementBy(ProductUnderMyInsurance1);
        try {
            if (CancelInsuranceBtn != null)
            {
                jsClick.elementBy(CancelInsuranceBtn);
                verify.elementIsPresent(CancelPurchasePopUpTilte);
                jsClick.elementBy(CancelReason);
                jsClick.elementBy(CancelPurchaseBtn);
                verify.elementIsPresent(PurchaseCancelledTitle);
                verify.elementIsPresent(ContinueBrowsingBtn);
                jsClick.elementBy(ContinueBrowsingBtn);
            }
            else {
                verify.elementIsPresent(Accident);
            }
        }
        catch (ApplicationException e) {
            e.printStackTrace();
        }
    }

    public void purchase_AccidentProduct() throws Throwable {
        verify.elementIsPresent(Accident);
        Wait.forSeconds(3000);
        click.elementBy(Accident);
        click.elementBy(AccidentInsurance1);
        jsClick.elementBy(PurchaseFor);
        verify.elementIsPresent(InsuranceMarketplaceTitle);
        verify.elementIsPresent(PurchaseFormTitle);
        commonMethods.clickkeySelectAcc();
        commonMethods.clickFromAccNumber();
        Ownaccount.clickNextbutton();
        verify.elementIsPresent(HeresyourtransactionsummaryTitle);
        click.elementBy(TermsandConditions);
        jsClick.elementBy(PurchaseFor);
        verify.IfElementExists(ImpPopupLabel);
        click.elementBy(ProceedBtn);
       // Ownaccount.verifyOTPpageisdisplayed();
        Ownaccount.entertheOTPOTPpage("222222");
        //click.elementBy(SubmitBtn);
    }

    public void verify_PurchaseSuccessTitle() throws Throwable {
         verify.elementIsPresent(PurchaseSuccessfulTitle);
         click.elementBy(ViewInsurance);
    }

    public void click_Transactions() throws Throwable {
         click.elementBy(Inbox);
         click.elementBy(Transactions);
    }

    public void verify_Details_PurchasedProduct() throws Throwable {
         //verify.elementIsPresent(InsuranceCancelled);
         verify.elementIsPresent(InsurancePurchaseSuccessful);
         click.elementBy(InsurancePurchaseSuccessful);
         Wait.forSeconds(1000);
         verify.elementIsPresent(ReferenceNumber);
         verify.elementIsPresent(PurchasedOn);
         verify.elementIsPresent(FromAccount);
         verify.elementIsPresent(Coverage);
         verify.elementIsPresent(Status);
         verify.elementIsPresent(Amount);
         verify.elementIsPresent(ViewReminders);
    }
}
