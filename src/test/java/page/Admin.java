package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static helpers.DriverSingleton.getDriver;
import static helpers.RandomDataGenerator.generatePassword;
import static helpers.RandomDataGenerator.generateUserName;

public class Admin {

    @FindBy(css = "button[class='oxd-button oxd-button--medium oxd-button--secondary']")
    private WebElement addButton;

    @FindBy(css = "div[class='oxd-select-text-input']")
    private WebElement userRoleList;

    @FindBy(xpath = "//span[@data-v-13cf171c=''][contains(text(),'Admin')]")
    private WebElement adminOption;

    @FindBy(xpath = "//div[contains(text(),'-- Select --')]")
    private WebElement statusLabel;

    @FindBy(css = "div[role='listbox'] div:nth-child(2) span:nth-child(1)")
    private WebElement enabledLabel;

    @FindBy(css = "p[class='oxd-userdropdown-name']")
    private WebElement getEmployeeName;

    @FindBy(css = "input[placeholder='Type for hints...']")
    private WebElement employeeNameLabel;

    @FindBy(css = "div[role='option'] span")
    private WebElement pickEmployeeName;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement userNameLabel;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    private WebElement passwordLabel;

    @FindBy(xpath = "(//input[@type='password'])[2]")
    private WebElement confirmPasswordLabel;

    @FindBy(css = "button[type='submit']")
    private WebElement saveButton;

    @FindBy(css = "div[class='oxd-toast-icon-container']")
    private WebElement successWindow;

    String password = generatePassword();

    public Admin() {
        PageFactory.initElements(getDriver(), this);
    }

    public Admin clickAddButton() {
        addButton.click();
        return this;
    }

    public Admin clickUserRoleList() {
        userRoleList.click();
        return this;
    }

    public Admin selectUserRoleLabel() {
        adminOption.click();
        return this;
    }

    public Admin clickStatusList() {
        statusLabel.click();
        return this;
    }

    public Admin selectStatusLabel() {
        enabledLabel.click();
        return this;
    }

    public Admin setEmployeeNameLabel() {
        String employeeName = getEmployeeName.getText();
        employeeNameLabel.sendKeys(employeeName);
        pickEmployeeName.click();
        return this;
    }

    public Admin setUserNameLabel() {
        userNameLabel.sendKeys(generateUserName());
        return this;
    }

    public Admin setPasswordLabel() {
        passwordLabel.sendKeys(password);
        return this;
    }

    public Admin setConfirmPasswordLabel() {
        confirmPasswordLabel.sendKeys(password);
        return this;
    }

    public Admin clickSaveButton() {
        saveButton.click();
        return this;
    }

    public boolean isSuccessButtonIsDisplayed() {
        return successWindow.isDisplayed();
    }
}