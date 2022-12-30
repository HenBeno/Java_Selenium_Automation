package test.java.TestFlow;

import io.qameta.allure.Step;
import test.java.Utilities.CommonOps;

public class TestFlows extends CommonOps {
    @Step("Basic Test: Template")
    public static void basicTest()
    {
        String text = mainPage.getWebFormText();
        System.out.println(text);
        mainPage.clickNavigationBtn();
    }
}
