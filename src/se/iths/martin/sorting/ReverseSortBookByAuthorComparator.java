package se.iths.martin.sorting;

import java.util.Comparator;

public class ReverseSortBookByAuthorComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        return book2.getAuthor().compareTo(book1.getAuthor());
    }
}
