package com.blz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class IsSelected {
    @Test
    public void radioIsSelected() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://www.facebook.com/");
//        driver.findElement(By.linkText("Create New Account")).click();
//        Thread.sleep(2000);
//        WebElement gender = driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
//        gender.click();

        driver.get("https://app.hubspot.com/login");
        WebElement rememberMe_Checkbox = driver.findElement(By.id("checkbox-content-4"));
        rememberMe_Checkbox.click();
        Thread.sleep(2000);
        if (rememberMe_Checkbox.isSelected()) {
            System.out.println("Checkbox is selected");
        } else {
            System.out.println("Checkbox is NOT selected");
        }
        driver.close();
    }
}