package Classes;

public class TestClass{
	
	int id;
	String name;
	String address;
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setId(int Id) {
		this.id = Id;
	}
	
	public void setName(String Name) {
		this.name = Name;
	}
	
	public void setAddress(String Address) {
		this.address = Address;
	}
	
	public TestClass(int ID,String NAME,String ADDRESS) {
		id = ID;
		name = NAME;
		address = ADDRESS;
	}
	public static void main(String[] args) {
		TestClass c1 = new TestClass(123,"John","123,hello street");
		System.out.println(c1.id);
		System.out.println(c1.name);
		System.out.println(c1.address);
		
	}
}