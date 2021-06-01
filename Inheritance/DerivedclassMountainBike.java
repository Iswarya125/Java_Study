package Inheritance;


public class DerivedclassMountainBike extends BaseclassBicycle{
	
	private int seatHeight;
	
	public DerivedclassMountainBike(int Height, int Gear, int Speed) {
		super(Gear,Speed);
		this.seatHeight = Height;
	}
	
	public void setHeight(int value) {
		this.seatHeight = value;
	}
	
	public int getHeight() {
		return this.seatHeight;
	}
	
}