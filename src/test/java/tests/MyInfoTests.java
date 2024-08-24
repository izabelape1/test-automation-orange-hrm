package tests;

import enums.BloodType;
import enums.Gender;
import page.MyInfo;
import helpers.Constants;
import enums.MaritalStatus;
import org.testng.annotations.Test;

public class MyInfoTests extends TestSetup {

    @Test
    public void modifyDataOfLoggedUserTest() {
        MyInfo myInfo = new MyInfo();
        myInfo
                .clickMyInfoButton()
                .typeFirstNameLabel(Constants.FIRST_NAME)
                .typeMiddleNameLabel(Constants.MIDDLE_NAME)
                .typeLastNameLabel(Constants.LAST_NAME)
                .typeEmployeeIdLabel(Constants.EMPLOYEE_ID_NUMBER)
                .typeOtherIdLabel(Constants.OTHER_ID_NUMBER)
                .typeDriversLicenseNumberLabel(Constants.DRIVERS_LICENSE_NUMBER)
                .typeLicenseExpiryDateLabel(Constants.LICENSE_EXPIRY_DATE)
                .selectNationalityLabel()
                .chooseMaritalStatusLabel(MaritalStatus.MARRIED)
                .typeDateOfBirthLabel(Constants.DATE_OF_BIRTH)
                .clickGenderRadioButton()
                .clickSaveButton()
                .setBloodTypeLabel(BloodType.A_NEGATIVE);
    }
}