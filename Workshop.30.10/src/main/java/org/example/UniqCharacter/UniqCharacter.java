package org.example.UniqCharacter;

import java.util.Scanner;

public class UniqCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;


        do {
            System.out.print("Please Enter a Word : ");
            text = scanner.nextLine();

        char[] character = text.replace(" ", "")
                .toLowerCase().toCharArray();

        int result = 0;
        for (int i = 0; i < character.length; i++) {

            for (int j = 0; j < character.length - 1; j++) {
                if (character[i] == character[j]) {
                    if (i != j) result++;
                }
            }
        }
        if (result == 0) {
            System.out.println("This string is UNIQUE");
        } else {
            System.out.println("This string is NOT UNIQUE");
        }

            System.out.println("-------------------------------");
            System.out.println("Please Press 'e'  to exit; : ");

    }
        while(!text.toUpperCase().equals("E"));
    }
}
