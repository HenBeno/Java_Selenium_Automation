package test.java.Utilities;

import test.java.PageObjects.*;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager extends Base {
    public static void initWebPage() {

        loginPageFB = PageFactory.initElements(driver, LoginPageFB.class);
        fbMainPage = PageFactory.initElements(driver, FBMainPage.class);
        fbTopMenu = PageFactory.initElements(driver, FBTopMenu.class);
        fbLeftMenu = PageFactory.initElements(driver, FBLeftMenu.class);
        fbUserPage = PageFactory.initElements(driver, FBUserPage.class);

    }
}


