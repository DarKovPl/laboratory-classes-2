package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

//    public static void main(String[] args) {
//        int x = 30;
//        int y = 0;
////        System.out.println(divideEx(x, y));
////        System.out.println(divideIf(x, y));
//
//    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        try{
            int i = scan.nextInt();
            System.out.println(i);
            scan.close();
        }catch(InputMismatchException e){
            System.out.println("Number format exception occurred");
        }
    }


//    private static int divide(int x, int y) {
//
//        return x / y;
//    }
//
//    private static int divideEx(int x, int y) {
//        try {
//            return x / y;
//        } catch (ArithmeticException e) {
//            return 0;
//        }
//    }
//
//    private static int divideIf(int x, int y){
//            if (y != 0) {
//                return x / y;
//            } else {
//                return 0;
//            }
//        }





}