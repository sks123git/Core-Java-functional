package com.programmes;
import java.util.Scanner;

//Program to find largest of three numbers
public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
        int number1,number2,number3;
        System.out.println("Enter 3 numbers");
        Scanner scanner = new Scanner(System.in);
        number1=scanner.nextInt();
        number2=scanner.nextInt();
        number3=scanner.nextInt();
        if(number1>=number2 && number1>=number3){
            System.out.println(number1 + " is Largest");
        } else if (number2>=number1 && number2>=number3) {
            System.out.println(number2 + " is Largest");

        }else {
            System.out.println(number3 + " is Largest");
        }
    }
}
