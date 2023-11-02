package org.example.amicablePairs;

public class AmicablePair {
    public static void main(String[] args) {

        isAmicablePair(284,220);


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
