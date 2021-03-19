package tests;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Tag("web")
@Feature("Documentation")
public class DocumentationPage extends TestBase {
    @Test
    @DisplayName("Enter Documentation Page")
    void mainDocPage() {

        open("https://expload.com/");

        $("#header-white-1").shouldHave(text("Getting started")).click();
    }

    @Test
    @DisplayName("Page should Be Opened From DirectPage")
    void shouldBeOpenedFromDirectPage() {

        open("https://expload.com/");

        $(byText("Документация")).click();

        $("h1").shouldHave(text("Overview")).click();
    }
}