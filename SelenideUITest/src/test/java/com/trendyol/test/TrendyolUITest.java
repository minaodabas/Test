package com.trendyol.test;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;


public class TrendyolUITest {

    @Test
    public void SmokeTest(){
        /**
         * Browser actim
         * www.trendyol.com a gittim
         * popup i kapatmam gerek
         * searchbar a telefon yazdım
         * enter bastım
         * sayfanin ust kisminda telefon yazdigini kontrol et
         *
         * click
         * input
         * scroll
         * url e gider
         * hover yapabilir
         * surukle birak(click)
         * speech recognation
         * read getText()
         */

        Configuration.browser = "Chrome";
        Configuration.startMaximized = true;
        Configuration.holdBrowserOpen = true;
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--disable-notifications");
        Configuration.browserCapabilities= opt;


        open("https://www.trendyol.com");
        $(".fancybox-item").click();
        $(".vn-close").click();
        $(".search-box").setValue("telefon").sendKeys(Keys.ENTER);

    }
}
