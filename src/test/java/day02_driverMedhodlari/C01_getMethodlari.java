package day02_driverMedhodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_getMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testotomasyonu.com");


        driver.get("https://wisequarter.com");


        // driver.get("www.youtube.com");
        // driver.get() https:// yazilmadan calismaz

        driver.get("https://youtube.com");


        driver.close();
    }
}
