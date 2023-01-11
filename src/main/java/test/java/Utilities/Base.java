package test.java.Utilities;


import org.apache.logging.log4j.*;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import test.java.Extensions.UiActions;
import test.java.PageObjects.*;

import java.io.Writer;
import java.util.Properties;

import static test.java.Utilities.GetDataFromXml.getDataFromXml;

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
    protected static HSSFWorkbook workbook;
    protected static HSSFSheet worksheet;
    protected static DataFormatter formatter= new DataFormatter();
    protected static String SheetName= "data";
    protected static  String file_location = "src/main/resources/Credentials.xlsx";
    protected static String Res;
//    Write obj1=new Write();
    public int DataSet=-1;

}
