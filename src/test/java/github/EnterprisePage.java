package github;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class EnterprisePage extends TestBase {

    @DisplayName("EnterprisePage header text check")
    @Test
    void enterpriseHeaderTextTest() {
        step("Open GitHub main page", () -> {
            open("https://github.com");
        });

        step("Hover Solutions", () -> {
            $(".header-menu-wrapper").find(byText("Solutions"))
                    .hover();
        });
        step("Go to Enterprise", () -> {
            $$(".HeaderMenu-dropdown-link").findBy(text("Enterprise")).click();
        });
        step("Check Enterprise header text", () -> {
            $(".col-9-max h1").shouldHave(text("Build like the best"));
        });
    }
}

