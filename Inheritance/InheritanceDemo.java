package Inheritance;


public class InheritanceDemo{
	public static void main(String[] args) {
		
		//Below way of creating object is called dynamic binding, right hand side of the =
		//decides which class methods to be invoked during run time
		//BaseclassBicycle Obj = new DerivedclassMountainBike(5,1,20);
		DerivedclassMountainBike Obj = new DerivedclassMountainBike(5,1,20);
		
		System.out.println(Obj.Gear);
		System.out.println(Obj.Speed);
		Obj.applyBrake(2);
		System.out.println(Obj.Speed);
		System.out.println(Obj.getHeight());
	}
}