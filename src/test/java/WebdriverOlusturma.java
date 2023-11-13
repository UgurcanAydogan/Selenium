import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverOlusturma {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        // Bu satır olusturacagımız webdrive'in ozelliklerini set ediyor.
        // Webdriver otomasyon sirasinda bizim elimiz, gozumuz, herseyimizdir.

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");

        Thread.sleep(5000);

        driver.manage().window().maximize();

        Thread.sleep(5000);

        driver.close();
    }
}
