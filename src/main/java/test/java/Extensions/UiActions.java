package test.java.Extensions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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

    @Step("Update text - sendKeys [UiActions]")
    public static void UpdateText(WebElement elem, String text)
    { wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(text);
    }

    @Step ("Choose from drop down menu [UiActions]")
    public static void UpdateDropDown(WebElement elem, String text)
    { wait.until(ExpectedConditions.visibilityOf(elem));
        Select dropdown=new Select(elem);
        dropdown.selectByVisibleText(text);
    }

    @Step("Mouse hover element [UiActions]")
    public static void MouseHover(WebElement elem1, WebElement elem2)
    {
        actions.moveToElement(elem1).perform();
        actions.moveToElement(elem2).click().perform();
    }

    @Step("Scroll by X & Y  delta [UiActions]")
    public static void ScrollByXYaxis(int scrollX, int scrollY)
    {
        actions.scrollByAmount(scrollX, scrollY)
                .perform();
    }
    @Step("Scroll down by given amount (From X to Y) [UiActions]")
    public static void ScrollDownByAmount(int amount)
    {
        actions.scrollByAmount(0, amount)
                .perform();
    }
    @Step("Scroll up by given amount (From X to Y) [UiActions]")
    public static void ScrollUpByAmount(int amount)
    {
        actions.scrollByAmount(0, amount * -1)
                .perform();
    }

    public static void ScrollLeftByAmount(int amount)
    {
        actions.scrollByAmount(amount, 0)
                .perform();
    }

    public static void ScrollRightByAmount(int amount)
    {
        actions.scrollByAmount(amount * -1, 0)
                .perform();
    }
    @Step("Scroll to element [UiActions]")
    public static void ScrollToElement(WebElement elem1)
    {
        actions.scrollToElement(elem1).perform();
    }
    @Step("Scroll to element [UiActions]")
    public static void ScrollToElementWithOffset(WebElement elem1)
    {
        actions.scrollToElement(elem1).perform();
    }

}
