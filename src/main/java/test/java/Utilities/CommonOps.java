package test.java.Utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import test.java.Extensions.UiActions;

import java.time.Duration;


public class CommonOps extends Base{
    @BeforeClass
    public void setupClass(String browserType, String url) {
        initLog();
        initBrowser(browserType);
        initUrl(url);
        initAction();
        initWait();
        initPageObjectManager();
    }

    private void initLog() {
        logger = Logger.getLogger("MyLogger");
        PropertyConfigurator.configure("log4j.properties");
    }

    private void initBrowser(String browserType) {
        WebDriverManager.chromedriver().setup();
        switch (browserType.toLowerCase()){
            case "chrome":
                driver = new ChromeDriver();
                logger.info("Start Chrome Browser");
            case "firefox":
                driver = new FirefoxDriver();
                logger.info("Start Firefox Browser");
            case "edge":
                driver = new EdgeDriver();
                logger.info("Start Edge Browser");
            case "explorer":
                driver = new InternetExplorerDriver();
                logger.info("Start InternetExplorer Browser");
            case "safari":
                driver = new SafariDriver();
                logger.info("Start Safari Browser");
            default:
                driver = new ChromeDriver();
                logger.info("Start default Browser [Chrome]");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        logger.info("Maximize browser window");
    }

    private void initUrl(String url) {
        driver.get(url);
        logger.info("Open URL");
    }

    private void initAction() {
        action = new UiActions();
        actions = new Actions(driver);
        logger.info("Initialized the 'Action'");
    }

    private void initWait() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        logger.info("Initialized 'wait'");
    }

    private void initPageObjectManager() {
        PageObjectManager.initWebPage();
        logger.info("Initialized POM");
    }

    @BeforeMethod
    public void setupDriver() {
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
        logger.info("Browser closed");
    }
}
