package com.blz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;

public class ElementsAreAlignedOrNot {
    @Test
    public void alignedByXcoordinatesOrNot() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\harshal bojja\\IdeaProjects\\SeleniumSession\\src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.hubspot.com/login");
        Thread.sleep(3000);

        WebElement unTB = driver.findElement(By.id("username"));
        int un_x = unTB.getLocation().getX();
        int un_width = unTB.getSize().getWidth();
        int un_height = unTB.getSize().getHeight();

        WebElement pwTB = driver.findElement(By.id("password"));
        int pw_x = pwTB.getLocation().getX();
        int pw_width = pwTB.getSize().getWidth();
        int pw_height = pwTB.getSize().getHeight();

        if (un_x == pw_x && un_width==pw_width && un_height==pw_height) {
            System.out.println("Username and password text box are aligned");
        } else {
            System.out.println("Username and password text box are NOT aligned");
        }

    }

    @Test
    public void alignedByYcoordinatesOrNot() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\harshal bojja\\IdeaProjects\\SeleniumSession\\src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);

        WebElement unTB = driver.findElement(By.id("email"));
// get the y-coordinate of username field
        int username_Ycordinate = unTB.getLocation().getY();
        System.out.println(username_Ycordinate);
        WebElement pwdTB = driver.findElement(By.name("pass"));
// get the y-coordinate of password field
        int password_Ycordinate = pwdTB.getLocation().getY();
        System.out.println(password_Ycordinate);

        if (username_Ycordinate==password_Ycordinate) {
            System.out.println("Both username and password fields are displayed in the same row");
        }else{
            System.out.println("username and password fields are NOT aligned in the same row");
        }
    }
}
