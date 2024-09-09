package oops.finalMemberVariable;

public class EmployeMain {
		public static void main(String[] args) {
			System.out.println("Main Method Started");
			Employee e1 = new Employee("raj", 192892.12, "engineer", 3);
	        Employee e2 = new Employee("rajan", 292892.12, "teacher", 2);
	        Employee e3 = new Employee("vidur", 4500.89, "peon", 6);
	        Employee e4 = new Employee("anna", 222212, "clerk", 10);
	        Employee e5 = new Employee("veera", 12000, "accountant", 20);
	        Employee e6 = new Employee("pokeman", 4500, "manager", 6);

	        e1.showdetails();
	        System.out.println("============");
	        e2.showdetails();
	        System.out.println("============");
	        e3.showdetails();
	        System.out.println("============");
	        e4.showdetails();
	        System.out.println("============");
	        e5.showdetails();
	        System.out.println("============");
	        e6.showdetails();
			System.out.println("Main Method Ended");
		}
}
