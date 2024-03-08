package Lesson2.WebDriverMethods;

import Lesson2.DriverSetUpV2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class WebDriverMethods1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUpV2.setUpDriver(); //ამ ობიქეტით უშვებს მერე დაბლა გეთიდან

        //manager
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //get
       // driver.get("https://www.guinnessworldrecords.com/search?term=%2A");

        //findElement
      //  driver.findElement(By.id("search-term")).sendKeys("push ups");

      /*  driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");
        Thread.sleep(1500);
        List<WebElement> webElementList = driver.findElements(By.cssSelector(".columned.block.block-4-12 a"));
        for (WebElement element : webElementList) {
            System.out.println(element.getText());
        } */
        //quti()
        driver.quit();

    }
}
















