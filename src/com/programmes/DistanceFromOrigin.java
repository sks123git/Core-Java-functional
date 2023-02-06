package com.programmes;
import java.util.Scanner;

// program to find euclidean distance from origin
public class DistanceFromOrigin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double xAxis; //x axis
        double yAxis; //y axis
        double distance;
        System.out.println("Enter point x:");
        xAxis = scanner.nextInt();
        System.out.println("Enter point y:");
        yAxis = scanner.nextInt();
        distance = Math.sqrt(Math.pow(xAxis,2)+Math.pow(yAxis,2));
        System.out.println("The distance is: " + distance);
    }
}
