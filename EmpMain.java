package lab1;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("seema",1,10000.0d);
		Employee e2=new Employee("reema",2,20000.0d);
		e1.displayDetails();
		e2.displayDetails();
		//incremement salary
		
		e1.increaseSalary(10.0d);
		e2.increaseSalary(20.0d);
		//again displaying details
		e1.displayDetails();
		e2.displayDetails();
		
	}

}
