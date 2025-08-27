package car;

public class Showroom {

	public static void main(String[] args) {
		 Car c1 = new Car("Toyota", "Innova", 25000, 18.5,"ritu");
	        Car c2 = new Car("Honda", "Civic", 20000, 16.0, "seema");
	        Car c3 = new Car("Hyundai", "Shift", 12000, 20.0,"nisha");

	        c1.displayDetails();
	        c2.displayDetails();
	        c3.displayDetails();
	        c1.setOwnerName("nis");  // using setter
	        c1.updatePrice(18000);

	        System.out.println("After Updates:");
	        c1.displayDetails();

	        Car.showShowroomName();
	        Car.showTotalCars();

	}

}


