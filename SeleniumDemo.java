package com.blz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class SeleniumDemo {
    public void seleniumLogin() throws InterruptedException {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\harshal bojja\\IdeaProjects\\SeleniumSession\\src\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
                Thread.sleep(2000);
                driver.findElement(By.id("email")).sendKeys("Test@gmail.com");
                Thread.sleep(2000);
                //driver.findElement(By.id("email")).clear();
                //Thread.sleep(2000);
                driver.findElement(By.name("pass")).sendKeys("Test@123");
                Thread.sleep(2000);
                //driver.findElement(By.name("Log In")).click();
                driver.findElement(By.name("login")).submit();
               Thread.sleep(2000);

                System.out.println("Title: " + driver.getTitle());
                System.out.println("URL: " + driver.getCurrentUrl());
                driver.close();


        }
    }