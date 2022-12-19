package internet;

import github.TestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class DragAndDropTests extends TestBase {

    @DisplayName("Switch rectangles to A from B")
    @Test
    void dragAndDropTest() {
        step("Open drag and drop page", () -> {
            open("https://the-internet.herokuapp.com/drag_and_drop");
        });
        step("Switch rectangles to A from B", () -> {
            $("#column-a").dragAndDropTo("#column-b");
        });
        step("Column A contains text from rectangle B", () -> {
            $("#column-a").shouldHave(text("B"));
        });
    }
}
