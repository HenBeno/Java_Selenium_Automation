package test.java.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FBTopMenu {
    @FindBy(how = How.XPATH,using ="//div[@role='banner']//a[@aria-label='Home']" )
    public WebElement homeBtn;

    @FindBy(how = How.XPATH,using ="//div[@role='banner']//a[@aria-label='Friends']" )
    public WebElement friendsBtn;

    @FindBy(how = How.XPATH,using ="//div[@role='banner']//a[@aria-label='Groups']" )
    public WebElement groupsBtn;
}
