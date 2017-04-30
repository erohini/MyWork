package clothes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// Created a class summer which implements interface ClothStore...
public class Wind implements ClothStore {

	File file = new File ("C:/Users/geethika/Desktop/file.txt");
    
     
	
	// Override the method named weather in interface ClothStore...
	@Override
	public void weather() throws IOException {
		PrintWriter printWriter = new PrintWriter (new FileWriter(file,true));
		printWriter.print("Wind: \n\t Scarves");
		printWriter.close (); 
	}


}
