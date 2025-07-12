package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import utils.WebDriverFactory;

public class BaseTest {
    // base/BaseTest.java

        protected WebDriver driver;

        @BeforeMethod
        public void setUp() {
            driver = WebDriverFactory.createDriver("chrome");
            driver.manage().window().maximize();
        }

        @BeforeMethod
        public void loginToApp() {
            driver = new ChromeDriver();
            driver.get("https://restateapp.com/login");

           LoginPage loginPage = new LoginPage(driver);
            loginPage.enterEmail("skyline-realty@example.com");
            loginPage.enterPassword("123456");
            loginPage.clickLogin();
        }
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }

    }
}



