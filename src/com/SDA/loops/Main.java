package com.SDA.loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Structuri repetitive cu numar cunoscut de pasi
//        1. for
//        2. foreach (se foloseste cu array)
//        start
//        end
//        progress

//        pentru i este egal cu 0, i este mai mic ca 3, executa si creste i
        int a  = 0;
        System.out.println(a++);
        // a = 1;
        System.out.println(a);

        // a = a + 1;
        System.out.println(++a);
        System.out.println("---------------");

        for(int i = 0; i < 3;i++) {
            System.out.println(i);
        }

//        pas 0: i = 0, 0 este mai mic ca 3? DA, afisez i, apoi adun 1 la i
//        pas 1: i = 1, 1 este mai mic ca 3? DA, afisez 1 apoi mai adun 1 la i
//        pas 2: i = 2, 2 este mai mic ca 3? DA, afisez 2 apoi mai adun 1 la i
//        pas 3: i = 3, 3 este mai mic ca 3? NU -> MA OPRESC

//        Structuri repetitive cu numar necunoscut de pasi
//        1. while
//        2. do while

        // Scanner ne ajuta sa citim date
        // System.in => citim date de la tastatura
        Scanner scanner = new Scanner(System.in);

        // citim n numare intregi pana cand n este 5
        int n = 0;
        // != inseamna diferit!!!!
        // cat timp n este diferit de 5 executa
//        while(true) { // while(true) inseamna bucla infinita
//            System.out.println("introduceti n:");
//            n = scanner.nextInt(); // ne permite sa citim un numar intreg de la tastatura
//            if(n == 5) {
//                break; // opreste executia unei bucle
//            }
//        }

//        n = 5;
//        do {
//            System.out.println("do - while");
//            System.out.println("introduceti n:");
////            n = scanner.nextInt(); // ne permite sa citim un numar intreg de la tastatura
//
//        } while(n != 5);

//        pentru a citi un cuvant folosim next()
//        String text = scanner.next();
//        System.out.println(text);

//        pentrua citi toata linia folosim nextLine()
        String text = scanner.nextLine();
        System.out.println(text);
    }
}