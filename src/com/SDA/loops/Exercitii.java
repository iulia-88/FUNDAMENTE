package com.SDA.loops;
import java.util.Scanner;
public class Exercitii {
    public static void main(String[] args) {
        // afisareAprmelor30deNumere();
        //sumaPrimelor5NumereCititeDelaTastatura();
        //afisarareAprimelor10numerePare();
        //afisarePrimelor300deNumereDivizibileCu3();
        //afisare10NumereDivizibileCu3si5();
        afisareNumerelorDeLa0la100siDeLa100La0();
    }
    public static void afisareAprmelor30deNumere() {
        for (int i = 0; i < 30; i++) {
            System.out.println(i);
        }
        int i = 0;
        while (i < 30) {
            System.out.println(i);
            i++;
        }
        System.out.println("-------");
        System.out.println(i);
        i = 0;
        do {
            System.out.println("do while:" + i);
            // i++;
            i = i + i;
        } while (i < 30);
    }
    public static void sumaPrimelor5NumereCititeDelaTastatura() {
        Scanner scanner = new Scanner(System.in);
        int suma = 0; //
        for (int i = 0; i < 5; i++) {
            System.out.println("introduceti numar:");
            int numar = scanner.nextInt();
            suma = suma + numar;
            System.out.println(suma);
        }
    }
    public static void afisarareAprimelor10numerePare() {
        //      for(int i = 0; i < 10; i++){
        //     if(i % 2 == 0) {
        //         System.out.println(i);
        //     }
        int i = 1;
        int contor = 0;
        while (contor < 100) {
            if (i % 2 == 0) {
                System.out.println(i);
                contor++;
            }
            i++;
        }
    }
    public static void afisarePrimelor300deNumereDivizibileCu3() {
        int i = 3;
        int contor = 0;
        while (contor < 300) {
            if (i % 3 == 0) {
                System.out.println(i);
                contor++;
            }
            i++;
        }
    }
    public static void afisare10NumereDivizibileCu3si5() {
        int i = 3;
        int contor = 0;
        while (contor < 10) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                contor++;
            }
            i++;
        }
    }
    public static void afisareNumerelorDeLa0la100siDeLa100La0() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        for (int i = 100; i > 0; i--) {
            System.out.println(i);
        }
    }
}