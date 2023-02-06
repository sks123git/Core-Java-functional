package com.programmes;
import java.util.Scanner;

// program to find effective temperature
public class WindChill {
    public static void main(String[] args) {
        double temperature, velocity;
        double windChill = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in fahrenheit:");
        temperature = scanner.nextDouble();
        System.out.println("Enter wind velocity");
        velocity = scanner.nextDouble();
        if(temperature>50 || velocity>120 || velocity<3){
            System.out.println(" kindly enter velocity within 3-120 and temperature within 50");
        } else {
            windChill = 35.74 + (0.6215 * temperature) + (0.4275 * temperature - 35.75) * Math.pow(velocity,0.16);

            System.out.println("Effective temperature: " + windChill);}
    }
}
