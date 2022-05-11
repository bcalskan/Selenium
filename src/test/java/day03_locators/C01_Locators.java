package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazona gidip nutella aratin
        driver.get("https://www.amazon.com");

        //findElement(By...locator) --> istedigimiz webElement´ini bize döndürür
        //biz de o webElement´ini kullanmak icin bir objeye assign ederiz
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        /*
        WebElement aramaKutusu= driver.findElement(By.className("nav-search-field "));  --> calismadi
        Locator alirken gözümüzden kacan detaylar olabilir
        aldigimiz bir locator calismazsa alternatif locatorlar denemeliyiz
         */


        //herhango bir webElementine istedigimiz yaziyi göndermek istersek

        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        /*
        <input type="text" id="twotabsearchtextbox" value="" name="field-keywords"
        autocomplete="off" placeholder="" class="nav-input nav-progressive-attribute"
        dir="auto" tabindex="0" aria-label="Search">
         */


    }
}
