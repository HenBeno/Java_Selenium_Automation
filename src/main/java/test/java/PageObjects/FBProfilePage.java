package test.java.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class FBProfilePage {
    @FindBy(how = How.XPATH,using ="//div[@data-pagelet='ProfileTabs']//*[contains(text(),'Posts')]" )
    public WebElement postsBtn;

    @FindBy(how = How.XPATH,using ="//div[@data-pagelet='ProfileTabs']//a[contains(@href,'sk=about')]" )
    public WebElement aboutBtn;

    @FindBy(how = How.XPATH,using ="//div[@data-pagelet='ProfileTabs']//a[contains(@href,'sk=friends')]" )
    public WebElement friendsBtn;

    @FindBy(how = How.XPATH,using ="//div[@data-pagelet='ProfileTabs']//a[contains(@href,'sk=photos')]" )
    public WebElement photosBtn;

    @FindBy(how = How.XPATH,using ="//div[@data-pagelet='ProfileTabs']//a[contains(@href,'sk=videos')]" )
    public WebElement videosBtn;

    @FindBy(how = How.XPATH,using ="//div[@data-pagelet='ProfileTabs']//a[contains(@href,'sk=map')]" )
    public WebElement mapBtn;

    @FindBy(how = How.XPATH,using ="//span[contains(text(),'mind?')]" )
    public WebElement clickToOpenTextAreaNewPosts;

    @FindBy(how = How.XPATH,using ="//div[@role='presentation']//p" )
    public WebElement textAreaNewPosts;

    @FindBy(how = How.XPATH,using ="//div[@aria-label='Post']" )
    public WebElement senNewPostBtn;

    @FindBy(how = How.XPATH,using ="//div[@data-pagelet='ProfileTimeline']//div[@dir='auto']" )
    public List<WebElement> postsTextList;

}
