	package problem3;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String string1=sc.nextLine();
		
		String[] splited1= string1.split("\\s+");
		
		for(int i=0;i<100;i++){
		String string2=sc.nextLine();
		if(string2.equals("what does the fox say?")){
			break;
		}
		String[] splited2 = string2.split(" goes ");
		String last=splited2[1].substring(splited2[1].lastIndexOf(" ")+1).trim();
		
		string1 = string1.replace(last,"");
		}
		System.out.println(string1);
//		String[] splited1= string1.split("\\s+");
//		int stringIndex =1;
//		
//		for(String split1 : splited1){
//			if(stringIndex<100){
//			if(!split1.equals( "woof") && !split1.equals( "blub") && !split1.equals( "toot") && !split1.equals( "ow")){
//			System.out.print(split1+" ");
//			}
//			stringIndex++;
//			}
//			else 
//				System.out.println("words should be less than 100");
	}

}