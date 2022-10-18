package homework;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SearchPageInSelenideRepository {

    @Test
    void searchPageInSelenideRepositoryWiki() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".Box--condensed").$(".js-wiki-more-pages-link").click();
        $(".Box--condensed").shouldHave(text("SoftAssertions"));
        $(".Box--condensed").$(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(text("3. Using JUnit5 extend test class:")).shouldBe(visible);
    }
}
