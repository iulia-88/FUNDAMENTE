package com.SDA.arrays;

public class Main {
    public static void main(String[] args) {
//        array este reprezentat de []
//        [12,3,4,5,6,7,8] => ARRAY de numere intregi
//        array-ul are dimensiune STATICA (FIXA)

//        DEFINIRE        = INITIALIZARE
        int[] numberArray = {100, 2, 35, 48, 50}; // am specificat elementele din array
        int[] numberArray2 = new int[5]; // am specificat DOAR DIMENSIUNEA, nu si elementele
        int[] numberArray3 = new int[]{1, 2, 3, 4, 5}; // am specificat elementele din array

        int[] data = {40, 60, 80, 100, 120};
//      pozitie:      0 , 1,  2,   3,  4

        for (int i = 0; i <= 4; i++) {
            int number = data[i]; // => data[i] ne va returna elementul de pe pozitia i
            System.out.println(number);
        }
//      pas 0: i = 0, 0 <= 4 DA, number = data[0], number = 40, i = i + 1;
//      pas 1: i = 1, 1 <= 4 DA, number = data[1], number = 60, i = i + 1;
//      pas 2: i = 2, 2 <= 4 DA, number = data[2], number = 80, i = i + 1;
//      pas 3: i = 3, 3 <= 4 DA, number = data[3], number = 100, i = i + 1;
//      pas 4: i = 4, 4 <= 4 DA, number = data[4], number = 120, i = i + 1;
//      pas 5: i = 5, 5 <= 4 NU => se iese din for
        System.out.println("--------------");

        String[] namesArray = {"Ana", "Mihai", "Ion", "Daria", "Mihnea", "Raul"};
//                               0,      1,      2,      3,        4,       5
        System.out.println("Numar elemente in namesArray: " + namesArray.length);

        for (int i = 0; i < namesArray.length; i++) {
            // i = pozitie
//            + => concatenare in situatia de mai jos, adica lipim 2 sau mai multe texte
            System.out.println("namesArray[" + i + "] = " + namesArray[i]);

            // salvam in variabila name, elementul de pe pozitia i din namesArray
//            daca i = 0, name va fi Ana
//            daca i = 1, name va fi Mihai

//            daca i = 5, name va fi Raul
            String name = namesArray[i];

            System.out.println(name);
        }
        System.out.println("-------------");

        // foreach
        // pentru fiecare element de tipul String cu numele name : (din) namesArray
        // se executa urmatorul cod
        for (String name : namesArray) {
            System.out.println(name);

        }
        for (int i = 0; i < namesArray.length; i++) {
            String name = namesArray[i];
            System.out.println(name);
        }
        System.out.println("-------");

        // atribuim cate o valoare pentru fiecare pozitie din array
        String[] carBrand = new String[3];
        carBrand[0] = "Mercedes";
        carBrand[1] = "Dacia";
        carBrand[2] = "BMW";

        for (String car : carBrand) {
            System.out.println(car);
        }
    }}



