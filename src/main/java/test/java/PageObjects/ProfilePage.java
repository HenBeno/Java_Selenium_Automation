package test.java.PageObjects;

import test.java.Extensions.UiActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProfilePage {
    @FindBy(how = How.XPATH,using ="//div[@class='card-body']/*[@href='navigation1.html']" )
    public WebElement placeHolder1;
    @FindBy(how = How.XPATH,using ="//div[@class='card-body']/*[@href='web-form.html']" )
    public WebElement placeHolder2;

    public void clickNavigationBtn(){
        UiActions.click(placeHolder1);
    }

    public String getWebFormText(){
        return UiActions.getText(placeHolder2);
    }
}
