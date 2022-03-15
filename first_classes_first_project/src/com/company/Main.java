package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner scanner =  new Scanner(System.in);
//        System.out.println("Enter two numbers: ");
//
//        int first = scanner.nextInt();
//        int second = scanner.nextInt();
//        int sum = first + second;
//
//        System.out.println("Sum: " + sum);


//        Scanner scanner =  new Scanner(System.in);
//        System.out.println("Enter two numbers: ");
//
//        double first = scanner.nextInt();
//        double second = scanner.nextInt();
//        double sum = first / second;
//
//        System.out.println("Sum: " + sum);


//        Scanner scanner =  new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int number = scanner.nextInt();
//
//        if(number > 0){
//            System.out.println("Number is grater than zero.");
//        }
//
//        else if (number < 0){
//            System.out.println("Number is less than zero.");
//        }
//
//        else{
//            System.out.println("Number is zero");
//        }



//        Scanner scanner =  new Scanner(System.in);
//        System.out.println("Enter number: ");
//        double number = scanner.nextInt();
//
//        if(number % 2 == 0 ){
//            System.out.println("Number is even");
//        }
//        else{
//            System.out.println("Number is odd");
//        }


//        Scanner scanner =  new Scanner(System.in);
//        System.out.println("Enter two numbers: ");
//        int first = scanner.nextInt();
//        int second = scanner.nextInt();

//        Numbers.printNumbers(first, second);
//        System.out.println(sum(5, 6));
//        System.out.println(least(0, 0));
//        System.out.println(average(2, 4));

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(2,2018));
        System.out.println(getDaysInMonth(-1,2030));





    }

//    public static int sum(int number, int number_2){
//
//        int sum = number + number_2;
//
//        return sum;
//    }
//
//    public static int least(int number_1, int number_2){
//
//        if(number_1 > number_2)
//            return number_2;
//
//        else
//            return number_1;
//
//    }
//
//    public static double average(int number_1, int number_2 ){
//        double sum = sum(number_1, number_2);
//        return (sum / 2);
//
//    }
//
//    public static boolean areEqualByThreeDecimalPlaces(double count_1, double count_2){
//        int compare_1 = (int) (count_1 * 1000);
//        int compare_2 = (int) (count_2 * 1000);
//        return (compare_1 == compare_2);
//
//    }

    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999){
            return false;
        }
        else return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static int getDaysInMonth(int month, int year){
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)){
            return -1;
        }
        else {
            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12: return 31;
                case 2: return isLeapYear(year) ? 29 : 28;
                default: return 30;

            }
        }
    }

}
