package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static helpers.DriverSingleton.getDriver;

public class MyInfo {

    @FindBy(xpath = "//a[@href='/web/index.php/pim/viewMyDetails']/span")
    private WebElement myInfoButton;

    @FindBy(name = "firstName")
    private WebElement firstNameLabel;

    @FindBy(name = "middleName")
    private WebElement middleNameLabel;

    @FindBy(name = "lastName")
    private WebElement lastNameLabel;

    @FindBy(xpath = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[1]//div[2]//div[1]//div[1]//div[2]//input[1]")
    private WebElement nickNameLabel;

    @FindBy(xpath = "//div[@class='orangehrm-edit-employee-content']//div[2]//div[1]//div[1]//div[1]//div[2]//input[1]")
    private WebElement employeeIdLabel;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[2]/div[1]/div[2]/input")
    private WebElement otherIdLabel;

    @FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[2]/div[2]/div[1]/div[1]/div[2]/input[1]")
    private WebElement driversLicenseNumberLabel;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
    private WebElement licenseExpiryDateLabel;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
    private WebElement nationalityDropDownList;

    @FindBy(xpath = "//div[@role='listbox']/div[3]/span")
    private WebElement nationalityLabel;

    @FindBy(xpath = "//div[@class='oxd-form-row']//div[3]//div[1]//div[1]//div[2]//input[1]")
    private WebElement ssnNumberLabel;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[3]/div[2]/div[1]/div[2]/input[1]")
    private WebElement sinNumberLabel;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]")
    private WebElement maritalStatusDropDownListLabel;

    @FindBy(xpath = "//span[normalize-space()='Single']")
    private WebElement maritalStatusLabel;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input")
    private WebElement dateOfBirthLabel;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/label[1]/span")
    private WebElement genderRadioButton;

    @FindBy(xpath = "//form[@class='oxd-form']/div[4]/div[1]/div[1]/div[1]/div[2]/input")
    private WebElement militaryServiceLabel;

    @FindBy(xpath = "//form[@class='oxd-form']/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/label/span")
    private WebElement smokerCheckbox;

    @FindBy(xpath = "//html/body/div/div/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
    private WebElement bloodTypeDropDownListLabel;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]")
    private WebElement bloodTypeLabel;

    @FindBy(xpath = "//form[@class='oxd-form']/div[2]/button")
    private WebElement saveButton;

    public MyInfo() {
        PageFactory.initElements(getDriver(), this);
    }

    public MyInfo clickMyInfoButton() {
        myInfoButton.click();
        return this;
    }

    public MyInfo typeFirstNameLabel(String firstName) {
        firstNameLabel.clear();
        firstNameLabel.sendKeys(firstName);
        return this;
    }

    public MyInfo typeMiddleNameLabel(String middleName) {
        middleNameLabel.sendKeys(Keys.CONTROL + "a");
        middleNameLabel.sendKeys(Keys.DELETE);
        middleNameLabel.sendKeys(middleName);
        return this;
    }

    public MyInfo typeLastNameLabel(String lastName) {
        lastNameLabel.sendKeys(Keys.CONTROL + "a");
        lastNameLabel.sendKeys(Keys.DELETE);
        lastNameLabel.sendKeys(lastName);
        return this;
    }


    public MyInfo typeEmployeeIdLabel(int employeeIdNumber) {
        employeeIdLabel.sendKeys(Keys.CONTROL + "a");
        employeeIdLabel.sendKeys(Keys.DELETE);
        employeeIdLabel.sendKeys(String.valueOf(employeeIdNumber));
        return this;
    }

    public MyInfo typeOtherIdLabel(int otherIdNumber) {
        otherIdLabel.sendKeys(Keys.CONTROL + "a");
        otherIdLabel.sendKeys(Keys.DELETE);
        otherIdLabel.sendKeys(String.valueOf(otherIdNumber));
        return this;
    }

    public MyInfo typeDriversLicenseNumberLabel(int driverLicenseNumber) {
        driversLicenseNumberLabel.sendKeys(Keys.CONTROL + "a");
        driversLicenseNumberLabel.sendKeys(Keys.DELETE);
        driversLicenseNumberLabel.sendKeys(String.valueOf(driverLicenseNumber));
        return this;
    }

    public MyInfo typeLicenseExpiryDateLabel(String licenseExpairyDate) {
        licenseExpiryDateLabel.click();
        licenseExpiryDateLabel.sendKeys(licenseExpairyDate);
        return this;
    }


    public MyInfo typeNationalityLabel() {
        nationalityDropDownList.click();
        nationalityLabel.click();
        return this;
    }

    public MyInfo typeMaritalStatusLabel() {
        maritalStatusDropDownListLabel.click();
        maritalStatusLabel.click();
        return this;
    }

    public MyInfo typeDateOfBirthLabel(String dateOfBirth) {
        dateOfBirthLabel.click();
        dateOfBirthLabel.sendKeys(Keys.CONTROL + "a");
        dateOfBirthLabel.sendKeys(Keys.DELETE);
        dateOfBirthLabel.sendKeys(dateOfBirth);
        return this;
    }

    public MyInfo typeGenderRadioButton() {
        genderRadioButton.click();
        return this;
    }

    public MyInfo setBloodTypeLabel() {
        bloodTypeDropDownListLabel.click();
        bloodTypeLabel.click();
        return this;
    }

    public MyInfo clickSaveButton() {
        saveButton.click();
        return this;
    }
}