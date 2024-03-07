package Lesson2.automationtests;

import Lesson2.DriverSetUpV2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.time.Duration;

public class AutomationTest1 {
    public static void main(String[] args) throws InterruptedException{

        // this 4 test was first exercise what was in homework
        Test1();
        Test2();
        Test3();
        Test4();



    }
    public static void Test1(){ // Test Case ID: AN01.1

        WebDriver driver = DriverSetUpV2.setUpDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://qa-course-01.andersenlab.com/login");
        WebElement email =  driver.findElement(By.xpath("/html/body/div/div/div/div/form/div/div[1]/label/input"));
        email.sendKeys("ninashaqarashvili25@gmail.com");
        WebElement password =  driver.findElement(By.xpath("/html/body/div/div/div/div/form/div/div[2]/label/input"));
        password.sendKeys("Anderson.1");
        WebElement singin = driver.findElement(By.xpath("//button[@type='submit']"));
        singin.click();
        driver.quit();
        System.out.println(" test is done ");

    }
    public static void Test2(){ // Test Case ID: AN01.2
        WebDriver driver = DriverSetUpV2.setUpDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://qa-course-01.andersenlab.com/login");
        WebElement email =  driver.findElement(By.xpath("/html/body/div/div/div/div/form/div/div[1]/label/input"));
        email.sendKeys("shaqara@gmail.com");
        WebElement password =  driver.findElement(By.xpath("/html/body/div/div/div/div/form/div/div[2]/label/input"));
        password.sendKeys("Nina");
        WebElement singin = driver.findElement(By.xpath("//button[@type='submit']"));
        singin.click();
        driver.quit();
        System.out.println(" test is done ");


    }
    public static void Test3(){ //Test Case ID: AN02.2
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
        confrimpassword.sendKeys("Anderson.1");
       // WebElement submit  = driver.findElement(By.xpath("//button[@type='submit']")); submit button is not working even i click on the button manualy , i think it is web site's problem
       // submit.click();
        driver.quit();
        System.out.println(" test is done ");


    }
    public static void Test4(){ //Test Case ID: AN02.3
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
        email.click();
        WebElement enterpassword  = driver.findElement(By.xpath("//input[@placeholder='Enter password']"));
        enterpassword.sendKeys("Anderson.1");
        WebElement confrimpassword  = driver.findElement(By.xpath("//input[@placeholder='Confirm Password']"));
        confrimpassword.sendKeys("Anderson.1");
        //WebElement submit  = driver.findElement(By.xpath("//button[@type='submit']"));
       // submit.click();
        driver.quit();
        System.out.println(" test is done ");
    }
}
























