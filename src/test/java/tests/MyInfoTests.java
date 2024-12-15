package tests;

import page.Menu;
import static helpers.Constants.*;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.SeverityLevel;

import static enums.BloodType.A_NEGATIVE;
import static enums.MaritalStatus.MARRIED;
import page.MyInfo;import io.qameta.allure.Severity;


public class MyInfoTests extends TestSetup {

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Modifying data of logged user")
    public void modifyDataOfLoggedUserTest() {

        Menu menu = new Menu();
        menu
                .clickMyInfoButton();

        MyInfo myInfo = new MyInfo();
        myInfo
                .typeFirstNameLabel(FIRST_NAME)
                .typeMiddleNameLabel(MIDDLE_NAME)
                .typeLastNameLabel(LAST_NAME)
                .typeEmployeeIdLabel(EMPLOYEE_ID_NUMBER)
                .typeOtherIdLabel(OTHER_ID_NUMBER)
                .typeDriversLicenseNumberLabel(DRIVERS_LICENSE_NUMBER)
                .typeLicenseExpiryDateLabel(LICENSE_EXPIRY_DATE)
                .selectNationalityLabel()
                .chooseMaritalStatusLabel(MARRIED)
                .typeDateOfBirthLabel(DATE_OF_BIRTH)
                .clickGenderRadioButton()
                .chooseBloodTypeLabel(A_NEGATIVE)
                .clickSaveButton();
    }
}