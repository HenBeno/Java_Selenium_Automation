package TestCase;

import io.qameta.allure.Step;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import test.java.Extensions.Verifications;
import test.java.TestFlow.TestFlows;
import test.java.Utilities.CommonOps;
import test.java.Utilities.ManageDDT;

import static test.java.Utilities.GetDataFromXml.getDataFromXml;

@Listeners(test.java.Utilities.Listeners.class)
public class ChromeTest extends CommonOps {

    @Test
    @Step("Verify the login successfully done [Check user name]")
    public void test1() throws Exception {
//        TestFlows.loginMethod(getDataFromXml("Data", "userName1"),getDataFromXml("Data", "password1"));
        Verifications.verifyTextInElement(fbLeftMenu.userName, getDataFromXml("Data", "expectedResult1"));
    }

    @Test
    @Step("Verify that the current menu chosen is highlight [Home]")
    public void test2() throws Exception {
        Verifications.verifyStrings(TestFlows.fbHomePage(), getDataFromXml("Data", "mouseHover"));
    }

    @Test
    @Step("Verify that the current menu chosen is highlight [Friends]")
    public void test3() throws Exception {
        Verifications.verifyStrings(TestFlows.fbFriendsPage(), getDataFromXml("Data", "mouseHover"));
    }

    @Test
    @Step("Verify that the current menu chosen is highlight [Groups]")
    public void test4() throws Exception {
        Verifications.verifyStrings(TestFlows.fbGroupsPage(), getDataFromXml("Data", "mouseHover"));
    }

    @Test
    @Step("Verify the mouse hover span appearance [Home] from the top menu")
    public void test5() throws Exception {
        Verifications.verifyStrings(TestFlows.mouseHoverHome(), getDataFromXml("Data", "expectedResult5"));
    }

    @Test
    @Step("Verify the mouse hover span appearance [friends] from the top menu")
    public void test6() throws Exception {
        Verifications.verifyStrings(TestFlows.mouseHoverFriends(), getDataFromXml("Data", "expectedResult6"));
    }

    @Test
    @Step("Verify the mouse hover span appearance [groups] from the top menu")
    public void test7() throws Exception {
        Verifications.verifyStrings(TestFlows.mouseHoverGroups(), getDataFromXml("Data", "expectedResult7"));
    }

    @Test
    @Step("Verify new post has been created successfully [verify by post text]")
    public void test8() throws Exception {
        Verifications.verifyStrings(
                TestFlows.createNewPost(getDataFromXml("Data", "newPostVerify")),
                getDataFromXml("Data", "expectedResult8"));
    }

    @Test
    @Step("Verify that profile picture has been uploaded successfully")
    public void test9() throws Exception {
        TestFlows.uploadProfilePhoto().assertAll();
    }

    @Test(dataProvider = "myDDT", dataProviderClass = ManageDDT.class)
    @Step("Verify privacy type of new posts using DDT")
    public void test10(String privacyType, String textForText, String expectedResult) throws Exception {
        Verifications.verifyStrings(TestFlows.privacyChecker(privacyType, textForText), expectedResult);
    }

    @Test
    @Step("Login using data from MongoDB")
    public void test11() throws Exception {
        //TODO: Need to add Verifications
        TestFlows.loginUsingMongoDB();
    }

}
