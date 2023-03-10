package test.java.Utilities;

import org.openqa.selenium.support.PageFactory;
import test.java.PageObjects.*;

public class PageObjectManager extends Base {
    public static void initWebPage() {

        loginPageFB = PageFactory.initElements(driver, LoginPageFB.class);
        fbMainPage = PageFactory.initElements(driver, FBMainPage.class);
        fbTopMenu = PageFactory.initElements(driver, FBTopMenu.class);
        fbLeftMenu = PageFactory.initElements(driver, FBLeftMenu.class);
        fbProfilePage = PageFactory.initElements(driver, FBProfilePage.class);

    }
}


