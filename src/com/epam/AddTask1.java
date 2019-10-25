package com.epam;

import java.util.Scanner;
    public class AddTask1 {
        public static void main (String[] args){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a positive integer");
            int number;
            number = in.nextInt();
            getNumbers(number);
        }
        public static void getNumbers(int number){
            String temp = Integer.toString(number);
            char lastNum = temp.charAt(temp.length() - 1);
            char lastNum2 = temp.charAt(temp.length() - 2);

            System.out.println("The number is: " + lastNum + lastNum2);
     }
}

