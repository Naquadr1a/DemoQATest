package pages;

import basePage.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StartPage extends BaseSeleniumPage
{
    public StartPage(String url)
    {
        driver.get(url);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h5[text()='Forms']")
    private WebElement formElement;

    public FormPage selectType()
    {
        driverWait.until(ExpectedConditions.visibilityOf(formElement))
                .click();
        return new FormPage();
    }
}