//100%
interface Printer{
	 //By Default -> all the methods are public and abstract
	void print(String message);
}

class ConsolePrinter implements Printer{
	void print(String message){
		System.out.println("message is  :- "+ message);
	}
}

//0 to 100%
abstract class Bank{
	int balance = 10000;
	//abstract method
	abstract int withdraw(int amount);
	
	//concrete method
	public int getBalance(){
		System.out.println("Available balance is  :- "+ this.balance);
		return balance;
	}
}

class ICICI extends Bank{
	int withdraw(int amount){
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
}
public class AbstractionDemo{

	public static void main(String args[]){
		Bank bank = new ICICI();
		bank.withdraw(3000);
		bank.getBalance();
	}
}