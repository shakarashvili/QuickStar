package lesson12;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import Lesson2.DriverSetUpV2;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lesson12 {



@Test
    public void LongTest() throws InterruptedException {
  WebDriver driver = DriverSetUpV2.setUpDriver();
  driver.get("https://www.google.com/search");
    driver.manage().window().maximize();

  WebElement element = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
  element.sendKeys("https://www.guinnessworldrecords.com/account.register?");
  element.sendKeys(Keys.ENTER);
  //Thread.sleep(2000);
  ((ChromeDriver) driver).executeScript("window.open('https://www.guinnessworldrecords.com/account/register','_blank');");

  ((ChromeDriver) driver).executeScript("window.open('https://www.hyrtutorials.com/p/alertsdemo.html','_blank');");


  driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
  Thread.sleep(2000);

driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");


/*
   driver.switchTo().defaultContent();
   // WebElement name = driver.findElement(By.name("fname"));
  WebElement name = driver.findElement(By.xpath("//input[@id='fname']"));
  //WebElement name = driver.findElement(By.cssSelector("input#fname"));
  name.sendKeys("sergey");
WebElement surname = driver.findElement(By.xpath("/html/body/form/input[2]"));
  surname.sendKeys("sergey");
WebElement submit = driver.findElement(By.xpath("/html/body/form/input[3]"));

surname.sendKeys("kudaev");
submit.click();
Thread.sleep(2000);
  Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[2]/p/text()[1]")).getText(), " This tutorial will not teach you how servers are processing input.\n" +
          "Processing input is explained in our ");
 */
// this episod of the code is not working , because Iframe which coming from webstie in video,
  // when i enter on the website , this iframe is not visiible ,
  //if i frame is not visible how can i close it?
  // i tried to turn of it from html, but it is not possible , because in inspects elements there are some Iframes and
  // i dont know which one is sepcial.


// https://www.guinnessworldrecords.com/account.register?
  //https://www.hyrtutorials.com/p/alertsdemo.html


  for (String handle : driver.getWindowHandles()) {
    driver.switchTo().window(handle);
    if (driver.getCurrentUrl().contains("https://www.guinnessworldrecords.com/account/register")) {
      break;
    }
  }
  WebElement lastname2 = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[1]/div[1]/div[1]/div[2]/input"));
  lastname2.sendKeys("kudaev");
  WebElement firstname2 = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[1]/div[1]/div[2]/div[2]/input"));
  firstname2.sendKeys("sergey");
  WebElement day = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[1]/div[2]/div[2]/input[1]"));
  day.sendKeys("25");
  WebElement month = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[1]/div[2]/div[2]/input[2]"));
  month.sendKeys("6");
  WebElement year = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[1]/div[2]/div[2]/input[3]"));
  year.sendKeys("1992");
  WebElement country = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[1]/div[2]/div[3]/div/div[1]/div[2]/select"));
  country.sendKeys("Ukraine");
  WebElement state = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[1]/div[2]/div[3]/div/div[2]/div[2]/select"));
  state.sendKeys("Dnipro");
  JavascriptExecutor js = (JavascriptExecutor) driver;
  //scroll
  js.executeScript("window.scrollBy(0, 300)");
  WebElement email2 = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[1]/div[3]/div[1]/div[2]/input"));
  email2.sendKeys("mailmail@mail.cim");
  WebElement email3 = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[1]/div[3]/div[2]/div[2]/input"));
  email3.sendKeys("mailmail@mail.cim");
  WebElement password1 = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[2]/div[1]/div[2]/input"));
  password1.sendKeys("12345678");
  WebElement password2 = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[2]/div[2]/div[2]/input"));
  password2.sendKeys("123456789");
  password2.sendKeys(Keys.ENTER);
  Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[2]/div[2]/div[2]/span/span")).getText(),
          "'Confirm password' and 'Password' do not match.");

   Thread.sleep(2000);


  for (String handle : driver.getWindowHandles()) {
    driver.switchTo().window(handle);
    if (driver.getCurrentUrl().contains("https://www.hyrtutorials.com/p/alertsdemo.html")) {
      break;
    }
  }
  driver.navigate().refresh();
  js.executeScript("window.scrollBy(0, 300)");
  WebElement click1 = driver.findElement(By.id("alertBox"));
  click1.click();
  Alert alert = driver.switchTo().alert();
  alert.accept();
  Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[2]/div[6]/div[1]/div/div[2]/div[1]/div[1]/div/div[1]/article/div/div/div[4]/div")).getText(),
          "You selected alert popup");


  WebElement click2 = driver.findElement(By.id("confirmBox"));
  click2.click();
  driver.switchTo().alert();
  alert.dismiss();
  Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[2]/div[6]/div[1]/div/div[2]/div[1]/div[1]/div/div[1]/article/div/div/div[4]/div")).getText(),
          "You pressed Cancel in confirmation popup");


  WebElement click3 = driver.findElement(By.id("promptBox"));
  click3.click();
  String text = "Final step of this task!";
  alert.sendKeys(text);
  alert.accept();
  Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[2]/div[6]/div[1]/div/div[2]/div[1]/div[1]/div/div[1]/article/div/div/div[4]/div")).getText(),
          "You entered text Final step of this task! in propmt popup");




    }
}
























