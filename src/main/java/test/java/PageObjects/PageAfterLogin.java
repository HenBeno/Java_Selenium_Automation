package test.java.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import test.java.Extensions.UiActions;
//
public class PageAfterLogin {
    @FindBy(how = How.XPATH,using ="//span[text()='Yossi Davidov']" )
    public WebElement userName;





}
