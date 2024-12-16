package page;

import java.util.List;

import io.qameta.allure.Step;
import enums.TypeOfMembership;
import enums.SubscriptionPayer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static helpers.DriverSingleton.getDriver;

public class Membership extends BasePage {

    @FindBy(xpath = "//div[@class='orangehrm-edit-employee-navigation']//div[2]//div[10]")
    private WebElement membershipButton;

    @FindBy(xpath = "//div[@class='orangehrm-edit-employee']/div[2]/div[1]/div[1]/button")
    private WebElement addAssignedMembershipsButton;

    @FindBy(xpath = "//div[@class='oxd-form-row']//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//div[2]")
    private WebElement membershipDropDownList;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/span")
    private WebElement OneTwoThreeLabel;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/span")
    private WebElement ACCLabel;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/span")
    private WebElement britishComputerSocietyLabel;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/span")
    private WebElement charteredInstituteOfMarketingLabel;

    @FindBy (xpath = "//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/span")
    private WebElement CIMALabel;

    @FindBy(xpath = "//div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[2]/div[1]/div[2]/div[1]")
    private WebElement subscriptionPayerDropDownList;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/span")
    private WebElement companyLabel;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[3]/span")
    private WebElement individualLabel;

    @FindBy(xpath = "//div[@class='oxd-grid-3 orangehrm-full-width-grid']//div[3]//div[1]//div[2]//input")
    private WebElement subscriptionAmountLabel;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]")
    private WebElement currencyDropDownList;

    @FindBy(xpath = "//div[@class='oxd-select-dropdown --positon-bottom']//div[5]")
    private WebElement currencyOptionLabel;

    @FindBy(xpath = "//div[@class='oxd-grid-3 orangehrm-full-width-grid']//div[5]//div[1]//div[2]")
    private WebElement startDateLabel;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[5]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]")
    private WebElement calendarStartDateLabel;

    @FindBy(xpath = "//div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[6]/div[1]/div[2]/div[1]/div[1]")
    private WebElement renewalDateLabel;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[6]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[30]")
    private WebElement calendarRenewalDateLabel;

    @FindBy(xpath = "//div[@class='oxd-table']/div[2]/div[1]/div[1]/div")
    private List<WebElement> membershipEntries;

    public Membership() {
        PageFactory.initElements(getDriver(), this);
    }

    @Step("Click membership button")
    public Membership clickMembershipButton() {
        membershipButton.click();
        return this;
    }

    @Step("Click add assigned membership button")
    public Membership clickAddAssignedMembershipsButton() {
        addAssignedMembershipsButton.click();
        return this;
    }

    @Step("Choosing membership Label : {typeOfMembership}")
    public Membership chooseMembershipLabel(TypeOfMembership typeOfMembership) {
        membershipDropDownList.click();
        switch (typeOfMembership){
            case ACCA:
                ACCLabel.click();
                break;
            case BRITISH_COMPUTER_SOCIETY:
                britishComputerSocietyLabel.click();
                break;
            case CHARTERED_INSTITUTE_OF_MARKETING:
                charteredInstituteOfMarketingLabel.click();
                break;
            case CIMA:
                CIMALabel.click();
                break;
        }
        return this;
    }

    @Step("Choosing subscription payer label: {subscriptionPayer}")
    public Membership chooseSubscriptionPayerLabel(SubscriptionPayer subscriptionPayer) {
        subscriptionPayerDropDownList.click();
        switch (subscriptionPayer){
            case INDIVIDUAL:
                individualLabel.click();
                break;
            case COMPANY:
                companyLabel.click();
                break;
        }
        return this;
    }

    @Step("Type subscription amount label")
    public Membership typeSubscriptionAmountLabel(String subscriptionAmount) {
        subscriptionAmountLabel.click();
        subscriptionAmountLabel.sendKeys(subscriptionAmount);
        return this;
    }

    @Step("Choosing currency")
    public Membership selectCurrencyLabel() {
        currencyDropDownList.click();
        currencyOptionLabel.click();
        return this;
    }

    @Step("Selecting start date")
    public Membership selectStartDateLabel() {
        startDateLabel.click();
        calendarStartDateLabel.click();
        return this;
    }

    @Step("Selecting renewal date")
    public Membership selectRenewalDateLabel() {
        renewalDateLabel.click();
        calendarRenewalDateLabel.click();
        return this;
    }

    @Step("Verification is membership present")
    public boolean isMembershipPresent(String membershipType) {
        for (WebElement entry : membershipEntries) {
            String entryText = entry.getText();
            if (entryText.contains(membershipType)) {
                return true;
            }
        }
        return false;
    }
}