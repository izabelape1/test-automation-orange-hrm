package tests;

import page.Login;
import java.time.Duration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static helpers.DriverSingleton.getDriver;
import static helpers.DriverSingleton.turnOffDriver;

public class TestSetup {

    @BeforeMethod
    public void beforeMethod() {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        getDriver().manage().window().maximize();
        getDriver().navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Login login = new Login();
        login
                .setUsernameLabel("Admin")
                .setPasswordLabel("admin123")
                .clickLoginButton();
    }

    @AfterMethod
    public void afterMethod() {
        turnOffDriver();
    }
}