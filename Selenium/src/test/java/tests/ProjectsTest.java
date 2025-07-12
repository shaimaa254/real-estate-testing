package tests;
/*
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import pages.ProjectsPage;

import java.time.Duration;

public class ProjectsTest {
    WebDriver driver;
    LoginPage loginPage;
    DashboardPage dashboardPage;
    ProjectsPage projectsPage;

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
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.urlContains("/dashboard"));

        DashboardPage dashboardPage =new DashboardPage(driver);
        dashboardPage.clickProjects();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.urlContains("/projects"));
    }

    @Test
    public void testAddProject() {

    }
}*/