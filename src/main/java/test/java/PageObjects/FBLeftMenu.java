package test.java.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FBLeftMenu {
    @FindBy(how = How.XPATH,using ="//span[text()='Lior Cohen']" )
    public WebElement userName;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Find Friends')]")
    public WebElement findFriendsBtn;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Most Recent')]")
    public WebElement mostRecentBtn;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Welcome')]")
    public WebElement WelcomBtn;


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Groups')]")
    public WebElement groupsBtn;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'MarketPlace')]")
    public WebElement marketPlaceBtn;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Watch')]")
    public WebElement watchBtn;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Memories')]")
    public WebElement memoriesBtn;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Saved')]")
    public WebElement savedBtn;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Pages')]")
    public WebElement pagesBtn;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Reels')]")
    public WebElement reelsBtn;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'See more')]")
    public WebElement seeMoreBtn;
    //Pay attention elements below the see more button are visible only after clicking on see more button;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Ad Center')]")
    public WebElement adCenterBtn;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Ads Manager')]")
    public WebElement addsManagerBtn;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Climate Science Center')]")
    public WebElement climateScienceCenterBtn;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Crisis response')]")
    public WebElement crisisResponseCenterBtn;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Events')]")
    public WebElement eventsBtn;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Facebook Pay')]")
    public WebElement facebookPayBtn;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Fundraisers')]")
    public WebElement fundrisersBtn;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Gaming Video')]")
    public WebElement gamingVideoBtn;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Messenger')]")
    public WebElement messengerBtn;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Play Games')]")
    public WebElement playGamesBtn;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Recent ad activity')]")
    public WebElement recentAdActivityBtn;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'See less')]")
    public WebElement seeLessBtn;






}
