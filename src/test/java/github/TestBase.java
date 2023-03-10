package github;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {

//    @BeforeAll
//    static void setUp() {
//        System.setProperty("webdriver.chrome.driver", "C://webdrivers/chromedriver.exe");
//        Configuration.holdBrowserOpen = true;
//        Configuration.browserSize = "1932x1160";
//        //Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
//    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }
}
