package test.java.Utilities;


import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.java.Extensions.UiActions;
import test.java.PageObjects.*;

import java.util.Properties;


public class Base {

    protected final static String USERNAME = "yossidavidov346@gmail.com";
    protected final static String PASSWORD = "yossi96";
    protected static WebDriver driver;

    protected static UiActions action;

    protected static Actions actions;

    protected static Logger logger;

    protected static String LOG_FILE;

    protected static Properties properties;

    // Page Objects

    protected static WebDriverWait wait;

    protected static MainPage mainPage;

    protected static LoginPage loginPage;

    protected static ProfilePage profilePage;

    protected static TopMenuBarPage topMenuBarPage;
    protected static LoginPageFB loginPageFB;
    protected static PageAfterLogin pageAfterLogin;

}
