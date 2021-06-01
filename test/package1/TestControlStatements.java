package test.package1;

public class TestControlStatements{
	public static void main(String[] args) {
		int value = 5;
		if(value < 3) 
			System.out.println("value is less than 3 " + value);
		else if (value > 3)
			System.out.println("Value is greater than 3 "+value);
		else
			System.out.println("value is 3 "+ value);
		
		int month = 11;
		String monthName ="";
		switch(month){
		case 1: monthName = "January";
				System.out.println(monthName);
				break;
		case 2: monthName = "Feb";
				System.out.println(monthName);
				break;
		case 3: monthName = "March";
				System.out.println(monthName);
				break;
		case 4: monthName = "April";
				System.out.println(monthName);
				break;
		case 5: monthName = "May";
				System.out.println(monthName);
				break;
		case 6: monthName = "June";
				System.out.println(monthName);
				break;
		case 7: monthName = "July";
				System.out.println(monthName);
				break;
		case 8: monthName = "August";
				System.out.println(monthName);
				break;
		case 9: monthName = "Sep";
				System.out.println(monthName);
				break;
		case 10 :monthName = "Oct";
				 System.out.println(monthName);
				 break;
		case 11 :monthName = "Nov";
		 		System.out.println(monthName);
		 		break;	
		case 12 :monthName = "December";
		 		System.out.println(monthName);
		 		break;
		default:
				System.out.println("Invalid choice");
				break;
		}
			
	}
}