package com.blz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IsEnabled {
    @Test
    public void radioIsSelected() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.hubspot.com/login");
        Thread.sleep(3000);

//        driver.findElement(By.id("username")).sendKeys("Test@gmail.com");
//        Thread.sleep(2000);
//        driver.findElement(By.id("password")).sendKeys("Test123");
          WebElement UN =driver.findElement(By.id("loginBtn"));
          Thread.sleep(2000);

        if (UN.isEnabled()) {
            System.out.println("Login button is enabled");
        }else {
            System.out.println("Login button is disabled");
        }
        driver.close();
    }
}
