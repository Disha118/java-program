package car;

public class Car {
	private String brand;  
    private String model;  
    private double price;   
    private double mileage;   
    private String OwnerName;   
    //static members
    private static int totalCars;//totalcars
    private static String showroomName = "CityMotors";

    // constructor 1
    public Car(String b, String m, double p, double mil) {
        brand=b; // initialize brand
        model=m; // initialize model
        price=p; // initialize price
        mileage=mil; // initialize mileage
        OwnerName = "Not Assigned";
        totalCars++;
    }
    		
    public Car(String b, String m, double p, double mil, String owner) {
    	 brand=b; // initialize brand
         model=m; // initialize model
         price=p; // initialize price
         mileage=mil;
        this.OwnerName = owner;
        totalCars++;
    }
    // getter & setter for ownerName
    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String owner) {
        OwnerName= owner;
    }
 // instance method
    public void displayDetails() {
        System.out.println("Brand: " +brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Mileage: " + mileage);
        System.out.println("Owner: " + OwnerName);
    }
    public void updatePrice(double newPrice) {
         price= newPrice;
    }
    // static methods
    public static void showTotalCars() {
        System.out.println("TotalCars: " + totalCars);
    }

    public static void showShowroomName() {
        System.out.println("Showroom: " + showroomName);
    }
}




