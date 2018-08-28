package se.iths.martin;


import java.util.Scanner;

public class Test {

    int classVariable = 10;

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World!");

        int a = 1;
        float b = 1.0f;
        double c = 1.0;
        long d = 1L;

        //Avrundning till närmaste heltal genom att plussa på 0.5 innan decimaler tas bort
        double dd = 1.5;
        int ii = (int) (dd + 0.5);


       // System.out.println(ii);

        Scanner sc = new Scanner(System.in);
        sc.nextLine();



 /*       int antal = 100;

        antal = 100;
        char tecken = 'A';

        float decimalTal = 5.0f;

        String textSträng = "He\\j";

        int result1 = 11 / 2;  //Svar 5 som heltal
        double result2 = 11 / 2.0; //Svar 5.5 som double
        int result3 = 11 % 2; // Svar 1 som heltal, kan användas för att testa för udda/jämna tal
*/

/*      //Operator ++ pre and post fix
        int i = 1;
        System.out.println(i);    //1 1 3 3
        System.out.println(i++);
        System.out.println(++i);
        System.out.println(i);*/
    }
}
