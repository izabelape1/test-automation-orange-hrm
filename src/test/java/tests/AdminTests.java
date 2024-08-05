package tests;

import enums.UserRole;
import enums.UserStatus;
import page.Menu;
import page.Admin;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminTests extends TestSetup {

    @Test
    public void addingNewAdminTest() {

        Menu menu = new Menu();
        menu
                .clickAdminButton();

        Admin admin = new Admin();
        admin
                .clickAddButton()
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