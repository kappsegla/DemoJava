package se.iths.martin;


import java.util.Scanner;

public class MenuDemo {

    public static void printMenu(){
        System.out.println("1. Alternativ 1");
        System.out.println("2. Alternativ 2");
    }


    public static void main(String[] args)
    {
        printMenu();
        System.out.print("Gör ett val: ");

        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();



    }
}
