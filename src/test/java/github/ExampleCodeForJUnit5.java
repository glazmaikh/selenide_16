package github;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class ExampleCodeForJUnit5 extends TestBase {

    @DisplayName("Search JUnit5 example code in 'Soft assertions' page")
    @Test
    void checkExampleCodeForJUnit5OnSoftAssertionPage() {
        step("Open page Selenide in GitHub", () -> {
            open("https://github.com/selenide/selenide");
        });
        step("Go to section 'Wiki'", () -> {
            $("#wiki-tab").click();
        });

        step("Search Soft Assertions page from list", () -> {
            $(".js-wiki-more-pages-link").click();
            $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        });

        step("Open Soft Assertions page", () -> {
            $("#wiki-pages-box").find(byText("SoftAssertions"))
                    .click();
        });
        step("Check example code for JUnit5 on page 'SoftAssertions'", () -> {
            $("div.markdown-body").$$("div.highlight")
                    .findBy(text("@ExtendWith({SoftAssertsExtension.class})"))
                    .shouldBe(visible);
        });

    }
}
