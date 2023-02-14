package baseTest;

import basePage.BaseSeleniumPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;


import java.time.Duration;

abstract public class BaseSeleniumTest
{
    protected WebDriver driver;
    protected WebDriverWait driverWait;

    @BeforeClass
    public void beforetest()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        BaseSeleniumPage.setDriver(driver, driverWait);
    }

    @AfterClass
    public void afterTest()
    {
        driver.quit();
    }
}