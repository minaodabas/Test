import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.testng.ScreenShooter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

@Listeners({ ScreenShooter.class })
public class ITUTest {
    @Test()
    public void findActorinMovie() {

        Configuration.browser = "Chrome";
        Configuration.startMaximized = true;
        Configuration.timeout = 10000;
        //Headless browser acilmayacak ama ayni seyler devam edecek
        Configuration.headless = true;

        open("http://kutuphane.itu.edu.tr/");
        $(".allsq").setValue("Agile Testing").pressEnter();

        int handles = getWebDriver().getWindowHandles().size();
        switchTo().window(handles-1);

        /**switchTo().window(1);
        $(".closeguest").click();
        **/
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}