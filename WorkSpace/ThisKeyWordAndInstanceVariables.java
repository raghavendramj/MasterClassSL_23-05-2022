public class ThisKeyWordAndInstanceVariables{	
	//Instance Variable -> One copy per Object
	public int counter = 0;		
	
	public void printCounter(){
		System.out.println("Value of obj1.counter :- "+ this.counter);
	}
	
	public static void main(String args[]){		
		ThisKeyWordAndInstanceVariables obj1 = new ThisKeyWordAndInstanceVariables();
		ThisKeyWordAndInstanceVariables obj2 = new ThisKeyWordAndInstanceVariables();
		ThisKeyWordAndInstanceVariables obj3 = new ThisKeyWordAndInstanceVariables();

		obj1.counter = 34;
		obj2.counter = 56;
		obj3.counter = 89;			
		
		obj1.printCounter();
		obj2.printCounter();
		obj3.printCounter();
		
		obj2.counter = 4567;
		
		obj1.printCounter();
		obj2.printCounter();
		obj3.printCounter();
	
	}
}