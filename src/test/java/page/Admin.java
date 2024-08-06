package page;

import enums.UserRole;
import enums.UserStatus;
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
    private WebElement userRoleDropDownList;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]")
    private WebElement ESSLabel;

    @FindBy(xpath = "//span[@data-v-13cf171c=''][contains(text(),'Admin')]")
    private WebElement adminLabel;

    @FindBy(xpath = "//div[contains(text(),'-- Select --')]")
    private WebElement statusDropDownList;

    @FindBy(css = "div[role='listbox'] div:nth-child(2) span:nth-child(1)")
    private WebElement enabledLabel;

    @FindBy(css = "div[class='oxd-select-option --selected']")
    private WebElement disabledLabel;

    @FindBy(css = "p[class='oxd-userdropdown-name']")
    private WebElement getEmployeeName;

    @FindBy(css = "input[placeholder='Type for hints...']")
    private WebElement employeeNameLabel;

    @FindBy(css = "div[role='option'] span")
    private WebElement selectEmployeeName;

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

    public Admin chooseUserRoleLabel(UserRole userRole) {
        userRoleDropDownList.click();
        switch (userRole) {
            case ADMIN:
                adminLabel.click();
                break;
            case ESS:
                ESSLabel.click();
                break;
        }
        return this;
    }

    public Admin chooseStatusLabel(UserStatus userStatus) {
        statusDropDownList.click();
        switch(userStatus){
            case ENABLED:
                enabledLabel.click();
                break;
            case DISABLED:
                disabledLabel.click();
                break;
        }
        return this;
    }

    public Admin typeEmployeeNameLabel() {
        String employeeName = getEmployeeName.getText();
        employeeNameLabel.sendKeys(employeeName);
        selectEmployeeName.click();
        return this;
    }

    public Admin typeUserNameLabel() {
        userNameLabel.sendKeys(generateUserName());
        return this;
    }

    public Admin typePasswordLabel() {
        passwordLabel.sendKeys(password);
        return this;
    }

    public Admin typeConfirmPasswordLabel() {
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