package pages;

import actions.Wait;
import base.Keywords;
import gherkin.lexer.Th;

public class GreenPinPage extends Keywords {

    private String PlayEverDayCard = "onlineBanking.GreenPin.PlayEverDayCard";
    private String ManageCards = "onlineBanking.GreenPin.ManageCards";
    private String PlayEveryDayCardImg = "onlineBanking.GreenPin.PlayEveryDayCardImg";
    private String ChangePin ="onlineBanking.GreenPin.ChangePin";
    private String Pin1 ="onlineBanking.GreenPin.Pin1";
    private String Pin2 ="onlineBanking.GreenPin.Pin2";
    private String Pin3 = "onlineBanking.GreenPin.Pin3";
    private String Pin4 =  "onlineBanking.GreenPin.Pin4";

    public void click_PlayEveryDayCard() throws Throwable {
        click.elementBy(PlayEverDayCard);
    }

    public void click_ManageCards() throws Throwable {
        click.elementBy(ManageCards);
    }

    public void click_CardImg() throws Throwable {
        click.elementBy(PlayEveryDayCardImg);
    }

    public void click_ChangePin() throws Throwable {
        click.elementBy(ChangePin);
    }

    public void enter_Pin(String pin1,String pin2,String pin3,String pin4,String pin5,String pin6) throws Throwable {
        type.data(Pin1,pin1);
        type.data(Pin1,pin2);
        type.data(Pin1,pin3);
        type.data(Pin1,pin4);
        type.data(Pin1,pin5);
        type.data(Pin1,pin6);
    }

}
