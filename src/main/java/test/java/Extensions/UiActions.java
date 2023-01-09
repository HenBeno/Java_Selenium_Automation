package test.java.Extensions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import test.java.Utilities.Base;

import static org.testng.Assert.fail;

public class UiActions extends Base {
    @Step("Click on element [UiActions]")
    public static void click(WebElement elem) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(elem));
            System.out.println("click on: '" + getText(elem) + "' Button");
            logger.error("click on: '" + getText(elem) + "' Button");
            elem.click();
        } catch (Exception e) {
            System.out.println("Error: Failed to click on Element: " + getText(elem) + " , see details: " + e);
            fail("Failed to click on Element: " + getText(elem));
            logger.error("Failed to click on Element: " + getText(elem));
        }

    }

    @Step("Get text from element [UiActions]")
    public static String getText(WebElement elem) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        return elem.getText();
    }

    @Step("Update text - sendKeys [UiActions]")
    public static void UpdateText(WebElement elem, String text) {
        try {
            wait.until(ExpectedConditions.visibilityOf(elem));
            elem.clear();
            elem.sendKeys(text);
            System.out.println("Text: " + text + " inserted successfully");
        } catch (Exception e) {
            System.out.println("Text: " + text + " fail to inserted");
            logger.error("Text: " + text + " fail to inserted into");
        }

    }

    @Step("Choose from drop down menu by text [UiActions]")
    public static void UpdateDropDown(WebElement elem, String text) {
        try {
            wait.until(ExpectedConditions.visibilityOf(elem));
        } catch (Exception e) {
            System.out.println("Error: Failed to find drop menu, see details: " + e);
            logger.error("Error: Failed to find drop menu, see details: " + e);
        }
        try {
            Select dropdown = new Select(elem);
            dropdown.selectByVisibleText(text);
            System.out.println("Text: " + text + " chosen successfully from drop menu");
        } catch (Exception e) {
            System.out.println("Error: Failed to find drop menu selection: " + text + " , see details: " + e);
            logger.error("Error: Failed to find drop menu selection: " + text + " , see details: " + e);
        }
    }

    @Step("Mouse hover element and click [UiActions]")
    public static void MouseHoverAndClick(WebElement elem1, WebElement elem2) {
        actions.moveToElement(elem1).perform();
        actions.moveToElement(elem2).click().perform();
    }

    @Step("Mouse hover")
    public static void MouseHover(WebElement elem1) {
        wait.until(ExpectedConditions.visibilityOf(elem1));
        actions.moveToElement(elem1).perform();
    }

    @Step("Scroll by X & Y  delta [UiActions]")
    public static void ScrollByXYaxis(int scrollX, int scrollY) {
        actions.scrollByAmount(scrollX, scrollY)
                .perform();
    }

    @Step("Scroll down by given amount (From X to Y) [UiActions]")
    public static void ScrollDownByAmount(int amount) {
        actions.scrollByAmount(0, amount)
                .perform();
    }

    @Step("Scroll up by given amount (From X to Y) [UiActions]")
    public static void ScrollUpByAmount(int amount) {
        actions.scrollByAmount(0, amount * -1)
                .perform();
    }

    public static void ScrollLeftByAmount(int amount) {
        actions.scrollByAmount(amount, 0)
                .perform();
    }

    public static void ScrollRightByAmount(int amount) {
        actions.scrollByAmount(amount * -1, 0)
                .perform();
    }

    @Step("Scroll to element [UiActions]")
    public static void ScrollToElement(WebElement elem1) {
        actions.scrollToElement(elem1).perform();
    }

    @Step("Get element attribute [UiActions]")
    public static String GetElementAttribute(WebElement elem1, String attribute) {
        wait.until(ExpectedConditions.attributeToBeNotEmpty(elem1, attribute));
        return elem1.getAttribute(attribute);
    }
    @Step("Wait until specific element will be invisible ]")
    public static void waitToInvisibility(WebElement element) {
        wait.until(ExpectedConditions.invisibilityOf(element));


    }

}
