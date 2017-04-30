package test;

public class ClassB {
	
	public static String text(String str){
		return str=str+"Ram";
	}
	
	
	public static void main(String args[]){
		ClassA classA = new ClassA();
		ClassA.text1();
	}

}
