package org.example.model;

public class periodical extends LibraryItem {

    public periodical(String title, String publisher) {
        super(title, publisher);
    }

    @Override
    public void borrowItem() {
        throw new UnsupportedOperationException("Periodicals cannot be borrowed.");
    }

}
