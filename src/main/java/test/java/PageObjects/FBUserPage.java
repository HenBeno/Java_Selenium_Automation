package test.java.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FBUserPage {

    @FindBy(how = How.XPATH, using = "//div[@aria-label='Add cover photo']")
    public WebElement addCoverPhotoBtn;

    @FindBy(how = How.XPATH, using = "(//input)[5]")
    public WebElement uploadImageBtn;
    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Save changes')])[2]")
    public WebElement saveChangesBtn;



}
//span[contains(text(),'Upload photedo')]