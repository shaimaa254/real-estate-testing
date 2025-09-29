package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.time.Duration;

public class HomePage {

    private AndroidDriver driver;

    // Constructor
    public HomePage(AndroidDriver driver) {
        this.driver = driver;
    }



    public void openSearch() {
        driver.findElement(AppiumBy.id("")).click();
    }
    public void clearSearch() {
        driver.findElement(AppiumBy.id("")).clear();
    }
    public void enterSearch(String query) {
        driver.findElement(AppiumBy.id("")).sendKeys("");
    }

    public boolean isFilterVisible() {
        return driver.findElement(AppiumBy.id("")).isDisplayed();
    }

    public void clickFilterButton() {
        driver.findElement(AppiumBy.id("")).click();
    }

    public boolean isProfileVisible() {
        return driver.findElement(AppiumBy.id("")).isDisplayed();
    }
    public void clickProfileButton() {
        driver.findElement(AppiumBy.id("")).click();
    }

    public boolean isCheckboxSelected() {
        return driver.findElement(AppiumBy.id("")).isSelected();
    }




    public void scrollToText(String text) {
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollTextIntoView(\"" + text + "\")"
                ));}

    public void swipeDown() {

        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(500, 300))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(500, 1000))
                .release()
                .perform();
    }
    public boolean isPropertiesWalletVisible() {
        return driver.findElement(AppiumBy.id("")).isDisplayed();
    }
    public void clickPropertiesWalletButton() {
        driver.findElement(AppiumBy.id("")).click();
    }
    public boolean isPontsWalletVisible() {
        return driver.findElement(AppiumBy.id("")).isDisplayed();
    }
    public void clickPointsWalletButton() {
        driver.findElement(AppiumBy.id("")).click();
    }

    public boolean isSettingsVisible() {
        return driver.findElement(AppiumBy.id("")).isDisplayed();
    }
    public void clickSettingsButton() {
        driver.findElement(AppiumBy.id("")).click();
    }
    public boolean isMessagesVisible() {
        return driver.findElement(AppiumBy.id("")).isDisplayed();
    }
    public void clickMessagesButton() {
        driver.findElement(AppiumBy.id("")).click();
    }
    public boolean isNotificationsVisible() {
        return driver.findElement(AppiumBy.id("")).isDisplayed();
    }
    public void clickNotificationsButton() {
        driver.findElement(AppiumBy.id("")).click();
    }
    public boolean isHomeVisible() {
        return driver.findElement(AppiumBy.id("")).isDisplayed();
    }
    public void clickHomeButton() {
        driver.findElement(AppiumBy.id("")).click();
    }

}
