package com.company;

import java.util.Scanner;

public class J_LeastNumberMethod {
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

    public static Integer printLeastNumber(){
        Integer a = getA_Method();
        Integer b = getB_Method();

        if (a <= b)
        {
          return a;
        }

        else
        {
            return b;
        }

    }


}
