package test.java.PageObjects;

import test.java.Extensions.UiActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import test.java.Utilities.Base;
import test.java.Utilities.CommonOps;

import java.util.List;

public class MainPage extends CommonOps {

//    WebDriver driver;

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
    @FindBy(how = How.XPATH,using ="//turbo-frame" )
    public List<WebElement> turboFrameElements;
    @FindBy(how = How.XPATH,using ="//h2[@class='Box-title']" )
    public WebElement readMeHeader;
    @FindBy(how = How.XPATH,using ="//a[@href='https://github.com/'][1]" )
    public WebElement gitSmallLogo;



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