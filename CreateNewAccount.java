package com.blz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class CreateNewAccount {

    @Test
    public void createAccount() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\harshal bojja\\IdeaProjects\\SeleniumSession\\src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Harshal");
        Thread.sleep(2000);
        driver.findElement(By.name("lastname")).sendKeys("Anandas");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("Test@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Test@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("Test@123");
        Thread.sleep(2000);
        driver.findElement(By.name("birthday_day")).sendKeys("17");
        Thread.sleep(2000);
        driver.findElement(By.name("birthday_month")).sendKeys("Oct");
        Thread.sleep(2000);
        driver.findElement(By.name("birthday_year")).sendKeys("1995");
        Thread.sleep(2000);
        List<WebElement>gender = driver.findElements(By.name("sex"));
        gender.get(0).click();
        //driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
        Thread.sleep(2000);

    }
}
