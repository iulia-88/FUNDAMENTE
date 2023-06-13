package com.SDA.exercitii.ex9;

import java.util.Scanner;/*Se introduc de la tastatura 3 numere a,b si c.
        Sa se afiseze cele 3numere in ordine crescatoare adica daca introducem a=5,b=0 si c=3sa se afiseze 0 3 5.
        */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduceti a:");
        int a = scanner.nextInt();

        System.out.println("-------");

        System.out.println("introduceti b:");
        int b = scanner.nextInt();

        System.out.println("-----");

        System.out.println("introduceti c:");
        int c = scanner.nextInt();

        System.out.println("-----");

        // a = 5
        // b = 0
        // c = 3

        int a1, b1, c1;
        if (a <= b) {
            int temp = a;
            a = b;
            b = temp;


        }
        if (a >= c) {
            int temp = a;
            a = c;
            c = temp;

        }

        if (b >= c) {
            int temp = b;
            b = c;
            c = temp;

        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
