package kavya;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ModifyXMLFile {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerFactoryConfigurationError, TransformerException {
		Properties prop=new Properties();
		InputStream input = new FileInputStream("xmltest.properties");
		
		prop.load(input);
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		
		File file = new File(prop.getProperty("inputFilePath"));
		//System.out.println(file.getAbsolutePath());
		Document doc = db.parse(file);
		Node rootnode = doc.getFirstChild();
		System.out.println(rootnode.getNodeName());
		NodeList orderList = doc.getElementsByTagName("orderStatus");
		//System.out.println(nodelist.getLength());
		
		for( int i=0; i<orderList.getLength();i++){
			Node node = orderList.item(i);
			Element e= (Element) node;
			NodeList nodeList = e.getElementsByTagName("originatingSystemOrderID");
			String originatingSystemOrderID=nodeList.item(0).getChildNodes().item(0).getNodeValue();
			System.out.println(originatingSystemOrderID);
			

			
			if(originatingSystemOrderID.matches(prop.getProperty("searchString"))){
				node.getParentNode().removeChild(node);
				i--;
			}
			
		}
		
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File(prop.getProperty("outputFilePath")));
		transformer.transform(source, result);
		System.out.println("File has been written...");

	}

}
