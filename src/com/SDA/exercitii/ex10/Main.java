package com.SDA.exercitii.ex10;

import java.util.Scanner;

/* Sa se introduca de la tastatura 10 numere intregi , pe care le vom salva intr-un array.
 Sa se introduca un numar x de la tastatura si sa se verifice daca numarul este in array , daca da sa se afiseze
 un mesaj : Numarul a fost gasit  altfel  Sa se afiseze : Numarul nu s-a gasit.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++){
            System.out.println("Introduceti numar :");
            int n = scanner.nextInt();

            numbers[i] = n;
        }
        System.out.println("Introduceti nr :");
        int x = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            int m = numbers[i];
            if (x == m) {
                System.out.println("Este in array");
            }

        }


    }
}
