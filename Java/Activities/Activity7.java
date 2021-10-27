package activities;

interface BicycleParts{
	public int gears=0;
	public int currentSpeed=0;
}
interface BicycleOperations{
	public void applyBreak(int decrement);
	public void speedUp(int increment);
}
class Bicycle implements BicycleParts,BicycleOperations{
	
	public int gears;
	public int currentSpeed;
	public Bicycle(int gears, int currentSpeed){
		this.gears=gears;
		this.currentSpeed=currentSpeed;
	}
	
	public void applyBreak(int decrement) {
		currentSpeed-= decrement;
		System.out.println("Apply Break: "+currentSpeed);
	}
	
	public void speedUp(int increment) {
		currentSpeed+= increment;
		System.out.println("SpeedUp: "+currentSpeed);
	}
	public String bicycleDesc() {
		return("No.of Gears: "+gears+"\nSpeed of Bicycle is: "+currentSpeed);
	}
}
 class MountainBike extends Bicycle{
	 public int seatHeight;
	 public MountainBike(int gears, int currentSpeed, int startHeight){
		 super(gears, currentSpeed);
		 seatHeight = startHeight;
	 }
	 public void setHeight(int newValue) {
		 seatHeight = newValue;
	 }
	 
	public String bicycleDesc() {
		// TODO Auto-generated method stub
		return(super.bicycleDesc()+"\nSeatHeight is: "+seatHeight);
	}
 }
public class Activity7 {

	public static void main(String[] args) {
		MountainBike mb = new MountainBike(5, 10, 3);
		System.out.println(mb.bicycleDesc());
		mb.speedUp(10);
		mb.applyBreak(3);

	}

}
