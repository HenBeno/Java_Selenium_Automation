package test.java.Utilities;

import org.openqa.selenium.interactions.Actions;
import test.java.Extensions.UiActions;
import test.java.PageObjects.LoginPage;
import test.java.PageObjects.MainPage;
import test.java.PageObjects.ProfilePage;
import test.java.PageObjects.TopMenuBarPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
    protected static WebDriver driver;

    protected static UiActions action;

    protected static Actions actions;

    // Page Objects

    protected  static WebDriverWait wait;

    protected static MainPage mainPage;

    protected static LoginPage loginPage;

    protected static ProfilePage profilePage;

    protected static TopMenuBarPage topMenuBarPage;

}
