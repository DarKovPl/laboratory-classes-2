package com.company;

import java.util.Scanner;

public class G_EvenAndOddNumber {
    public static void main(String[] args) {

        Scanner integer = new Scanner(System.in);
        int a;

        System.out.print("Enter number: ");
        a = integer.nextInt();

        if (a % 2 == 0) {
            System.out.println("Number " + a + " is a even.");
        }
        else {
            System.out.println("Number " + a + " is odd.");
        }
    }
}
