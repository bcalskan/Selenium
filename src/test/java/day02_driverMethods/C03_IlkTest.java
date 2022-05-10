package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {
    public static void main(String[] args) {
        /*
        1- https://www.amazon.com url´ine gidin
        2- Basligin Amazon kelimesi icerdigini test edin
        3- Url´in https://www.amazon.com´a esit oldugunu test edin
        4- Sayfayi kapatin
         */

        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        String actualTitle = driver.getTitle();
        String arananKelime = "Amazon";
        if (actualTitle.contains(arananKelime)) {
            System.out.println("Title testi PASSED");
        } else System.out.println("Title " + arananKelime + "´yi icermiyor, title testi FAILED");


        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("URL testi PASSED");
        }else System.out.println("URL " +actualUrl+ " ile ayni degil. URL testi FAILED");

        driver.close();

//        String titel = driver.getTitle();
//        System.out.println(titel);
//
//        if (titel.contains("Amazon")) {
//            System.out.println("Iceriyor");
//        } else {
//            System.out.println("Icermiyor");
//        }
//
//        String url = driver.getCurrentUrl();
//        System.out.println(url);
//
//        if (url.equals("https://www.amazon.com")) {
//            System.out.println("URL´ler esit");
//        } else System.out.println("Degil");
//
//        driver.close();


    }
}
