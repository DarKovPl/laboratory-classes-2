package com.company;

public class Main {

    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee ( "Jan",  "Nowak",  5000,  0.9);
        System.out.println("First name is " + employee.getFirstName());
        System.out.println("Gross sales is " + employee.getGrossSales());
        System.out.println("Commision rate is " + employee.getCommissionRate());
        employee.setGrossSales(5000);
        employee.setCommissionRate(0.1);
        System.out.println("First name is " + employee.getFirstName());
        System.out.println("Gross sales is " + employee.getCommissionRate());
        System.out.println("Commision rate is " + employee.getGrossSales());
        System.out.println("EARNINGS employee "+ employee.earnings());

        // employee.setGrossSales(-5000) ;
        // employee.setCommissionRate (-0.1);
        System.out.println("First name is " + employee.getFirstName());
        System.out.println("Gross sales is " + employee.getCommissionRate());
        System.out.println("Commision rate is " + employee.getGrossSales());

        CommissionEmployee employee2 = new BaseEmployee ("Inny","Inny",6666.00, 0.4, 1234);
        System.out.println("EARNINGS "+ employee2.earnings());

        Payable[] payableObjects = new Payable[4];

        //first object is an invoice
        payableObjects [0] = new Invoice( "01234" ,"seat",  2, 450.00);
        payableObjects [1] = new Invoice("01235", "tire", 3, 200.00);

        //3-rd object is SalariedEmployee
        payableObjects [2] = new SalariedEmployee ( "Jan", "Kowalski", 4000.00);
        payableObjects [3] = new SalariedEmployee(  "Stefan",  "Kowalski",  2700.00) ;
        for (Payable currentPayable : payableObjects) {
            System.out.println(currentPayable.getPaymentAmount());
        }
    }
}
