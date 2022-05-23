public class Car{
	
	//Instance Variable
	String modelName="";
	
	//Parametrized Constructor
	public Car(String name){
		this.modelName = name;
	}
	
	//Default Constructor
	public Car(){
		System.out.println("Default Constructor");
	}
	
	//Simple function/method
	public void drive(){
		System.out.println("I am driving the car "+ modelName);
	}
	
		
	public static void main(String args[]){
		Car benzCar = new Car("Mercedes Benz V1");
		benzCar.drive();
	}
	
	//public -> Access Modifier return type
	//void ->  return type (String, Integer, Float, Boolean, Character, Object...) void-> the method won't return anything
	//display ->  function/method name
	//Parameters
		//1. Parameter type:-   String ->  (String, Integer, Float, Boolean, Character, Object...)
		//2. Parameter name:-   message
	public void display(String message){		
		//System -> Class
		//PrintWriter out -> static variable in the System
		//PrintWriter -> println -> will take string as input and prints in the console.
		System.out.println("Your message is : "+ message);
		
		Car marutiCar = new Car();		
		//Car -> Classname / Reference type
		//marutiCar -> object  / Reference variable
		//new -> used to fetch the memory from the heap
		//Car() -> constructor -> initialize the object
						// Types of Constructor are 1. Default Constructor and 2. Parameterized Constructor
	}	
	//public -> Access Modifier return type
	//int ->  return the integer as the data type
	//addNumbers ->  function/method name
	//Parameters [Parameter 1:-   (type ->int, name->number1), Parameter 2:-   (type ->int, name->number2)]	
	public int addNumbers(int number1, int number2){		
		int result = number1 + number2 ;
		return result;
	}


	
}