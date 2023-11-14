package day02_driverMedhodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_IlkTest {
    public static void main(String[] args) throws InterruptedException {

        // testotomasyonu anasayfaya gidin
        // URL'in https://www.testotomasyon.com oldugunu
        // ve Title'in test kelimesi icerdigini test edin

        // Her test icin mutlaka bir webdriver olusturmali
        // ve gerekli ayarlamali yapmaliyiz
        System.setProperty("webriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // testotomasyonu anasayfaya gidin

        driver.get("https://www.testotomasyonu.com");

        // URL'in https://www.testotomasyon.com oldugunu

        String excpetedUrl = "https://www.testotomasyonu.com/";
        String actualUrl = driver.getCurrentUrl();

        if (excpetedUrl.equals(actualUrl)){
            System.out.println("URL testi PASSED");
        }else {
            System.out.println("URL testi FAILED");
            System.out.println("Actual URL : " + actualUrl);
        }


        // ve Title'in test kelimesi icerdigini test edin

        String exceptedTitleIcerigi = "test";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(exceptedTitleIcerigi)){
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title testi FAILED");
            System.out.println("Actual URL : " + actualTitle);
        }




        driver.close();
    }
}
