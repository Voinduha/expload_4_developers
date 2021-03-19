package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Tag("web")
public class MainWhitePage extends TestBase {

    @Test
    @DisplayName("Header should have Text \"SDK для быстрой разработки\"")
    void mainHomePage() {

        open("https://expload.com/");

        $("#home-1").shouldHave(text("SDK для быстрой разработки"));

    }

    @Test
    @DisplayName("Page blocks should be loaded")
    void blocksLoadedTest() {

        open("https://expload.com/");

        $("#header-white-1").shouldBe(visible);
        $("#home-1").shouldBe(visible);
        $("#home-2").shouldBe(visible);
        $("#home-3").shouldBe(visible);
        $("#home-4").shouldBe(visible);
        $("#header-white-2").shouldBe(visible);
    }

    @Test
    @DisplayName("Page should change language")
    void changeLanguageTest() {
        open("https://expload.com/");
        $("#header").shouldHave(text("En")).click();
        $("#header-white-1 h1").shouldHave(text("Платформа для разработки и дистрибуции игр с открытой экономикой"));
    }
}
