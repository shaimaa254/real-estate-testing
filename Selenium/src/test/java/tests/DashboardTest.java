package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import java.time.Duration;

public class DashboardTest {
   /* WebDriver driver;
    LoginPage loginPage;
    DashboardPage dashboardPage;

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


    }


    @Test
    public void testProjectsModuleLink() {
     dashboardPage =new DashboardPage(driver);
     dashboardPage.clickProjects();
     new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.urlContains("/projects"));
     dashboardPage.clickDashboard();
    }


  /*  @Test
    public void testCustomersModuleLink() {
        dashboardPage =new DashboardPage(driver);
        dashboardPage.clickCustomers();
        dashboardPage.clickDashboard();
    }

    @Test
    public void testUnitsModuleLink() {
        dashboardPage =new DashboardPage(driver);
        dashboardPage.clickUnits();
        dashboardPage.clickDashboard();
    }

    @Test
    public void testMenuUnitsReservationsModuleLink() {
        dashboardPage =new DashboardPage(driver);
        dashboardPage.clickUnitsReservations();
        dashboardPage.clickDashboard();
    }

    @Test
    public void testMenuUnitsReservationsRequestsModuleLink() {
        dashboardPage =new DashboardPage(driver);
        dashboardPage.clickReservationsRequests();
        dashboardPage.clickDashboard();
    }

    @Test
    public void testNotificationsModuleLink() {
        dashboardPage =new DashboardPage(driver);
        dashboardPage.clickNotifications();
        dashboardPage.clickDashboard();
    }

    @Test
    public void testMessagesModuleLink() {


        dashboardPage =new DashboardPage(driver);
        dashboardPage.clickMessages();
        dashboardPage.clickDashboard();


    @Test
    public void testProfile() {
        dashboardPage = new DashboardPage(driver);
        dashboardPage.clickProfile();


    @Test
    public void testLanguageDropdown() {


    }
     @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }*/

}
