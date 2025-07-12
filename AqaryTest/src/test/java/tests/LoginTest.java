package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class LoginTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://restateapp.com/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmail("skyline-realty@example.com");
        loginPage.enterPassword("123456");
        loginPage.clickLogin();
    }
}