package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static helpers.DriverSingleton.getDriver;

public class Qualifications {

    @FindBy(xpath = "//div[@class='orangehrm-edit-employee-navigation']/div[2]/div[9]/a")
    private WebElement qualificationsButton;

    @FindBy(xpath = "//div[@class='orangehrm-edit-employee']/div[2]/div[2]/div[1]/div[1]/button/i")
    private WebElement addButton;

    @FindBy(xpath = "//div[@class='orangehrm-edit-employee-content']/div[2]/div/form/div[1]/div[1]/div[1]/div[1]/div[2]/input")
    private WebElement companyLabel;

    @FindBy(xpath = "//div[@class='orangehrm-edit-employee-content']/div[2]/div[1]/form/div[1]/div[1]/div[2]/div[1]/div[2]/input")
    private WebElement jobTitleLabel;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
    private WebElement startDateLabel;

    @FindBy(xpath = "//div[@class='oxd-date-input-calendar']/div[1]/div[3]/div[1]/div[1]")
    private WebElement startDateOnCalendarLabel;

    @FindBy(xpath = "//div[@class='orangehrm-edit-employee-content']/div[2]/div[1]/form/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]")
    private WebElement finishDateLabel;

    @FindBy(xpath = "//div[@class='orangehrm-edit-employee-content']/div[2]/div[1]/form/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[31]/div[1]")
    private WebElement finishDateOnCalendarLabel;

    @FindBy(xpath = "//div[@class='orangehrm-edit-employee-content']/div[2]/div[1]/form/div[3]/div[1]/div[1]/div[1]/div[2]/textarea")
    private WebElement commentLabel;

    @FindBy(xpath = "//div[@class='orangehrm-edit-employee-content']/div[2]/div[1]/form/div[4]/button[2]")
    private WebElement saveButton;

    public Qualifications() {
        PageFactory.initElements(getDriver(), this);
    }

    public Qualifications clickQualificationsButton(){
        qualificationsButton.click();
        return this;
    }

    public Qualifications clickWorkExperienceAddButton(){
        addButton.click();
        return this;
    }

    public Qualifications typeCompanyNameLabel(String companyName){
        companyLabel.click();
        companyLabel.sendKeys(companyName);
        return this;
    }

    public Qualifications typeJobTitle(String jobTitle){
        jobTitleLabel.click();
        jobTitleLabel.sendKeys(jobTitle);
        return this;
    }

    public Qualifications selectStartDate(){
        startDateLabel.click();
        startDateOnCalendarLabel.click();
        return this;
    }

    public Qualifications selectFinishDate(){
        finishDateLabel.click();
        finishDateOnCalendarLabel.click();
        return this;
    }

    public Qualifications typeComment(String comment){
        commentLabel.click();
        commentLabel.sendKeys(comment);
        return this;
    }

    public Qualifications clickSaveButton(){
        saveButton.click();
        return this;
    }
}