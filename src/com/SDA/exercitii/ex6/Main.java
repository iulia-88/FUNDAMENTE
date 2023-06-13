package com.SDA.exercitii.ex6;

public class Main {
    public static void main(String[] args) {
        System.out.println("Numere dizibile cu 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " ");
            }
        }
        System.out.println("Numerele divizibile cu 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i + " ");
            }
        }
        System.out.println("Numerele divizibile cu 3 si 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}









