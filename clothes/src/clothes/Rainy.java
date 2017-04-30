package clothes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//Created a class rainy which implements interface ClothStore...
public class Rainy implements ClothStore {


	File file = new File ("C:/Users/geethika/Desktop/file.txt");
	// Override the method named weather in interface ClothStore...
	@Override
	public void weather() throws IOException {
		PrintWriter printWriter = new PrintWriter (new FileWriter(file,true));
		printWriter.append("\nRainy: \n\tRain coats \n\tcoats");
		printWriter.close (); 
		
	}

}
