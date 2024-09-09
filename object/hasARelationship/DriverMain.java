package oops.object.hasARelationship;

public class DriverMain {
		public static void main(String[] args) {
			System.out.println("Main Method Started");
			Bicycle b1= new Bicycle();
			Car1 c1= new Car1();
			Bike b2= new Bike();
			Driver d1= new Driver();
			d1.decideVehicle(c1);
			d1.decideVehicle(b1);
			d1.decideVehicle(b2);
			d1.drive();
			d1.drive();
			d1.drive();
			System.out.println("Main Method Ended");
		}
}
