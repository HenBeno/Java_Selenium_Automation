package test.java.Utilities;


import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bson.Document;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import test.java.Extensions.UiActions;
import test.java.PageObjects.*;

//User name: yegati8771@dewareff.com
//Pass: Lior96
//
//        User name: yofigi5953@dewareff.com
//Pass: Topaz96
public class Base {

    // TODO: 05-Jan-23 Delete extra classes and rename Classes  
    protected static WebDriver driver;
    protected static UiActions action;
    protected static Actions actions;

    protected static Logger logger;
    protected static WebDriverWait wait;


    // Page Objects
    protected static LoginPageFB loginPageFB;
    protected static FBMainPage fbMainPage;
    protected static FBTopMenu fbTopMenu;
    protected static FBLeftMenu fbLeftMenu;

    protected static FBProfilePage fbProfilePage;


    protected static SoftAssert softAssert;


    //DDT
    protected static XSSFWorkbook workbook;
    protected static XSSFSheet worksheet;
    protected static DataFormatter formatter = new DataFormatter();
    protected static String SheetName = "data";
    protected static String file_location = "src/main/resources/Credentials.xlsx";
    protected static String Res;
    //DB
    protected static MongoClient client;
    protected static MongoDatabase db;
    protected static MongoCollection<Document> collection;
    //    Write obj1=new Write();
    public int DataSet = -1;

}
