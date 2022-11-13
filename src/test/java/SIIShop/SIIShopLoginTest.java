package SIIShop;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SIIShopLoginTest
{
    private WebDriver driver;
//    driver jest typem interfejsu - nie da się zrobic obiektu tyou interface
    @Test
    void loginToApplication() {

//        page object model
//        0 konfiguracja webdrivera
        String browser = "chrome";
        driver = new ChromeDriver();
//        klasy które impelmentuja z danych przegladarek
//        1. zwiezła
//        2.miec asercje na koncu

    }
}
