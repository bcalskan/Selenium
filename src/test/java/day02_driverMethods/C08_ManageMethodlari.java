package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08_ManageMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        //boyutlari ve konumu maximize iken alalim
        System.out.println("Maximize konum : " + driver.manage().window().getPosition()); //Maximize konum : (-8, -8)
        System.out.println("Maximize boyut : " + driver.manage().window().getSize()); //Maximize konum : (1552, 840)

        driver.manage().window().fullscreen();
        //boyutlari ve konumu maximize iken alalim
        System.out.println("Fullscreen konum : " + driver.manage().window().getPosition()); //Fullscreen konum : (0, 0)
        System.out.println("Fullscreen boyut : " + driver.manage().window().getSize()); //Fullscreen boyut : (1536, 864)


    }
}
