package automation;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Automation {

	public static void main(String[] args) {
		Automation automation = new Automation();
		automation.PathInput();
	}
	
	public void PathInput(){
		System.out.println("Enter the path: "); //Takes the input of the path 
		Scanner sc = new Scanner(System.in);
		String path = sc.next();
		File currentDir = new File(path); 
		displayDirectoryContents(currentDir);
	}
	

	public static void displayDirectoryContents(File dir) {
		try {
			File[] files = dir.listFiles();
			//Recursive traversal Operation
			for (int i=files.length-1; i>=0;i--) {
				if (files[i].isDirectory()) {
					System.out.println("directory:" + files[i].getCanonicalPath()); // Prints the path of directory
					displayDirectoryContents(files[i]);
				} else {
					System.out.println("file:" + files[i].getCanonicalPath()); // Prints the path of file
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}