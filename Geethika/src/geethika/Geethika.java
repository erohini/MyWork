package geethika;


import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map.Entry;
import java.util.Scanner;

public class Geethika {
	private static Scanner sc;

	public static void main(String[] args) throws IOException {
		try{
		sc = new Scanner(System.in);
		System.out.println("Enter Option: \n1. State \n2. Abbrevation");
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			System.out.println("Enter state: ");
				String s=sc.next();
				FileReader fi1 = new FileReader("C:/Users/rohini/Desktop/Geethika/statesplusAbbrev.txt");
				FileReader fi2 = new FileReader("C:/Users/rohini/Desktop/Geethika/AbbrevPlusPOP.txt");
				
				Scanner sc1 = new Scanner(fi1);
				Scanner sc2 = new Scanner(fi2);
				HashMap<String, String> states = new HashMap<String, String>();
				HashMap<String, String> abbrevations = new HashMap<String, String>();
				
				while(sc1.hasNext()) {
					String[] line1 = sc1.nextLine().split(",");
					String state = line1[0];
					String abbrev = line1[1];
					states.put(state, abbrev);
						}
				
				while(sc2.hasNext()) {
					String[] line2 = sc2.nextLine().split("\\t");
					String abb = line2[0];
					String pop = line2[1];
					abbrevations.put(abb, pop);
						}
				
				for(Entry<String ,String> entry1 : states.entrySet()){
					if(entry1.getKey().equals(s)){
						for(Entry<String ,String> entry2 : abbrevations.entrySet()){
							if(entry2.getKey().equals(entry1.getValue())){
								System.out.println(entry2.getValue());
							}
						}
					}
				}
				break;
				
		case 2:
			System.out.println("Enter State Abbrevation: ");
			String a=sc.next();
			FileReader file2 = new FileReader("C:/Users/rohini/Desktop/Geethika/AbbrevPlusPOP.txt");
			Scanner sca2 = new Scanner(file2);
			HashMap<String, String> abbr = new HashMap<String, String>();
			while(sca2.hasNext()) {
				String[] line2 = sca2.nextLine().split("\\t");
				String abb = line2[0];
				String pop = line2[1];
				abbr.put(abb, pop);
					}
			for(Entry<String ,String> entry2:abbr.entrySet()){
				if(entry2.getKey().equals(a)){
					System.out.println(entry2.getValue());
				}
			}
			break;
		default:
			System.out.println("Invalid input...");
		}
		}
		catch(InputMismatchException e){
			System.out.println("Improper input...");
		}
	}
		
}

