package org.example;

import org.example.model.*;
import org.example.service.LibraryService;
import org.example.service.RealLibraryService;

public class Main {
    public static void main(String[] args) {
        LibraryService library = new RealLibraryService();

        book book1 = new book("The Great Gatsby", "F. Scott Fitzgerald");
        CD cd1 = new CD("Thriller", "Michael Jackson");
        DVD dvd1 = new DVD("Inception", "Christopher Nolan");
        periodical periodical1 = new periodical("National Geographic", "National Geographic Society");

        library.addItem(book1);
        library.addItem(cd1);
        library.addItem(dvd1);
        library.addItem(periodical1);

        library.displayItems();

        library.borrowItem(book1);
        library.borrowItem(cd1);
        library.borrowItem(dvd1);
        library.borrowItem(periodical1);

        library.displayItems();

        library.returnItem(book1);
        library.returnItem(cd1);
        library.returnItem(dvd1);
        library.returnItem(periodical1);

        library.displayItems();

        library.removeItem(book1);
        library.removeItem(cd1);
        library.removeItem(dvd1);
        library.removeItem(periodical1);

        library.borrowItem(book1);

        library.displayItems();

    }
}
