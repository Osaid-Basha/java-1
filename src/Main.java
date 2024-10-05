import library.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1925", "A classic novel.", "Fiction");
        Magazine magazine1 = new Magazine("National Geographic", "Various", "2023", "Science magazine.", 3);


        Member member1 = new Member("John Doe", "M12345");
        member1.displayMemberInfo();


        ArrayList<LibraryItem> libraryItems = new ArrayList<>();
        libraryItems.add(book1);
        libraryItems.add(magazine1);


        for (LibraryItem item : libraryItems) {
            item.displayStatus();
            item.borrowItem();
        }


        System.out.println("\nStatus after borrowing items:");
        for (LibraryItem item : libraryItems) {
            item.displayStatus();
        }


        for (LibraryItem item : libraryItems) {
            item.returnItem();
        }


        System.out.println("\nStatus after returning items:");
        for (LibraryItem item : libraryItems) {
            item.displayStatus();
        }
    }
}

