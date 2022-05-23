class MarutiSuzuki{
	public void topSpeed(){
		System.out.println("Top speed is 60KMPH");
	}
}

class Benz extends MarutiSuzuki{
	
	//OVERRDING THE METHOD => METHOD OVERRIDING
	public void topSpeed(){
		System.out.println("Top speed is 180KMPH");
	}
}

public class OverridingDemo{
	public static void  main(String args[]){
		MarutiSuzuki brezza = new MarutiSuzuki();
		brezza.topSpeed();
		Benz classA = new Benz();
		classA.topSpeed();
	}
}