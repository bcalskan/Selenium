package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) {
    /*
    1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    2- add element butonuna basin
    3- Delete butonunun görünür oldugunu test edin
    4- Delete tusuna basin
    5- "Add/Remove Elements" yazisinin görünür oldugunu test edin
    */

        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- add element butonuna basin
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();

        //3- Delete butonunun görünür oldugunu test edin
        //System.out.println(driver.findElement(By.xpath("//button[@class='added-manually']")).isDisplayed() ? "Displayed test PASSED" : "Displayed test FAILED");
        WebElement deleteButonu = driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deleteButonu.isDisplayed()) {
            System.out.println("Display test PASSED");
        } else System.out.println("Display test FAILED");

        //4- Delete tusuna basin
        deleteButonu.click();

        //5- "Add/Remove Elements" yazisinin görünür oldugunu test edin
        WebElement addRemoveYazisi = driver.findElement(By.xpath("//h3"));
        System.out.println(addRemoveYazisi.isDisplayed() ? "Add remove test PASSED" : "Add remove test FAILED");

        driver.close();

    }
}
