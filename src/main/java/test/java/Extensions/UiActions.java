package test.java.Extensions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import test.java.Utilities.Base;

public class UiActions extends Base {
    @Step("Click on element [UiActions]")
    public static void click(WebElement elem)
    {
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }

    @Step("Get text from element [UiActions]")
    public static String getText(WebElement elem)
    {
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        return elem.getText();
    }

}
