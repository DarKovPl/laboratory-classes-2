package com.company;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4.0);

        System.out.println("Sum " + calculator.getAdditionResult());

        Calculator calculator_2 = new Calculator(10, 2);
        System.out.println("Sum 2: " + calculator_2.getAdditionResult());

    }
}
