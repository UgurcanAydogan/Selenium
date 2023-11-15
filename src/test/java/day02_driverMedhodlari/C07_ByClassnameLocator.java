package day02_driverMedhodlari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C07_ByClassnameLocator {
    public static void main(String[] args) {

        System.setProperty("Webdrive.chorem.drive","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // testotomasyonu.com sayfasina gidin
        driver.get("https://www.testotomasyonu.com");

        // arama kutusuna phone yazip aratin
        WebElement aramaKutusu = driver.findElement(By.id("global-search"));

        aramaKutusu.sendKeys("phone");

        aramaKutusu.submit();

        // arama yapildiktan sonra, sol tarafta cikan Categories menusundeki
        // kategori sayisinin 8 oldugunu test edin


        // kategorileri yazdirin

    }
}
