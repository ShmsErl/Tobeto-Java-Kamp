package org.example;

import java.lang.reflect.Array;
import java.time.chrono.ChronoLocalDate;
import java.util.*;
import java.util.concurrent.Callable;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        isAmicablePair(1184,1210);
        //isAllUniq("sehmus");
        //isAnagram("sil  e  nt","lis ten");
       //amstrong(153);
        // fibonacciNumber(100);
       // letterCount("T  ob e to ");
        //perferctNumber();


    }



    //f(n) = f(n-1) + f(n-2) //




    public static void perferctNumber() {
        int count = 0; // Bulunan mükemmel sayıların sayısı
        long number = 2; // Formülde kullanılan sayının başlangıç değeri

        System.out.println(" 10 Perfect Number :");

        while (count < 10) {
            long perfect = ((1L << number) - 1) * (1L << (number - 1));

            if (isPerfect(perfect)) {
                System.out.println(perfect);
                count++;
            }
            number++;
        }




    }
    // Bir sayının mükemmel olup olmadığını kontrol eden fonksiyon
    public static boolean isPerfect ( long n){
        long sum = 1; // 1 her zaman bölen olarak kullanılır
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }
        return sum == n;
    }

    // Girilen iki farklı kelimenin aynı harflere sahip fakat farklı kelimelerden oluşan olup olmadığını bulma


    public static void isAllUniq(String text) {
        char[] character = text.replace(" ", "")
                .toLowerCase().toCharArray();

        int result = 0;
        for (int i = 0; i < text.length(); i++) {

            for (int j = 0; j < text.length() - 1; j++) {
                if (character[i] == character[j]) {
                    if (i != j) result++;
                }
            }
        }
        if (result != 0) {
            System.out.println("This string is UNIQUE");
        } else {
            System.out.println("This string is NOT UNIQUE");
        }

    }

    public static void isAmicablePair(int... numbers){
        int number1 = 0 , number2 = 0;

        int[] values = new int[]{number1,number2};
        for(int i = 0 ; i < numbers.length ; i++){
            int total = 0;
            for(int j = 1 ; j < numbers[i]; j++){
                if(numbers[i] % j == 0){
                    total +=j;
                }
            }
            values[i] = total;

        }
        for (int item :values) {

            System.out.println(item);

        }if(numbers[0] == values[1] && numbers[1] == values[0]){

            System.out.println("This numbers is AMİCABLE PAİR");
        } else {
            System.out.println("This numbers is NOT AMİCABLE PAİR");
        }


    }

}




