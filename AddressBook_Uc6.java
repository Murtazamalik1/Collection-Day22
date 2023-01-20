package day22.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook_Uc6 {
    ArrayList<Contact> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public String toString() {
        return "AddressBook_Uc6{" +
                "list=" + list +
                '}';
    }

    void addContact(){
        Contact contact = new Contact();
        System.out.println("enter first name");
        contact.setFirstName(scanner.next());
        System.out.println("enter last name");
        contact.setLastName(scanner.next());
        System.out.println("enter city");
        contact.setCity(scanner.next());
        System.out.println("enter state");
        contact.setState(scanner.next());
        System.out.println("enter email");
        contact.setEmail(scanner.next());
        System.out.println("enter address");
        contact.setAddress(scanner.next());
        System.out.println("enter zipCode");
        contact.setZip(scanner.nextInt());
        System.out.println("enter phone number");
        contact.setPhoneNo(scanner.nextInt());

        list.add(contact);
    }

    void editContact(){
        System.out.println("Enter The First Name of Person To edit");
        String firstName = scanner.next().toLowerCase();

        boolean found = false;

        for (Contact contact: list){
            if (firstName.equals(contact.getFirstName().toLowerCase())){
                System.out.println("edit the details of person");
                System.out.println("enter the first name");
                contact.setFirstName(scanner.next());

                System.out.println("enter last name");
                contact.setLastName(scanner.next());

                System.out.println("enter city");
                contact.setCity(scanner.next());
                System.out.println("enter state");
                contact.setState(scanner.next());
                System.out.println("enter email");
                contact.setEmail(scanner.next());
                System.out.println("enter address");
                contact.setAddress(scanner.next());
                System.out.println("enter zipCode");
                contact.setZip(scanner.nextInt());
                System.out.println("enter phone number");
                contact.setPhoneNo(scanner.nextInt());

                found = true;
                break;
            }
        }

        if (!found){
            System.out.println(" no contact found");
        }
    }

    void deleteContact(){
        System.out.println("enter the first name of person to delete");
        String firstName = scanner.next().toLowerCase();
        boolean found = false;

        for(Contact contact : list){
            if (firstName.equals(contact.getFirstName())){
                list.remove(contact);
                found = true;

                System.out.println("contact delete successfully");
                break;
            }
        }
        if (!found){
            System.out.println("no contact found");
        }
    }
    void display(){
        if (list.isEmpty()){
            System.out.println("no found to display");
        }
        else {
            for (Contact contact: list){
                System.out.println(contact);
            }
        }
    }
}
