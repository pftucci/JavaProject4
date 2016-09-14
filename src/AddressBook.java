import java.util.Scanner;

public class AddressBook {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many contacts would you like to store?");
		int numberOfContacts = input.nextInt();
		input.nextLine();
		
		
		Contact[] contactsInAddressBook = new Contact[numberOfContacts];
		
		for (int i = 0; i < numberOfContacts; i++) {
		
			System.out.println("Enter a contact's name.");
			String contactName = input.nextLine();
			
			System.out.println("Enter a contact's email.");
			String contactEmail = input.nextLine();
			
			System.out.println("Enter a contact's phone number.");
			String contactPhoneNumber = input.nextLine();
			
			contactsInAddressBook[i] = new Contact(contactName, contactEmail, contactPhoneNumber);
						
		}
		
		for (Contact c:contactsInAddressBook) {
			c.printContact();
		}
		
		input.close();
		
	}
	

}
