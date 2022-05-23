public class DefinitionOfClass{
	//Fields/Variables/data members
	public int counter = 0; // instance variable.
	
	//Default Constructor
	public DefinitionOfClass(){
		System.out.println("Default Constructor");
	} 
	
	//Parametrized Constructor
	public DefinitionOfClass(int value){
		System.out.println("Parametrized Constructor");
		this.counter = value;
	}
	
	//Methods - Instance Method
	public void displayMessage(String message){
		System.out.println("Data Member :- Method/function inside the class");
	}
	
	//Methods
	public static void main(String args[]){
		System.out.println("This is main method");
	}
}