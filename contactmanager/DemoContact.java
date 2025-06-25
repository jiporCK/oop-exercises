package collectionframeworks.exercise.contactmanager;

import java.util.List;
import java.util.Scanner;

public class DemoContact {
    static public void menu(){
        System.out.println("1. Add contact ");
        System.out.println("2. View all contacts");
        System.out.println("3. Search contact by name");
        System.out.println("4. exit ");
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        ContactManager manager = new ContactManagerImpl();

        int option;

        do{
            menu();
            System.out.println("Select your option :");
            option = Integer.parseInt(scanner.nextLine());

            switch (option){
                case 1:{
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter phone: ");
                    String phone = scanner.nextLine();

                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();

                    System.out.println(manager.addContact(name, phone, email)
                            ? "Added successfully"
                            : "Failed to create product");

                    break;
                }
                case 2: {
                    List<Contact> contacts = manager.getAllContacts();
                    for (Contact c : contacts) {
                        System.out.println(c);
                    }
                    break;
                }
                case 3:{
                    System.out.print("Enter a name: ");
                    String name = scanner.nextLine();
                    Contact contact = manager.searchContactByName(name);
                    System.out.println(contact);
                    break;
                }
                case 4:
                    System.out.println("Exiting Program");
                    break;
            }

        } while (option != 4);
    }
}
