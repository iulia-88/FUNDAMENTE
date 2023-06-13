package com.SDA.operators;

public class Main {
    /**
     * Operatori
     *  +, -, *, /, ++, --, % (modulo - returneaza restul impartirii) - Aritmetici
     *  % => il folosim pentru a vedea daca un numar e par sau nu
     *
     *  = operator de atribuire
     *  == operator pentru a verifica egalitatea
     *  1. Atribuire
     *      =
     *  2. Aritmetic
     *      =, -, *, /, %, ++, --, +=, -=, *=, /=
     *  3. Logic
     *      not: ! => negatie
     *      si: &&
     *      sau: ||
     *      if((2 > 3) || (3 < 2)) {
     *
     *      }
     *      if((2 > 3) && (3 < 2)) {
     *
     *      }
     *  4. Relational
     *      != inseamna diferit
     *      ==
     *      <=
     *      >=
     *      >
     *      <
     *
     *
     *
     */
    public static void main(String[] args) {
        // Atribuire
        int a = 0;
        a++; // <=> a = a + 1
        // a--; // <=> a = a - 1
//        System.out.println(a);

        // Artimetic
        a = 1 + 2;
        System.out.println(a);
        a = 1 - 2;
        System.out.println(a);
        a = 1 * 2;
        System.out.println(a);
        a = 1 / 2;
        System.out.println(a);
        // am resetat valoare lui la 0
        a = 0;
        System.out.println("--------");
        a += 3; // <=> a = a + 3
        System.out.println(a);
        a *= 2; // <=> a = 3 * 2
        System.out.println(a);
        a /= 3; // <=> a = 6 / 3;
        System.out.println(a);

        System.out.println("-------");

        // Logic
        // se folosesc impreuna cu o structura conditionala
        // if, switch (structuri conditionale)

        a = 10;
        if(a == 100) {
            // daca se indeplineste conditia executa acest cod
            System.out.println("a este 10");
        } else {
            // daca NU se indeplineste conditia executa acest cod
            System.out.println("a nu este 10");
        }

        if(a == 5) {
            System.out.println("a este 5");
        } else if(a == 6) {
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