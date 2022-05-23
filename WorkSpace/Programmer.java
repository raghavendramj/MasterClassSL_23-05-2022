class Employee{
	float salary = 40_000;
}
class DevOpsEngineer extends Employee{
	int bonus = 5_000;
}
 
 //Employee -> DevOpsEngineer -> DevOpsSpecialist -> MultiLevel
class DevOpsSpecialist extends DevOpsEngineer{
	int additional_bonus = 5_000;
}

//Employee -> DevOpsEnginee
//					 -> Programmer
//Hierarchical Inheritance
public class Programmer extends Employee{
	int bonus = 10_000;
	public static void main(String args[]){
		Programmer pgrmr = new Programmer();
		System.out.println("Programmer salary is "+ pgrmr.salary);
		System.out.println("Programmer bonus is "+ pgrmr.bonus);
		
		System.out.println("\n*****************************************");
		DevOpsEngineer devEng = new DevOpsEngineer();
		System.out.println("DevOpsEngineer salary is "+ devEng.salary);
		System.out.println("DevOpsEngineer bonus is "+ devEng.bonus);
			System.out.println("\n*****************************************");
		DevOpsSpecialist specialist = new DevOpsSpecialist();
		System.out.println("DevOpsSpecialist salary is "+ specialist.salary);
		System.out.println("DevOpsSpecialist bonus is "+ specialist.bonus);
		System.out.println("DevOpsSpecialist additional_bonus is "+ specialist.additional_bonus);
	}
}

