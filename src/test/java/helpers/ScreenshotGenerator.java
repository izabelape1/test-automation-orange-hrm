package helpers;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;

import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;

import static helpers.DriverSingleton.getDriver;

public class ScreenshotGenerator {
    public static void takeScreenshot() {
        String timestamp = DateTimeGenerator.getCurrentDateTime();

        String filePath = "screenshot/screenshot_" + timestamp + ".png";

        File file = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File(filePath));
            System.out.println("Screenshot saved at: " + filePath);
            FileInputStream screenshotStream = new FileInputStream(filePath);
            Allure.addAttachment("Screenshot", screenshotStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}