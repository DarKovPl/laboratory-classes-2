package com.company;

public class Main {

    public static void main(String[] args) {
        before();
        after();

    }
    public static void before() {
        System.out.println("Before exception");
        except();
    }
    public static void except() {
        try {
            String text = null;
            text.length();
            System.out.println("Test");
        }
        catch (NullPointerException ex){
            System.err.println(ex);
        }
    }

    public static void after()	{
        System.out.println("After exception");
    }

}
