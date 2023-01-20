package day22.collection;

public class AddressBook_Uc4Main {
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook");
        AddressBook_Uc4 add = new AddressBook_Uc4();
        add.addContact();
        System.out.println(add.display());

        add.editContact();
        System.out.println(add.display());

        add.deleteContact();
        System.out.println(add.display());
    }
}
