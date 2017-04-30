package clothes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// Created a class summer which implements interface ClothStore...
public class Summer implements ClothStore {

	File file = new File ("C:/Users/geethika/Desktop/file.txt");
    
     
	
	// Override the method named weather in interface ClothStore...
	@Override
	public void weather() throws IOException {
		PrintWriter printWriter = new PrintWriter (new FileWriter(file,true));
		printWriter.print("Summer: \n\t Shots \n\tTan tops \n\tT-shirts");
		printWriter.close (); 
	}


}
