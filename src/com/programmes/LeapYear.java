package com.programmes;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        int count = 0;
        System.out.println("Enter the year: ");
        year = scanner.nextInt();
        int temprory = year;
        while (temprory != 0) {                                 //counting digits
            temprory = temprory / 10;
            ++count;
        }
        if (count != 4) {                                  //checking whether the year is of 4 digits or not
            System.out.println("Kindly enter 4 digit year");
        } else {
            if (year % 4 == 0) {                            //checking if the year is leap or not
                if ((year % 100 != 0) && (year % 400 == 0)) {
                    System.out.println("Year is leap year");
                } else {
                    System.out.println("Year is not leap year");
                }
            } else {
                System.out.println("Year is not a leap year");
            }
        }
    }
}
