package org.example.model;

public class LibraryItem {
    private String title;
    private String authorOrArtist;
    private boolean borrowed;

    public LibraryItem(String title, String authorOrArtist) {
        this.title = title;
        this.authorOrArtist = authorOrArtist;
        this.borrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorOrArtist() {
        return authorOrArtist;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void borrowItem() {
        this.borrowed = true;
    }

    public void returnItem() {
        this.borrowed = false;
    }

    @Override
    public String toString() {
        return title + " by " + authorOrArtist + (borrowed ? " (Borrowed)" : " (Available)");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryItem that = (LibraryItem) o;
        return title.equals(that.getTitle());
    }
}


