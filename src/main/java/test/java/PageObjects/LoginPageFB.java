package test.java.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import test.java.Extensions.UiActions;
//
public class LoginPageFB {
    @FindBy(how = How.XPATH,using ="//input[@id='email']" )
    private static WebElement loginInput;
    @FindBy(how = How.XPATH,using ="//input[@id='pass']" )
    private static WebElement passwordInput;
    @FindBy(how = How.XPATH,using ="//button[@name='login']" )
    private static WebElement loginBtn;

    public void login(String userName, String password){
        UiActions.UpdateText(loginInput, userName);
        UiActions.UpdateText(passwordInput, password);
        UiActions.click(loginBtn);
    }



}
