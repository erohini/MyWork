package xmltest;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Test {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException{
		// call Dom parser
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		
		File file = new File("xmltest.xml");
		//db.parse(file);
		
		////document object represents DOM tree
		Document doc = db.parse(file);
		Node rootnode = doc.getFirstChild();
		System.out.println(rootnode.getNodeName());
		NodeList nodelist = rootnode.getChildNodes();
		
		for( int i=0; i<nodelist.getLength();i++){
			Node node = nodelist.item(i);
			System.out.println(node.getNodeName());
			if(node.getNodeType() == Node.ELEMENT_NODE){
					System.out.println(node.getNodeName());
					NodeList childNodeList = node.getChildNodes();
					for(int j=0; j<childNodeList.getLength();j++){
						Node childNode = childNodeList.item(j);
						if(childNode.getNodeType()== Node.ELEMENT_NODE){
							System.out.println(childNode.getFirstChild().getTextContent());
						}
					}
			}
		}
	}

}
