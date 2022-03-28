package com.company;

public class BaseEmployee extends CommissionEmployee{

    private double baseSalary;

    public BaseEmployee(String firstName, String lastName, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }


    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return getBaseSalary() + getCommissionRate() * getGrossSales();
    }


}
