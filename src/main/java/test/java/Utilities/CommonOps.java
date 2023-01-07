package test.java.Utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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

import java.io.IOException;
import java.time.Duration;

import static test.java.Utilities.GetDataFromXml.getDataFromXml;


public class CommonOps extends Base{
    @BeforeMethod
    protected void setupClass() throws Exception {
        String browserType = getDataFromXml("Config", "browser");
        String url = getDataFromXml("Config", "url");
        initLog();
        initBrowser(browserType);
        initUrl(url);
        initAction();
        initWait();
        initPageObjectManager();
    }


    private void initLog() throws IOException {
        logger = LogManager.getLogger(Base.class);
        System.out.println("this is logger demo.");
    }

    private void initBrowser(String browserType) {
        switch (browserType.toLowerCase()){
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                logger.info("Start Firefox Browser");
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                logger.info("Start Edge Browser");
                break;
            case "explorer":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                logger.info("Start InternetExplorer Browser");
                break;
            case "safari":
                WebDriverManager.safaridriver().setup();
                driver = new SafariDriver();
                logger.info("Start Safari Browser");
                break;
            default:
                WebDriverManager.chromedriver().setup();
                //handle chrome notifications
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--disable-notifications");
                driver = new ChromeDriver(options);
//                PageFactory.initElements((new FieldContextDecorator(new ElementContextLocatorFactory(driver))), mainPage);
//                mainPage = PageFactory.initElements((new FieldContextDecorator(new ElementContextLocatorFactory(driver))), mainPage);
                logger.info("Start default Browser [Chrome]");
                break;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        logger.info("Maximize browser window");
    }

    private void initUrl(String url) {
        driver.get(url);
        logger.info("Open URL: " + url);
    }

    private void initAction() {
        action = new UiActions();
        actions = new Actions(driver);
        logger.info("Initialized the 'Action'");
    }

    private void initWait() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        logger.info("Initialized 'wait'");
    }

    private void initPageObjectManager() {
        PageObjectManager.initWebPage();
        logger.info("Initialized POM");
    }

//    @BeforeMethod
//    public void setupDriver() {
//    }
//
//    @AfterMethod
//    public void tearDownMethod() throws InterruptedException {
//    }

    @AfterMethod
    protected void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
        logger.info("Browser closed");
    }



}
