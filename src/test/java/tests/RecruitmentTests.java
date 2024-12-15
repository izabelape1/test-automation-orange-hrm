package tests;

import org.testng.Assert;
import page.Menu;
import page.BasePage;
import page.Recruitment;

import io.qameta.allure.Severity;

import static enums.Vacancy.TEST;
import static helpers.Constants.*;

import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.SeverityLevel;


public class RecruitmentTests extends TestSetup {

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Adding candidate details")
    public void givenCandidateDetailsWhenClickOnSaveThenCandidateIsAdded() {

        Menu menu = new Menu();
        menu
                .clickRecruitmentButton();

        Recruitment recruitment = new Recruitment();
        recruitment
                .clickAddButton()
                .typeFirstNameLabel(FIRST_NAME)
                .typeMiddleNameLabel(MIDDLE_NAME)
                .typeLastNameLabel(LAST_NAME)
                .chooseVacancyLabel(TEST)
                .typeEmailLabel("nowak@nowak.com")
                .typeContactNumberLabel(PHONE_NUMBER)
                .typeKeywordsLabel("xxx")
                .selectDateOfApplication()
                .typeNotesLabel("xxx")
                .clickConsentToKeepDataCheckbox();

        BasePage basePage = new BasePage();
        basePage
                .clickSaveButton();
        Assert.assertTrue(recruitment.isSuccessButtonIsDisplayed());
    }
}