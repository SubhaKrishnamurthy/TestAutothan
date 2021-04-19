package actions;

import base.Keywords;
import exceptions.ApplicationException;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Select extends Keywords {

    private static Logger log = Logger.getLogger(Select.class);

    public static void backOffice_selectValueInAnyList(String locatorKey, String data) throws ApplicationException {

        try {
            String Datatoselect = data.trim();
            Thread.sleep(1000);
            get.elementBy(locatorKey).click();
            Thread.sleep(1000);
            String Datatoselectxpath = "(" + "//div[text()=" + "'" + Datatoselect + "'" + "]" + ")" + "[1]" + "|" + "(" + "//li[text()=" + "'" + Datatoselect + "'" + "]" + ")" + "[1]" + "|" + "(" + "//a[text()=" + "'" + Datatoselect + "'" + "]" + ")" + "[1]";
            driver.findElement(By.xpath(Datatoselectxpath)).click();
            Thread.sleep(100);
            log.info("Successfully Value selected from Listbox" + locatorKey);
        }
             catch (Exception e1) {
                // TODO Auto-generated catch block
                try {
                    Robot robot = new Robot();
                    robot.keyPress(KeyEvent.VK_ENTER);
                    log.info("Successfully Value selected from Listbox " + locatorKey);
                } catch (AWTException e2) {
                    e2.printStackTrace();
                }

        }
    }
}
