package Abstract;

public class TesterDemo{
	public static void main(String[] args) {
		TestAbstractClass Obj = new DerivedUsingAbstract();
		Obj.drawShapes();
		Obj.showShapes();
	}
}