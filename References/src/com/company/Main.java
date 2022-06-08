package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        int myIntValue = 10;
//        int anotherIntValue = myIntValue;
//        System.out.println("myIntValue " + myIntValue);
//        System.out.println("anotherIntValue " + anotherIntValue);
//
//        anotherIntValue++;
//
//        System.out.println("myIntValue " + myIntValue);
//        System.out.println("anotherIntValue " + anotherIntValue);

        int[] myIntArray = new int[5];

        System.out.println("myIntArray" + Arrays.toString(myIntArray));
        System.out.println("anotherArray" + Arrays.toString(myIntArray));

        myIntArray[0] = 1;

        System.out.println("after change myIntArray" + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray" + Arrays.toString(myIntArray));


    }
}
