package se.iths.martin.collection;

import java.io.IOException;
import java.security.spec.ECField;
import java.util.*;

class Node {
    String s;
    Node next;
    Node previous;
}

public class CollectionDemo {

    Node first;
    Node last;
    //Linked list implementation demo, add method
    public void add(String s) {
        Node temp = new Node();
        if (first == null) {
            first = temp;
            first.s = s;
            last = first;
        } else {
            last.next = temp;
            last = temp;
            last.s = s;
        }
    }

    public void test() {
        return;
    }

    public String getRegNumber() {
        Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            if( s.length() > 0 && s.matches("[A-Za-z]{3}\\s*[0-9]{2}[A-Za-z0-9]") )
                System.out.println("Regnummer");
                //i = Integer.parseInt(s);
            else {
                System.out.println("Du skrev inte ett regnummer");
                return "";
            }
            //i = sc.nextInt();
        return s;
    }

    public static void main(String[] args) {
        CollectionDemo c = new CollectionDemo();
        c.getRegNumber();
    }
}
//Unchecked exception
class NotANumberException extends RuntimeException
{
    public NotANumberException(){
        super("Not a number");
    }
}