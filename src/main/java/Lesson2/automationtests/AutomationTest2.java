package Lesson2.automationtests;

import Lesson2.DriverSetUpV2;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import java.time.Duration;

public class AutomationTest2 {
    public static void main(String[] args) throws InterruptedException  {
        // this is second homework exercies , where we need to open together some websites

        WebDriver driver = DriverSetUpV2.setUpDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://www.automationpractice.pl/index.php");
        driver.getWindowHandles();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://zoo.waw.pl/");
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.w3schools.com/");
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.clickspeedtester.com/click-counter/");
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://andersenlab.com/");
        Thread.sleep(2000);
        driver.quit();


       // System.out.println(" println is not working ");
       // Set<String> windowHandles1 = driver.getWindowHandles(); also Set is not working why?


    }

}
