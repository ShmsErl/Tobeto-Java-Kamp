package org.example.amstrongNumber;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Please Enter a Number : ");
            number = scanner.nextInt();


            long[] arrays = new long[number];
            if(number < 2 ){
                System.out.println("first two fibonacci numbers : " + 0 + " "  + 1);
            }
            else {
                arrays[0] = 0;
                arrays[1] = 1;
                for (int i = 2; i < number; i++) {
                    arrays[i] = arrays[i - 1] + arrays[i - 2];

                }
                for (long value : arrays) {
                    System.out.println(" Fibonacci Number: " + value);

                }
            }
            System.out.println("-------------------------------");
            System.out.println("Please Press '0'  to exit; : ");
        }
        while(number != 0);

        }
    }


