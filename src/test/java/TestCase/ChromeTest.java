package TestCase;

import io.qameta.allure.Step;
import test.java.Extensions.Verifications;
import test.java.TestFlow.TestFlows;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import test.java.Utilities.Base;
import test.java.Utilities.CommonOps;

@Listeners(test.java.Utilities.Listeners.class)
public class ChromeTest extends CommonOps {

//    @Test
//    public void test() throws InterruptedException {
//        TestFlows.basicTest();
//    }
//    @Test
//    public void test2() throws InterruptedException {
//        TestFlows.basicTest2();
//    }
//    @Test
//    public void test3() throws InterruptedException {
//        TestFlows.basicTest3();
//    }
//    @Test
//    public void test4() throws InterruptedException {
//        TestFlows.basicTest4();
//    }

    @Test
    @Step("Verify the login successfully done [Check user name]")
    public void test1() throws InterruptedException {
        TestFlows.fbLoginTest(Base.USERNAME_1,Base.PASSWORD_1);
        Verifications.verifyTextInElement(fbMainPage.userName,"Lior Cohen");
    }

    @Test
    @Step("Verify the movement to home page throw top menu")
    public void test2() throws InterruptedException {
        Verifications.verifyStrings(TestFlows.fbHomePage(Base.USERNAME_1,Base.PASSWORD_1), "page");
    }

    @Test
    @Step("Verify the movement to friends page using the top menu")
    public void test3() throws InterruptedException {
        Verifications.verifyStrings(TestFlows.fbFriendsPage(Base.USERNAME_1,Base.PASSWORD_1), "page");
    }

    @Test
    @Step("Verify the movement to groups page using the top menu")
    public void test4() throws InterruptedException {
        Verifications.verifyStrings(TestFlows.fbGroupsPage(Base.USERNAME_1,Base.PASSWORD_1), "page");
    }

    @Test
    @Step("Verify the mouse hover span appearance [Home] from the top menu")
    public void test5() throws InterruptedException {
        Verifications.verifyStrings(TestFlows.mouseHoverHome(Base.USERNAME_1,Base.PASSWORD_1), "Home");
    }

    @Test
    @Step("Verify the mouse hover span appearance [friends] from the top menu")
    public void test6() throws InterruptedException {
        Verifications.verifyStrings(TestFlows.mouseHoverFriends(Base.USERNAME_1,Base.PASSWORD_1), "Friends");
    }

    @Test
    @Step("Verify the mouse hover span appearance [groups] from the top menu")
    public void test7() throws InterruptedException {
        Verifications.verifyStrings(TestFlows.mouseHoverGroups(Base.USERNAME_1,Base.PASSWORD_1), "Groups");
    }

}
