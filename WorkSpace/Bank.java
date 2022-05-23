public class Bank{
	private int balance = 0;
	
	public Bank(int initBalance){		
		this.balance = initBalance;
	}

	public int withdraw(int amount){
		if(balance >= amount){
			//update the balance
			balance = balance - amount;
			System.out.println("Amount withdrawn is :- "+ amount);
			System.out.println("And the updated balance is  :- "+ this.balance);
			return balance;
		} else {
			System.out.println("withdraw :- Insufficient Balance in the account to withdraw");
			return -1;
		}
	}

	public void deposit(int amount){
			if(amount > 0){
				balance = balance + amount;
			System.out.println("Amount deposited is :- "+ amount);
			System.out.println("And the updated balance is  :- "+ this.balance);
			} else {
				System.out.println("Deposit:- Invalid amount to deposit.");
			}
	}

	public int getBalance(){
		System.out.println("Available balance is  :- "+ this.balance);
		return this.balance;
	}
	
	public static void main(String args[]){
		Bank bankObject1 = new Bank(10000);
		bankObject1.getBalance();
		bankObject1.withdraw(3000);
		bankObject1.deposit(8000);
		bankObject1.withdraw(20000);
		bankObject1.deposit(-2);
		
		
	}

}