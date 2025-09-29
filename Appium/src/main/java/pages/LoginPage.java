package pages;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private AndroidDriver driver;

        // Constructor
        public LoginPage(AndroidDriver driver) {
            this.driver = driver;



        }
    public void enterEmail(String email) {
        driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[@text='Email']"))
                .sendKeys("kholod@gmail.com");
    }
    public void enterPassword(String password) {
          driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[@text='Password']"))
         .sendKeys("0000");
    }
    public void clickLogin() {
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"تسجيل الدخول\"]"))
                .click();
    }

}


