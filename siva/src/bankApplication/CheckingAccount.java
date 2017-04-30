package bankApplication;

public class CheckingAccount extends Account{

	double fee_charged=3;
	boolean transaction=false;
	
	
	public void credit(){
		if(transaction=true){
			current_balance=current_balance-fee_charged;
		}
	}
	
	public void debit(){
		transaction=true;
		if(transaction=true){
			current_balance=current_balance-fee_charged;
		}
	}
}
