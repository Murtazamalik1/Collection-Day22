package day22.collection;

import java.util.Scanner;

public class AddressBook extends AddressBook_Uc7 {
    Contact contact = new Contact();
    Scanner scanner = new Scanner(System.in);

    void addContact(){
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
    }
    Contact display(){
        return contact;
    }
}
