package day02_driverMedhodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_getMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testotomasyonu.com");
        Thread.sleep(3000);

        driver.get("https://wisequarter.com");
        Thread.sleep(3000);

        // driver.get("www.youtube.com");
        // driver.get() https:// yazilmadan calismaz

        driver.get("https://youtube.com");


        Thread.sleep(10000);

        driver.close();
    }
}
