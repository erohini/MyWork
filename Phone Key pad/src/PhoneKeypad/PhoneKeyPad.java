package PhoneKeypad;

import java.util.Scanner;

public class PhoneKeyPad {
	
	public void getNumber(char ch) {
		if(ch=='A'||ch=='B'||ch=='C')
			//return 2;
			System.out.println("2");
		
		else if(ch=='D'||ch=='E'||ch=='F')
			//return 3;
			System.out.println("3");
		
		else if(ch=='G'||ch=='H'||ch=='I')
		   // return 4;
			System.out.println("4");
		
		else if(ch=='J'||ch=='K'||ch=='L')
			//return 5;
			System.out.println("5");
		
		else if(ch=='M'||ch=='N'||ch=='O')
			//return 6;
			System.out.println("6");
		
		else if(ch=='P'||ch=='Q'||ch=='R'||ch=='S')
			//return 7;
			System.out.println("7");
		
		else if(ch=='T'||ch=='U'||ch=='V')
			//return 8;
			System.out.println("8");
		
		else if(ch=='W'||ch=='X'||ch=='Y'||ch=='Z')
			//return 9;
			System.out.println("9");
		
			else
				//return 0;
				System.out.println("0");
		}
	
	public PhoneKeyPad()
	{
		String input;
		String output="";
		Scanner in=new Scanner(System.in);
		System.out.println("Enter string: ");
		input=in.next().toLowerCase();
		
		System.out.println("char is: "+input);
		
		for(int i=0;i<input.length();i++)
		{
		char c = input.charAt(i);
		getNumber(c);
		//if(Character.isLetter(c))
		//{
		//int digit=getNumber(c);
		//System.out.print("number is: "+digit);
		//output=output+digit;
		//}
		//else
		//{
		//	output=output+c;
		//}
		}
		
				
	}

}










/*import java.util.*;
public class PhoneKeyPad {
    public static void main(String[] args){
        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);

         
       String phNumber = input.next();

        String output = "";

        for(int i = 0 ; i < phNumber.length() ; i++){

            char ch = Character.toUpperCase(phNumber.charAt(i));
            if(Character.isLetter(ch)){
                int digit = getNumber(ch);

                output = output + digit;

            }

            else{

                output = output + ch;

            }

        }

          System.out.println(output);

    }

    public static int getNumber(char upperCaseLetter){

        if(upperCaseLetter == 'A' || upperCaseLetter=='B'

                                    || upperCaseLetter == 'C')

            return 2;

        else if(upperCaseLetter == 'D' || upperCaseLetter=='E'

                                         || upperCaseLetter == 'F')

            return 3;

        else if(upperCaseLetter == 'G' || upperCaseLetter=='H'

                                         || upperCaseLetter == 'I')

            return 4;

        else if(upperCaseLetter == 'J' || upperCaseLetter=='K'

                                         || upperCaseLetter == 'L')

            return 5;

        else if(upperCaseLetter == 'M' || upperCaseLetter=='N'

                                         || upperCaseLetter == 'O')

            return 6;
        else if(upperCaseLetter == 'P' || upperCaseLetter=='Q'

                                         || upperCaseLetter == 'R')

            return 7;

        else if(upperCaseLetter == 'S' || upperCaseLetter =='T'

                                         || upperCaseLetter == 'U')

            return 8;

        else if(upperCaseLetter == 'V' || upperCaseLetter=='W'

              || upperCaseLetter == 'Y' || upperCaseLetter == 'Z')

            return 9;

        else

            return 0;

    }

 }*/

