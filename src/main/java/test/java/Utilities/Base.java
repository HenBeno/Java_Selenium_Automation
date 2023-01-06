package test.java.Utilities;


import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.java.Extensions.UiActions;
import test.java.PageObjects.*;

import java.util.Properties;

//User name: yegati8771@dewareff.com
//Pass: Lior96
//
//        User name: yofigi5953@dewareff.com
//Pass: Topaz96
public class Base {
    // TODO: 05-Jan-23 make external file or use some database for users list, generate more users
    protected final static String USERNAME_1 = "yegati8771@dewareff.com"; //Lior Cohen
    protected final static String PASSWORD_1 = "Lior96";
    protected final static String USERNAME_2 = "yofigi5953@dewareff.com"; //Topaz Kaldon
    protected final static String PASSWORD_2 = "Topaz96";


    // TODO: 05-Jan-23 Delete extra classes and rename Classes  
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
    protected static FBMainPage fbMainPage;
    protected static FBTopMenu fbTopMenu;
    protected static FBLeftMenu fbLeftMenu;
    protected static FBUserPage fbUserPage;

}
