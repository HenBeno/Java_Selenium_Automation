package test.java.TestFlow;

import io.qameta.allure.Step;
import test.java.Extensions.UiActions;
import test.java.Extensions.Verifications;
import test.java.Utilities.Base;
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

    @Step("Login to FB")
     public static void fbLoginTest(String userName, String password) throws InterruptedException{
        UiActions.UpdateText(loginPageFB.loginInput, userName);
        UiActions.UpdateText(loginPageFB.passwordInput, password);
        UiActions.click(loginPageFB.loginBtn);
    }

    @Step("Verify home page")
    public static String fbHomePage(String userName, String password) throws InterruptedException{
        fbLoginTest(Base.USERNAME_1,Base.PASSWORD_1);
        UiActions.click(fbTopMenu.homeBtn);
        System.out.println(UiActions.GetElementAttribute(fbTopMenu.homeBtn, "aria-current"));
        return UiActions.GetElementAttribute(fbTopMenu.homeBtn, "aria-current");
    }

    @Step("Verify friends page")
    public static String fbFriendsPage(String userName, String password) throws InterruptedException{
        fbLoginTest(Base.USERNAME_1,Base.PASSWORD_1);
        UiActions.click(fbTopMenu.friendsBtn);
        System.out.println(UiActions.GetElementAttribute(fbTopMenu.friendsBtn, "aria-current"));
        return UiActions.GetElementAttribute(fbTopMenu.friendsBtn, "aria-current");
    }

    @Step("Verify groups page")
    public static String fbGroupsPage(String userName, String password) throws InterruptedException{
        fbLoginTest(Base.USERNAME_1,Base.PASSWORD_1);
        UiActions.click(fbTopMenu.groupsBtn);
        System.out.println(UiActions.GetElementAttribute(fbTopMenu.groupsBtn, "aria-current"));
        return UiActions.GetElementAttribute(fbTopMenu.groupsBtn, "aria-current");
    }

    @Step("Verify mouse hover popup in Friends page")
    public static String mouseHoverFriends(String userName, String password) throws InterruptedException{
        fbFriendsPage(userName, password);
        UiActions.MouseHover(fbTopMenu.friendsBtn);
        return UiActions.getText(fbTopMenu.mouseHoverFriendsBtn);
    }

    @Step("Verify mouse hover popup in Groups page")
    public static String mouseHoverGroups(String userName, String password) throws InterruptedException{
        fbGroupsPage(userName, password);
        UiActions.MouseHover(fbTopMenu.groupsBtn);
        return UiActions.getText(fbTopMenu.mouseHoverGroupsBtn);
    }

    @Step("Verify mouse hover popup in Home page")
    public static String mouseHoverHome(String userName, String password) throws InterruptedException{
        fbHomePage(userName, password);
        // The first one is because after click on the home button we need to "move the mose" to different element
        // and then go back to home element to the move hover element appear again.
        UiActions.MouseHover(fbTopMenu.groupsBtn);
        UiActions.MouseHover(fbTopMenu.homeBtn);
        return UiActions.getText(fbTopMenu.mouseHoverHomeBtn);
    }
}