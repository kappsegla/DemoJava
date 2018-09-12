package se.iths.martin.sorting;

public class Book implements Comparable<Book> {

    public Book(String title) {
        this("No author", title);
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
        numberOfBooks++;
    }

    private static int numberOfBooks;

    public static int getNumberOfBooks(){
        return numberOfBooks;
    }

    @Override
    public String toString() {
        return author + " - " + title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String author;
    private String title;

    @Override
    public int compareTo(Book o) {
        return author.compareTo(o.author);
    }
}