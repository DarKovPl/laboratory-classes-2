package com.company;

import java.util.Scanner;

public class H_PrintRangeNumbers {
    public static void main(String[] args) {

        Scanner integer = new Scanner(System.in);
        int a,b;

        System.out.print("Enter number: ");
        a = integer.nextInt();
        System.out.print("Enter number: ");
        b = integer.nextInt();

        if (a < b) {
            a++;
            for (; a < b; a++){
                System.out.println(a);
            }
        }

    }
}
