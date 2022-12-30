package TestCase;

import test.java.TestFlow.TestFlows;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import test.java.Utilities.CommonOps;

@Listeners(test.java.Utilities.Listeners.class)
public class ChromeTest extends CommonOps {

    @Test
    public void test() throws InterruptedException {
        TestFlows.basicTest();
    }
}
