package page;

import enums.Vacancy;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static helpers.DriverSingleton.getDriver;

public class Recruitment extends BasePage{

    @FindBy(xpath = "//div[@class='oxd-layout-container']/div/div/div[2]/div/button/i")
    private WebElement addButton;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement candidateFirstNameLabel;

    @FindBy(xpath = "//input[@placeholder='Middle Name']")
    private WebElement candidateMiddleNameLabel;

    @FindBy(xpath =  "//input[@placeholder='Last Name']")
    private WebElement candidateLastNameLabel;

    @FindBy(xpath = "//form[@class='oxd-form']/div[2]/div/div/div/div[2]/div/div/div/i")
    private WebElement vacancyDropDownList;

    @FindBy(xpath = "//span[normalize-space()='Junior Account Assistant']")
    private WebElement juniorAccountAssistantLabel;

    @FindBy(xpath = "//span[normalize-space()='Payroll Administrator']")
    private WebElement payrollAdministratorLabel;

    @FindBy(xpath = "//span[normalize-space()='Sales Representative']")
    private WebElement salesRepresentativeLabel;

    @FindBy(xpath = "//span[normalize-space()='Senior QA Lead']")
    private WebElement seniorQaLeadLabel;

    @FindBy(xpath = "//span[normalize-space()='Senior Support Specialist']")
    private WebElement seniorSupportSpecialistLabel;

    @FindBy(xpath = "//span[normalize-space()='Software Engineer']")
    private WebElement softwareEngineerLabel;

    @FindBy(xpath = "//div[@role='listbox']//div[2]")
    private WebElement testLabel;

    @FindBy(xpath = "//form[@class='oxd-form']/div[3]/div/div/div/div[2]/input")
    private WebElement emailLabel;

    @FindBy(xpath = "//form[@class='oxd-form']/div[3]/div/div[2]/div/div[2]/input")
    private WebElement phoneNumberLabel;

    @FindBy(xpath = "//form[@class='oxd-form']/div[5]/div/div/div/div[2]/input")
    private WebElement keywordsLabel;

    @FindBy(xpath = "//form[@class='oxd-form']/div[5]/div/div[2]/div/div[2]/div/div/input")
    private WebElement dateOfApplicationLabel;

    @FindBy(xpath = "//form[@class='oxd-form']/div[5]/div/div[2]/div/div[2]/div/div[2]/div/div[3]/div[3]")
    private WebElement calendarApplicationStartLabel;

    @FindBy(xpath = "//form[@class='oxd-form']/div[6]/div/div/div/div[2]/textarea")
    private WebElement notesLabel;

    @FindBy(xpath = "//form[@class='oxd-form']/div[7]/div/div/div/div[2]/div/label/span")
    private WebElement consentToKeepDataCheckbox;

    @FindBy(css = "div[class='oxd-toast-icon-container']")
    private WebElement successWindow;

    public Recruitment() {
        PageFactory.initElements(getDriver(), this);
    }

    @Step("Click add button")
    public Recruitment clickAddButton(){
        addButton.click();
        return this;
    }
    @Step("Type first name")
    public Recruitment typeFirstNameLabel(String firstName){
        candidateFirstNameLabel.sendKeys(Keys.CONTROL + "a");
        candidateFirstNameLabel.sendKeys(Keys.DELETE);
        candidateFirstNameLabel.sendKeys(firstName);
        return this;
    }
    @Step("Type middle name")
    public Recruitment typeMiddleNameLabel(String middleName){
        candidateMiddleNameLabel.sendKeys(Keys.CONTROL + "a");
        candidateMiddleNameLabel.sendKeys(Keys.DELETE);
        candidateMiddleNameLabel.sendKeys(middleName);
        return this;
    }
    @Step("Type last name")
    public Recruitment typeLastNameLabel(String lastName){
        candidateLastNameLabel.sendKeys(Keys.CONTROL + "a");
        candidateLastNameLabel.sendKeys(Keys.DELETE);
        candidateLastNameLabel.sendKeys(lastName);
        return this;
    }
    @Step("Choose vacancy label")
    public Recruitment chooseVacancyLabel(Vacancy vacancy){
        vacancyDropDownList.click();
        switch(vacancy){
            case JUNIOR_ACCOUNT_ASSISTANT:
                juniorAccountAssistantLabel.click();
            case SENIOR_SUPPORT_SPECIALIST:
                seniorSupportSpecialistLabel.click();
            case SENIOR_QE_LEAD:
                seniorQaLeadLabel.click();
            case PAYROLL_ADMINISTRATOR:
                payrollAdministratorLabel.click();
            case SALES_REPRESENTATIVE:
                salesRepresentativeLabel.click();
            case SOFTWARE_ENGINEER:
                softwareEngineerLabel.click();
            case TEST:
                testLabel.click();
                break;
        }
        return this;
    }
    @Step("Type e-mail")
    public Recruitment typeEmailLabel(String email){
        emailLabel.click();
        emailLabel.sendKeys(email);
        return this;
    }
    @Step("Type contact number")
    public Recruitment typeContactNumberLabel(int phoneNumber){
        phoneNumberLabel.sendKeys(Keys.CONTROL + "a");
        phoneNumberLabel.sendKeys(Keys.DELETE);
        phoneNumberLabel.sendKeys(String.valueOf(phoneNumber));
        return this;
    }
    @Step("Type keywords")
    public Recruitment typeKeywordsLabel(String keywords){
        keywordsLabel.click();
        keywordsLabel.sendKeys(keywords);
        return this;
    }
    @Step("Select date of application")
    public Recruitment selectDateOfApplication(){
        dateOfApplicationLabel.click();
        calendarApplicationStartLabel.click();
        return this;
    }
    @Step("Type notes")
    public Recruitment typeNotesLabel(String notes){
        notesLabel.click();
        notesLabel.sendKeys(notes);
        return this;
    }
    @Step("Click consent to keep data checkbox")
    public Recruitment clickConsentToKeepDataCheckbox(){
        consentToKeepDataCheckbox.click();
        return this;
    }

    @Step("Verification is success button is displayed")
    public boolean isSuccessButtonIsDisplayed() {
        return successWindow.isDisplayed();
    }
}