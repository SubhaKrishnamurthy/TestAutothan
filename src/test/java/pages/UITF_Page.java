package pages;

import actions.Wait;
import base.Keywords;

import static driver.DriverManager.Drivertype;
import static driver.DriverManager.EnvironmentType;
//import org.python.antlr.op.Eq;

public class UITF_Page extends Keywords {

    private String AllBtn = "onlineBanking.UITF.AllBtn";
    private String MultiAssetContent = "onlineBanking.UITF.MultiAssetContent";
    private String PHPEquityContent = "onlineBanking.UITF.PHPEquityContent";
    private String PHPFixedIncomeContent = "onlineBanking.UITF.PHPFixedIncomeContent";
    private String USDFixedIncomeContent = "onlineBanking.UITF.USDFixedIncomeContent";
    private String PHPFixedIncome = "onlineBanking.UITF.PHPFixedIncome";
    private String USDFixedIncome = "onlineBanking.UITF.USDFixedIncome";
    private String EquityBtn = "onlineBanking.UITF.EquityBtn";
    private String MultiAssetBtn = "onlineBanking.UITF.MultiAssetBtn";
    private String WeekBtn = "onlineBanking.UITF.WeekBtn";
    private String MonthlyBtn = "onlineBanking.UITF.MonthlyBtn";
    private String YearlyBtn = "onlineBanking.UITF.YearlyBtn";
    private String InvesmentObjectiveLbl = "onlineBanking.UITF.InvesmentObjectiveLbl";
    private String YearOn = "onlineBanking.UITF.YearOn";
    private String YearTo = "onlineBanking.UITF.YearTo";
    private String CurrencyLbl = "onlineBanking.UITF.CurrencyLbl";
    private String MinimumLbl = "onlineBanking.UITF.MinimumLbl";
    private String Trust = "onlineBanking.UITF.Trust";
    private String Holding = "onlineBanking.UITF.Holding";
    private String SubscriptionLbl = "onlineBanking.UITF.SubscriptionLbl";
    private String RedemptionLbl = "onlineBanking.UITF.RedemptionLbl";
    private String SubscribeBtn = "onlineBanking.UITF.SubscribeBtn";
    private String RedeemBtn = "onlineBanking.UITF.RedeemBtn";
    private String SubscriptionDetailsLabel = "onlineBanking.UITF.SubscriptionDetailsLabel";
    private String NextButton = "onlineBanking.UITF.NextButton";
    private String SubAmt = "onlineBanking.UITF.SubAmt";
    private String SubscribeBtnFinal = "onlineBanking.UITF.SubscribeBtnFinal";
    private String ImpPopupLabel = "onlineBanking.UITF.ImpPopupLabel";
    private String CancelSubsBtn = "onlineBanking.UITF.CancelSubsBtn";
    private String ProceedBtn = "onlineBanking.UITF.ProceedBtn";
    private String SubscriptionSuccessLbl = "onlineBanking.UITF.SubscriptionSuccessLbl";
    private String SubsAmtLbl = "onlineBanking.UITF.SubsAmtLbl";
    private String SubsAmtValue = "onlineBanking.UITF.SubsAmtValue";
    private String RedemptionSucceessLbl = "onlineBanking.UITF.RedemptionSucceessLbl";
    private String UnitToRedem = "onlineBanking.UITF.UnitToRedem";
    private String RedeemValue = "onlineBanking.UITF.RedemValue";
    private String CancelRedemptionBtn = "onlineBanking.UITF.CancelRedemptionBtn";
    private String RedemptionDetailsLabel = "onlineBanking.UITF.RedemptionLbl";
    private String RedeemBtnFinal = "onlineBanking.UITF.RedemBtnFinal";
    private String AccNumberTxt = "onlineBanking.UITF.AccNumberTxt";
    private String Errormessage_NonExistingUITFAccNo = "onlineBanking.UITF.Errormessage_NonExistingUITFAccNo";
    private String ErrorOKButton = "onlineBanking.UITF.ErrorOKButton";
    private String DashboardLink = "onlineBanking.HomePage.DashboardLink";

    public SendMoney_Ownaccount ownaccount = new SendMoney_Ownaccount();
    public Dashboard_Home_Page dashboardHomePage = new Dashboard_Home_Page();

    public void click_Dashboard() throws Throwable {
     jsClick.elementBy(DashboardLink);
    }

    public void FilterAll() throws Throwable {
        verify.IfElementExists(AllBtn);
        click.elementBy(AllBtn);
    }

    public void verifyAllProducts() throws Throwable {
        verify.elementIsPresent(MultiAssetContent);
        verify.elementIsPresent(PHPEquityContent);
        verify.elementIsPresent(PHPFixedIncomeContent);
        verify.elementIsPresent(USDFixedIncomeContent);
    }

    public void FilterPHPIncome() throws Throwable {
       verify.IfElementExists(PHPFixedIncome);
        click.elementBy(PHPFixedIncome);
    }

    public void verifyPHPIncomeProducts() throws Throwable {
        verify.elementIsPresent(PHPFixedIncomeContent);
    }

    public void clickPHPIncomeProduct() throws Throwable {
        click.elementBy(PHPFixedIncomeContent);
    }

    public void FilterUSDIncome() throws Throwable {
        verify.IfElementExists(USDFixedIncome);
        click.elementBy(USDFixedIncome);
    }

    public void verifyUSDIncomeProducts() throws Throwable {
        verify.elementIsPresent(USDFixedIncomeContent);
    }

    public void FilterEquity() throws Throwable {
        verify.IfElementExists(EquityBtn);
        click.elementBy(EquityBtn);
    }

    public void verifyEquityProducts() throws Throwable {
        verify.elementIsPresent(PHPEquityContent);
    }

    public void FilterMultiAsset() throws Throwable {
        verify.IfElementExists(MultiAssetBtn);
        click.elementBy(MultiAssetBtn);
    }

    public void verifyMultiAssetProducts() throws Throwable {
        verify.elementIsPresent(MultiAssetContent);
    }

    public void verifyPerformance_ProductDetails() throws Throwable {
        Wait.forSeconds(1000);
        verify.elementIsPresent(WeekBtn);
        verify.elementIsPresent(MonthlyBtn);
        verify.elementIsPresent(YearlyBtn);
        verify.elementIsPresent(InvesmentObjectiveLbl);
        verify.elementIsPresent(YearOn);
        verify.elementIsPresent(YearTo);
        verify.elementIsPresent(CurrencyLbl);
        verify.elementIsPresent(MinimumLbl);
        verify.elementIsPresent(Trust);
        verify.elementIsPresent(Holding);
        verify.elementIsPresent(SubscriptionLbl);
        verify.elementIsPresent(RedemptionLbl);
    }

        public void clickSubscribeBtn() throws Throwable {
        Wait.forSeconds(15000);
        click.elementBy(SubscribeBtn);
        Wait.forSeconds(8000);
        }

        public void enterSubscriptionDetails() throws Throwable {
            //Wait.forSeconds(3000);
            //verify.elementIsPresent(SubscriptionDetailsLabel);
            type.data(SubAmt,"100");
            Wait.forSeconds(1000);
            click.elementBy(NextButton);
        }

        public void clickSubscribeFinalBtn() throws Throwable {

            if(Drivertype.equalsIgnoreCase("safari") && EnvironmentType.equalsIgnoreCase("mac") ) {
                Wait.forSeconds(2000);
                get.elementBy(SubscribeBtnFinal).click();
                verify.elementISPresent_MacSafari(ImpPopupLabel);
                click.elementBy(ProceedBtn);

            }
            else{
                Wait.forSeconds(2000);
                click.elementBy(SubscribeBtnFinal);
                verify.IfElementExists(ImpPopupLabel);
                click.elementBy(ProceedBtn);

            }
            Wait.forSeconds(2000);
            ownaccount.entertheOTPOTPpage("222222");
        }

        public void verifySubscriptionSuccess() throws Throwable {
        verify.elementIsPresent(SubscriptionSuccessLbl);
        verify.elementIsPresent(SubsAmtLbl);
        verify.elementTextMatching(SubsAmtValue,"USD 100.00");
        }

        public void clickRedeemBtn() throws Throwable {
        Wait.forSeconds(15000);
        click.elementBy(RedeemBtn);
            Wait.forSeconds(8000);
        }

        public void enterRedemptionDetails() throws Throwable {
            //Wait.forSeconds(2000);
            //verify.elementIsPresent(RedemptionDetailsLabel);
            type.data(SubAmt,"1");
            click.elementBy(NextButton);
        }

        public void clickRedeemFinalBtn() throws Throwable
        {
            if(Drivertype.equalsIgnoreCase("safari") && EnvironmentType.equalsIgnoreCase("mac") ) {
                Wait.forSeconds(2000);
                get.elementBy(RedeemBtnFinal).click();
                verify.elementISPresent_MacSafari(ImpPopupLabel);
                click.elementBy(ProceedBtn);
            }
            else{
                Wait.forSeconds(2000);
                click.elementBy(RedeemBtnFinal);
                verify.IfElementExists(ImpPopupLabel);
                click.elementBy(ProceedBtn);
            }
            Wait.forSeconds(2000);
            ownaccount.entertheOTPOTPpage("222222");

        }

        public void verifyRedemptionSuccess() throws Throwable {
            verify.elementIsPresent(RedemptionSucceessLbl);
            verify.elementIsPresent(UnitToRedem);
            //verify.elementTextMatching(RedeemValue,"1.000000 Units");
        }

        public void enterBlank_VerifyNextBtn() throws Throwable {
        type.data(AccNumberTxt,"");
            Wait.forSeconds(1000);
        verify.elementIsDisabled(NextButton);
        }

        public void enterLessthan12digits_VerifyNxtBtn() throws Throwable {
            type.data(AccNumberTxt,"12345678911");
            Wait.forSeconds(1000);
            verify.elementIsDisabled(NextButton);
        }

        public void enterMoreThan16Digits_VerifyNxtBtn() throws Throwable {
            type.data(AccNumberTxt,"12345678911234567892");
            Wait.forSeconds(2000);
            AccNumberTxt.compareTo("1234567891123456");
            Wait.forSeconds(1000);
            verify.elementIsEnabled(NextButton);
        }

        public void enterNonExistingNum_VerifyErrMsg() throws Throwable {
            type.data(AccNumberTxt,"123456789112");
            click.elementBy(NextButton);
           verify.elementIsPresent(Errormessage_NonExistingUITFAccNo);
            Wait.forSeconds(3000);
            click.elementBy(ErrorOKButton);
        }
}
