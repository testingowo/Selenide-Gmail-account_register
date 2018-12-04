package com.gmail.testing.pages;

import net.bytebuddy.utility.RandomString;

import java.util.Random;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AccountRegisterPage {
    public void FillMandatoryFields(){
        $("#firstName").setValue("John");
        $("#lastName").setValue("Mark");
        Random random = new Random();
        $("#username").setValue("john" + random.nextInt(100));
        $$("input[type=\"password\"]").get(0).setValue("Qazwsxe1");
        $$("input[type=\"password\"]").get(1).setValue("Qazwsxe1");
    }

    public void clickNextBtn(){
        $$("content>span").get(2).click();
    }
}
