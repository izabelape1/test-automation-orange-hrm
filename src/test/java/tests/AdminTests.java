package tests;

import page.Menu;
import page.Admin;
import enums.UserRole;
import enums.UserStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminTests extends TestSetup {

    @Test
    public void givenAdminDetailsWhenClickOnSaveButtonThenNewAdminIsRegisterTest(){

        Menu menu = new Menu();
        menu
                .clickAdminButton();

        Admin admin = new Admin();
        admin
                .clickAddButton()
                .clickUserRoleList()
                .selectUserRoleLabel()
                .clickStatusList()
                .selectStatusLabel()
                .typeEmployeeNameLabel()
                .typeUserNameLabel()
                .typePasswordLabel()
                .setConfirmPasswordLabel()
                .chooseUserRoleLabel(UserRole.ADMIN)
                .chooseStatusLabel(UserStatus.ENABLED)
                .setEmployeeNameLabel()
                .setUserNameLabel()
                .setPasswordLabel()
                .typeConfirmPasswordLabel()
                .clickSaveButton();
        Assert.assertTrue(admin.isSuccessButtonIsDisplayed());
    }
}