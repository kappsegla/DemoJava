package se.iths.martin;


import java.util.Scanner;

public class MenuDemo {

    public static void printMenu() {
        System.out.println("1. Alternativ 1");
        System.out.println("2. Alternativ 2");
        System.out.println("3. abc...");
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
            case "3":
                menyAlternativ3();
                break;
            default:
                break;

        }
    }

    private static void menyAlternativ3() {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println("Tecken: " + i);
        }

    }

    public static void menyAlternativ2() {
        System.out.println("Alternativ 2 valdes");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

    }

    private static void menyAlternativ1() {
        System.out.println("Alternativ 1 valdes.");
        for(int i = 10;  i < 100 ; i +=10 ){
            System.out.println(i);
        }
    }
}
