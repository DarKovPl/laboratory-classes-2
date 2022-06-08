package com.company;

import java.util.Scanner;

public class F_PositiveNumber {
    public static void main(String[] args) {

        Scanner integer = new Scanner(System.in);
        int a;

        System.out.print("Enter number: ");
        a = integer.nextInt();

        if (a > 0) {
            System.out.println(a);
        }
        else {
            System.out.println("Integer is not greater than zero.");
        }
    }
}
