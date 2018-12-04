package tests;

import com.gmail.testing.pages.AccountRegisterPage;
import com.gmail.testing.pages.GmailMainPage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class GmailTest {
    @Test
    public void fillDataAndSave(){
        GmailMainPage gmailMainPage = open("http://www.gmail.com", GmailMainPage.class);
        AccountRegisterPage accountRegisterPage = gmailMainPage.clickOnCreateAccountBtn();
        accountRegisterPage.FillMandatoryFields();
        accountRegisterPage.clickNextBtn();
    }
}
