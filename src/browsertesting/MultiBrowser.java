package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {
    static  String browser = "Chrome";

    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else{
            System.out.println("Wrong Browser name");
        }
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

        //Launch the Chrome browser
        WebDriver driver = new ChromeDriver();
        //Open the URL into browser
        driver.get(baseUrl);

        //Maximize the window
        driver.manage().window().maximize();

        //We give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title =("Title");

        //Get the current Url
        System.out.println("Current Url:" +driver.getCurrentUrl());

        //Get page source
        System.out.println("Page Source:" +driver.getPageSource());

        //Find the email field element
        driver.findElement(By.id("user[email]")).sendKeys("primetesting123@gamil.com");

        //Find the password field element
        driver.findElement(By.id("user[password]")).sendKeys("123patel");

        driver.close();
    }

}
