package tests;

import page.Login;
import java.time.Duration;
import io.qameta.allure.Step;
import org.testng.ITestResult;
import io.qameta.allure.Severity;
import helpers.ScreenshotGenerator;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static helpers.DriverSingleton.getDriver;
import static helpers.DriverSingleton.turnOffDriver;

public class TestSetup {

    @BeforeMethod
    @Severity(SeverityLevel.BLOCKER)
    @Step("Configuration and user setting")
    public void beforeMethod() {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        getDriver().manage().window().maximize();
        getDriver().navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Login login = new Login();
        login
                .typeUsernameLabel("Admin")
                .typePasswordLabel("admin123")
                .clickLoginButton();
    }

    @AfterMethod
    @Step("Turn off driver and website")
    public void afterMethod(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            ScreenshotGenerator.takeScreenshot();
        }
        turnOffDriver();
    }
}