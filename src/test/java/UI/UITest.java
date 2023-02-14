package UI;

import baseTest.BaseSeleniumTest;
import data.Data;
import org.testng.annotations.Test;
import pages.StartPage;

public class UITest extends BaseSeleniumTest
{
    @Test
    public void studentRegister()
    {

        Data data = new Data();
        StartPage startPage = new StartPage(data.getURL());
        startPage.selectType()
                .selectform()
                .fillingForm(data.getFirstName(), data.getSecondName(),
                        data.getEmail(), data.getAddress(), data.getMobile(), data.getSubject(), data.getState(), data.getCity())
                .submitForm()
                .closeForm();
    }
}