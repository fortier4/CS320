//Connor Fortier
//Week Six - Project One
//CS 320
//10/10/2021

//Description: create a contact list in memory
//as part of a mobile application, to add, update, and delete contacts

package contact;

//import

//contact class
public class Contact {
	
	//declare and initialize variables
	private String id = "";					//ID
	private String firstName = "";			//first name
	private String lastName = "";			//last name
	private String phone = "";				//phone number
	private String address = "";			//address
	
	//function to validate that phone number is digits and not characters
	public static boolean digitCheck(String phone) {
		for(int i = 0; i < 10; i++) {
			if(Character.isDigit(phone.charAt(i))) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	
	//public class for contact class to verify requirements and set values once checks are passed
	public Contact(String id, String firstName, String lastName, String phone, String address) {
		//id requirements
		if(id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		
		//firstName requirements
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name!");
		}
		
		//lastName requirements
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name!");
		}
		
		//phone requirements
		if(phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number!");
		}
		
		if(digitCheck(phone) == false) {
			throw new IllegalArgumentException("Invalid Phone Number!");
		}
		
		//address requirements
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address!");
		}
		
		//set ID value
		this.id = id;
		
		//set first name
		this.firstName = firstName;
		
		//set last name
		this.lastName = lastName;
		
		//set phone value
		this.phone = phone;
		//set address
		this.address = address;
	}
	
	//public accessor function for id
	public String getId() {
		return id;
	}
	
	//public accessor function for firstName
	public String getFirstName() {
		return firstName;
	}
	
	//public accessor function for lastName
	public String getLastName() {
		return lastName;
	}
	
	//public accessor function for phone
	public String getPhone() {
		return phone;
	}
	
	//public accessor function for address
	public String getAddress() {
		return address;
	}
	
}
