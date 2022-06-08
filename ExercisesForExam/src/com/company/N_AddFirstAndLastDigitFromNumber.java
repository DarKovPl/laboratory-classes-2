package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class N_AddFirstAndLastDigitFromNumber {

    public int getNumber_Method() {
        Scanner integer = new Scanner(System.in);

        System.out.print("Enter a number: ");
        return integer.nextInt();
    }

    public int returnSumOfDigits(){
        ArrayList<Integer> int_number = new ArrayList<>();
        int num = getNumber_Method();

        if (num > 0) {
            int first_digit = 0;

            int last_digit = num % 10;
            int_number.add(last_digit);

            while (num > 0) {
                first_digit = num;
                num /= 10;
            }

            int_number.add(first_digit);

            return int_number.get(0) + int_number.get(1);
        }
        else return -1;
    }

}
