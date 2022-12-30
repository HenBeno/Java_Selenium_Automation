package test.java.PageObjects;

import test.java.Extensions.UiActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import test.java.Utilities.Base;

public class MainPage extends Base {

    WebDriver driver;

//    Locators for the page title and the logout button
    @FindBy(how = How.XPATH,using ="//div[@class='card-body']/*[@href='navigation1.html']" )
    public WebElement navigationBtn;
    @FindBy(how = How.XPATH,using ="//div[@class='card-body']/*[@href='web-form.html']" )
    public WebElement webFormText;
    @FindBy(how = How.XPATH,using ="//p[@class='lead']/a[text()='GitHub']" )
    public WebElement gitBtn;
    @FindBy(how = How.XPATH,using ="//article//a/img[contains(@src, 'https://avatars.githubusercontent.com')]" )
    public WebElement gitLogo;
    @FindBy(how = How.XPATH,using ="//a[@title='LICENSE']" )
    public WebElement licenseElm;


    public void clickNavigationBtn(){
        UiActions.click(navigationBtn);
    }

    public void clickGitBtn(){
        UiActions.click(gitBtn);
    }

    public String getWebFormText(){
        return UiActions.getText(navigationBtn);
    }

}