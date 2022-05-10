package day01_seleniumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ilkClass {
    public static void main(String[] args) {

        /*
        En ilkel haliyle bir otomasyon yapmak icin
        classimiza otomasyon icin gerekli olan webdriverin yerini göstermemiz gerekir
        bunun icin java kütüphanesinden System.setProperty() methodu kullanilir.

        method2 parametre istemektedir
        ilki kullanacagimiz driver : webdriver.chrome.driver
        ikincisi ise bu driverin fiziki yolu :
         */



        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");


    }
}
