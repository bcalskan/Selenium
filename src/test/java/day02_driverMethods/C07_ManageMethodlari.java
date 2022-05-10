package day02_driverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_ManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("Pencere ölcüleri : " + driver.manage().window().getSize());
        System.out.println("Pencere konumu : " + driver.manage().window().getPosition());
        Thread.sleep(2000);

        //pencere konumunu ve büyüklügünü degistirelim
        driver.manage().window().setPosition(new Point(15, 15));
        driver.manage().window().setSize(new Dimension(900, 600));
        System.out.println("Pencere konumu : " + driver.manage().window().getPosition());


    }
}
