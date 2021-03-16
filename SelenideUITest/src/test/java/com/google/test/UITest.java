package com.google.test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class UITest {

    //go to google.com
    //search twitter
    //click search button
    //click first URL
    //check the page

    @Test
    public void searchTwitterPageInGoogle(){

        Configuration.browser = "Chrome";
        Configuration.startMaximized = true;
        Configuration.holdBrowserOpen = true;

        open("https://www.google.com/");
        $(".gLFyf").setValue("twitter").pressEnter();
        $(".g").$(By.tagName("a")).click();
        $(".r-k200y").should(Condition.appear);




    }
}
