package actions;

import base.Keywords;
import exceptions.ApplicationException;
import helper.PropertyReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.time.Duration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Click extends Keywords {

    private static Logger log = Logger.getLogger(Click.class);

    public void elementBy(String locatorKey) throws ApplicationException {
        log.info("Click element [" + locatorKey + "]");
        try {
            Keywords.screenshot.attachScreenshot("Click");
            get.elementBy(locatorKey).click();
            log.info("Click Successful!");
        } catch (StaleElementReferenceException ex) {
            get.elementBy(locatorKey).click();
        } catch (Exception e) {
            // TODO: handle exception
            log.info("Error while clicking the element " + locatorKey);
            throw new ApplicationException(e.getMessage());

        }
    }

    public void elementBy(By locator) throws ApplicationException {
        log.info("Click element [" + locator + "]");
        try {
            get.elementBy(locator).click();
            log.info("Click Successful!");
        } catch (StaleElementReferenceException ex) {
            get.elementBy(locator).click();

        } catch (Exception e) {
            // TODO: handle exception
            log.info("Error while clicking the element " + locator);
            throw new ApplicationException(e.getMessage());

        }

    }

    public void elementBy(String locatorKey, int whichElement) throws ApplicationException {
        log.info("Click element [" + locatorKey + "]");
        try {
            get.elementBy(locatorKey, whichElement).click();
            log.info("Clicked on the element's " + locatorKey + " [" + whichElement + "] occurrence");
        } catch (Exception e) {
            log.info("Error while clicking the element " + locatorKey);
            throw new ApplicationException(e.getMessage());
        }
    }

    public void elementBy(String locatorKey, String ivalue) throws ApplicationException {
        log.info("Click element [" + locatorKey + "]");
        try {
            //Wait.forSeconds(3);
            wait.until(ExpectedConditions.presenceOfElementLocated(PropertyReader.locatorOf(locatorKey)));
            //Wait.forSeconds(5);
            List<WebElement> a = driver.findElements(PropertyReader.locatorOf(locatorKey));
            for (int i = 0; i < a.size(); i++) {
                if (( a.get(i).getText().trim() ).contentEquals(ivalue.trim())) {
                    a.get(i).click();
                    log.info("Clicked on the element's " + locatorKey + "with value " + ivalue);
                    break;
                }
            }

        } catch (Exception e) {
            log.info("Error while clicking the element " + locatorKey);
            throw new ApplicationException(e.getMessage());


        }
    }

    public void pickdatefromcalendar(String date) {
        String date_Locator = "//android.view.View[@content-desc='" + date + "']";
        WebElement date_to_selected = driver.findElement(By.xpath(date_Locator));
        date_to_selected.click();

    }
    public static boolean isClickable(WebElement webe)
    {
        try
        {
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.elementToBeClickable(webe));
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

}







