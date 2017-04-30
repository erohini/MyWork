package bankApplication;

public class SavingsAccount extends Account {

	double interest_rate=0.01;
	
	public double calculateInterest(){
		double interest= current_balance*interest_rate;
		return interest;
	}
}
