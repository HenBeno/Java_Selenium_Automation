package test.java.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import test.java.Extensions.UiActions;
//
public class LoginPageFB {
    @FindBy(how = How.XPATH,using ="//input[@id='email']" )
    public WebElement loginInput;
    @FindBy(how = How.XPATH,using ="//input[@id='pass']" )
    public WebElement passwordInput;
    @FindBy(how = How.XPATH,using ="//button[@name='login']" )
    public WebElement loginBtn;




}
