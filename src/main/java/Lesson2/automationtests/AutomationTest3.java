package Lesson2.automationtests;

import Lesson2.DriverSetUpV2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomationTest3 {
    public static void main(String[] args) throws InterruptedException {
        //this is third exercises , where we get element locations and size

        WebDriver driver = DriverSetUpV2.setUpDriver();
        driver.get("http://www.automationpractice.pl/index.php");
        Thread.sleep(2000);
        WebElement leftbutton = driver.findElement(By.xpath("//a[contains(@class,'sf-with-ul')][1]"));
        WebElement rightbutton = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a/b"));
        WebElement biggerelement = driver.findElement((By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[1]")));

        System.out.println("left element Location is " + leftbutton.getLocation().x);
        System.out.println("right element location is " + rightbutton.getLocation().y);
        System.out.println("biggest element on the page " + biggerelement.getSize().width);
        System.out.println("biggest element on the page " + biggerelement.getSize().height);
        driver.quit();
    }
}
