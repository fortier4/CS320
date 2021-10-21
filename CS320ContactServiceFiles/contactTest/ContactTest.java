//Connor Fortier
//Week Six - Project One
//CS 320
//10/10/2021

//Description: create a contact list in memory
//as part of a mobile application, to add, update, and delete contacts

package contactTest;

import contact.Contact;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ContactTest {
	//first test to validate object can be created
		@Test
		void testContact() {
			//create new contact object for testing
			Contact contact = new Contact("cf4", "stan", "smith", "0123456789", "123 road");
			
			assertTrue(contact.getId().equals("cf4"));
			assertTrue(contact.getFirstName().equals("stan"));
			assertTrue(contact.getLastName().equals("smith"));
			assertTrue(contact.getPhone().equals("0123456789"));
			assertTrue(contact.getAddress().equals("123 road"));
		}

		//second test for ID to long
		@Test
		void testContactIdToLong() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new contact("01234567890", "stan", "smith", "0123456789", "123 road");
			});
		}
		//third test for names to long
		@Test
		void testContactNamesToLong() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new contact("cf4", "stanstanstan", "smithsmithsmith", "0123456789", "123 road");
			});
		}
		
		//fourth test for phone number not 10 digits
		@Test
		void testContactPhoneDigits() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new contact("cf4", "stan", "smith", "01234567890", "123 road");
			});
		}
		
		//fifth test for address to long
		@Test
		void testContactAddressToLong() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new contact("cf4", "stan", "smith", "0123456789", "0123456789012345678901234567890123456789");
			});
		}
}
