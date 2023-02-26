package UI;

import baseTest.BaseSeleniumTest;
import data.Data;
import data.PersonData;
import org.testng.annotations.Test;
import pages.StartPage;

public class UITest extends BaseSeleniumTest
{
    @Test
    public void studentRegister()
    {
        StartPage startPage = new StartPage(new Data().getURL());
        startPage.selectType()
                .selectform()
                .fillingForm(new PersonData())
                .submitForm()
                .closeForm();
    }
}