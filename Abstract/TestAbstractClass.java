package Abstract;


public abstract class TestAbstractClass{
	TestAbstractClass(){
		System.out.println("Inside TestAbstractClass");
	}
	
	public void getClassName()
	{
		System.out.println("Class Name is TestAbstractClass");
	}
	
	//Notice abstract keyword before the function declaration names
	abstract void drawShapes();
	abstract void showShapes();
	
}