package oops.initializationStatesOfObjects.constructors;

public class Employee {
		int id;
		String name;
		double salary;
		Employee(int id,String name,double salary){
			this.id=id;
			this.name=name;
			this.salary=salary;
		}
		void details() {
			System.out.println("Id: "+id+"\nName: "+name+"\nSalary: "+salary);
		}
}
