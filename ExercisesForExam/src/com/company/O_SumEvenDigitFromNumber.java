package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class O_SumEvenDigitFromNumber {
    public int getNumber_Method() {
        Scanner integer = new Scanner(System.in);

        System.out.print("Enter a number: ");
        return integer.nextInt();
    }

    public int sumEvenNumber(){
        ArrayList<Integer> int_number = new ArrayList<>();
        int num = getNumber_Method();
        if(num > 0) {
            while (num > 0) {
                int last_digit = num % 10;

                if (last_digit % 2 == 0) {
                    int_number.add(last_digit);

                }
                num /= 10;
            }
            return int_number.stream().mapToInt(a -> a).sum();
        }
        else return -1;
    }


}
