package Employee;

public class Employee {
	//Datamember
	String name;
	int id;
	double salary;
Employee(String n,int id,double sal)
{
name=n;
this.id=id;
salary=sal;
}
void  displayDetails()
{
	System.out.println("Employee ID:"+this.id);
	System.out.println("Name:"+name);
	System.out.println("Salary:"+salary);
	
}
void increaseSalary(double percentage)
{
	salary+=(salary*percentage)/100.0d;
}
}
	 
