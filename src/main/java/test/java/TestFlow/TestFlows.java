package test.java.TestFlow;

import io.qameta.allure.Step;
import test.java.Extensions.UiActions;
import test.java.Utilities.CommonOps;

public class TestFlows extends CommonOps {
    @Step("Basic Test: Template")
    public static void basicTest() throws InterruptedException {
        String text = mainPage.getWebFormText();
        System.out.println(text);
        mainPage.clickGitBtn();
        Thread.sleep(2000);
        UiActions.ScrollDownByAmount(400);
        Thread.sleep(2000);
        UiActions.ScrollUpByAmount(400);
        Thread.sleep(2000);
        UiActions.ScrollToElement(mainPage.gitLogo);
        Thread.sleep(2000);

//        mainPage.clickNavigationBtn();
    }
}
