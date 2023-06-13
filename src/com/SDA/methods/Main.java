package com.SDA.methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // clasa  .  numele metodei -> ASA APELAM METODE / Obiecte STATICE
        Calculator.afisareMesaj("Acesta este un mesaj dintr-o metoda statica!");
        Scanner scanner = new Scanner(System.in);
        while (1 > 0) {

            System.out.println("Introduceti a: ");
            int a = scanner.nextInt();

            System.out.println("Introduceti b: ");
            int b = scanner.nextInt();

            Calculator hp = new Calculator();
            System.out.println(hp);
            // hp.adunare => am apelat metoda adunare
            int suma = hp.adunare(a, b);

            System.out.println("Suma: " + suma);

            // scadere
            int diferenta = hp.scadere(a, b);
            System.out.println("Diferenta: " + diferenta);

            // produs
            int produs = hp.inmultire(a, b);
            System.out.println("Produs: " + produs);

            // impartire
            double cat = hp.impartire(a, b);
            System.out.println("Cat: " + cat);

            hp.afisareMesaj("Bun venit!");
        }
    }
}