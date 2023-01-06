package test.java.Utilities;

import test.java.PageObjects.*;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager extends Base{
    public static void  initWebPage(){
        mainPage = PageFactory.initElements(driver,MainPage.class);
//        PageFactory.initElements(new FieldContextDecorator(new ElementContextLocatorFactory(driver)), MainPage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
//        PageFactory.initElements(new FieldContextDecorator(new ElementContextLocatorFactory(driver)), LoginPage.class);
        profilePage = PageFactory.initElements(driver, ProfilePage.class);
//        PageFactory.initElements(new FieldContextDecorator(new ElementContextLocatorFactory(driver)), PageObjectManager.class);
        topMenuBarPage = PageFactory.initElements(driver, TopMenuBarPage.class);
//        PageFactory.initElements(new FieldContextDecorator(new ElementContextLocatorFactory(driver)), TopMenuBarPage.class);
        loginPageFB = PageFactory.initElements(driver, LoginPageFB.class);
        FBMainPage = PageFactory.initElements(driver, FBMainPage.class);

    }
    }


