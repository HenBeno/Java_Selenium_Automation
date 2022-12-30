package test.java.Utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import test.java.Extensions.UiActions;

import java.time.Duration;

public class CommonOps extends Base{
    @BeforeClass
    public void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setupDriver() {
        driver = new ChromeDriver();
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
        initAction();
        initWait();
        initPageObjectManager();
    }

    private void initPageObjectManager() {
        PageObjectManager.initWebPage();
    }

    private void initWait() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    private void initAction() {
        action = new UiActions();
        actions = new Actions(driver);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
