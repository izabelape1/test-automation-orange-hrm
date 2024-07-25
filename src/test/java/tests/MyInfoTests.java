package tests;

import page.MyInfo;
import org.testng.annotations.Test;

public class MyInfoTests extends TestSetup {

    @Test
    public void modifyDataOfLoggedUserTest() {
        MyInfo myInfo = new MyInfo();
        myInfo
                .clickMyInfoButton()
                .typeFirstNameLabel("Anna")
                .typeMiddleNameLabel("Pola")
                .typeLastNameLabel("Kowalska")
                .typeEmployeeIdLabel(123)
                .typeOtherIdLabel(123)
                .typeDriversLicenseNumberLabel(123)
                .typeLicenseExpiryDateLabel("2025-01-01")
                .typeNationalityLabel()
                .typeMaritalStatusLabel()
                .typeDateOfBirthLabel("2000-01-01")
                .typeGenderRadioButton()
                .clickSaveButton()
                .setBloodTypeLabel();
    }
}