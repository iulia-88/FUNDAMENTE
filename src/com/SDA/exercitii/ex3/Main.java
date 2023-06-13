package com.SDA.exercitii.ex3;
/**
 * Sa se creeze un calculator cu operatiile de adunare, scadere ,inmultire, impartire.
 * Pentru fiecare operatie utilizatorul va trebui sa introduca o tasta de la tastatura.
 * 1.adunare
 * 2.scadere
 * 3.inmultire
 * 4.impartire
 * 0.iesire
 * Sa se introduca 2 nr intregi a si b de la tastatura.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1.adunare \n2.scadere \n3.inmultire \n4.impartire \n0.Iesire");
            int optiune = scanner.nextInt();
            if(optiune ==0){
                System.out.println("Am terminat!");
                break; //intrerupere executia unei bucle
            }
            int rezultat = 0;
            double rezultatImpartire = 0.0;
            int a= 0;
            int b = 0;
            switch (optiune) {
                case 1:
                    System.out.println("Introduceti a:");
                    a = scanner.nextInt();
                    System.out.println("Introduceti b:");
                    b = scanner.nextInt();
                    rezultat = adunare(a, b);
                    System.out.println("Rezultat: " + rezultat);
                    break;
                case 2:
                    System.out.println("Introduceti a:");
                    a = scanner.nextInt();
                    System.out.println("Introduceti b:");
                    b = scanner.nextInt();
                    rezultat = scadere(a, b);
                    System.out.println("Rezultat: " + rezultat);
                    break;
                case 3:
                    System.out.println("Introduceti a:");
                    a = scanner.nextInt();
                    System.out.println("Introduceti b:");
                    b = scanner.nextInt();
                    rezultat = inmultire(a, b);
                    System.out.println("Rezultat: " + rezultat);
                    break;
                case 4:
                    System.out.println("Introduceti a:");
                    a = scanner.nextInt();
                    System.out.println("Introduceti b:");
                    b = scanner.nextInt();
                    rezultatImpartire = impartire(a, b);
                    System.out.println("rezultat impartire" + rezultatImpartire);
                    break;
                default:
                    System.out.println("Optiune invalida");
            }
        }while(true);
    }
    public static int adunare(int a, int b) {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        int suma = a + b;
//        System.out.println("Suma: " + suma);
//      keyword return se foloseste atunci cand returnam un tip de data
        return suma;
    }
    public static int scadere(int a, int b) {
        int diferenta;
        if(a <= b) {
            diferenta = b - a;
        } else {
            diferenta = a - b;
        }
        return diferenta;
    }
    public static int inmultire(int a, int b) {
        int produs = a * b;
        return produs;
    }
    public static double impartire(int a, int b) {
        // casting de date!! (transformare dintr-un tip de data in altul)
        // int a = 10;
        // (double) a = 10.0
        double cat = (double) a / (double) b;
        return cat;
    }
}