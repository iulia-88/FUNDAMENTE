package com.SDA.dataTypes;

import java.util.ArrayList;
import java.util.List;

public class Main {
//   PRIMITEVE + OBIECTE => CELE 2 CATEGORI DE TIPURI DE DATA


    // numere intregi
//    byte => [-128 -> 127]
//    short => [-32,768 -> 32,767]
//    int => [-2,147,483,648 -> 2,147,483,647]
//    long => [-2^63 -> 2^63 - 1]

    // numere cu zecimala (cu virgula)
//    float => numere cu zecimala (nu are o precizie atat de buna)
//    double => numere cu zecimala (recomandat, are precizie mai mare)

    // starea de adevar
//    boolean => true sau false

    // caractere
//     char = 'a' => a - z, 0 - 9, +,-,*,., ,

    public static void main(String[] args) {
        // int => tip de data
        int age;
//         age => numele variabilei

//      Tot timpul cand definim (declaram) o variabila pe prima pozitie
//      specificam tipul de variabila (tipul de data)

//       "=" acesta inseamna atribuire (initializare)
        age = 100;
        System.out.println(age); // (sout) => va genera linia din stanga
        age = 200;
        System.out.println(age);

        double money = 30.5;
        System.out.println(money);
        money = 500.78;
        System.out.println(money);

        char text = 'a';
        System.out.println(text);

        boolean isTrue = true;
        System.out.println(isTrue);

        boolean isFalse = false;
        System.out.println(isFalse);

        // declarare + initializare multipla
        double km = 100.0, m = 1.0, cm = 0.01, hectar = 20.0;
        System.out.println(km);
        System.out.println(m);
        System.out.println(cm);
        System.out.println(hectar);

        // OBIECT, toate obiectele se scriu cu litera mare
        String name = "Catalin Trainer SDA";

//        String => sir de caractere
        String initiala = "C";

//        REGULA!!!
//        Un obiect se initializeaza asa:
        String courseName = new String("Java from basic!");
        System.out.println(courseName);
        courseName = "1"; //
        char text2 = '1'; // folosim ' atunci cand ne referim la un singur
        // caracter, iar variabila este de tip char


        // CREARE OBIECT ANIMAL
        Animal dog = new Animal();

        // Animal => clasa (schita)
        // dog => varibila/obiect, numele sa scrie cu litera mica


        // new => aloca spatiu in memorie pentru obiectul dog, de tipul Animal
        // Animal() => constructor

//        dog.name => apelam proprietatile din clasa Animal

        // initializare variabile din clasa Animal
        dog.name = "Rex";
        dog.age = 1;

        // afisare variabile din clasa Animal
        System.out.println(dog.name);
        System.out.println(dog.age);

        dog.goForward();

//        Initializarea numeDog cu rezultatul returnat
//        de metoda returneazaNume() din clasa Animal
//        String numeDog = dog.returneazaNume();


//        String numeDog = dog.age;
//        String numeDog = "Rex";

        System.out.println("-----------");

        Vanzator catalinVanzator = new Vanzator();
        // catalinVanzator vinde orez cu boabe mari
        catalinVanzator.orez = "Orez Boabe Mari";

        String ionel = catalinVanzator.getOrez();

        System.out.println(ionel);

        Vanzator mihaiVanzator = new Vanzator();
        mihaiVanzator.orez ="Orez Boabe Mici";
        mihaiVanzator.getOrez();

        // CLASE WRAPPER
//        clasele wrapper ne ajuta sa transformam primitivele in obiecte
//        DE CE?
//        Colectii de date, Collection (Liste, Seturi, Map, etc) aceste functioneaza doar cu OBIECTE

//        int => Integer
        Integer number = 100;
//        boolean => Boolean
        Boolean trueOrFalse = true;
//        short => Short
//        byte => Byte
//        long => Long
//        float => Float
//        double => Double
//        char => Character

        int[] ageArray = new int[3]; // maxim 3 elemente

        List<Integer> ageList = new ArrayList();
        ageList.add(1);
        ageList.add(2);
        ageList.add(3);
        ageList.add(4);
        ageList.add(4);

    }
}