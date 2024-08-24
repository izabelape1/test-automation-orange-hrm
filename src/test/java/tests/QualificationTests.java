package tests;

import helpers.Constants;
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
                .clickWorkExperienceAddButton()
                .typeCompanyNameLabel(Constants.COMPANY_NAME)
                .typeJobTitle(Constants.JOB_TITLE)
                .selectStartDate()
                .selectFinishDate()
                .typeComment("Hello World")
                .clickSaveButton();
    }
}