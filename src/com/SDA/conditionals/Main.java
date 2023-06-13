package com.SDA.conditionals;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        // if, switch (structuri conditionale)
        if (a == 100) {
            // daca se indeplineste conditia executa acest cod
            System.out.println("a este 10");
        } else {
            // daca NU se indeplineste conditia executa acest cod
            System.out.println("a nu este 10");
        }

        if (a == 5) {
            System.out.println("a este 5");
        } else if (a == 6) {
            System.out.println("a este 6");
        } else {
            System.out.println("a nu este nici 5 nici 6");
        }

        a = 3;
        switch (a) {
            case 1:
                System.out.println("a este 1");
                break; // !!!!!!! ESTE RECOMANDAT CA FIECARE CAZ
//                                SA AIBA UN BREAK!!!!!!!!!
            case 2:
                System.out.println("a este 2");
                break;
            case 3:
                System.out.println("case 3");
                break;

//                ......
            case 50:
                System.out.println("a este 50");
                break;

            default: // (este optional, se pune tot timpul ultimul caz in switch)
                System.out.println("a este: ");
                System.out.println(a);
        }
    }
}
