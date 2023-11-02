package org.example.CharacterCount;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CharacterCount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text, value ;
        do{
            System.out.print("Please Enter a Number : ");
            text = scanner.nextLine();
            value = text.toLowerCase().replace(" ", "");

            Map<Character, Integer> list = new TreeMap<>();
            char[] character = value.toCharArray();

            for (int i = 0; i < value.length(); i++) {

                int sayac = 0;
                for (int j = 0; j < value.length(); j++) {

                    if (character[i] == character[j]) {
                        sayac++;
                    }
                }

                Character character1 = character[i];
                list.put(character[i], sayac);

            }

            for (Character key : list.keySet()) {
                System.out.println("Key: " + key + ", Value: " + list.get(key));
            }

            System.out.println("-------------------------------");
            System.out.println("Please Press 'e'  to exit; : ");



        }
        while (!value.equals( "e"));
        //Klavyeden alınan metnin içerisindeki her bir harfin sayısını veren program



    }
}
