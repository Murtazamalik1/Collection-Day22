package day22.collection;

public class AddressBook_Uc3Main {
    public static void main(String[] args) {
        System.out.println("welcome to AddressBook");
        AddressBook_Uc3 add = new AddressBook_Uc3();
        add.addContact();
        System.out.println(add.display());
        add.editContact();
        System.out.println(add.display());
    }
}
