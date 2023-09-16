package Equation_two;

import java.text.DecimalFormat;
import java.util.Scanner;

public class equation {
    private static Scanner scanner = new Scanner(System.in);
    private static DecimalFormat df = new DecimalFormat("#.##");

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("--------2nd degree equation---------");
        // input a, b, c
        System.out.println("Enter number a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter number b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter number c: ");
        double c = scanner.nextDouble();
        equation.check_solve(a, b, c);
    }

    // check a, b, c ; if it ok, solve math
    public static void check_solve(double a, double b, double c) {
        double x;
        if (a == 0) {
            if (b == 0) {
                System.out.println("Equation haven't solution");
            } else {
                System.out.println("Equation have 1 solution:");
                x = c / b;
                System.out.println("x= " + df.format(x));
            }
        } else {
            equation.solve_math(a, b, c);
        }
    }

    // solve 2nd degree equation
    public static void solve_math(double a, double b, double c) {
        double x, x1, x2, dental;
        dental = Math.pow(b, 2) - 4 * a * c;
        if (dental == 0) {
            System.out.println("Equation have double solution:");
            x = -b / (2 * a);
            System.out.println("x= " + df.format(x));
        } else if (dental > 0) {
            System.out.println("Equation have 2 distinct solutions:");
            x1 = (-b + dental) / 2 * a;
            x2 = (-b - dental) / 2 * a;
            System.out.println("x1= " + df.format(x1));
            System.out.println("x2= " + df.format(x2));
        } else {
            System.out.println("Equation have 2 complex solution:");
            double real = -b / 2 * a;
            double virtual = Math.sqrt(-dental) / 2 * a;
            System.out.println("x1 = " + df.format(real) + " + " + df.format(virtual) + "i");
            System.out.println("x1 = " + df.format(real) + " - " + df.format(virtual) + "i");
        }
    }
}
