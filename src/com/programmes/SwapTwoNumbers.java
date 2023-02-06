package com.programmes;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number1,number2;
        System.out.println("Kindly enter num1");
        number1 = scanner.nextInt();
        System.out.println("Kindly enter num2");
        number2 = scanner.nextInt();

        number1=number1+number2;
        number2=number1-number2;
        number1=number1-number2;

        System.out.println("Num 1: " + number1);
        System.out.println("Num 2: " + number2);
    }
}
