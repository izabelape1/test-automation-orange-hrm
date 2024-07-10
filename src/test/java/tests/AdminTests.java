package tests;

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
                .clickUserRoleList()
                .selectUserRoleLabel()
                .clickStatusList()
                .selectStatusLabel()
                .setEmployeeNameLabel()
                .setUserNameLabel()
                .setPasswordLabel()
                .setConfirmPasswordLabel()
                .clickSaveButton();
        Assert.assertTrue(admin.isSuccessButtonIsDisplayed());
    }
}