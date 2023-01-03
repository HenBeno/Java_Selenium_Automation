package test.java.Utilities;

import io.selenium.utils.ElementContextLocatorFactory;
import io.selenium.utils.FieldContextDecorator;
import test.java.PageObjects.LoginPage;
import test.java.PageObjects.MainPage;
import test.java.PageObjects.ProfilePage;
import test.java.PageObjects.TopMenuBarPage;
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
    }

}
