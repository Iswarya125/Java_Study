package Interfaces;


public class DerivedclassMountainBike implements BaseclassBicycle{
	
	private int seatHeight;
	private int Gear;
	private int Speed;
	
	public DerivedclassMountainBike(int Height, int Gear, int Speed) {
		this.seatHeight = Height;
		this.Gear = Gear;
		this.Speed = Speed;
	}
	
	public void setHeight(int value) {
		this.seatHeight = value;
	}
	
	public int getGear() {
		return Gear;
	}

	public void setGear(int gear) {
		this.Gear = gear;
	}

	//works with or without @Override keyword
	// it is optional but in some IDEs it forces to add
	public void applyBrake(int value) {
		this.Speed -= value;
	}

	@Override
	public void acclerateSpeed(int value) {
		this.Speed += value;
	}

	public int getSpeed() {
		return Speed;
	}

	public void setSpeed(int speed) {
		this.Speed = speed;
	}

	public int getHeight() {
		return this.seatHeight;
	}
	
}