package com.epam;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        int number;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        number = in.nextInt();
        System.out.print("Convert to binary is: ");
        printBinary(number);
    }
    private static void printBinary(int number) {
        int binary;
        if (number <= 1) {
            System.out.print(number);
            return;
        }
        binary = number % 2;
        printBinary(number >> 1);
        System.out.print(binary);
    }
}
