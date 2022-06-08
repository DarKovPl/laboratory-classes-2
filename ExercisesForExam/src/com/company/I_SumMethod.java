package com.company;

import java.util.Scanner;

public class I_SumMethod {
    public static int getA_Method() {
        Scanner integer = new Scanner(System.in);
        int a;

        System.out.print("Enter number A: ");
        a = integer.nextInt();
        return a;
    }

    public static int getB_Method() {
        Scanner integer = new Scanner(System.in);
        int b;

        System.out.print("Enter number B: ");
        b = integer.nextInt();
        return b;
    }

    public static int sumA_And_B_Method() {
        Integer a = getA_Method();
        Integer b = getB_Method();

        int sum =  a + b;

        return sum;
    }

}
