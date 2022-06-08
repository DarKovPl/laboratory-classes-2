package com.company;

import java.util.Scanner;

public class P_EuclidesAlgorithm {

    private int a;
    private int b;

    public P_EuclidesAlgorithm() {

    }



    public int getA_Method() {
        Scanner integer = new Scanner(System.in);

        System.out.print("Enter number A: ");
        return a = integer.nextInt();
    }

    public int getB_Method() {
        Scanner integer = new Scanner(System.in);

        System.out.print("Enter number B: ");
        return b = integer.nextInt();
    }

    public int calculateGCD(int a, int b){
        if(b > 0){
            return calculateGCD(b, a % b);
        }
        else return a;
    }


}
