package test.java.TestFlow;

import io.qameta.allure.Step;
import org.bson.Document;
import org.testng.asserts.SoftAssert;
import test.java.Extensions.UiActions;
import test.java.Utilities.CommonOps;
import test.java.Utilities.GetDataFromXml;

import java.util.Objects;

import static test.java.Utilities.DBManager.getDataFromDB;
import static test.java.Utilities.GetDataFromXml.getDataFromXml;

public class TestFlows extends CommonOps {
    @Step("Login to FB")
    public static void loginMethod(String userName, String password) throws Exception {
        UiActions.UpdateText(loginPageFB.loginInput, userName);
        UiActions.UpdateText(loginPageFB.passwordInput, password);
        UiActions.click(loginPageFB.loginBtn);
        Thread.sleep(5000);
    }

    public static void logOut(){
        UiActions.click(fbTopMenu.circleProfileLogo);
        UiActions.click(fbTopMenu.logOutBtn);
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
    public static String fbGroupsPage() {
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
    public static String createNewPost(String textOfPost) throws Exception {
        createTextPost(textOfPost);
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

    @Step("upload post, change privacy and compare to expected results")
    public static String privacyChecker(String privacyType, String textForPost) throws Exception {
        createTextPost(textForPost);
        UiActions.click(fbProfilePage.getPostPrivacyOptions());
        if (Objects.equals(fbProfilePage.getPostPrivacyOnlyMe().getText(), privacyType)) {
            UiActions.click(fbProfilePage.getPostPrivacyOnlyMe());
        } else if (Objects.equals(fbProfilePage.getPostPrivacyPublic().getText(), privacyType)) {
            UiActions.click(fbProfilePage.getPostPrivacyPublic());
        }
        UiActions.click(fbProfilePage.getSavePrivacyChoice());
        return UiActions.getText(fbProfilePage.getCurrentPrivacyValue());
    }

    private static void createTextPost(String postText) throws Exception {

        UiActions.click(fbLeftMenu.userName);

        UiActions.click(fbProfilePage.getClickToOpenTextAreaNewPosts());

        UiActions.click(fbProfilePage.getTextAreaNewPosts());

        UiActions.UpdateText(fbProfilePage.getTextAreaNewPosts(), postText);

        UiActions.click(fbProfilePage.getSenNewPostBtn());
        Thread.sleep(3000);

    }

    public static void loginUsingMongoDB() throws Exception {
        logOut();
        for (Document doc : getDataFromDB("username", "pass")) {
//            System.out.println((Document.parse(doc.toJson()).get("username")).toString());
//            System.out.println((Document.parse(doc.toJson()).get("pass")).toString());
            String user = (Document.parse(doc.toJson()).get("username")).toString();
            String pass = (Document.parse(doc.toJson()).get("pass")).toString();
            loginMethod(user, pass);
            logOut();
        }

    }

}

