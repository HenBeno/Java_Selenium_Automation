package test.java.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import test.java.Extensions.UiActions;

//
public class LoginPageFB {
    @FindBy(how = How.XPATH, using = "//input[@id='email']")
    private WebElement loginInput;
    @FindBy(how = How.XPATH, using = "//input[@id='pass']")
    private WebElement passwordInput;
    @FindBy(how = How.XPATH, using = "//button[@name='login']")
    private WebElement loginBtn;

    public void loginToFB(String userName, String pass) {
        UiActions.UpdateText(loginInput, userName);
        UiActions.UpdateText(passwordInput, pass);
        UiActions.click(loginBtn);
    }
}
