package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        First Method task 9.
//       Integer out_I = I_SumMethod.sumA_And_B_Method();
//       System.out.println(out_I);


//       Second Method task 10
//        String out_J = String.valueOf(J_LeastNumberMethod.printLeastNumber());
//        System.out.println("Least number is " + out_J);


//        Third Method task 11
//        String out_K = String.valueOf(K_AverageNumberMethod.averageBySum_Method());
//        System.out.println(out_K);


//        Fourth Method task 12
//        String out_L = String.valueOf(L_DoubleTestMethod.checkEqualDouble());
//        System.out.println(out_L);


//        Fifth Method task 13

//        String out_M = new M_NumberOfDaysInAMonth().checkLeapYear();
//        System.out.println(out_M);

//        Sixth Method task 14
//        Integer out_N = new N_AddFirstAndLastDigitFromNumber().returnSumOfDigits();
//        System.out.println(out_N);


//        Seventh Method task 15
//        Integer out_O = new O_SumEvenDigitFromNumber().sumEvenNumber();
//        System.out.println(out_O);

//        Eighth Method task 16
        P_EuclidesAlgorithm instance = new P_EuclidesAlgorithm();
        int a = instance.getA_Method();
        int b = instance.getB_Method();
        if (a > 0 && b > 0) {
            System.out.println(instance.calculateGCD(a, b));
        }
        else System.out.println(-1);
    }
}
