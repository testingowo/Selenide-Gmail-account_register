package com.gmail.testing.pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.page;

public class GmailMainPage {

    public AccountRegisterPage clickOnCreateAccountBtn(){
        $$(".RveJvd.snByac").get(1).click();
        return page(AccountRegisterPage.class);
    }
}
