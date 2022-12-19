package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch extends TestBase {

    @Test
    void shouldFindSelenideRepositoryAtTheTop() {
        open("https://github.com/");
        $(".header-search-input").val("selenide").pressEnter();
        $$("ul.repo-list li").first().$("a").click();
        $("#repository-container-header").shouldHave(text("selenide / selenide"));
    }
}
