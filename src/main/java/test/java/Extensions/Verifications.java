package test.java.Extensions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import test.java.Utilities.CommonOps;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class Verifications extends CommonOps {
    @Step("Verify number of elements")
    public static void verifyNumberOfVisibilityElements (List<WebElement> elemList, int expected)
    {
        wait.until(ExpectedConditions.visibilityOfAllElements(elemList));
        assertEquals(elemList.size(),expected);
    }

    @Step("Verify title")
    public static void verifyTitle (String expected)
    {
        wait.until(ExpectedConditions.titleIs(expected));
    }

    @Step("Verify text in element")
    public static void verifyTextInElement(WebElement elem,String expected){
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(),expected) ;
        System.out.println(elem.getText());
    }

    @Step("Verify text in element")
    public static void verifyVisibilityOfElement(WebElement elem){
        wait.until(ExpectedConditions.visibilityOf(elem));
    }

    @Step("Verify by strings comparing ")
    public static void verifyStrings(String actual, String expected) {
        assertEquals(actual, expected);
    }

}
