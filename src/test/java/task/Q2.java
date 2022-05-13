package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        /*
        1. http://zero.webappsecurity.com sayfasina gidin
        2. Signin buttonuna tiklayin
        3. Login alanine  "username" yazdirin
        4. Password alanine "password" yazdirin
        5. Sign in buttonuna tiklayin
        6. Pay Bills sayfasina gidin
        7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        8. tarih kismina "2020-09-10" yazdirin
        9. Pay buttonuna tiklayin
        10. "The payment was successfully submitted." mesajinin ciktigini control edin
        */

        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");

        // 2. Signin buttonuna tiklayin
        driver.findElement(By.xpath("//button[@id='signin_button']")).click();

        //3. Login alanine  "username" yazdirin
        WebElement login = driver.findElement(By.xpath("//input[@autocomplete='off']"));
        login.sendKeys("username");

        //4. Password alanine "password" yazdirin
        //<input type="password" id="user_password" name="user_password" tabindex="2" autocomplete="off">
        WebElement password = driver.findElement(By.xpath("//input[@id='user_password']"));
        password.sendKeys("password");

        //5. Sign in buttonuna tiklayin
        //<input type="submit" name="submit" value="Sign in" class="btn btn-primary" tabindex="4">
        WebElement signInTikla = driver.findElement(By.xpath("//input[@name='submit']"));
        signInTikla.click();
        driver.navigate().back();

        //6. Pay Bills sayfasina gidin
        driver.findElement(By.xpath("//li[@id='onlineBankingMenu']")).click();
        driver.findElement(By.xpath("//span[text()='Pay Bills']")).click();

        //7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        WebElement amount = driver.findElement(By.xpath("//input[@id='sp_amount']"));
        amount.sendKeys("500");

        //8. tarih kismina "2020-09-10" yazdirin
        WebElement tarih = driver.findElement(By.xpath("//input[@id='sp_date']"));
        tarih.sendKeys("2023-05-13");

        //9. Pay buttonuna tiklayin
        WebElement pay = driver.findElement(By.xpath("//input[@id='pay_saved_payees']"));
        pay.click();

        //10. "The payment was successfully submitted." mesajinin ciktigini control edin
        System.out.println(driver.findElement(By.xpath("//span[text()='The payment was successfully submitted.']")).isDisplayed() ? "Payment test PASSED" : "Payment test FAILED");


        driver.close();

    }
}
