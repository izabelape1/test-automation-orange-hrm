package tests;

import page.Menu;
import page.Membership;
import helpers.Constants;
import org.testng.Assert;
import enums.TypeOfMembership;
import enums.SubscriptionPayer;
import org.testng.annotations.Test;


public class MembershipTests extends TestSetup {

    @Test
    public void givenMembershipDetailsWhenClickOnSaveButtonThenMembershipIsAddedTest() {

        Menu menu = new Menu();
        menu
                .clickMyInfoButton();

        Membership membership = new Membership();
        membership
                .clickMembershipButton()
                .clickAddAssignedMembershipsButton()
                .chooseMembershipLabel(TypeOfMembership.ACCA)
                .chooseSubscriptionPayerLabel(SubscriptionPayer.INDIVIDUAL)
                .typeSubscriptionAmountLabel(Constants.MEMBERSHIP_AMOUNT)
                .selectCurrencyLabel()
                .selectStartDateLabel()
                .selectRenewalDateLabel()
                .clickSaveButton();

        boolean isMemberAdded = membership.isMembershipPresent(Constants.MEMBERSHIP_AMOUNT);
        Assert.assertTrue(isMemberAdded, "Membership was not added to the list");
    }
}