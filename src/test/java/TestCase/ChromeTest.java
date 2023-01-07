package TestCase;

import io.qameta.allure.Step;
import test.java.Extensions.Verifications;
import test.java.TestFlow.TestFlows;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import test.java.Utilities.Base;
import test.java.Utilities.CommonOps;

import static test.java.Utilities.GetDataFromXml.getDataFromXml;

@Listeners(test.java.Utilities.Listeners.class)
public class ChromeTest extends CommonOps {

    @Test
    @Step("Verify the login successfully done [Check user name]")
    public void test1() throws Exception {
        TestFlows.fbLoginTest(getDataFromXml("Config", "username1"),getDataFromXml("Config", "password1"));
        Verifications.verifyTextInElement(fbLeftMenu.userName,getDataFromXml("Data","expectedResult1"));
    }

    @Test
    @Step("Verify the movement to home page throw top menu")
    public void test2() throws Exception {
        Verifications.verifyStrings(TestFlows.fbHomePage(), getDataFromXml("Data","mouseHover");
    }

    @Test
    @Step("Verify the movement to friends page using the top menu")
    public void test3() throws Exception {
        Verifications.verifyStrings(TestFlows.fbFriendsPage(), getDataFromXml("Data","mouseHover"));
    }

    @Test
    @Step("Verify the movement to groups page using the top menu")
    public void test4() throws Exception {
        Verifications.verifyStrings(TestFlows.fbGroupsPage(), getDataFromXml("Data","mouseHover"));
    }

    @Test
    @Step("Verify the mouse hover span appearance [Home] from the top menu")
    public void test5() throws Exception {
        Verifications.verifyStrings(TestFlows.mouseHoverHome(), getDataFromXml("Data","expectedResult5"));
    }

    @Test
    @Step("Verify the mouse hover span appearance [friends] from the top menu")
    public void test6() throws Exception {
        Verifications.verifyStrings(TestFlows.mouseHoverFriends(),  getDataFromXml("Data","expectedResult6"));
    }

    @Test
    @Step("Verify the mouse hover span appearance [groups] from the top menu")
    public void test7() throws Exception {
        Verifications.verifyStrings(TestFlows.mouseHoverGroups(), getDataFromXml("Data","expectedResult7"));
    }

    @Test
    @Step("Verify create new post and verify by post text")
    public void test8() throws Exception {
        Verifications.verifyStrings(TestFlows.createNewPost(), getDataFromXml("Data", "expectedResult8"));
    }

}
