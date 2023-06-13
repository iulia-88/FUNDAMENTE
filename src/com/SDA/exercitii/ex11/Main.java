package com.SDA.exercitii.ex11;

import java.util.Scanner;

/* Sa se citeasca de la tastatura 10 cuvinte care apoi sa fie salvate intr-un array .
Sa se afiseze pe ecran fiecare element din array impreuna cu dimensiunea elementului
EX: mere , pere ,cirese
    mere - 4 , pere - 4 , cirese -6
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduceti cuvant:");
            String n = scanner.nextLine();
            array[i] = n;
            System.out.println(n + "-" + n.length());
        }
    }
}


