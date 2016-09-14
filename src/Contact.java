
public class Contact {
	
	public String name;
	public String email;
	public String phoneNumber;
	

	public Contact(String name, String email, String phoneNumber) {
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	public void printContact() {
		System.out.println("\nName: " + name);
		System.out.println("Email: " + email);
		System.out.println("Phone Number: " + phoneNumber);
	}

}
