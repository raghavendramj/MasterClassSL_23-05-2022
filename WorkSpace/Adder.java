public class Adder{
	int add(int a, int b){
		return a+b;
	}		
	
	//This is not over-loading, because atleast one parameter type has to be modified
	//float add(int a, int b){
		//return a+b;
	//}	
	
	float add(float a, float b){
		return a+b;
	}
	
	//Overloaded method
	int add(int a, int b, int c){
		return a+b +c;
	}
	
	public static void main(String args[]){
		Adder adder = new Adder();
		System.out.println("10+14 = "+ adder.add(10, 14));
		System.out.println("10.12, 14.45= "+ adder.add(10.12f, 14.45f));
		System.out.println("4+5+6= "+ adder.add(4, 5, 6));
	}
}