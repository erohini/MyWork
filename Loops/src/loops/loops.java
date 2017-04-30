package loops;

public class loops {

	public static void main(String[] args) {
		for(int a=1;a<=110;a++)
		{
			if(a%3==0){
				System.out.print("Coza ");
			}
			else if(a%5==0){
				System.out.print("Loza ");
			}
			else if(a%7==0){
				System.out.print("Woza ");
			}
			else if(a%3==0 && a%5==0){
				System.out.print("CozaLoza ");
			}
			else if(a%3==0 && a%7==0){
				System.out.print("CozaWoza ");
			}
			else if(a%5==0 && a%7==0){
				System.out.print("LozaWoza ");
			}
			
			else if(a%11==0)
			{
				System.out.print(+a);
			    System.out.println();
			}
			else {
				System.out.print(+a+" ");
			}
		}

	}

}
