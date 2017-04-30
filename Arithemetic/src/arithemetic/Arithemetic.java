package arithemetic;

public class Arithemetic {

	public static void main(String[] args) {
		System.out.println("Enter first operand: ");
		System.out.println("Enter second operand: ");
		System.out.println("Enter operator: ");
		/*if (args.length==0)
		{
			System.out.println("Arguments are not passed...");
		}*/

		int operand1=Integer.parseInt(args[0]);
		int operand2=Integer.parseInt(args[1]);
		char operator=args[2].charAt(0);
		System.out.println(args[0]+args[2]+args[1]+"=");
		
		switch(operator)
		{
		case('+'): System.out.println(operand1+operand2);break;
		case('-'): System.out.println(operand1-operand2);break;
		case('*'): System.out.println(operand1*operand2);break;
		case('/'): System.out.println(operand1/operand2);break;
		default:
			System.out.println("Error in entering operator");
		}
		
	

	}

}
