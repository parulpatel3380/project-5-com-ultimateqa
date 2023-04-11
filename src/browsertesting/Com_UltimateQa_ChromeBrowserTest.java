package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Com_UltimateQa_ChromeBrowserTest {
    public static void main(String[] args) {

        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

        //Launch the Chrome browser
        WebDriver driver = new ChromeDriver();
        //open the URL into browser
        driver.get(baseUrl);
        //maximize the window
        driver.manage().window().maximize();
        //we give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of page
        String title = driver.getTitle();

        //print statement
        System.out.println("Title");

        // Get the current url
        System.out.println("Current Url:" +driver.getCurrentUrl());

         // Get page source
        System.out.println("Page Source:" +driver.getPageSource());

        //Find the email field element
        driver.findElement(By.id("user[email]")).sendKeys("primetesting12@gmail.com");

        //Find the password field element
        driver.findElement(By.id("user[password]")).sendKeys("parul123");

        driver.close();
    }
}
