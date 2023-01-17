package test.java.Utilities;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.Objects;


public class GetDataFromXml {
    public static String getDataFromXml(String dataType, String tagName) throws Exception {
        Document doc;
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        if (Objects.equals(dataType, "Config")) {
            doc = dBuilder.parse("src/main/resources/configuration.xml");
        } else if (Objects.equals(dataType, "Data")) {
            doc = dBuilder.parse("src/main/resources/testData.xml");
        } else {
            doc = dBuilder.parse("src/main/resources/testData.xml");
        }
        doc.getDocumentElement().normalize();
        return doc.getElementsByTagName(tagName).item(0).getTextContent();
    }

}
