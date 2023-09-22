package checkInteger;

import java.util.Scanner;

public class checkInteger {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("----- Check the number is Integer or not --------");
        System.out.println(" Input n: ");
        int n = scanner.nextInt();
        checkInteger.checkNisInteger(n);
    }

    private static void checkNisInteger(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("n is not a prime number !");
        } else {
            System.out.println(" n is a prime number !");
        }
    }

}
