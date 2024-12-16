package page;

import enums.UserRole;
import enums.UserStatus;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static helpers.DriverSingleton.getDriver;
import static helpers.RandomDataGenerator.generatePassword;
import static helpers.RandomDataGenerator.generateUserName;

public class Admin extends BasePage {

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

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[4]/div[1]/div[2]/input")
    private WebElement userNameLabel;

    @FindBy(xpath = "//form[@class='oxd-form']/div[2]/div[1]/div[1]/div[1]/div[2]/input")
    private WebElement passwordLabel;

    @FindBy(xpath = "//form[@class='oxd-form']/div[2]/div[1]/div[2]/div[1]/div[2]/input")
    private WebElement confirmPasswordLabel;

    @FindBy(css = "div[class='oxd-toast-icon-container']")
    private WebElement successWindow;

    String password = generatePassword();

    public Admin() {
        PageFactory.initElements(getDriver(), this);
    }

    @Step("Click add button")
    public Admin clickAddButton() {
        addButton.click();
        return this;
    }

    @Step("Choosing user role: {userRole}")
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

    @Step("Choosing status label: {userStatus}")
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

    @Step("Type employee name")
    public Admin typeEmployeeNameLabel() {
        String employeeName = getEmployeeName.getText();
        employeeNameLabel.sendKeys(employeeName);
        selectEmployeeName.click();
        return this;
    }

    @Step("Type user name")
    public Admin typeUserNameLabel() {
        userNameLabel.sendKeys(generateUserName());
        return this;
    }

    @Step("Type password")
    public Admin typePasswordLabel() {
        passwordLabel.sendKeys(password);
        return this;
    }

    @Step("Type confirmation password")
    public Admin typeConfirmPasswordLabel() {
        confirmPasswordLabel.sendKeys(password);
        return this;
    }

    @Step("Verification is success button is displayed")
    public boolean isSuccessButtonIsDisplayed() {
        return successWindow.isDisplayed();
    }
}