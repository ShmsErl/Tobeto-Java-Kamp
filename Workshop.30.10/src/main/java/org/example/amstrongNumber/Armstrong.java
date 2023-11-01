package org.example.amstrongNumber;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number ;

        do{
            System.out.print("Please enter a number : ");
            number = scanner.nextInt();

            // Amstrong sayı : Girilen Rakamın basamak sayılarının küpünün toplamı kendisine eşit sayı demektir.
            int result = 0;
            String value = String.valueOf(number);
            for (int i = 0; i < value.length(); i++) {
                int b = Character.getNumericValue(value.charAt(i));
                result += Math.pow(b, 3);

            }


            if (result == number) {
                System.out.println("This is a ARMSTRONG NUMBER. ");
            } else System.out.println("This is a NOT ARMSTRONG NUMBER.");

            System.out.println("-------------------------------");
            System.out.println("Please Press '0'  to exit; : ");

        }
        while (number != 0);



    }
}
