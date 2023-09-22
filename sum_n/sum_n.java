package sum_n;

import java.util.Scanner;

public class sum_n {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("----- Sum 1+2+...+n -------");
        System.out.println("Input n:");
        int n = scanner.nextInt();
        sum_n.sumN(n);
    }

    public static void sumN(int n) {
        int Sum = 0;
        for (int i = 0; i <= n; i++) {
            Sum += i;
        }
        System.out.println("1+2+3+...+n = " + Sum);
    }
}
