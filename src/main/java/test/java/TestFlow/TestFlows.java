package test.java.TestFlow;

import io.qameta.allure.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import test.java.Extensions.UiActions;
import test.java.Extensions.Verifications;
import test.java.Utilities.CommonOps;

public class TestFlows extends CommonOps {
    @Step("Verify text in element 'gitBtn'")
    public static void basicTest() throws InterruptedException {
        Verifications.verifyTextInElement(mainPage.gitBtn, "GitHub");
//        UiActions.click(mainPage.gitBtn);
//        Thread.sleep(2000);
//        UiActions.ScrollDownByAmount(400);
//        Thread.sleep(2000);
//        UiActions.ScrollUpByAmount(400);
//        Thread.sleep(2000);
//        UiActions.ScrollToElement(mainPage.gitLogo);
//        Thread.sleep(2000);
//        Verifications.verifyNumberOfVisibilityElements(mainPage.turboFrameElements, 1);
//        Verifications.verifyTitle("TTT");
//        mainPage.clickNavigationBtn();
    }
    @Step("Verify 'gitBtn' is working")
    public static void basicTest2() throws InterruptedException {
        UiActions.click(mainPage.gitBtn);
        Verifications.verifyTitle("GitHub - bonigarcia/selenium-webdriver-java: Examples of the O'Reilly book \"Hands-On Selenium WebDriver with Java\"");
    }

    //Need to verify using Sikuli - False true
    @Step("Verify element down page")
    public static void basicTest3() throws InterruptedException {
        UiActions.ScrollDownByAmount(400);
        System.out.println(mainPage.readMeHeader.isDisplayed());
        Verifications.verifyVisibilityOfElement(mainPage.readMeHeader);
    }

    //Need to verify using Sikuli - False true
    @Step("Verify element up page")
    public static void basicTest4() throws InterruptedException {
        UiActions.ScrollUpByAmount(400);
        Verifications.verifyVisibilityOfElement(mainPage.gitSmallLogo);
    }



//    @Step("Verify page down elements")
//    public static void basicTest2() throws InterruptedException {
//        UiActions.ScrollDownByAmount(400);
//        Verifications.verifyVisibilityOfElement();
//    }

    @Step("Login in fb")
     public static void fbLoginTest(String userName, String password) throws InterruptedException{
        UiActions.UpdateText(loginPageFB.loginInput, userName);
        UiActions.UpdateText(loginPageFB.passwordInput, password);
        UiActions.click(loginPageFB.loginBtn);
        Verifications.verifyTextInElement(pageAfterLogin.userName,"Lior Choen");
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }
}