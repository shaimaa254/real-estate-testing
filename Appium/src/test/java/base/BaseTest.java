package base;


import io.appium.java_client.AppiumDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.URL;


public class BaseTest {
    protected AndroidDriver driver;

    @BeforeTest
        @Parameters({"udid", "systemPort", "platformVersion", "appPath"})

        public void setup(String udid, String systemPort, String platformVersion, String appPath) throws Exception {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", "Android");
            caps.setCapability("udid", udid);
            caps.setCapability("systemPort", Integer.parseInt(systemPort));
            caps.setCapability("platformVersion", platformVersion);
        caps.setCapability("deviceName", "AndroidDevice");

        caps.setCapability("automationName", "UiAutomator2");
            caps.setCapability("app", appPath);


        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), caps);

    }
    @BeforeMethod
    public void setUp() {
        // driver initialization here...
    }

    protected void switchToWebView() {
        System.out.println(driver.getContextHandles());
        for (String context : driver.getContextHandles()) {
            if (context.contains("WEBVIEW")) {
                driver.context(context);
                break;
            }
        }
    }

    protected void switchToNative() {
        driver.context("NATIVE_APP");
    }

       /* @AfterTest
        public void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }*/
    }









