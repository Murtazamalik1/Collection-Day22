package day22.collection;

import java.util.Scanner;

public class AddressBook_Uc5Main {
    public static void main(String[] args) {
        System.out.println("Welcome To AddressBook");
        AddressBook_Uc5 add = new AddressBook_Uc5();
        Scanner scanner = new Scanner(System.in);
        boolean exit = true;
        do {
            System.out.println("Enter option:\n1) To add contact:\n2) To Edit Contact:\n3) To Display Contact:\n4) To Delete contact:\n5) To Exit ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    add.addContact();
                    break;
                case 2:
                    add.editContact();
                    break;
                case 3:
                    add.display();
                    break;
                case 4:
                    add.deleteContact();
                    break;
                case 5:
                default:
                    break;
            }

        }while (exit);
    }
}
