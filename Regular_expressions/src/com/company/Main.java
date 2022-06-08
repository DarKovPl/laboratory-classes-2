package com.company;

public class Main {

    public static void main(String[] args) {

        String alpanumeric = "abcDDDeeeeeF12Ghhhiiijkl99z";
        System.out.println(alpanumeric.replaceAll( ".","Y"));
        System.out.println((alpanumeric.replaceAll( "^abc",  "Y")));
        System.out.println((alpanumeric.replaceAll( "99z$",  "THE END")));
        System.out.println((alpanumeric.replaceAll( "[aei]", "X")));
        System.out.println((alpanumeric.replaceAll( "[aei] [Fj]", "X")));
        System.out.println((alpanumeric.replaceAll( "[a-fA-F3-8]", "X")));
        System.out.println((alpanumeric.replaceAll( "(?i) [a-f3-8]", "X")));
        System.out.println((alpanumeric.replaceAll("[0-9]",  "X")));
        System.out.println((alpanumeric.replaceAll(  "\\d","X")));
        System.out.println((alpanumeric.replaceAll( "\\D",  "X")));

        String kkkk =  "1999-01-21";
        String kkkk_1 = "2100-12-31";
        System.out.println((kkkk.replaceAll( "[12]\\d{3}-[120]\\d-[213]\\d", "Ok")));
        System.out.println((kkkk_1.replaceAll( "[12]\\d{3}-[120]\\d-[213]\\d", "Ok")));

        String kkkk_2 =  "11-10-2001";
        String kkkk_3 = "9-2-99";
        System.out.println((kkkk_2.replaceAll( "[12]\\d{3}-[120]\\d-[213]\\d", "Ok")));
        System.out.println((kkkk_3.replaceAll( "[12]\\d{3}-[120]\\d-[213]\\d", "Ok")));

    }



}
