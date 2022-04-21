package pages;

import actions.Verify;
import actions.Wait;
import base.Keywords;
import exceptions.ApplicationException;

public class ReportCardPage extends Keywords {

    private String PlayeverydayCreditCard = "onlineBanking.ReportCard.PlayeverydayCreditCard";
    private String ManageCard = "onlineBanking.CC.ManageCard";
    private String ReportCard = "onlineBanking.ReportCard.ReportCardLost";
    private String LockYourCardPopup = "onlineBanking.ReportCard.LockYourCardPopup";
    private String GoBackButton = "onlineBanking.ReportCard.GoBackButton";
    private String LockMyCardButton = "onlineBanking.ReportCard.LockMyCardButton";
    private String CardUnlocked = "onlineBanking.ReportCard.CardIsUnlocked";
    private String CardLocked = "onlineBanking.ReportCard.CardIsLocked";
    private String SwitchButton= "onlineBanking.ReportCard.SwitchButton";
    private String UnlockMyCardButton = "onlineBanking.ReportCard.UnlockMyCardButton";
    private String YourCardIsLockedTitle ="onlineBanking.ReportCard.YourCardIsLockedTitle";
    private String MaybeLaterButton = "onlineBanking.ReportCard.MaybeLaterButton";
    private String ProceedToCardReportingButton = "onlineBanking.ReportCard.ProceedToCardReportingButton";
    private String CardReplacementDetails= "onlineBanking.ReportCard.CardReplacementDetails";
    private String Reminder= "onlineBanking.ReportCard.Reminder";
    private String DeliverTo= "onlineBanking.ReportCard.DeliverTo";
    private String HomeAddress= "onlineBanking.ReportCard.HomeAddress";
    private String WorkAddress= "onlineBanking.ReportCard.WorkAddress";
    private String UpdateAddress= "onlineBanking.ReportCard.UpdateAddress";
    private String Landmark = "onlineBanking.ReportCard.Landmark";
    private String DeliveryAddress= "onlineBanking.ReportCard.DeliveryAddress";
    private String NoWorkAddressMessage= "onlineBanking.ReportCard.NoWorkAddressMessage";
    private String UpdateMyAddress= "onlineBanking.ReportCard.UpdateMyAddress";
    private String EmailCustomerService= "onlineBanking.ReportCard.EmailCustomerService";
    private String EmailNowButton= "onlineBanking.ReportCard.EmailNowButton";
    private String ReportCardTitle= "onlineBanking.ReportCard.ReportCardTitle";
    private String ILostMyCard= "onlineBanking.ReportCard.ILostMyCard";
    private String ReportLostCardTitle= "onlineBanking.ReportCard.ReportLostCardTitle";
    private String MyCardGotStolen = "onlineBanking.ReportCard.MyCardGotStolen";
    private String LocationTitle= "onlineBanking.ReportCard.LocationTitle";
    private String DateTimeTitle= "onlineBanking.ReportCard.DateTimeTitle";
    private String LocationInput= "onlineBanking.ReportCard.LocationInput";
    private String ReportMyLostCard= "onlineBanking.ReportCard.ReportMyLostCard";
    private String CardReplacementConfirmation= "onlineBanking.ReportCard.CardReplacementConfirmation";
    private String Type= "onlineBanking.ReportCard.Type";
    private String CardName= "onlineBanking.ReportCard.CardName";
    private String DeliverToAddress= "onlineBanking.ReportCard.DeliverToAddress";
    private String CardFee= "onlineBanking.ReportCard.CardFee";









    private GreenPinPage greenPinPage = new GreenPinPage();

    public void select_PlayeverydayCreditCard() throws Throwable {
        Wait.forSeconds(6000);
        click.elementBy(PlayeverydayCreditCard);
    }
    public void clickManageCard() throws Throwable {
        Wait.forSeconds(4000);
        click.elementBy(ManageCard);
    }
    public void verifyReportCard() throws Throwable {
        Wait.forSeconds(2000);
        verify.elementIsPresent(ReportCard);
    }
    public void clickReportCard() throws Throwable {
        Wait.forSeconds(3000);
       if(verify.IfElementExistsboolean(CardUnlocked))
        {
            jsClick.elementBy(ReportCard);
        }
        else
        {
         jsClick.elementBy(SwitchButton);
         click.elementBy(UnlockMyCardButton);
            String OTP="111111";
            Wait.forSeconds(3000);
            char[] ch=OTP.toCharArray();
            greenPinPage.enter_Pin(String.valueOf(ch[0]),String.valueOf(ch[1]),String.valueOf(ch[2]),
                    String.valueOf(ch[3]),String.valueOf(ch[4]),String.valueOf(ch[5]));
            Wait.forSeconds(3000);
            jsClick.elementBy(ReportCard);
        }
    }
    public void verify_LockYourCallPopup() throws Throwable {
        Wait.forSeconds(2000);
        verify.elementIsPresent(LockYourCardPopup);
    }
    public void verify_PopupButtons(String goBack, String lockMyCard) throws Throwable {
        Wait.forSeconds(2000);
        verify.elementTextMatching(GoBackButton,goBack);
        verify.elementTextMatching(LockMyCardButton,lockMyCard);
    }
    public void clickLockMyCard() throws Throwable {
        Wait.forSeconds(1000);
        click.elementBy(LockMyCardButton);
    }
    public void verify_LockedSuccessPage() throws Throwable {
        Wait.forSeconds(2000);
        verify.elementIsPresent(YourCardIsLockedTitle);
    }
    public void verify_CardisLockedButtons(String MaybeLater, String CardReporting) throws Throwable {
        Wait.forSeconds(2000);
        verify.elementTextMatching(MaybeLaterButton,MaybeLater);
        verify.elementTextMatching(ProceedToCardReportingButton,CardReporting);
    }
    public void clickGoBack() throws Throwable {
        Wait.forSeconds(1000);
        click.elementBy(GoBackButton);
    }
    public void verify_CardisUnlocked() throws Throwable {
        verify.elementIsPresent(CardUnlocked);
        //verify.IfElementExistsboolean(CardUnlocked)
    }
    public void verify_CardisLocked() throws Throwable {
        verify.elementIsPresent(CardLocked);
        //verify.IfElementExistsboolean(CardLocked)
    }
    public void clickMaybeLater() throws Throwable {
        Wait.forSeconds(1000);
        click.elementBy(MaybeLaterButton);
    }
    public void clickProceedToCardReporting() throws Throwable {
        Wait.forSeconds(2000);
        click.elementBy(ProceedToCardReportingButton);
    }
    public void verify_CardReplacementDetailsHeader() throws Throwable {
        Wait.forSeconds(1000);
        click.elementBy(GoBackButton);
        verify.elementIsPresent(CardReplacementDetails);
    }
    public void verify_ViewTheCardReplacement() throws Throwable {
        verify.elementIsPresent(Reminder);
        verify.elementIsPresent(DeliverTo);
        verify.elementIsPresent(HomeAddress);
        verify.elementIsPresent(WorkAddress);
        verify.elementIsPresent(UpdateAddress);
        verify.elementIsPresent(Landmark);
        verify.elementIsPresent(DeliveryAddress);

    }
    public void clickWorkAddress() throws ApplicationException {
        Wait.forSeconds(1000);
        click.elementBy(WorkAddress);
    }
    public void verify_NoWorkAddressMessage() throws Throwable {
        Wait.forSeconds(1000);
        verify.elementIsPresent(NoWorkAddressMessage);
    }
    public void clickUpdateAddress() throws ApplicationException {
        Wait.forSeconds(1000);
        jsClick.elementBy(UpdateAddress);
    }
    public void verify_UpdateAddressPopupsection() throws Throwable {
        Wait.forSeconds(1000);
        verify.elementIsPresent(GoBackButton);
        verify.elementIsPresent(UpdateMyAddress);
    }
    public void clickUpdateMyaddress() throws Throwable {
        Wait.forSeconds(1000);
        click.elementBy(UpdateMyAddress);
    }
    public void verify_UpdateMyAddressPopupsection() throws Throwable {
        Wait.forSeconds(1000);
        //verify.elementIsPresent(GoBackButton);
        verify.elementIsPresent(MaybeLaterButton);
        verify.elementIsPresent(EmailNowButton);
    }
    public void clickConfirmDeliveryaddress() throws Throwable {
        Wait.forSeconds(1000);
        click.elementBy(DeliveryAddress);
    }
    public void verify_ReportCardPage() throws Throwable {
        Wait.forSeconds(1000);
        verify.elementIsPresent(ReportCardTitle);
    }
    public void verify_ReportCardPageOptions() throws Throwable {
        Wait.forSeconds(1000);
        verify.elementIsPresent(ILostMyCard);
        verify.elementIsPresent(MyCardGotStolen);
    }
    public void clickLostMyCard() throws Throwable {
        Wait.forSeconds(1000);
        click.elementBy(ILostMyCard);
    }
    public void verify_ReportLostCardDetailsPage() throws Throwable {
        Wait.forSeconds(1000);
        verify.elementIsPresent(ReportLostCardTitle);
        verify.elementIsPresent(LocationTitle);
        verify.elementIsPresent(DateTimeTitle);
    }
}
