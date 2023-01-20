package day22.collection;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook");
        AddressBook add = new AddressBook();
        add.addContact();
        System.out.println(add.display());
    }
}
