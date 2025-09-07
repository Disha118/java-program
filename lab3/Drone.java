package transport;

public class Drone extends Vehicle implements IPayable {

	public Drone(String id) {
		super(id);//calls vehicle constructor 
		System.out.println("Drone() constructor called");
		}
		@Override
		public void deliver(String item, String place) {
		//security check before flying
        if (!SecurityRules.canFly(place)) {
		System.out.println("Delivery to " + place + " is blocked by security.");
		return; }
		System.out.println("Delivering " + item + " to " + place + " by Drone."); }
		@Override
		public double cost(double distanceKm) {
		return 20 * distanceKm; }
		}