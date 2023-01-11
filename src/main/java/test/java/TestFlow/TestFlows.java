package test.java.TestFlow;

import io.qameta.allure.Step;
import org.testng.asserts.SoftAssert;
import test.java.Extensions.UiActions;
import test.java.Utilities.CommonOps;

import static test.java.Utilities.GetDataFromXml.getDataFromXml;

public class TestFlows extends CommonOps {
    @Step("Login to FB")
    public static void loginMethod(String userName, String password) throws Exception {
        UiActions.UpdateText(loginPageFB.loginInput, userName);
        UiActions.UpdateText(loginPageFB.passwordInput, password);
        UiActions.click(loginPageFB.loginBtn);
        Thread.sleep(5000);
    }


    @Step("Verify home page")
    public static String fbHomePage() throws Exception {
        UiActions.click(fbTopMenu.homeBtn);
        System.out.println(UiActions.GetElementAttribute(fbTopMenu.homeBtn, "aria-current"));
        return UiActions.GetElementAttribute(fbTopMenu.homeBtn, "aria-current");
    }

    @Step("Verify friends page")
    public static String fbFriendsPage() throws Exception {
        UiActions.click(fbTopMenu.friendsBtn);
        System.out.println(UiActions.GetElementAttribute(fbTopMenu.friendsBtn, "aria-current"));
        return UiActions.GetElementAttribute(fbTopMenu.friendsBtn, "aria-current");
    }

    @Step("Verify groups page")
    public static String fbGroupsPage()  {
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
        createTextPost("Username1", "password1");
        return UiActions.getText(fbProfilePage.getPostsTextList().get(0));
    }


    @Step("upload cover photo")
    public static SoftAssert uploadProfilePhoto() throws Exception {
        softAssert = new SoftAssert();
        UiActions.click(fbLeftMenu.userName);
        UiActions.click(fbProfilePage.getUpdateProfilePicture());
        UiActions.click(fbProfilePage.getUploadProfilePictureBtn());
        Thread.sleep(1000);
        Runtime.getRuntime().exec("src/main/java/test/java/External_files/uploadPicture.exe");
        UiActions.click(fbProfilePage.getSaveProfilePhoto());
        UiActions.waitToInvisibility(fbProfilePage.getSaveProfilePhoto());

        driver.navigate().refresh();

        softAssert.assertEquals(UiActions.getText(fbProfilePage.getPictureUpdateTime()), getDataFromXml("Data", "expectedResult9.1"));
        String cut_name = UiActions.getText(fbProfilePage.getUptdatedHisProfilePhotTxt());
        softAssert.assertEquals(cut_name.substring(cut_name.length() - 29), getDataFromXml("Data", "expectedResult9.2"));

        return softAssert;

    }

    @Step("upload post, change privacy and compeare to expected results")
    public static void privacyChecker() throws Exception {
        createTextPost("userName2", "password2");


    }

    private static void createTextPost(String username, String password) throws Exception {
        Thread.sleep(1000);
        UiActions.click(fbLeftMenu.userName);
        Thread.sleep(2000);
        UiActions.click(fbProfilePage.getClickToOpenTextAreaNewPosts());
        Thread.sleep(2000);
        UiActions.click(fbProfilePage.getTextAreaNewPosts());
        Thread.sleep(2000);
        UiActions.UpdateText(fbProfilePage.getTextAreaNewPosts(), "Hey Hey Hey");
        Thread.sleep(2000);
        UiActions.click(fbProfilePage.getSenNewPostBtn());
        Thread.sleep(2000);
    }

}

