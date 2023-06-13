package com.SDA.conversions;

public class Main {
    public static void main(String[] args) {
        int a = 10 ;
        short b = (short) a ; // (short) inseamna casting
        System.out.println(b);

  //      Object car = Audi() ;

   //     Audi x = (Audi) car

        double amount = 100.30 ;
        int amountNumber = (int) amount ; // !!! NU ESTE CORECT

        long amonutNumber = Math.round(amount);
        System.out.println(amountNumber);

    }
}
