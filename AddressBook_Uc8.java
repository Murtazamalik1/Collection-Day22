package day22.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook_Uc8 {
    ArrayList<Contact> list = new ArrayList<>();
    Scanner scr = new Scanner(System.in);


    void addContact() {
        System.out.println("Enter the first name");
        String firstName = scr.next().toLowerCase();
        System.out.println("Enter the last name");
        String lastName = scr.next().toLowerCase();
        for (Contact contacts : list) {
            if ((contacts.getFirstName().toLowerCase().equals(firstName)) && (contacts.getLastName().toLowerCase().equals(lastName))) {
                System.out.println("Contact already exist!!!");
                return;
            }
        }
        Contact contact = new Contact();
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        System.out.print("Enter city: ");
        contact.setCity(scr.next());
        System.out.print("Enter state: ");
        contact.setState(scr.next());
        System.out.print("Enter address:  ");
        scr.nextLine();
        contact.setAddress(scr.nextLine());
        System.out.print("Enter Zipcode: ");
        contact.setZip(scr.nextInt());
        System.out.print("Enter phone Number: ");
        contact.setPhoneNo(scr.nextInt());
        System.out.print("Enter email address: ");
        contact.setEmail(scr.next());
        list.add(contact);
    }

    void editContact() {
        if (list.isEmpty()) {
            System.out.println("Address book is empty");
        } else {
            System.out.println("Enter the first name of person to edit");
            String firstName = scr.next().toLowerCase();
            System.out.println("Enter the last name of person to edit");
            String lastName = scr.next().toLowerCase();

            boolean found = false;
            for (Contact contact : list) {
                if (firstName.equals(contact.getFirstName().toLowerCase())) {
                    if (lastName.equals(contact.getLastName())) {
                        System.out.println("Edit the details of person");
                        System.out.print("Enter first name: ");
                        contact.setFirstName(scr.next());

                        System.out.print("Enter last Name: ");
                        contact.setLastName(scr.next());

                        System.out.print("Enter Email: ");
                        contact.setEmail(scr.next());

                        System.out.print("Enter address: ");
                        scr.nextLine();
                        contact.setAddress(scr.nextLine());

                        System.out.print("Enter phone number: ");
                        contact.setPhoneNo(scr.nextInt());

                        System.out.print("Enter state: ");
                        contact.setState(scr.next());

                        System.out.print("Enter city: ");
                        contact.setCity(scr.next());

                        System.out.print("Enter zip: ");
                        contact.setZip(scr.nextInt());
                        found = true;
                        break;
                    }

                }
            }
            if (!found) {
                System.out.println("No contact found");
            }
        }
    }

    void searchContact() {
        if (list.isEmpty()) {
            System.out.println("No contacts to search in the addressBook");
            return;
        }

        boolean exit = false;
        while (!exit) {
            System.out.println("""
                    Enter option
                    1)To search by city
                    2)To search by state
                    3)Exit
                    """);
            int option = scr.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the city to search contacts");
                    String city = scr.next();
                    for (Contact contacts : list) {
                        if (contacts.getCity().toLowerCase().contains(city)) {
                            System.out.println(contacts);
                        }
                    }
                case 2:
                    System.out.println("Enter the state to search contact");
                    String state = scr.next();
                    for (Contact contacts : list) {
                        if (contacts.getState().toLowerCase().contains(state)) {
                            System.out.println(contacts);
                        }
                    }
                    break;
                case 3:
                    exit = true;
                default:
                    break;
            }

        }
    }

    void deleteContact() {
        if (list.isEmpty()) {
            System.out.println("Address book is empty");
        } else {
            System.out.println("Enter the first name of person to delete");
            String firstName = scr.next().toLowerCase();
            System.out.println("Enter the last name of person to delete");
            String lastName = scr.next().toLowerCase();
            boolean found = false;
            for (Contact contact : list) {
                if (firstName.equals(contact.getFirstName().toLowerCase())) {
                    if (lastName.equals(contact.getLastName())) {
                        list.remove(contact);
                        found = true;
                        System.out.println("Contact deleted successfully");
                        break;
                    }
                }
            }
            if (!found) {
                System.out.println("No contact found");
            }
        }
    }

    void displayContacts() {
        if (list.isEmpty()) {
            System.out.println("No contacts to display");
        } else {
            for (Contact contact : list) {
                System.out.println(contact);
            }
        }

    }

    @Override
    public String toString() {
        return list +
                "}\n";
    }
}
