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
    public void test5() throws InterruptedException {
        TestFlows.fbLoginTest(Base.USERNAME_1,Base.PASSWORD_1);
        Verifications.verifyTextInElement(FBMainPage.userName,"Lior Cohen");
    }

}
