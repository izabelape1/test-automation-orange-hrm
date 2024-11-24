package tests;

import page.Menu;
import page.Qualifications;
import org.testng.annotations.Test;
import io.qameta.allure.Severity;
import io.qameta.allure.Description;
import io.qameta.allure.SeverityLevel;

import static helpers.Constants.JOB_TITLE;
import static helpers.Constants.COMPANY_NAME;

public class QualificationTests extends TestSetup {

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Adding qualifications details")
    public void givenWorkExperienceDetailsWhenClickOnSaveThenWorkExperienceIsAdded() {
        Menu menu = new Menu();
        menu
                .clickMyInfoButton();

        Qualifications qualifications = new Qualifications();
        qualifications
                .clickQualificationsButton()
                .clickWorkExperienceAddButton()
                .typeCompanyNameLabel(COMPANY_NAME)
                .typeJobTitle(JOB_TITLE)
                .selectStartDate()
                .selectFinishDate()
                .typeComment("Hello World")
                .clickSaveButton();
    }
}