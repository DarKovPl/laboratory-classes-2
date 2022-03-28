package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(3);
//        list.add(2);
//        list.add(7);
//        list.add (2);
//        System.out.println("The sum: "	+	sum(list));
//        list.add(10);
//        System.out.println("the sum: "	+	sum(list));


        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        System.out.println("The average is: " + average(list, (double)sum(list)));

    }



    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public static double average(ArrayList<Integer> list, Double sum){

        return sum / list.size();
    }

}
