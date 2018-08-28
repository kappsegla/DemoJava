package se.iths.martin;


import java.util.Scanner;

public class MenuDemo {

    public static void printMenu() {
        System.out.println("1. Alternativ 1");
        System.out.println("2. Alternativ 2");
    }


    public static void main(String[] args) {
        printMenu();
        System.out.print("Gör ett val: ");

        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();

        switch (val) {
            case "1":
                menyAlternativ1();
                break;
            case "2":
                menyAlternativ2();
                break;
            default:
                break;

        }
    }

    public static void menyAlternativ2() {
        System.out.println("Alternativ 2 valdes");
    }

    private static void menyAlternativ1() {
        System.out.println("Alternativ 1 valdes.");
    }
}
