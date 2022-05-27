package com.blz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class KeyboardMouseOperations {

    @Test
    public void operateMouse() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\harshal bojja\\IdeaProjects\\SeleniumSession\\src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
        Robot r = new Robot();
        r.mouseMove(300, 500);           //move the mouse by x and y coordinate
    }

    @Test
    public void operateKeyboard() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\harshal bojja\\IdeaProjects\\SeleniumSession\\src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_SHIFT);
        r.keyPress(KeyEvent.VK_N);
        r.keyRelease(KeyEvent.VK_N);

        //r.keyRelease(KeyEvent.VK_SHIFT);
        //r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_I);
        Thread.sleep(3000);
        driver.close();
        driver.quit();
    }
    }
