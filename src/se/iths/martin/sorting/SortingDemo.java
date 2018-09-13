package se.iths.martin.sorting;

import java.text.Collator;
import java.util.*;

public class SortingDemo {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Världens mat"));
        books.add(new Book("Astrid", "Pippi Långstrump"));
        books.add(new Book("Ástrid", "Emil"));
        books.add(new Book("Mártin", " A Java Book"));
        books.add(new Book("Stephen", "It"));
        books.add(new Book("Astrid", "Ronja"));
        books.add(new Book("Ástrid", "Rõnja"));
        books.add(new Book("Beck", "Att jobba som polis"));

        System.out.println("Before sorting books: " + books);
//        Collections.sort(books);
//
//        System.out.println("After sorting by author: " + books);
//
//        Collections.sort(books, new SortBookByTitleComparator());
//
//        System.out.println("After sorting by title: " + books);
//        Comparator<Book> combinedSort = new ReverseSortBookByAuthorComparator()
//                .thenComparing(new SortBookByTitleComparator());
//
//        Collections.sort(books, combinedSort);
//
        Comparator<Book> sortByAuthorComparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
//                return o1.getAuthor().compareTo(o2.getAuthor());
                final Collator myCollator = Collator.getInstance(new Locale("sv","SE"));
                myCollator.setStrength(Collator.CANONICAL_DECOMPOSITION);
                return myCollator.compare(o1.getAuthor(), o2.getAuthor());
            }
        };

        Collections.sort(books, sortByAuthorComparator);


        //Iteration
//        for (int i = 0; i < books.size(); i++) {
//            System.out.println(books.get(i));
//        }
//
//        for ( Book book : books  ) {
//            System.out.println(book);
//        }

        ListIterator<Book> bookListIterator = books.listIterator();

        while( bookListIterator.hasNext() ) {
            Book b = bookListIterator.next();
            if( b.getAuthor().equals("Astrid"))
                bookListIterator.remove();
            System.out.println(b);
        }

        //System.out.println("After sorting: " + books);

        //Java 8 Comparator https://www.baeldung.com/java-8-comparator-comparing
        //Comparator<Book> sortByTitleComparator = Comparator.comparing(Book::getTitle);
        //Comparator<Book> sortByAuthorThenTitleComparator = Comparator.comparing(Book::getAuthor).thenComparing(Book::getTitle);
        //Comparator<Book> bookAuthorComparator = Comparator.<Book> naturalOrder();
        //Comparator<Book> reversedNaturalOrder = bookAuthorComparator.reversed();
    }


}
