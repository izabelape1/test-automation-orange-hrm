package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static helpers.DriverSingleton.getDriver;

public class Menu {

    @FindBy(css = "span[class='oxd-text oxd-text--span oxd-main-menu-item--name']")
    private WebElement adminButton;

    @FindBy(xpath = "//a[@href='/web/index.php/pim/viewMyDetails']/span")
    private WebElement myInfoButton;

    public Menu() {
        PageFactory.initElements(getDriver(), this);
    }

    public Menu clickAdminButton() {
        adminButton.click();
        return this;
    }

    public Menu clickMyInfoButton() {
        myInfoButton.click();
        return this;
    }
}