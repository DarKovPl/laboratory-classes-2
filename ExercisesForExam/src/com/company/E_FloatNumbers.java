package com.company;

import java.util.Scanner;

public class E_FloatNumbers {
    public static void main(String[] args) {
        Scanner integer = new Scanner(System.in);
        int a, b;

        System.out.print("Enter number 1: ");
        a = integer.nextInt();

        System.out.print("Enter number 2: ");
        b = integer.nextInt();

        float sum = (float)a / (float)b;

        String output = String.format("Fraction of two integers: %f", sum);
        System.out.println(output);
    }
}
