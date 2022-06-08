package com.company;

public class Invoice implements Payable {

    private final int quantity;
    private final double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        if(quantity < 0) {
            throw new IllegalArgumentException("Quantity must be >=0");
        }
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    @Override
    public double getPaymentAmount() {
        return getQuantity() + getPricePerItem();
    }
}
