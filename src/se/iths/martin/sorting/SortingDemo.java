package se.iths.martin.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingDemo {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
//        List<String> strings = new ArrayList<>();
//        Collections.sort(strings);

        books.add(new Book("Astrid", "Pippi Långstrump"));
        books.add(new Book("Martin", " A Java Book"));
        books.add(new Book("Stephen", "It"));
        books.add(new Book("Beck", "Att jobba som polis"));
        books.add(new Book("Världens mat"));

        System.out.println("Before sorting: " + books);

        Collections.sort(books);

        //Comparator<Book> sortByTitleComparator = Comparator.comparing(Book::getTitle);

        System.out.println("After sorting: " + books);


    }


}
