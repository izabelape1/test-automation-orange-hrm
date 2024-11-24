package tests;

import page.Menu;
import page.MyInfo;
import page.BasePage;
import io.qameta.allure.Severity;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.SeverityLevel;

import static helpers.Constants.*;
import static enums.BloodType.A_NEGATIVE;
import static enums.MaritalStatus.MARRIED;

public class MyInfoTests extends TestSetup {


        @Test
        @Severity(SeverityLevel.NORMAL)
        @Description("Modifying data of logged user")
        public void modifyDataOfLoggedUserTest () {

            Menu menu = new Menu();
            menu
                    .clickMyInfoButton();

            MyInfo.getInstance()
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
                    .chooseBloodTypeLabel(A_NEGATIVE);

            BasePage.getInstance()
                    .clickSaveButton();
        }
    }
////todo zrobić pull request i dodać Kubę jako reviever