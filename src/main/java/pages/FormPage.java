package pages;

import basePage.BaseSeleniumPage;
import data.PersonData;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FormPage extends BaseSeleniumPage
{
    public FormPage()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Practice Form']")
    private WebElement practiceFormElement;

    @FindBy(css = "input#lastName")
    private WebElement lastNameInput;

    @FindBy(css = "input#firstName")
    private WebElement firstNameInput;

    @FindBy(css = "input#userEmail")
    private WebElement inputEmail;

    @FindBy(xpath = "//label[@for='gender-radio-1']")
    private WebElement chooseGender;

    @FindBy(css = "input#userNumber")
    private WebElement inputMobile;

    @FindBy(xpath = "//input[@id='subjectsInput']")
    private WebElement inputSubject;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-2']")
    private WebElement chooseHobbies;

    @FindBy(css = "textarea#currentAddress")
    private WebElement currentAdsress;

    @FindBy(css = "input#dateOfBirthInput")
    private WebElement calendar;

    @FindBy(css = "select.react-datepicker__month-select")
    private WebElement monthPicker;

    @FindBy(xpath = "//*[text()='February']")
    private WebElement monthOfBirthday;

    @FindBy(css = "select.react-datepicker__year-select")
    private WebElement yearPicker;

    @FindBy(xpath = "//*[text()='2000']")
    private WebElement yearOfBirthday;

    @FindBy(xpath = "//*[text()='29']")
    private WebElement dateOfBirthday;

    @FindBy(xpath = "//button[@id='submit']")
    private WebElement submitButton;

    @FindBy(css = "input#react-select-3-input")
    private WebElement selectState;

    @FindBy(css = "input#react-select-4-input")
    private WebElement selectCity;

    @FindBy(css = "button#closeLargeModal")
    private WebElement closeFormButton;

    public FormPage selectform()
    {
        driverWait.until(ExpectedConditions.visibilityOf(practiceFormElement))
                .click();
        return this;
    }

    public FormPage fillingForm(PersonData personData)
    {
        lastNameInput.sendKeys(personData.getSecondName());
        firstNameInput.sendKeys(personData.getFirstName());
        inputEmail.sendKeys(personData.getEmail());
        chooseGender.click();
        inputMobile.sendKeys(personData.getMobile());
        inputSubject.sendKeys(personData.getSubject());
        inputSubject.sendKeys(Keys.ENTER);
        driverWait.until(ExpectedConditions.elementToBeClickable(chooseHobbies))
                .click();
        currentAdsress.sendKeys(personData.getAddress());
        driverWait.until(ExpectedConditions.visibilityOf(calendar))
                .click();
        monthPicker.click();
        monthOfBirthday.click();
        yearPicker.click();
        yearOfBirthday.click();
        dateOfBirthday.click();
        selectState.sendKeys(personData.getState(), Keys.ENTER);
        selectCity.sendKeys(personData.getCity(), Keys.ENTER);
        return this;
    }

    public FormPage submitForm()
    {
        submitButton.click();
        return this;
    }

    public void closeForm()
    {
        closeFormButton.click();
    }
}
