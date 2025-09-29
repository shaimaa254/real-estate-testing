package tests;
import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
public class LoginTest extends BaseTest{





    @Test
        public void testValidLogin() {
            LoginPage loginPage = new LoginPage(driver);


        loginPage.enterEmail("kholod@gmail.com");
        loginPage.enterPassword("0000");
        loginPage.clickLogin();



                // context switch if needed (e.g., after login opens WebView)
                System.out.println(driver.getContextHandles());
                for (String context : driver.getContextHandles()) {
                    if (context.contains("WEBVIEW")) {
                        driver.context(context);
                        System.out.println("Switched to: " + context);
                    }
                }

                // Switch back to native app
                driver.context("NATIVE_APP");
    }
    }


