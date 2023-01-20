package day22.collection;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBook_Uc6Main {
    public static void main(String[] args) {

        HashMap<String, AddressBook_Uc6> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome To AddressBook System");
        boolean exit = true;

        while (exit){
            AddressBook_Uc6 add = new AddressBook_Uc6();
            System.out.println("Enter AddressBook Name");
            String addressBookName = scanner.next().toLowerCase();
            if (map.containsKey(addressBookName)){
                System.out.println(" AddressBook Already exit");
            }
            else {
                map.put(addressBookName,add);
            }

            System.out.println("""
                    Enter Option:
                    1) To add contact
                    2) To edit contact
                    3) To display contact
                    4) To Delete contact
                    5) To Exit """);

            int option = scanner.nextInt();
            switch (option){
                case 1:
                    map.get(addressBookName).addContact();
                    break;
                case 2:
                    map.get(addressBookName).editContact();
                    break;
                case 3:
                    map.get(addressBookName).display();
                    break;
                case 4:
                    map.get(addressBookName).deleteContact();
                    break;
                case 5:
                    exit = false;
                    break;
                case 6:
                default:
                    break;
            }
        }
        System.out.println(map);
    }
}
