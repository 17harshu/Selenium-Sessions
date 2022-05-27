import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class SeleniumMain {
    public static void main(String[] args) {
        int choice;
        WebDriver driver = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the driver: 1: Chrome driver \n 2: Edge driver \n 3: Firefox driver");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\harshal bojja\\IdeaProjects\\SeleniumSession\\src\\driver\\chromedriver.exe");
                driver = new ChromeDriver();
                System.out.println("Chrome launched");
                break;

            case 2:
                System.setProperty("webdriver.edge.driver", "C:\\Users\\harshal bojja\\IdeaProjects\\SeleniumSession\\src\\driver\\msedgedriver.exe");
                driver = new EdgeDriver();
                System.out.println("Microsoft Edge launched");
                break;

            case 3:
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\harshal bojja\\IdeaProjects\\SeleniumSession\\src\\driver\\geckodriver.exe");
                driver = new FirefoxDriver();
                System.out.println("Firefox launched");
                break;
        }
    }
}


