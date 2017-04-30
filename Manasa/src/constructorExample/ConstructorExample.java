package constructorExample;

public class ConstructorExample {
	
	public ConstructorExample(){
		System.out.println("...................");
	}

	public ConstructorExample(int a){
		System.out.println("This is a small example for manasa...");
	}
	
	public ConstructorExample(int a, int b){
		System.out.println("this is ............");
	}
	
	public void add(int a, int b){
		int c=a+b;
		System.out.println("Addition: "+c);
	}
	
	public void sub(int a, int b){
		int c=a-b;
		System.out.println("Substraction: "+c);
	}
}
