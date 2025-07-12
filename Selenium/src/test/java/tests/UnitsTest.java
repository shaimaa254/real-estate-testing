package tests;

/*import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import pages.UnitsPage;

import java.time.Duration;

public class UnitsTest {
    WebDriver driver;
    LoginPage loginPage;
    DashboardPage dashboardPage;
    UnitsPage unitsPage;
    @BeforeClass
    public void setupClass() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://restateapp.com/login");
    }
        @BeforeMethod
        public void setUpMethod() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.enterEmail("skyline-realty@example.com");
    loginPage.enterPassword("123456");
    loginPage.clickLogin();
    new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("/dashboard"));

    DashboardPage dashboardPage = new DashboardPage(driver);
    dashboardPage.clickLanguageDropdown();
    dashboardPage.clickEnglishOption();
    dashboardPage.openUnitsModule();
    new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.urlContains("/units"));

}

@Test
    public void testAddUnit(){
        UnitsPage unitPage = new UnitsPage(driver);
        unitPage.clickAddButton();
}



    /*@Test
    public void testAddUnit() {
        UnitsPage unitsPage = new UnitsPage() {
        unitsPage.enterName("Commercial Unit");
        unitsPage.enterPrice("100000");
        unitsPage.enterDownpayment("50000");
        unitsPage.enterCode("3333");
        unitsPage.enterProject("stars");
        unitsPage.enterCustomer("خلود على");
       unitsPage.enterCountries("Egypt");
        unitsPage.enterCity("Giza");
        unitsPage.enterAreas("Hadayek Al Ahram");
        unitsPage.enterDistricts("First Gate");
        unitsPage.toggleStatus();
        unitsPage.uploadFile("");
        unitsPage.enterDescription("");
        unitsPage.clicksave();
    }
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }*/

