package Inheritance;

public class BaseclassBicycle{
	protected int Gear;
	protected int Speed;
	
	public BaseclassBicycle(int Gear,int Speed) {
		this.Gear = Gear;
		this.Speed = Speed;
	}
	
	public void setGear(int gear) {
		this.Gear = gear;
	}
	
	public void setSpeed(int speed) {
		this.Speed = speed;
	}
	
	public void applyBrake(int value) {
		this.Speed -= value;
	}
	
	public void acclerateSpeed(int value) {
		this.Speed += value;
	}
}