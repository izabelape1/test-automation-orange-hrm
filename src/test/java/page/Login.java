package page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static helpers.DriverSingleton.getDriver;

public class Login extends BasePage {

    @FindBy(css = "input[placeholder='Username']")
    private WebElement userNameLabel;

    @FindBy(css = "input[name='password']")
    private WebElement passwordLabel;

    @FindBy(css = "button[type='submit']")
    private WebElement loginButton;

    public Login() {
        PageFactory.initElements(getDriver(), this);
    }

    @Step("Type user name")
    public Login typeUsernameLabel(String username) {
        userNameLabel.sendKeys(username);
        return this;
    }

    @Step("Type password")
    public Login typePasswordLabel(String password) {
        passwordLabel.sendKeys(password);
        return this;
    }

    @Step("Click login button")
    public Login clickLoginButton() {
        loginButton.click();
        return this;
    }
}