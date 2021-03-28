package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static config.ConfigHelper.isVideoOn;
import static helpers.AttachmentsHelper.*;
import static helpers.AttachmentsHelper.attachVideo;
import static helpers.DriverHelper.configureDriver;
import static helpers.DriverHelper.getConsoleLogs;
import static org.openqa.selenium.remote.HttpSessionId.getSessionId;

public class TestBase {

    @BeforeAll
    public static void beforeAll() {
        configureDriver();

        Configuration.baseUrl = "https://expload.com";
    }

    @AfterEach
    public void addAttachments() {
        String sessionId = getSessionId();

        attachScreenshot("Last screenshot");
        attachPageSource();
//        attachNetwork(); // todo
        attachAsText("Browser console logs", getConsoleLogs());
        if (isVideoOn()) attachVideo(sessionId);

        closeWebDriver();
    }
}
