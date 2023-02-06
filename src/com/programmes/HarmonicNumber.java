package com.programmes;
import java.util.Scanner;
//Program to print nth harmonic number
public class HarmonicNumber {
    public static void main(String[] args) {
        int nth,i;
        float harmonicValue = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kindly enter Nth number");
        nth = scanner.nextInt();
        for (i=2; i<=nth; i++){
            harmonicValue += (float)1 / i;
        }
        System.out.println("Nth harmonic value is " + harmonicValue);
    }
}
