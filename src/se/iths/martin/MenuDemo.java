package se.iths.martin;


import java.util.Scanner;

public class MenuDemo {


    public static void printMenu() {

//        String[] menuOptions = new String[4];
//        menuOptions[0] = "1. Alternativ 1";
//        menuOptions[1] = "2. Alternativ 2";
//        menuOptions[2] = "3. abc...";
//        menuOptions[3] = "0. Avsluta";
//        for (int i = 0; i < menuOptions.length; i++) {
//            System.out.println(menuOptions[i]);
//        }

        String[] menuOptions = new String[]{
                "1. Alternativ 1", "2. Alternativ 2",
                "3. abc...", "0. Avsluta"};

        for (String s : menuOptions) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        String val;
        Scanner sc = new Scanner(System.in);

        do {
            printMenu();
            System.out.print("Gör ett val: ");
            val = sc.nextLine();

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
        } while (!val.equals("0"));
    }

    private static void menyAlternativ3() {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println("Tecken: " + i);
        }

        char i = 'a';
        while (i <= 'z') {
            System.out.println("Tecken: " + i);
            i++;
        }
    }

    public static void menyAlternativ2() {
        System.out.println("Alternativ 2 valdes");

        int[] myArray = new int[10];

        myArray[0] = 10;
        myArray[1] = 9;
        myArray[2] = 8;
        myArray[3] = 7;
        myArray[4] = 6;
        myArray[5] = 5;
        myArray[6] = 4;
        myArray[7] = 3;
        myArray[8] = 2;
        myArray[9] = 1;
        myArray[10] = 0;

        for (int i = 0; i < 11; i++) {
            System.out.println(myArray[i]);
        }


//        for (int i = 10; i >= 0; i--) {
//            System.out.println(i);
//        }
    }

    private static void menyAlternativ1() {
        System.out.println("Alternativ 1 valdes.");
        for (int i = 10; i < 100; i += 10) {
            System.out.println(i);
        }
    }
}
