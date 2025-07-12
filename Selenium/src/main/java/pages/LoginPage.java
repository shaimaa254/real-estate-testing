package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage{
  WebDriver driver;

public LoginPage(WebDriver driver){
 this.driver = driver;
 }

//locators
By emailField = By.name("email");
By passwordField = By.name("password");
By loginButton = By.cssSelector("button.btn.btn-primary");

//methods
   public void enterEmail(String Email){ driver.findElement(emailField).sendKeys("skyline-realty@example.com");}
    public void enterPassword(String password){driver.findElement(passwordField).sendKeys("123456");}
    public void clickLogin() {driver.findElement(loginButton).click();}

}
//locators and methods
/*public void enterEmail(String text) {
    By emailField = By.name("email");
    driver.findElement(emailField).sendKeys("skyline-realty@example.com");
}

    public void enterPassword(String text) {
        By passwordField = By.name("password");
        driver.findElement(passwordField).sendKeys("123456");
    }
    public void clickLogin() {
        By loginButton = By.cssSelector("button.btn.btn-primary");
        driver.findElement(loginButton).click();}*/


