package tests;

import page.Menu;
import page.Qualifications;
import org.testng.annotations.Test;

public class QualificationTests extends TestSetup {

    @Test
    public void givenWorkExperienceDetailsWhenClickOnSaveThenWorkExperienceIsAdded() {
        Menu menu = new Menu();
        menu.clickMyInfoButton();

        Qualifications qualifications = new Qualifications();
        qualifications
                .clickQualificationsButton()
                .clickAddButton()
                .typeCompanyNameLabel("DPS")
                .typeJobTitle("Manual Tester")
                .selectStartDate()
                .selectFinishDate()
                .typeComment("Hello World")
                .clickSaveButton();
    }
}