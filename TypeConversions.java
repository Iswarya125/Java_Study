class typeconversion 
{
	public static void main(String args[])
	{
		int a = 100;
		System.out.println("Value of a is "+a);
		
		long b = a;
		System.out.println("Value of b is "+b);
		
		float c = b;
		System.out.println("value of c is "+c);
		
		double d = 35.6;
		System.out.println("value of d is "+ d);
		
		//Whenever larger range variable to be assigned to smaller range variable 
		//typecast is required if not error will be thrown
		float e = (float)d;
		System.out.println("value of e is "+e);
		
		long f = (long) d;
		System.out.println("value of f is "+f);
	}
	
}