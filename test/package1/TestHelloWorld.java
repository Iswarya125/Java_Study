package test.package1;

//File name and public class name should match
//if not we get errors
//To execute any class in java main method is required
// if not program will not execute
//main method should be public if not java will not able to find the method
//static for main is required - because the class need to be executed without creating the object
//String array argument is required to be passed as arguments
//Java supplies all the command line arguments to the String array so it is required to be present
public class TestHelloWorld {

	public static void main(String args[])
	{
		System.out.println("Hello World");
	}
}
