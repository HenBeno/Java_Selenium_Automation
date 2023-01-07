package test.java.TestFlow;

import io.qameta.allure.Step;
import test.java.Extensions.UiActions;
import test.java.Utilities.Base;
import test.java.Utilities.CommonOps;

public class TestFlows extends CommonOps {
    @Step("Login to FB")
     public static void fbLoginTest(String userName, String password) throws InterruptedException{
        UiActions.UpdateText(loginPageFB.loginInput, userName);
        UiActions.UpdateText(loginPageFB.passwordInput, password);
        UiActions.click(loginPageFB.loginBtn);
    }

//    @Step("upload cover photo")
//    public static void uploadCoverPhoto() throws InterruptedException {
//        fbLoginTest(Base.USERNAME_1,Base.PASSWORD_1);
//        UiActions.click(fbLeftMenu.userName);
//        UiActions.click(fbUserPage.addCoverPhotoBtn);
//        UiActions.UpdateText(fbUserPage.uploadImageBtn,"C:\\Users\\jondi\\Downloads\\girl.jpg");
//        UiActions.click(fbUserPage.saveChangesBtn);
//    }

    @Step("Verify home page")
    public static String fbHomePage(String userName, String password) throws InterruptedException{
        fbLoginTest(Base.username1,Base.password1);
        UiActions.click(fbTopMenu.homeBtn);
        System.out.println(UiActions.GetElementAttribute(fbTopMenu.homeBtn, "aria-current"));
        return UiActions.GetElementAttribute(fbTopMenu.homeBtn, "aria-current");
    }

    @Step("Verify friends page")
    public static String fbFriendsPage(String userName, String password) throws InterruptedException{
        fbLoginTest(Base.username1,Base.password1);
        UiActions.click(fbTopMenu.friendsBtn);
        System.out.println(UiActions.GetElementAttribute(fbTopMenu.friendsBtn, "aria-current"));
        return UiActions.GetElementAttribute(fbTopMenu.friendsBtn, "aria-current");
    }

    @Step("Verify groups page")
    public static String fbGroupsPage(String userName, String password) throws InterruptedException{
        fbLoginTest(Base.username1,Base.password1);
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

    @Step("Create new post")
    public static String createNewPost(String userName, String password) throws InterruptedException{
        fbLoginTest(userName, password);
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
}