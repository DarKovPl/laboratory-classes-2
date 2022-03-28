package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        int[] array = {1, 2, 3, 4, 5};
//        reverse(array);
//        System.out.println("Reversed array = " + Arrays.toString(array));

        int[] array_2 = {4, 2, 1, 3, 5};
        descendingSort(array_2);
        System.out.println("Sorted array = " + Arrays.toString(array_2));
        
    }

    private static void reverse (int[] array) {

        int maxIndex = array.length - 1;

        for (int i = 0; i <= array.length / 2; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }

    }

    private static void descendingSort (int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

    }
    

}
