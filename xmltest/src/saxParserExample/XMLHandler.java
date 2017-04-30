package saxParserExample;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLHandler extends DefaultHandler{
	
	private Breakfast_Menu breakfastMenu;
	private String elementName;
	private Food food;
	
	public Breakfast_Menu getBreakfast_Menu() {
		
		return breakfastMenu;
	}
	
	@Override
	public void startDocument() throws SAXException {
		breakfastMenu = new Breakfast_Menu();
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		
		if(attributes.getLength()>0){
		String attributeName=attributes.getQName(0);
		System.out.println(attributeName);
		System.out.println(attributes.getValue(attributeName));
		}
		if(qName.equals("food")){
			food = new Food();
		}
		elementName=qName;
	}
	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		switch(elementName){
		case "name":
			food.setName(new String(ch, start, length));
			break;
		case "price":
			food.setPrice(Double.parseDouble(new String(ch, start, length)));
			break;
		case "description":
			food.setDescription(new String(ch, start,length));
			break;
		case "calories":
			food.setCalories(Double.parseDouble(new String(ch, start, length)));
			break;
		default:
			break;
		}
		
		System.out.println(new String(ch,start,length));
	}
	
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		if(qName.equals("food")){
			breakfastMenu.getFoodList().add(food);
			food=null;
		}
		
		elementName="";
	}
	
	@Override
	public void endDocument() throws SAXException {
		
	}

	
}
