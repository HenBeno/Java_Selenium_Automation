package test.java.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FBMainPage {
    @FindBy(how = How.XPATH,using ="//span[text()='Lior Cohen']" )
    public WebElement userName;
}
