package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_Navigate {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        /*
        Eger testimiz sirasinda birden fazla sayfa arasinda ileri geri hareket edeceksek
        driver.get() yerine driver.navigate().to() methodunu kullaniriz
        ve sonrasinda forward(), back() veya refresh() methodlarini kullanabiliriz.
         */

        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);

        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);

        //Amazona geri dönelim
        driver.navigate().back();
        Thread.sleep(2000);

        //facebook´a gidelim
        driver.navigate().forward();
        Thread.sleep(2000);

        //refresh
        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.close();



    }
}
