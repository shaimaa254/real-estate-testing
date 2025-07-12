package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {
    // utils/WebDriverFactory.java

        public static WebDriver createDriver(String browser) {
            if (browser.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            }
            // Add Firefox, Edge etc. if needed
            throw new IllegalArgumentException("Browser not supported");
        }
    }



