//Connor Fortier
//Week Six - Project One
//CS 320
//10/10/2021

//Description: create a contact list in memory
//as part of a mobile application, to add, update, and delete contacts

package contactTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


//did not have time to complete this section due to work
public class ContactServiceTest {
	
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	@DisplayName("Test to Add contact object.")
	void testAddContact() {
		Contact service = new Contact();
		service.addContact("Name");
		assertNotNull(service.getContact("9"), "The contact was not added!");
	}
}
