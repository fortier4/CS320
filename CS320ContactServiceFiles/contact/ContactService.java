//Connor Fortier
//Week Six - Project One
//CS 320
//10/10/2021

//Description: create a contact list in memory
//as part of a mobile application, to add, update, and delete contacts

package contact;

import java.util.ArrayList;

import task.Task;

public class ContactService {
	//did not have time to complete this section due to a conflict with my work schedule
	
	//add new contact to the list using the constructor
			public void addContact(String contactName) {
				//create new task
				Contact contact = new Contact(contactName);
				//add new task object to the list
				contactList.add(contact);
			}
}
