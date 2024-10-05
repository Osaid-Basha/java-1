package library;

import java.util.ArrayList;

public  class Library {
    private ArrayList<LibraryItem> items;


    public Library() {
        items = new ArrayList<>();
    }


    public void addLibraryItem(LibraryItem item) {
        items.add(item);
    }


    public void borrowLibraryItem(String title) {
        LibraryItem item = searchItem(title);
        if (item != null) {
            item.borrowItem();
        } else {
            System.out.println("Item with title \"" + title + "\" not found.");
        }
    }


    public void returnLibraryItem(String title) {
        LibraryItem item = searchItem(title);
        if (item != null) {
            item.returnItem();
        } else {
            System.out.println("Item with title \"" + title + "\" not found.");
        }
    }


    public void displayAllItems() {
        for (LibraryItem item : items) {
            item.displayStatus();
        }
    }


    private LibraryItem searchItem(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null;
    }
}
