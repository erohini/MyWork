package abstractExample;

public class PermenentEmployee extends Employee{

	String dateOfJoining;

	@Override
	public void calculateSalary() {
	
		System.out.println("Permenent employee salary : calculateSalary()");
	}
	
	
}
