package page;

import enums.BloodType;
import enums.MaritalStatus;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static helpers.DriverSingleton.getDriver;

public class MyInfo extends BasePage {

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input")
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

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[2]/div[1]/div[1]/div[2]/input")
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

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i")
    private WebElement maritalStatusDropDownListLabel;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/span")
    private WebElement singleLabel;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[3]/span")
    private WebElement marriedLabel;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[4]/span")
    private WebElement otherLabel;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input")
    private WebElement dateOfBirthLabel;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/label[1]/span")
    private WebElement femaleRadioButton;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/label/input")
    private WebElement maleRadioButton;

    @FindBy(xpath = "//form[@class='oxd-form']/div[4]/div[1]/div[1]/div[1]/div[2]/input")
    private WebElement militaryServiceLabel;

    @FindBy(xpath = "//form[@class='oxd-form']/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/label/span")
    private WebElement smokerCheckbox;

    @FindBy(xpath = "//html/body/div/div/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
    private WebElement bloodTypeDropDownListLabel;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]")
    private WebElement APositiveLabel;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]")
    private WebElement ANegativeLabel;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]")
    private WebElement BPositiveLabel;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]")
    private WebElement BNegativeLabel;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]")
    private WebElement zeroPositiveLabel;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[7]")
    private WebElement zeroNegativeLabel;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[8]")
    private WebElement ABPositiveLabel;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[9]")
    private WebElement ABNegativeLabel;

    public MyInfo() {
        PageFactory.initElements(getDriver(), this);
    }

    public static MyInfo getInstance() {
        return new MyInfo();
    }

    @Step("Type first name")
    public MyInfo typeFirstNameLabel(String firstName) {
        firstNameLabel.sendKeys(Keys.CONTROL + "a");
        firstNameLabel.sendKeys(Keys.DELETE);
        firstNameLabel.sendKeys(firstName);
        return this;
    }

    @Step("Type middle name")
    public MyInfo typeMiddleNameLabel(String middleName) {
        middleNameLabel.sendKeys(Keys.CONTROL + "a");
        middleNameLabel.sendKeys(Keys.DELETE);
        middleNameLabel.sendKeys(middleName);
        return this;
    }

    @Step("Type last name")
    public MyInfo typeLastNameLabel(String lastName) {
        lastNameLabel.sendKeys(Keys.CONTROL + "a");
        lastNameLabel.sendKeys(Keys.DELETE);
        lastNameLabel.sendKeys(lastName);
        return this;
    }

    @Step("Type employee ID")
    public MyInfo typeEmployeeIdLabel(int employeeIdNumber) {
        employeeIdLabel.sendKeys(Keys.CONTROL + "a");
        employeeIdLabel.sendKeys(Keys.DELETE);
        employeeIdLabel.sendKeys(String.valueOf(employeeIdNumber));
        return this;
    }

    @Step("Type other ID")
    public MyInfo typeOtherIdLabel(int otherIdNumber) {
        otherIdLabel.sendKeys(Keys.CONTROL + "a");
        otherIdLabel.sendKeys(Keys.DELETE);
        otherIdLabel.sendKeys(String.valueOf(otherIdNumber));
        return this;
    }

    @Step("Type driver license number")
    public MyInfo typeDriversLicenseNumberLabel(int driverLicenseNumber) {
        driversLicenseNumberLabel.sendKeys(Keys.CONTROL + "a");
        driversLicenseNumberLabel.sendKeys(Keys.DELETE);
        driversLicenseNumberLabel.sendKeys(String.valueOf(driverLicenseNumber));
        return this;
    }

    @Step("Type license expiry date")
    public MyInfo typeLicenseExpiryDateLabel(String licenseExpiryDate) {
        licenseExpiryDateLabel.sendKeys(Keys.CONTROL + "a");
        licenseExpiryDateLabel.sendKeys(Keys.DELETE);
        licenseExpiryDateLabel.sendKeys(licenseExpiryDate);
        return this;
    }

    @Step("Select nationality")
    public MyInfo selectNationalityLabel() {
        nationalityDropDownList.click();
        nationalityLabel.click();
        return this;
    }

    @Step("Choosing marital status: {maritalStatus}")
    public MyInfo chooseMaritalStatusLabel(MaritalStatus maritalStatus) {
        maritalStatusDropDownListLabel.click();
        switch(maritalStatus){
            case SINGLE:
                singleLabel.click();
                break;
            case MARRIED:
                marriedLabel.click();
                break;
            case OTHER:
                otherLabel.click();
                break;
        }
        return this;
    }

    @Step("Type date of birth")
    public MyInfo typeDateOfBirthLabel(String dateOfBirth) {
        dateOfBirthLabel.click();
        dateOfBirthLabel.sendKeys(Keys.CONTROL + "a");
        dateOfBirthLabel.sendKeys(Keys.DELETE);
        dateOfBirthLabel.sendKeys(dateOfBirth);
        return this;
    }

    @Step("Click on gender")
    public MyInfo clickGenderRadioButton(){
       femaleRadioButton.click();
        return this;
    }

    @Step("Choosing blood type: {bloodType}")
    public MyInfo chooseBloodTypeLabel(BloodType bloodType) {
        bloodTypeDropDownListLabel.click();
        switch(bloodType){
            case A_POSITIVE:
                APositiveLabel.click();
                break;
            case A_NEGATIVE:
                ANegativeLabel.click();
                break;
            case B_POSITIVE:
                BPositiveLabel.click();
                break;
            case B_NEGATIVE:
                BNegativeLabel.click();
                break;
            case O_POSITIVE:
                zeroPositiveLabel.click();
                break;
            case O_NEGATIVE:
                zeroNegativeLabel.click();
                break;
            case AB_POSITIVE:
                ABPositiveLabel.click();
                break;
            case AB_NEGATIVE:
                ABNegativeLabel.click();
                break;
        }
        return this;
    }
}