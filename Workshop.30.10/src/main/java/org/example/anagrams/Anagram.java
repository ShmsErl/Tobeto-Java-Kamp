package org.example.anagrams;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String text1, text2;

    do

    {
        System.out.print("Please Enter a First Word : ");
        text1 = scanner.nextLine();

        System.out.println("-------------------------------");

        System.out.print("Please Enter a Second Word: ");
        text2 = scanner.nextLine();

        char[] word1 = text1.toLowerCase().replace(" ", "").toCharArray();
        char[] word2 = text2.toLowerCase().replace(" ", "").toCharArray();

        Arrays.sort(word1);
        Arrays.sort(word2);
        boolean result = Arrays.equals(word1, word2);

        if (result) {
            System.out.println(text1.replace(" ", "") + " is an anagram of " + text2.replace(" ", ""));
        } else
            System.out.println(text1.replace(" ", "") + " is not an anagram of " + text2.replace(" ", ""));


        System.out.println("-------------------------------");

        System.out.println("Please Press 'e'  to exit; : ");
    }
    while(!text1.equals("E".toUpperCase()));
}
}
