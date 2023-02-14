package basePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

abstract public class BaseSeleniumPage
{
     protected static WebDriver driver;
     protected static WebDriverWait driverWait;

     public static void setDriver(WebDriver webDriver, WebDriverWait webDriverWait)
     {
         driver = webDriver;
         driverWait = webDriverWait;
     }
}
