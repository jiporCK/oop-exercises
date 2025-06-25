package collectionframeworks.exercise.contactmanager;

import java.util.ArrayList;
import java.util.List;

public class ContactManagerImpl implements ContactManager {

    static List<Contact> contacts = new ArrayList<>();

    @Override
    public boolean addContact(String name, String phone, String email) {
        return contacts.add(new Contact(name, phone, email));
    }

    @Override
    public List<Contact> getAllContacts() {
        return contacts;
    }

    @Override
    public Contact searchContactByName(String name) {
        for (Contact c : contacts) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        return null;
    }
}
