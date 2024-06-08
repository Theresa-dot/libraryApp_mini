package org.example.service;

import org.example.model.LibraryItem;

public interface LibraryService {
    void addItem(LibraryItem item);
    void removeItem(LibraryItem item);
    void borrowItem(LibraryItem item);
    void returnItem(LibraryItem item);
    void displayItems();

}
