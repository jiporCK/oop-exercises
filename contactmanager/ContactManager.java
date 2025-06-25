package collectionframeworks.exercise.contactmanager;

import java.util.List;

public interface ContactManager {

    boolean addContact(String name, String phone,String email);

    List<Contact> getAllContacts();

    Contact searchContactByName(String name);

}
