package Calculate_n;

import java.util.Scanner;

public class CalculateN {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("----- How to calculate n! -----");
        System.out.println("Input n: ");
        int n = scanner.nextInt();
        CalculateN.solve_n(n);
    }

    public static void solve_n(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println(n + "! = " + result);
    }
}
