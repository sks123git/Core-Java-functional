package com.programmes;
import java.util.Scanner;

// Program to find Quotient and remainder
public class QuotientAndRemainder {
    public static void main(String[] args) {
        int quotient,remainder,divisor,dividend;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number and divisor to find quotient and remainder: ");
        dividend = scanner.nextInt();
        divisor = scanner.nextInt();
        quotient = dividend/divisor;
        remainder = dividend - (divisor * quotient);
        System.out.println("Quotient is: "+ quotient);
        System.out.println("Remainder is: "+ remainder);

    }
}
