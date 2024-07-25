package page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static helpers.DriverSingleton.getDriver;

public class Membership {

    @FindBy(xpath = "//div[@class='orangehrm-edit-employee-navigation']//div[2]//div[10]")
    private WebElement membershipButton;

    @FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/div[@class='orangehrm-action-header']/button[1]")
    private WebElement addAssignedMembershipsButton;

    @FindBy(xpath = "//div[@class='oxd-form-row']//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//div[2]")
    private WebElement membershipList;

    @FindBy(xpath = "//div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]")
    private WebElement membershipOption;

    @FindBy(xpath = "//div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[2]/div[1]/div[2]/div[1]")
    private WebElement subscriptionPayerList;

    @FindBy(xpath = "//div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[2]/div[1]/div[2]/div[1]/div[2]/div[3]/span")
    private WebElement subscriptionPayerOption;

    @FindBy(xpath = "//div[@class='oxd-grid-3 orangehrm-full-width-grid']//div[3]//div[1]//div[2]//input")
    private WebElement subscriptionAmountLabel;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]")
    private WebElement currencyList;

    @FindBy(xpath = "//div[@class='oxd-select-dropdown --positon-bottom']//div[5]")
    private WebElement currencyOption;

    @FindBy(xpath = "//div[@class='oxd-grid-3 orangehrm-full-width-grid']//div[5]//div[1]//div[2]")
    private WebElement startDateLabel;

    @FindBy(xpath = "//div[@class='oxd-date-input-calendar']/div[1]/div[3]/div[1]")
    private WebElement calendarStartDateLabel;

    @FindBy(xpath = "//div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[6]/div[1]/div[2]/div[1]/div[1]")
    private WebElement renewalDateLabel;

    @FindBy(xpath = "//div[@class='oxd-date-input-calendar']/div[1]/div[3]/div[31]/div[1]")
    private WebElement calendarRenewalDateLabel;

    @FindBy(css = "button[type='submit']")
    private WebElement saveButton;

    @FindBy(xpath = "//div[@class='oxd-table']/div[2]/div[1]/div[1]/div")
    private List<WebElement> membershipEntries;

    public Membership() {
        PageFactory.initElements(getDriver(), this);
    }

    public Membership clickMembershipButton() {
        membershipButton.click();
        return this;
    }

    public Membership clickAddAssignedMembershipsButton() {
        addAssignedMembershipsButton.click();
        return this;
    }

    public Membership clickMembershipList() {
        membershipList.click();
        return this;
    }

    public Membership selectMembershipLabel() {
        membershipOption.click();
        return this;
    }

    public Membership clickSubscriptionPayerList() {
        subscriptionPayerList.click();
        return this;
    }

    public Membership selectSubscriptionPayerLabel() {
        subscriptionPayerOption.click();
        return this;
    }

    public Membership typeSubscriptionAmountLabel(String subscriptionAmount) {
        subscriptionAmountLabel.click();
        subscriptionAmountLabel.sendKeys(subscriptionAmount);
        return this;
    }

    public Membership clickCurrencyList() {
        currencyList.click();
        return this;
    }

    public Membership selectCurrencyOption() {
        currencyOption.click();
        return this;
    }

    public Membership typeStartDateLabel() {
        startDateLabel.click();
        calendarStartDateLabel.click();
        return this;
    }

    public Membership typeRenewalDateLabel() {
        renewalDateLabel.click();
        calendarRenewalDateLabel.click();
        return this;
    }

    public Membership clickSaveButton() {
        saveButton.click();
        return this;
    }

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