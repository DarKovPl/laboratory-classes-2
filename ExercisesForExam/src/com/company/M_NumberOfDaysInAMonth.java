package com.company;

import java.util.Scanner;

public class M_NumberOfDaysInAMonth {

    private int month;
    private int year;

    public M_NumberOfDaysInAMonth() {

    }

    public void getMonth_Method() {
        Scanner integer = new Scanner(System.in);

        System.out.print("Enter a month: ");
        this.month = integer.nextInt();
    }

    public void getYear_Method() {
        Scanner integer = new Scanner(System.in);

        System.out.print("Enter a year: ");
        this.year = integer.nextInt();
    }

    public int checkProvidedData(){
        this.getMonth_Method();
        if(this.month > 12 || this.month < 1) {
            return -1;
        }

        this.getYear_Method();
        if (this.year > 9999 || this.year < 1){
            return -1;
        }
        return 1;
    }

    public String checkLeapYear(){
        String[] noLeap = {"31", "28", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31"};
        String[] Leap = {"31", "29", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31"};

        if (checkProvidedData() != -1){

            if (this.year % 4 == 0 && this.year % 100 != 0){
                return Leap[this.month - 1];

            }
            else {
                return noLeap[this.month - 1];
            }
        }
        else {
            return "-1";
        }
    }
}
