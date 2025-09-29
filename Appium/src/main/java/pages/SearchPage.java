package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.time.Duration;

public class SearchPage {
    private AndroidDriver driver;

    // Constructor
    public SearchPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void openSearch() {
        driver.findElement(AppiumBy.id("")).click();
    }
    public void enterSearch(String query) {
        driver.findElement(AppiumBy.id("")).sendKeys("");
    }
    public void clearSearch() {
        driver.findElement(AppiumBy.id("")).clear();
    }

}

