package se.iths.martin.sorting;

import java.io.Serializable;
import java.text.Collator;
import java.util.Locale;

public class Book implements Comparable<Book>, Serializable {

    public static final long serialVersionUID = 763247632446732476L;

    public Book(){
    }

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

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
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
        Collator collator = Collator.getInstance(new Locale("en","US"));
        collator.setStrength(Collator.CANONICAL_DECOMPOSITION);
        return collator.compare(this.getAuthor(),o.getAuthor());
        //return author.compareTo(o.author);
    }
}
