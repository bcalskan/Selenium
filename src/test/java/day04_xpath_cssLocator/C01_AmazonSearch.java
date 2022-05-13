package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_AmazonSearch {
    public static void main(String[] args) {
        /*
        2. Main method olusturun ve asagidaki görevi tamamlayin
        a- Amazon sayfasina gidin : https://www.amazon.com/
        b- Search(ara) "city bike"
        c- Amazon´da görüntülenen ilgili sonuclarin sayisini yazdirin
        e- Sonra karsiniza cikan ilk sonucun resmine tiklayin
         */

        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // a- Amazon sayfasina gidin : https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        // b- Search(ara) "city bike"
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);

        //c- Amazon´da görüntülenen ilgili sonuclarin sayisini yazdirin
        List<WebElement> istenenElementListesi = driver.findElements(By.className("sg-col-inner"));
        WebElement sonucYazisiElementi = istenenElementListesi.get(0);
        System.out.println(sonucYazisiElementi.getText());

        //e- Sonra karsiniza cikan ilk sonucun resmine tiklayin
//        List<WebElement> ürünResimleriList = (List<WebElement>) driver.findElement(By.className("s-image"));
//        WebElement ilkÜrunResmi = ürünResimleriList.get(0);
//        ilkÜrunResmi.click();

    }
}
