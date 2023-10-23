package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Java ve Sınıflar PascalCase(Baş harfleri büyük), olarak tanımlamır // Örnek olarak Main Clasını verebiliriz.


        // Java Değişkenler(variable) camelCase(ilk kelimenin baş harfi küçük diğer kelime baş  harfleri büyük), olarak tanımlamır.
        String organizationName = "Tobeto";
        String instructorName = "Halit Kalayacı";
        String lessonName = " Fullstack Developer RoadMap with Java";

        System.out.println( " Kurum adı : " + organizationName +
                "\n Eğitmen Adı: " + instructorName +
                "\n Ders Adı: " + lessonName );

            int vadeCount = 12;
            Double dolarDun = 18.5;
            Double dolarBugun = 18.6;
            boolean status;

        String svgUrl = "";

            if(dolarDun > dolarBugun){
                svgUrl = "down.svg";
                System.out.println("Dolar Düştü");
            }
            else if(dolarDun == dolarBugun){
                svgUrl = "up.svg";
                System.out.println("Dolar fiyatı Değişmedi");

            }
            else {
                svgUrl = "equals.svg";
                System.out.println("Dolar yükseldi");
            }


           // -----------------------------------------------------//
        System.out.println(("-----------------------Kredi Türleri-------------------------------"));
        String [] krediler = {"Hızlı Kredi", "Krediniz Halktbanktan", "Mutlu Emekli"};

        for (String x : krediler) {
            System.out.println(x);

        }

    }
}