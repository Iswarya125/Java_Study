package Interfaces;


public class InheritanceDemo{
	public static void main(String[] args) {
		
		DerivedclassMountainBike Obj = new DerivedclassMountainBike(5,1,20);
		
		Obj.applyBrake(2);
		System.out.println(Obj.getSpeed());
		Obj.acclerateSpeed(3);
		System.out.println(Obj.getSpeed());
		System.out.println(Obj.getHeight());
	}
}