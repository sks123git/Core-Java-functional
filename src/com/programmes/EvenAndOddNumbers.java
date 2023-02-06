package com.programmes;
import java.util.Scanner;

// Program to find given number is even or odd
public class EvenAndOddNumbers {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        number = scanner.nextInt();

        if(number%2==0)
            System.out.println("Its an even number");
        else
            System.out.println("Its an odd number");
    }
}
