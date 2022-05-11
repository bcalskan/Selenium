package task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://youtube.com");
        driver.manage().window().maximize();

        System.out.println("\n------ YOUTUBE TITLE ------\n");
        String youtubeActualTitle = driver.getTitle();
        String youtubeExpectedTitle = "youtube";
        System.out.println("Youtube title : " + youtubeActualTitle);
        System.out.println("Youtube expected title : " + youtubeExpectedTitle);
        if (youtubeActualTitle.equals(youtubeExpectedTitle)) {
            System.out.println("Title test PASSED!");
        } else {
            System.out.println("Title test FAILED!");
            System.out.println("Actual Title : " + youtubeActualTitle);
        }
        System.out.println("\n---------------\n");

        System.out.println("\n------ YOUTUBE URL ------\n");
        String youtubeActualUrl = driver.getCurrentUrl();
        String youtubeExpectedUrl = "youtube";
        System.out.println("Youtube url : " + youtubeActualUrl);
        System.out.println("Youtube expected url : " + youtubeExpectedUrl);
        if (youtubeActualUrl.contains(youtubeExpectedUrl)) {
            System.out.println("URL test PASSED!");
        } else {
            System.out.println("URL test FAILED!");
            System.out.println("Actual URL : " + youtubeActualUrl);
        }
        System.out.println("\n---------------\n");


        driver.get("https://www.amazon.com");
        driver.navigate().back();//youtube´a geri gider
        driver.navigate().refresh();//yeniler
        driver.navigate().forward();//amazona gider
        driver.manage().window().maximize(); //tam sayfa yapar

        System.out.println("\n------ AMAZON TITLE ------\n");
        String amazonActualTitle = driver.getTitle();
        String amazonExpectedTitle = "Amazon";
        System.out.println("Amazon title : " + amazonActualTitle);
        System.out.println("Amazon expected title : " + amazonExpectedTitle);


        if (amazonActualTitle.contains(amazonExpectedTitle)) {
            System.out.println("Amazon Title test PASSED!");
        } else {
            System.out.println("Amazon Title test FAILED!");
            System.out.println(amazonActualTitle);
        }
        System.out.println("\n---------------\n");


        System.out.println("\n------ AMAZON URL ------\n");
        String amazonActualUrl = driver.getCurrentUrl();
        String amazonExpectedUrl = "https://www.amazon.com/";
        System.out.println("Amazon url : " + amazonActualUrl);
        System.out.println("Amazon expected url : " + amazonExpectedUrl);
        if (amazonActualUrl.equals(amazonExpectedUrl)) {
            System.out.println("Amazon URL test PASSED!");
        } else {
            System.out.println("Amazon URL test FAILED");
            System.out.println(amazonActualUrl);
        }

        System.out.println("\n---------------\n");


        driver.close();


    }
}
