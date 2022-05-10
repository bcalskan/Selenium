package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_ManageMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");
        /*
        ileride wait konusunu daha genis olarak ele alacagiz
        Bir sayfa acilirken ilk basta sayfanin icersinde bulunan elementlere göre
        bir yüklenme süresine ihtiyac vardir
        veya bir web elementinin kullanilabilmesi icin zamana ihtiyac olabilir
        implicitlyWait bize sayfanin yüklenmesi ve sayfadaki elementlere ulasim icin
        beklenecek maksimum süreyi belirleme olanagi tanir
         */

    }
}
