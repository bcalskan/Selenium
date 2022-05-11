package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementMethodlari {
    public static void main(String[] args) {
        /*
        1- amazon.com´a gidip arama kutusunu locate edin
        2- arama kutusunun tagName´inin input oldugunu test edin
        3- arama kutusunun name attribute´nun degerinin "field-keywords" oldugunu test edin
         */

        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        String expectedTagName = "input";
        String actualTagName = aramaKutusu.getTagName();
        System.out.println(actualTagName.equals(expectedTagName) ? "Tag name PASSED" : "Tag name FAILED");

        String expectedNameDegeri = "field-keywords";
        String actualNameDegeri = aramaKutusu.getAttribute("name");
        System.out.println(expectedNameDegeri.equals(actualNameDegeri) ? "Name attribute test PASSED" : "Name attribute test FAILED");


        System.out.println("Konum : " +aramaKutusu.getLocation());
        System.out.println("Web Element yüksekligi : " +aramaKutusu.getSize().height);
        driver.close();


        /*
        <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder=""
        class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search">

        webElementIsmi.getTagName() --> daha önce locate ettigimiz bir webelementin tagnameini döndürür
        webElementIsmi.getAttribute(attributeIsmi) --> daha önce locate ettigimiz webelementin istenilen attribute degerini döndürür
         */
    }
}
