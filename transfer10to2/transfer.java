package transfer10to2;

import java.util.Scanner;

public class transfer {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("---- Transfer Decimal to Briary number-------");
        System.out.println("Input Decimal:  ");
        int decimal = scanner.nextInt();
        System.out.println("Briary Number is : " + transferDecimalToBriary(decimal));
    }

    public static long transferDecimalToBriary(int decimal) {
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
