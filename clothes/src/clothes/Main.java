package clothes;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		//Objects are created for ClassStore according to the classes...
		ClothStore summer=new Summer();
		ClothStore winter=new Winter();
		ClothStore rainy=new Rainy();
		ClothStore fall=new Fall();		
		ClothStore wind=new Wind();
		
		//To display the items according to the weather....
		ClothItem item1=new ClothItem();
		item1.weather(summer);
		ClothItem item2=new ClothItem();
		item2.weather(winter);
		ClothItem item3=new ClothItem();
		item3.weather(rainy);
		ClothItem item4=new ClothItem();
		item4.weather(fall);
		ClothItem item5=new ClothItem();
		item5.weather(wind);
		
		 
	}

}
