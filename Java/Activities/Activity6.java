package activities;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
          Plane plane = new Plane(10);
          plane.onboard("Vineela");
          plane.onboard("Sita");
          plane.onboard("Rama");
          plane.onboard("Ravi");
          plane.onboard("Vanitha");
          System.out.println("Plane Take Off Date and Time: "+plane.takeoff());
          System.out.println("Passengers in Plane: "+plane.getPassengers());
          Thread.sleep(5000);
          plane.land();
          System.out.println("Plane landed Date and Time: "+plane.getLastTimeLanded());
          
	}

}
