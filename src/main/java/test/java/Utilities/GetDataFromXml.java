package test.java.Utilities;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.Objects;


public class GetDataFromXml {
    public static String getDataFromXml(String dataType, String tagName) throws Exception {
        Document doc;
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        if (Objects.equals(dataType, "Config")){
            doc = dBuilder.parse("src/main/resources/configuration.xml");
        }
        else if (Objects.equals(dataType, "Data")) {
            doc = dBuilder.parse("src/main/resources/testData.xml");
        }
        else {
            doc = dBuilder.parse("src/main/resources/testData.xml");
        }
        doc.getDocumentElement().normalize();
        return doc.getElementsByTagName(tagName).item(0).getTextContent();
    }

}
