package clothes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//Created a class winter which implements interface ClothStore...
public class Winter implements ClothStore {
	
	File file = new File ("C:/Users/geethika/Desktop/file.txt");

	// Override the method named weather in interface ClothStore...
	@Override
	public void weather() throws IOException {
		PrintWriter printWriter = new PrintWriter (new FileWriter(file,true));
		printWriter.append("\nWinter: \n\tJackets \n\tjeans \n\tHoodies");
		printWriter.close (); 
		
	}

}
