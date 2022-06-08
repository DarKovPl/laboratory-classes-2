package com.company;

import java.util.Scanner;


public class L_DoubleTestMethod {
    public static double getA_Method() {
        Scanner double_num = new Scanner(System.in);
        double a;

        System.out.print("Enter number A: ");
        a = double_num.nextDouble();
        return a;
    }

    public static double getB_Method() {
        Scanner double_num = new Scanner(System.in);
        double b;

        System.out.print("Enter number B: ");
        b = double_num.nextDouble();
        return b;
    }

    public static boolean checkEqualDouble(){
        double a = getA_Method() * 1000;
        double b = getB_Method() * 1000;

        return (int)a == (int)b;

    }
}
