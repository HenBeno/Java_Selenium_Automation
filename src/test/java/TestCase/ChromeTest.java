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
    public void test1() throws InterruptedException {
        TestFlows.fbLoginTest(Base.username1,Base.password1);
        Verifications.verifyTextInElement(fbLeftMenu.userName,"Lior Cohen");
    }

    @Test
    @Step("Verify the movement to home page throw top menu")
    public void test2() throws InterruptedException {
        Verifications.verifyStrings(TestFlows.fbHomePage(Base.username1,Base.password1), "page");
    }

    @Test
    @Step("Verify the movement to friends page using the top menu")
    public void test3() throws InterruptedException {
        Verifications.verifyStrings(TestFlows.fbFriendsPage(Base.username1,Base.password1), "page");
    }

    @Test
    @Step("Verify the movement to groups page using the top menu")
    public void test4() throws InterruptedException {
        Verifications.verifyStrings(TestFlows.fbGroupsPage(Base.username1,Base.password1), "page");
    }

    @Test
    @Step("Verify the mouse hover span appearance [Home] from the top menu")
    public void test5() throws InterruptedException {
        Verifications.verifyStrings(TestFlows.mouseHoverHome(Base.username1,Base.password1), "Home");
    }

    @Test
    @Step("Verify the mouse hover span appearance [friends] from the top menu")
    public void test6() throws InterruptedException {
        Verifications.verifyStrings(TestFlows.mouseHoverFriends(Base.username1,Base.password1), "Friends");
    }

    @Test
    @Step("Verify the mouse hover span appearance [groups] from the top menu")
    public void test7() throws InterruptedException {
        Verifications.verifyStrings(TestFlows.mouseHoverGroups(Base.username1,Base.password1), "Groups");
    }

}
