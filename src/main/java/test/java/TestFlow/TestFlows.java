package test.java.TestFlow;

import io.qameta.allure.Step;
import test.java.Extensions.UiActions;
import test.java.Utilities.Base;
import test.java.Utilities.CommonOps;

import java.io.IOException;

import static test.java.Utilities.GetDataFromXml.getDataFromXml;

public class TestFlows extends CommonOps {
    @Step("Login to FB")
     public static void fbLoginTest(String userName, String password) throws InterruptedException{
        UiActions.UpdateText(loginPageFB.loginInput, userName);
        UiActions.UpdateText(loginPageFB.passwordInput, password);
        UiActions.click(loginPageFB.loginBtn);
    }



    @Step("Verify home page")
    public static String fbHomePage() throws Exception {
        fbLoginTest(getDataFromXml("Data", "userName1"),getDataFromXml("Data", "password1"));
        UiActions.click(fbTopMenu.homeBtn);
        System.out.println(UiActions.GetElementAttribute(fbTopMenu.homeBtn, "aria-current"));
        return UiActions.GetElementAttribute(fbTopMenu.homeBtn, "aria-current");
    }

    @Step("Verify friends page")
    public static String fbFriendsPage() throws Exception {
        fbLoginTest(getDataFromXml("Data", "userName1"),getDataFromXml("Data", "password1"));
        UiActions.click(fbTopMenu.friendsBtn);
        System.out.println(UiActions.GetElementAttribute(fbTopMenu.friendsBtn, "aria-current"));
        return UiActions.GetElementAttribute(fbTopMenu.friendsBtn, "aria-current");
    }

    @Step("Verify groups page")
    public static String fbGroupsPage() throws Exception {
        fbLoginTest(getDataFromXml("Data", "userName1"),getDataFromXml("Data", "password1"));
        UiActions.click(fbTopMenu.groupsBtn);
        System.out.println(UiActions.GetElementAttribute(fbTopMenu.groupsBtn, "aria-current"));
        return UiActions.GetElementAttribute(fbTopMenu.groupsBtn, "aria-current");
    }

    @Step("Verify mouse hover popup in Friends page")
    public static String mouseHoverFriends() throws Exception {
        fbFriendsPage();
        UiActions.MouseHover(fbTopMenu.friendsBtn);
        return UiActions.getText(fbTopMenu.mouseHoverFriendsBtn);
    }

    @Step("Verify mouse hover popup in Groups page")
    public static String mouseHoverGroups() throws Exception {
        fbGroupsPage();
        UiActions.MouseHover(fbTopMenu.groupsBtn);
        return UiActions.getText(fbTopMenu.mouseHoverGroupsBtn);
    }

    @Step("Verify mouse hover popup in Home page")
    public static String mouseHoverHome() throws Exception {
        fbHomePage();
        // The first one is because after click on the home button we need to "move the mose" to different element
        // and then go back to home element to the move hover element appear again.
        UiActions.MouseHover(fbTopMenu.groupsBtn);
        UiActions.MouseHover(fbTopMenu.homeBtn);
        return UiActions.getText(fbTopMenu.mouseHoverHomeBtn);
    }

    @Step("Create new post")
    public static String createNewPost() throws Exception {
        fbLoginTest(getDataFromXml("Data", "userName1"),getDataFromXml("Data", "password1"));
        Thread.sleep(1000);
        UiActions.click(fbLeftMenu.userName);
        Thread.sleep(2000);
        UiActions.click(fbProfilePage.clickToOpenTextAreaNewPosts);
        Thread.sleep(2000);
        UiActions.click(fbProfilePage.textAreaNewPosts);
        Thread.sleep(2000);
        UiActions.UpdateText(fbProfilePage.textAreaNewPosts, "Hey Hey Hey");
        Thread.sleep(2000);
        UiActions.click(fbProfilePage.senNewPostBtn);
        Thread.sleep(2000);
        return UiActions.getText(fbProfilePage.postsTextList.get(0));
    }
    //    ControlFocus(Open,,Edit1)
//    ControlSetText(Open,,Edit1,DSaedAutomationJava_Selenium_AutomationsrcmainjavatestjavaExternal filesgirl.png)
//    ControlClick(Open,,Button1)
    @Step("upload cover photo")
    public static void uploadCoverPhoto() throws Exception {
        fbLoginTest(getDataFromXml("Data", "userName1"),getDataFromXml("Data", "password1"));
        UiActions.click(fbLeftMenu.userName);
        UiActions.click(fbProfilePage.updateProfilePicture);
        UiActions.click(fbProfilePage.uploadProfilePictureBtn);
        Thread.sleep(3000);
        Runtime.getRuntime().exec("D:\\SaedAutomation\\Java_Selenium_Automation\\src\\main\\java\\test\\java\\External files\\uploadPicture.exe");
        UiActions.click(fbProfilePage.saveProfilePhoto);
    }

}

