package lesson13;

import Lesson2.DriverSetUpV2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lesson13 {


@Test
    public void test01(){ // Test Case ID: AN01.3

        WebDriver driver = DriverSetUpV2.setUpDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://qa-course-01.andersenlab.com/login");
        WebElement email =  driver.findElement(By.xpath("/html/body/div/div/div/div/form/div/div[1]/label/input"));
        email.sendKeys("ninashaqarashvili25@gmail.com");
        WebElement password =  driver.findElement(By.xpath("/html/body/div/div/div/div/form/div/div[2]/label/input"));
        password.sendKeys("wrong-wrong");
        WebElement singin = driver.findElement(By.xpath("//button[@type='submit']"));
        singin.click();

    Assert.assertEquals(driver.findElement(By.cssSelector("span.absolute.right-0.text-rose-500.text-sm")).getText(),
            "Email or password is not valid");

        driver.quit();
    }
    @Test
    public void test02(){ // Test Case ID: AN01.4
        WebDriver driver = DriverSetUpV2.setUpDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://qa-course-01.andersenlab.com/login");
        WebElement singin = driver.findElement(By.xpath("//button[@type='submit']"));
        singin.click();

        Assert.assertEquals(driver.findElement(By.cssSelector("span.absolute.right-0.text-rose-500.text-sm")).getText(),
                "Required");
        driver.quit();

    }

    @Test
    public void test03 (){ //Test Case ID: AN01.5
        WebDriver driver = DriverSetUpV2.setUpDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://qa-course-01.andersenlab.com/login");
        WebElement email =  driver.findElement(By.xpath("/html/body/div/div/div/div/form/div/div[1]/label/input"));
        email.sendKeys("ninashaqarashvili25");
        WebElement password =  driver.findElement(By.xpath("/html/body/div/div/div/div/form/div/div[2]/label/input"));
        password.sendKeys("Anderson.1");
        WebElement singin = driver.findElement(By.xpath("//button[@type='submit']"));
        singin.click();

        Assert.assertEquals(driver.findElement(By.cssSelector("span.absolute.right-0.text-rose-500.text-sm")).getText(),
                "Invalid email address");
        driver.quit();


    }

    @Test
    public void test04(){ // Test Case ID: AN02.4
        WebDriver driver = DriverSetUpV2.setUpDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://qa-course-01.andersenlab.com/registration");
        WebElement name = driver.findElement(By.className("border-gray-500"));
        name.sendKeys("nina");
        WebElement lastname = driver.findElement(By.name("lastName"));
        lastname.sendKeys("shakarashvili");
        WebElement birthday = driver.findElement(By.cssSelector("input[name='dateOfBirth']"));
        birthday.sendKeys("25/02/2005");
        birthday.click();
        WebElement email = driver.findElement(By.xpath("//input[@placeholder='Enter email']"));
        // //input[contains(@class,'border')]
        email.sendKeys("ninashaqarashvili25@gmail.com");
        WebElement enterpassword  = driver.findElement(By.xpath("//input[@placeholder='Enter password']"));
        enterpassword.sendKeys("Anderson.1");
        WebElement confrimpassword  = driver.findElement(By.xpath("//input[@placeholder='Confirm Password']"));
        confrimpassword.sendKeys("Anderson");
        confrimpassword.sendKeys(Keys.ENTER);
        Assert.assertEquals(driver.findElement(By.cssSelector("span.absolute.right-0.text-rose-500.text-sm")).getText(),
                "Passwords must match");

        driver.quit();

    }

    @Test
    public void test05(){ //Test Case ID: AN02.5

        WebDriver driver = DriverSetUpV2.setUpDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://qa-course-01.andersenlab.com/registration");
        WebElement name = driver.findElement(By.className("border-gray-500"));
        name.sendKeys("nina");
        WebElement lastname = driver.findElement(By.name("lastName"));
        lastname.sendKeys("nina");
        WebElement birthday = driver.findElement(By.cssSelector("input[name='dateOfBirth']"));
        birthday.sendKeys("25/02/2005");
        birthday.click();
        WebElement email = driver.findElement(By.xpath("//input[@placeholder='Enter email']"));
        // //input[contains(@class,'border')]
        email.sendKeys("ninashaqarashvili25@gmail.com");
        WebElement enterpassword  = driver.findElement(By.xpath("//input[@placeholder='Enter password']"));
        enterpassword.sendKeys("Anderson.1");
        WebElement confrimpassword  = driver.findElement(By.xpath("//input[@placeholder='Confirm Password']"));
        confrimpassword.sendKeys("Anderson.1");
        confrimpassword.sendKeys(Keys.ENTER);
        driver.quit();

        // here i found bug , because website give me psibilities to give its ,
        // same name and surname , and this is exactly bug.
    }

    @Test
    public void test06(){  // Test Case ID: AN02.7

        WebDriver driver = DriverSetUpV2.setUpDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://qa-course-01.andersenlab.com/registration");
        WebElement name = driver.findElement(By.className("border-gray-500"));
        name.sendKeys("nina");
        WebElement lastname = driver.findElement(By.name("lastName"));
        lastname.sendKeys("shakarashvili");
        WebElement birthday = driver.findElement(By.cssSelector("input[name='dateOfBirth']"));
        birthday.sendKeys("25/02/2005");
        birthday.click();
        WebElement email = driver.findElement(By.xpath("//input[@placeholder='Enter email']"));
        // //input[contains(@class,'border')]
        email.sendKeys("ninashaqarashvili25");
        WebElement enterpassword  = driver.findElement(By.xpath("//input[@placeholder='Enter password']"));
        enterpassword.sendKeys("Anderson.1");
        WebElement confrimpassword  = driver.findElement(By.xpath("//input[@placeholder='Confirm Password']"));
        confrimpassword.sendKeys("Anderson.1");
        confrimpassword.sendKeys(Keys.ENTER);

        WebElement element = driver.findElement(By.cssSelector("span.absolute.right-0.text-rose-500.text-sm"));
        String actualText = element.getText();
        String expectedText = "Invalid email address";
        Assert.assertEquals(actualText, expectedText, "Text does not match");

        driver.quit();

    }
}
