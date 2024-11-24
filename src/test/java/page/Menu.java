package page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static helpers.DriverSingleton.getDriver;

public class Menu extends BasePage {

    @FindBy(css = "span[class='oxd-text oxd-text--span oxd-main-menu-item--name']")
    private WebElement adminButton;

    @FindBy(xpath = "//nav[@class='oxd-navbar-nav']/div[2]/ul/li[6]/a/span")
    private WebElement myInfoButton;

    public Menu() {
        PageFactory.initElements(getDriver(), this);
    }

    @Step("Click my info button")
    public Menu clickMyInfoButton(){
        myInfoButton.click();
        return this;
    }
    @Step("Click admin button")
    public Menu clickAdminButton() {
        adminButton.click();
        return this;
    }
}