package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideContributors extends TestBase {

    @Test
    void solntsevShouldBeTheTopContributor() {
        open("https://github.com/selenide/selenide");
        $("div.Layout-sidebar").find(byText("Contributors"))
                .ancestor("div").$$("ul li").first().hover();
        $(".Popover-message").shouldHave(text(("Andrei Solntsev")));
    }
}
