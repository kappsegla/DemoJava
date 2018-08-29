package se.iths.martin;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Övning1Uppgift9 {

    //Exempel Övning1 Uppgift9

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text;
        int length = 0;
        String[] strings = new String[10];
        //Alternativt, använd ArrayList<String> som typ. Den växer automatiskt
        //när mer plats behövs.
        int counter = 0;

        while (true) {
            text = sc.nextLine();
            if (text.length() <= length)
                break;
            length = text.length();
            strings[counter++] = text;
            if( counter > strings.length - 1)
            {
                //Arrayen är full. Skapa en med 10 fler platser och kopiera över den gamla
                String[] nystrings = new String[strings.length + 10];
                for (int i = 0; i < strings.length; i++) {
                    nystrings[i] = strings[i];
                }
                strings = nystrings;
            }
        }
        //Skriv ut alla inmatade strängar
        for (String s : strings ) {
            if( s == null)
                break;
            System.out.println(s);
        }

    }
}
