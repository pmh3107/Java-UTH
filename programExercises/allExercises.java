package programExercises;

import java.util.Scanner;

public class allExercises {
    // This is all programming exercises in chapter 01 and 02
    // All programming exercises will summary become one file have menu and
    // selection.
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("========== Programming exercises ========== ");
        System.out.println("(1). _ Sum _ 1+2+3+...+n ");
        System.out.println("(2). _Calculate n!_ n!=? ");
        System.out.println("(3). _Check a number is a prime number or not_");
        System.out.println("(4). _Input full name_ the name will out put at prope");
        System.out.println("(5). _Transfer Decimal number to Briary number_");
        System.out.println("(0). _ Exit_");
        System.out.println(" Please input one of programming exercises (0 to 6):");
        int selection = scanner.nextInt();
        if (selection > 5) {
            System.out.println("Wrong input !!");
        } else {
            switch (selection) {
                case 1:
                    allExercises.sum_n();
                    break;
                case 2:
                    allExercises.nFactorial();
                    break;
                case 3:
                    allExercises.checkN();
                    break;
                case 4:
                    allExercises.floralText();
                    break;
                case 5:
                    allExercises.ioTransfer();
                    break;
                case 0:
                    break;
            }
        }

    }

    public static void sum_n() {
        System.out.println("========== _ Sum _ 1+2+3+...+n_ ========== ");
        System.out.println("Please input n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;// sum = sum+i
        }
        System.out.println("Sum n = " + sum);
    }

    public static void nFactorial() {
        System.out.println("_Calculate n!_ n!=?_");
        System.out.println("Please input n: ");
        int n = scanner.nextInt();
        int result = 1;
        for (int i = 1; i < n; i++) {
            result *= i; // result = result * i
        }
        System.out.println("n!= " + result);
    }

    public static void checkN() {
        // prime number is a number when it divisible by 1 and itself
        System.out.println("_Check a number is prime number or not_");
        System.out.println("Please input n: ");
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("The number " + n + " is not a prime number !");
        } else {
            System.out.println("The number " + n + " is a prime number !");
        }
    }

    public static void floralText() {
        StringBuilder outPut = new StringBuilder();
        System.out.println("_Input full name_ the name will out put at capitalize each first character");
        System.out.println("Input your full name: ");
        String nothing = scanner.nextLine(); // Because switch case create a enter white space so I create a fake value
                                             // to process it.
        String fullName = scanner.nextLine();
        // slit : separate to character base white space
        String[] words = fullName.split(" ");
        // ... ?
        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                outPut.append(firstChar).append(word.substring(1)).append(" ");
            }
        }
        System.out.println("Your full name after capitalization: " + outPut.toString());
    }

    public static void ioTransfer() {
        System.out.println("_Transfer Decimal number to Briary number_");
        System.out.println("Input decimal number: ");
        int decimal = scanner.nextInt();
        System.out.println("Briary number: " + transfer(decimal));
    }

    public static long transfer(int decimal) {
        long briaryNumber = 0;
        int p = 0;
        while (decimal > 0) {
            briaryNumber += (decimal % 2) * Math.pow(10, p);
            p++;
            decimal /= 2;
        }
        return briaryNumber;
    }

}
