package clothes;


import java.io.IOException;


public class ClothItem {

	//ClothItem class is created which is changed according to interface ClothStore...
	public void weather(ClothStore store) throws IOException
	{
		store.weather();
	}

}
