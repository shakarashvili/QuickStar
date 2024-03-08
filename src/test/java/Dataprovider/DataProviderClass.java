package Dataprovider;

import Lesson2.DriverSetUpV2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataProviderClass {   // This is fourth Task
    @Test(dataProvider = "log")
    public void DataProvider1(String email, int password){
        WebDriver driver = DriverSetUpV2.setUpDriver();
        driver.get("https://qa-course-01.andersenlab.com/login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/form/div/div[1]/label/input"))).sendKeys(email);
        driver.findElement(By.xpath("/html/body/div/div/div/div/form/div/div[2]/label/input")).sendKeys(String.valueOf(password));
        driver.findElement(By.xpath("//button[@type='submit']")).click();
       // WebElement errortext = driver.findElement(By.cssSelector(":contains('Email or password is not valid')"));
        By errortext = By.xpath("/html/body/div/div/div/div/form/div/div[1]/div/span");
       // By errortext = By.cssSelector(".absolute.right-0.text-rose-500.text-sm");
       // WebElement errortext = driver.findElement(By.xpath("(//*[@class='your-class'])[1]"));

        wait.until(ExpectedConditions.visibilityOfElementLocated((By) errortext)).getText();
        String errorText = driver.findElement((By) errortext).getText();
        Assert.assertTrue(errorText.contains("not valid"));
        driver.quit();
    }

    @DataProvider(name = "log")
    public Object[][] createData(){
        return  new  Object[][]{
                {"yvandrago@gmail.com", 123456789}, {"peteryan@gmail.com", 87654321}, {"ekaterinasobchak@gmail.com" , 124567623} , {"valeriagardineza@gmail.com" , 354324543}
        };
    }
}
















