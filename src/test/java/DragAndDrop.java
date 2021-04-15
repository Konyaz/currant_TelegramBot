import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class DragAndDrop {
    @Test
    void successfulFillTest() {
        step("Открываем главную страницу", (step) -> {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        });
        step("Drag and drop a to b", () -> {
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
        });
    }
}