package tests;

import page.Menu;
import page.Membership;
import org.testng.Assert;
import io.qameta.allure.Severity;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.SeverityLevel;

import static enums.TypeOfMembership.ACCA;
import static enums.SubscriptionPayer.INDIVIDUAL;
import static helpers.Constants.MEMBERSHIP_AMOUNT;


public class MembershipTests extends TestSetup {

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Adding new membership with details")
    public void givenMembershipDetailsWhenClickOnSaveButtonThenMembershipIsAddedTest() {

        Menu menu = new Menu();
        menu
                .clickMyInfoButton();

        Membership membership = new Membership();
        membership
                .clickMembershipButton()
                .clickAddAssignedMembershipsButton()
                .chooseMembershipLabel(ACCA)
                .chooseSubscriptionPayerLabel(INDIVIDUAL)
                .typeSubscriptionAmountLabel(MEMBERSHIP_AMOUNT)
                .selectCurrencyLabel()
                .selectStartDateLabel()
                .selectRenewalDateLabel()
                .clickSaveButton();

        boolean isMemberAdded = membership.isMembershipPresent(MEMBERSHIP_AMOUNT);
        Assert.assertFalse(isMemberAdded, "Membership was added to the list");
    }
}