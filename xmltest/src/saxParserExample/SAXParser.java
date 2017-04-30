package saxParserExample;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
public class SAXParser {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		javax.xml.parsers.SAXParser saxParser = saxParserFactory.newSAXParser();
		
		XMLHandler xmlHandler = new XMLHandler();
		saxParser.parse(new File("xmlTest.xml"),xmlHandler );
		
		Breakfast_Menu breakfastMenu = xmlHandler.getBreakfast_Menu();
		
		for(Food food:breakfastMenu.getFoodList()){
			System.out.println("Name: "+food.getName());
			System.out.println("Price: "+food.getPrice());
			System.out.println("Description: "+food.getDescription());
			System.out.println("Calories: "+food.getCalories());
		}
	}

}
