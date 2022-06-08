package com.company;

import java.util.Scanner;

public class D_SumNumbers {
    public static void main(String[] args) {
        Scanner integer = new Scanner(System.in);
        int a, b;

        System.out.print("Enter number 1: ");
        a = integer.nextInt();

        System.out.print("Enter number 2: ");
        b = integer.nextInt();

        int sum = a + b;

        String output = String.format("Sum of two integers: %d", sum);
        System.out.println(output);
    }
}
