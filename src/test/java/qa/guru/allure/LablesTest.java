package qa.guru.allure;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class LablesTest {

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "GitHub", url = "https://testing.github.com")
    @Owner("AndreyMo")
    @Story("Issue creation")
    @Feature("Issue in the repository")
    @DisplayName("Create an Issue for an authorized user")
    void testStaticLabels() {

    }

    @Test
    public void testDynamicLabels() {
    }

}
