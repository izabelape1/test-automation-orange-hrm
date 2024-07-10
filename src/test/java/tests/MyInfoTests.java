package tests;

import page.MyInfo;
import org.testng.annotations.Test;

public class MyInfoTests extends TestSetup {

    @Test
    public void modifyDataOfLoggedUserTest() {
        MyInfo myInfo = new MyInfo();
        myInfo
                .clickMyInfoButton()
                .setFirstNameLabel("Anna")
                .setMiddleNameLabel("Pola")
                .setLastNameLabel("Kowalska")
                .setEmployeeIdLabel(123)
                .setOtherIdLabel(123)
                .setDriversLicenseNumberLabel(123)
                .setLicenseExpiryDateLabel("2025-01-01")
                .setNationalityLabel()
                .setMaritalStatusLabel()
                .setDateOfBirthLabel("2000-01-01")
                .setGenderRadioButton()
                .clickSaveButton()
                .setBloodTypeLabel();
    }
}