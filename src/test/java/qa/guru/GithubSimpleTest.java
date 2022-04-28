package qa.guru;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GithubSimpleTest {

    @Test
    void softAssertionsContainsJunitCode(){
        open("https://github.com/");

        $("[role=combobox]").click();
        $("[role=combobox]").setValue("Selenide").pressEnter();
        $("ul.repo-list li a").click();

        $("#wiki-tab").click();

        $("ul .btn-link").click();
        $(".wiki-pages-box").$(byText("SoftAssertions")).click();

        $(".markdown-body").shouldBe(Condition.text("Using JUnit5 extend test class:"));
    }
}
