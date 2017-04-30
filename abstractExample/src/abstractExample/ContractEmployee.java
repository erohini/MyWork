package abstractExample;

public class ContractEmployee extends Employee{
	int contractPeriod;

	@Override
	public void calculateSalary() {
		System.out.println("Contract Employee : calculateSalary()");
		
	}

}
