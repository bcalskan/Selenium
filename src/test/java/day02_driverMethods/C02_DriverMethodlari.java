package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); // sayfayi tam ekran yapar

        driver.get("https://www.amazon.com");
        System.out.println("Actual Titel : " + driver.getTitle()); //Amazon.com. Spend less. Smile more.
        System.out.println("Actual URL : " + driver.getCurrentUrl()); //https://www.amazon.com/
        driver.close();

    }
}
