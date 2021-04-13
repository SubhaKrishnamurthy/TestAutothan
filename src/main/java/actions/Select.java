package actions;

import base.Keywords;
import exceptions.ApplicationException;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;

public class Select extends Keywords {

    private static Logger log=Logger.getLogger(Select.class);

    public static void backOffice_selectValueInAnyList(String locatorkey) throws ApplicationException
    {
        try{

                    String Datatoselect = locatorkey.trim();
                    Thread.sleep(1000);
                    TestAttributes.element.click();
                    Thread.sleep(1000);
                    //String Datatoselectxpath= TestAttributes.LocatorValue+"//*[text()="+"'"+Datatoselect+"'"+"]";
                    //TestAttributes.element.sendKeys(Keys.DOWN);
                    String Datatoselectxpath= "("+"//div[text()="+"'"+Datatoselect+"'"+"]"+")"+"[1]" +"|"+ "("+"//li[text()="+"'"+Datatoselect+"'"+"]"+")"+"[1]" +"|"+ "("+"//a[text()="+"'"+Datatoselect+"'"+"]"+")"+"[1]";
                    TestAttributes.driver.findElement(By.xpath(Datatoselectxpath)).click();
                    Thread.sleep(100);
                    TestAttributes.ActualResult = "Successfully Value selected from Listbox";
                }
                catch(Exception e){

                    try {

                        //TestAttributes.element.click();
                        Thread.sleep(100);
                        //TestAttributes.element.click();
                        String Datatoselect = TestAttributes.Data.trim();
                        String Datatoselectxpath= "("+"//*[text()="+"'"+Datatoselect+"'"+"]"+")"+"[1]";
                        //Actions action= new Actions(TestAttributes.driver);
                        //action.moveToElement(TestAttributes.element).build().perform();
                        TestAttributes.driver.findElement(By.xpath(Datatoselectxpath)).click();
                        //Thread.sleep(2000);
                        TestAttributes.ActualResult = "Successfully Value selected from Listbox";
                    } catch (Exception e1) {
                        // TODO Auto-generated catch block
                        try {
//				          Thread.sleep(100);

                            TestAttributes.element.click();
                             Robot robot = new Robot();
//			    robot.keyPress(KeyEvent.VK_DOWN);
//			    robot.keyPress(KeyEvent.VK_DOWN);
                            robot.keyPress(KeyEvent.VK_ENTER);

                            TestAttributes.ActualResult = "Successfully Value selected from Listbox";
                        }
                        catch(InterruptedException e2){


                            e2.printStackTrace();
                        }


                    }
                }
            }
        }


    }
}
