package tests;

import page.Menu;
import page.Membership;
import helpers.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MembershipTests extends TestSetup {

    @Test
    public void addingNewMembershipTests() {

        Menu menu = new Menu();
        menu
                .clickMyInfoButton();

        Membership membership = new Membership();
        membership
                .clickMembershipButton()
                .clickAddAssignedMembershipsButton()
                .clickMembershipList()
                .selectMembershipLabel()
                .clickSubscriptionPayerList()
                .selectSubscriptionPayerLabel()
                .setSubscriptionAmountLabel(Constants.MEMBERSHIP_AMOUNT)
                .clickCurrencyList()
                .selectCurrencyOption()
                .setStartDateLabel()
                .setRenewalDateLabel()
                .clickSaveButton();

        boolean isMemberAdded = membership.isMembershipPresent(Constants.MEMBERSHIP_AMOUNT);
        Assert.assertTrue(isMemberAdded, "Membership was not added to the list");
    }
}