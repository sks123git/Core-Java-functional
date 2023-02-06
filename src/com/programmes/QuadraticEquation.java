package com.programmes;
import java.util.Scanner;

//Program to find quadratic equation
public class QuadraticEquation {
    public static void main(String[] args) {
        double aValue,bValue,cValue;
        double delta,squareroot;
        double root1 = 0;
        double root2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a");
        aValue = scanner.nextDouble();
        System.out.println("Enter the value of b");
        bValue = scanner.nextDouble();
        System.out.println("Enter the value of c");
        cValue = scanner.nextDouble();

        delta = Math.pow(bValue,2) - 4 * aValue * cValue;
        squareroot = Math.sqrt(delta);

        root1 = (-bValue + squareroot)/(2 * aValue);
        root2 = (-bValue - squareroot)/(2 * aValue);

        System.out.println("Root 1 of x: "+ root1 );
        System.out.println("Root 2 of x: "+ root2 );
    }
}
