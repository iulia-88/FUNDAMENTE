package com.SDA.arrays;

public class Exercitii {
    public static void main(String[] args) {
        int[] numbers = {4, 15, 17, 20, 33, 104};
        // 1. sa se afiseze numerele pare din numbers
        // 2. sa se afiseze numerele mai mari ca 4 si mai mici ca 100 din numbers
        // 3. sa se afiseze elementele din numbers de la coada la spre inceput

        // 1.
        for (int i = 0; i < numbers.length; i++) {
            int nr = numbers[i];
            if (nr % 2 == 0) {
                // daca nr % 2==0 inseamna ca nr este par
                System.out.println(nr);
            }

        }
        System.out.println("------");
        // 2.
        for (int i = 0; i < numbers.length; i++) {
            int nr = numbers[i];
            if (nr > 4 && nr < 100) {
                System.out.println(nr);
            }
        }
        // 3.
        System.out.println("------");
        for (int i = numbers.length - 1; i >= 0; i--) {
            int nr = numbers[i];
            System.out.println(nr);
        }
        System.out.println("-------");
        String[] names = {"Mircea" , "Iulian", "Iulia" , "Ana" };
        // 1. sa se afiseze dimensiunea stringurilor (sirurile de caractere)
        // 2. sa se afiseze fiecare element cu litera mare
        for (int i= 0 ; i < names.length;i++){

            String name = names [i];
            System.out.println(name.length());
            System.out.println(name.toUpperCase());

        }

    }
}

