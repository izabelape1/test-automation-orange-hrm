package page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static helpers.DriverSingleton.getDriver;

public class Login {

    @FindBy(name = "username")
    private WebElement userNameLabel;

    @FindBy(css = "input[name='password']")
    private WebElement clickOnPasswordLabel;

    @FindBy(css = "button[type='submit']")
    private WebElement clickOnLoginButton;

    public Login() {
        PageFactory.initElements(getDriver(), this);
    }

    public Login setUsernameLabel(String username) {
        userNameLabel.sendKeys(username);
        return this;
    }

    public Login setPasswordLabel(String password) {
        clickOnPasswordLabel.sendKeys(password);
        return this;
    }

    public Login clickLoginButton() {
        clickOnLoginButton.click();
        return this;
    }
}