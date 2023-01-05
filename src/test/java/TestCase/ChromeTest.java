package TestCase;

import test.java.TestFlow.TestFlows;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import test.java.Utilities.Base;
import test.java.Utilities.CommonOps;

@Listeners(test.java.Utilities.Listeners.class)
public class ChromeTest extends CommonOps {

    @Test
    public void test() throws InterruptedException {
        TestFlows.basicTest();
    }
    @Test
    public void test2() throws InterruptedException {
        TestFlows.basicTest2();
    }
    @Test
    public void test3() throws InterruptedException {
        TestFlows.basicTest3();
    }
    @Test
    public void test4() throws InterruptedException {
        TestFlows.basicTest4();
    }

    @Test
    public void test5() throws InterruptedException {
        TestFlows.basicTest5(Base.USERNAME,Base.PASSWORD);
    }

}
