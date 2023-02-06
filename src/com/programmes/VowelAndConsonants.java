package com.programmes;
import java.util.Scanner;

//Program for verifying vowel or consonant
public class VowelAndConsonants {
    public static void main(String[] args) {
        String alphabet;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a alphabet");
        alphabet = scanner.next();
        switch (alphabet){
            case "a":
                System.out.println("Its a vowel");
                break;
            case "e":
                System.out.println("Its a vowel");
                break;
            case "i":
                System.out.println("Its a vowel");
                break;
            case "o":
                System.out.println("Its a vowel");
                break;
            case "u":
                System.out.println("Its a vowel");
                break;
            case "A":
                System.out.println("Its a vowel");
                break;
            case "E":
                System.out.println("Its a vowel");
                break;
            case "I":
                System.out.println("Its a vowel");
                break;
            case "O":
                System.out.println("Its a vowel");
                break;
            case "U":
                System.out.println("Its a vowel");
                break;
            default:
                System.out.println("its a consonant");

        }
    }
}
