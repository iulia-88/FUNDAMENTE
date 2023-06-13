package com.SDA.methods;

public class Calculator {

    public Calculator() {
        // constructor
    }

    /**
     * Modificatori de acces: (Incapsulare, principiu OOP)
     *      public -> este disponibil peste tot
     *      default -> (NU SE SCRIE) este accesibil DOAR la nivel de pachet
     *      protected -> accesibil la nivel de pachet, DAR si in afara pechetului in subclase
     *      private -> este accesibil doar in CLASA in care suntem
     *
     * void -> tipul returnat
     *  - void => nu returneaza nimic
     *  - int, double, float, String etc => metoda trebuie sa returneze o variabila de acel tip
     *
     *  adunare -> numele metodei
     *   - o metoda trebuie sa aiba un singur scop!!!!
     *   - numele metodei trebuie sa reflecte ce face metoda
     *
     *   parametrii
     *   - int a, int b sunt parametrii metodei adunare
     *   - folosind parametrii transmitem datele de la o clasa la alta
     */
    int adunare(int a, int b) {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        int suma = a + b;
//        System.out.println("Suma: " + suma);
//      keyword return se foloseste atunci cand returnam un tip de data
        return suma;
    }

    protected int scadere(int a, int b) {
        int diferenta;
        if(a <= b) {
            diferenta = b - a;
        } else {
            diferenta = a - b;
        }
        return diferenta;
    }

    public int inmultire(int a, int b) {
        int produs = a * b;

        return produs;
    }

    public double impartire(int a, int b) {
        // casting de date!! (transformare dintr-un tip de data in altul)
        // int a = 10;
        // (double) a = 10.0
        double cat = (double) a / (double) b;

        return cat;
    }

    /**
     * static -> O metoda statica se aloca in memorie o singura data
     *           ea se apeleaza cu NumeleClasei.numeleMetodeiStatice()
     * @param mesaj
     */
    public static void afisareMesaj(String mesaj) {
        System.out.println(mesaj);
    }
}