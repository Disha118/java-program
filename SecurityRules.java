package transport;

public final class SecurityRules {
	private SecurityRules() {

	  }
	 //static method to check if the drone is allowed
	 public static boolean canFly(String place) 
	 { 
		 if(place=="ExamCell")
	 return false;
		 else
	 return true; 
	 }
	 }

	
