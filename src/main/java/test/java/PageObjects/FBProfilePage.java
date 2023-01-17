package test.java.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class FBProfilePage {
    @FindBy(how = How.XPATH, using = "//div[@data-pagelet='ProfileTabs']//*[contains(text(),'Posts')]")
    private WebElement postsBtn;

    @FindBy(how = How.XPATH, using = "//div[@data-pagelet='ProfileTabs']//a[contains(@href,'sk=about')]")
    private WebElement aboutBtn;

    @FindBy(how = How.XPATH, using = "//div[@data-pagelet='ProfileTabs']//a[contains(@href,'sk=friends')]")
    private WebElement friendsBtn;

    @FindBy(how = How.XPATH, using = "//div[@data-pagelet='ProfileTabs']//a[contains(@href,'sk=photos')]")
    private WebElement photosBtn;

    @FindBy(how = How.XPATH, using = "//div[@data-pagelet='ProfileTabs']//a[contains(@href,'sk=videos')]")
    private WebElement videosBtn;

    @FindBy(how = How.XPATH, using = "//div[@data-pagelet='ProfileTabs']//a[contains(@href,'sk=map')]")
    private WebElement mapBtn;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'mind?')]")
    private WebElement clickToOpenTextAreaNewPosts;

    @FindBy(how = How.XPATH, using = "//div[@role='presentation']//p")
    private WebElement textAreaNewPosts;

    @FindBy(how = How.XPATH, using = "//div[@aria-label='Post']")
    private WebElement senNewPostBtn;

    @FindBy(how = How.XPATH, using = "//div[@data-pagelet='ProfileTimeline']//div[@dir='auto']")
    private List<WebElement> postsTextList;
    @FindBy(how = How.XPATH, using = "//div[@aria-label='Update profile picture']")
    private WebElement updateProfilePicture;
    @FindBy(how = How.XPATH, using = "//div[@aria-label='Upload photo']")
    private WebElement uploadProfilePictureBtn;
    @FindBy(how = How.XPATH, using = "//div[@aria-label='Save']")
    private WebElement saveProfilePhoto;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),\" updated his profile picture.\")]")
    private WebElement uptdatedHisProfilePhotTxt;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'1m')]")
    private WebElement pictureUpdateTime;
    @FindBy(how = How.XPATH, using = "//div[@aria-label='Edit Privacy']")
    private WebElement postPrivacyOptions;
    @FindBy(how = How.XPATH, using = "//div[@class='xu06os2 x1ok221b']/span[text()='Friends']")
    private WebElement postPrivacyFriends;
    @FindBy(how = How.XPATH, using = "//span[text()='Only me']")
    private WebElement postPrivacyOnlyMe;
    @FindBy(how = How.XPATH, using = "//span[text()='Public']")
    private WebElement postPrivacyPublic;

    @FindBy(how = How.XPATH, using = "//span[text()='Done']")
    private WebElement newPostDoneBtn;

    @FindBy(how = How.XPATH, using = "//div[@data-pagelet='ProfileTimeline']/div[1]//*[contains(text(),'Only')]")
    private WebElement onlyMeChecker;

    @FindBy(how = How.XPATH, using = "//div[@data-pagelet='ProfileTimeline']/div[1]//*[contains(text(),'Public')]")
    private WebElement publicChecker;

    @FindBy(how = How.XPATH, using = "//div[@data-pagelet='ProfileTimeline']/div[1]//*[contains(text(),'friends')]")
    private WebElement friendsChecker;
    @FindBy(how = How.XPATH, using = "//span[@class='xzpqnlu x179tack x10l6tqk']")
    private WebElement currentPrivacyValue;
    @FindBy(how = How.XPATH, using = "//div[@aria-label='Save']")
    private WebElement savePrivacyChoice;


    //span[@class='xzpqnlu x179tack x10l6tqk']

    public WebElement getCurrentPrivacyValue() {
        return this.currentPrivacyValue;
    }

    public WebElement getPublicChecker() {
        return this.publicChecker;
    }

    public WebElement getFriendsChecker() {
        return this.friendsChecker;
    }

    public WebElement getSavePrivacyChoice() {
        return this.savePrivacyChoice;
    }

    public WebElement getPostPrivacyPublic() {
        return this.postPrivacyPublic;
    }

    public WebElement getOnlyMeChecker() {
        return this.onlyMeChecker;
    }

    public WebElement getNewPostDoneBtn() {
        return this.newPostDoneBtn;
    }

    public WebElement getPostPrivacyOnlyMe() {
        return this.postPrivacyOnlyMe;
    }

    public WebElement getPostPrivacyFriends() {
        return this.postPrivacyFriends;
    }

    public WebElement getPostPrivacyOptions() {
        return this.postPrivacyOptions;
    }

    public WebElement getPostsBtn() {
        return this.postsBtn;
    }

    public WebElement getAboutBtn() {
        return this.aboutBtn;
    }

    public WebElement getFriendsBtn() {
        return this.friendsBtn;
    }

    public WebElement getPhotosBtn() {
        return this.photosBtn;
    }

    public WebElement getVideosBtn() {
        return this.videosBtn;
    }

    public WebElement getMapBtn() {
        return this.mapBtn;
    }

    public WebElement getClickToOpenTextAreaNewPosts() {
        return this.clickToOpenTextAreaNewPosts;
    }

    public WebElement getTextAreaNewPosts() {
        return this.textAreaNewPosts;
    }

    public WebElement getSenNewPostBtn() {
        return this.senNewPostBtn;
    }

    public List<WebElement> getPostsTextList() {
        return this.postsTextList;
    }

    public WebElement getUpdateProfilePicture() {
        return this.updateProfilePicture;
    }

    public WebElement getUploadProfilePictureBtn() {
        return this.uploadProfilePictureBtn;
    }

    public WebElement getSaveProfilePhoto() {
        return this.saveProfilePhoto;
    }

    public WebElement getUptdatedHisProfilePhotTxt() {
        return this.uptdatedHisProfilePhotTxt;
    }

    public WebElement getPictureUpdateTime() {
        return this.pictureUpdateTime;
    }
}
