package tests;

import page.Menu;
import page.Admin;
import org.testng.Assert;
import io.qameta.allure.Severity;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.SeverityLevel;

import static enums.UserRole.ADMIN;
import static enums.UserStatus.ENABLED;

public class AdminTests extends TestSetup {

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Adding new admin with status enabled")
    public void givenAdminDetailsWhenClickOnSaveButtonThenNewAdminIsRegisterTest(){

        Menu menu = new Menu();
        menu
                .clickAdminButton();

        Admin admin = new Admin();
        admin
                .clickAddButton()
                .typeEmployeeNameLabel()
                .typeUserNameLabel()
                .typePasswordLabel()
                .chooseUserRoleLabel(ADMIN)
                .chooseStatusLabel(ENABLED)
                .typeConfirmPasswordLabel()
                .clickSaveButton();
        Assert.assertTrue(admin.isSuccessButtonIsDisplayed());
    }
}