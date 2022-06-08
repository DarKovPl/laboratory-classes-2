package com.company;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;
    private static int count;

    @BeforeClass
    public static void setUpBefore(){
        System.out.println("This executes before any test cases. Count= " + count++);
    }

    @org.junit.Before
    public void setUp() throws Exception {
        account = new BankAccount("Jan", "Kowalski", 1000.00);
        System.out.println("Running a test...");
    }


    @org.junit.Test
    public void deposit() {
        double balance = account.deposit(200.00);
        assertEquals(1200.00, balance,0);
    }

    @org.junit.Test (expected = IllegalArgumentException.class)
    public void withdraw() {
        account.withdraw(600.00, false);
        fail("Should have thrown an IllegalArgumentException");

    }

    @org.junit.Test
    public void getBalance_withdraw() {
        account.withdraw(100, false);
        assertEquals(900, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_deposit() {
        account.deposit(200.00);
        assertEquals(1200.00, account.getBalance(),0);
    }


    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("This executes after any test cases " + count++ );
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("This executes after all test cases " + --count );
    }
}