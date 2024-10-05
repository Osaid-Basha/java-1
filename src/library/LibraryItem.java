package library;

import java.sql.SQLOutput;

public abstract class LibraryItem {
    private String title ;
    private String author;
    private String publish_date;
    private String summary;
    private boolean isBorrowed=false;

    public LibraryItem() {}

    public LibraryItem(String title, String author, String publish_date, String summary) {
        this.title = title;
        this.author = author;
        this.publish_date = publish_date;
        this.summary = summary;

    }
    public abstract void borrowItem();
    public abstract void returnItem();
    public void displayStatus() {
        System.out.println("Title: " + title + ", Author: " + author + ", Status: " + (isBorrowed ? "Borrowed" : "Available"));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(String publish_date) {
        this.publish_date = publish_date;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}
