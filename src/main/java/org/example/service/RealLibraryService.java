package org.example.service;

import java.util.ArrayList;
import java.util.List;

import org.example.model.LibraryItem;

public class RealLibraryService implements LibraryService {
    private List<LibraryItem> items=new ArrayList<>();

    @Override
    public void addItem(LibraryItem item) {
        items.add(item);
        System.out.println(item.getTitle() + " added to the library.");
    }

    @Override
    public void removeItem(LibraryItem Item) {
        LibraryItem item=this.findItem(Item.getTitle());
        if(item!=null){
            items.remove(item);
            System.out.println(item.getTitle() + " removed from the library.");
        }else{
            System.out.println("Item not found.");
        }

    }

    @Override
    public void borrowItem(LibraryItem Item) {
        LibraryItem item=this.findItem(Item.getTitle());
        if(item!=null){
            try {
                if (!item.isBorrowed()) {
                    item.borrowItem();
                    System.out.println("You borrowed " + item.getTitle());
                    item.borrowItem();
                } else {
                    System.out.println(item.getTitle() + " is already borrowed.");
                }
            } catch (UnsupportedOperationException e) {
                System.out.println("Periodicals cannot be borrowed.");
            }
        }else{
            System.out.println("Item not found.");
        }

    }

    @Override
    public void returnItem(LibraryItem Item) {
        LibraryItem item=this.findItem(Item.getTitle());
        if(item!=null){
            if (item.isBorrowed()) {
                item.returnItem();
                System.out.println("You returned " + item.getTitle());
                item.returnItem();
            } else {
                System.out.println(item.getTitle() + " was not borrowed.");
            }
        }else{
            System.out.println("Item not found.");
        }

    }

    @Override
    public void displayItems() {
        for (LibraryItem item : items) {
            System.out.println(item);
        }
    }

    private LibraryItem findItem(String title) {
        for(LibraryItem item: items) {
            if (item.getTitle().equals(title)) {
                return item;
            }
        }
        return null;
    }

}
