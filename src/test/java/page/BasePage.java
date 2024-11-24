package page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static helpers.DriverSingleton.getDriver;

public class BasePage {

    @FindBy(xpath = "//button[@type='submit'] | //form[@class='oxd-form']/div[2]/button | //div[@class='orangehrm-edit-employee-content']/div[2]/div[1]/form/div[4]/button[2]")
    private WebElement saveButton;

    public BasePage() {
        PageFactory.initElements(getDriver(), this);
    }

    public static BasePage getInstance() {
        return new BasePage();
    }

    @Step("Click save button")
    public BasePage clickSaveButton() {
        saveButton.click();
        return this;
    }
}