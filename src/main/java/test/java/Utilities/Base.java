package test.java.Utilities;


import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.java.Extensions.UiActions;
import test.java.PageObjects.*;

import java.util.Properties;

import static test.java.Utilities.GetDataFromXml.getDataFromXml;

//User name: yegati8771@dewareff.com
//Pass: Lior96
//
//        User name: yofigi5953@dewareff.com
//Pass: Topaz96
public class Base {
    // TODO: 05-Jan-23 make external file or use some database for users list, generate more users
    protected static String username1;

    static {
        try {
            username1 = getDataFromXml("Data", "userName1");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected static String password1;

    static {
        try {
            password1 = getDataFromXml("Data", "password1");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected static String username2;

    static {
        try {
            username2 = getDataFromXml("Data", "userName2");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected static String password2;

    static {
        try {
            password2 = getDataFromXml("Data", "password1");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    // TODO: 05-Jan-23 Delete extra classes and rename Classes  
    protected static WebDriver driver;
    protected static UiActions action;
    protected static Actions actions;

    protected static Logger logger;
    protected static String LOG_FILE;
    protected static Properties properties;
    protected static WebDriverWait wait;


    // Page Objects
    protected static LoginPageFB loginPageFB;
    protected static FBMainPage fbMainPage;
    protected static FBTopMenu fbTopMenu;
    protected static FBLeftMenu fbLeftMenu;
    protected static FBUserPage fbUserPage;
    protected static FBProfilePage fbProfilePage;

}
