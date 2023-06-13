package com.SDA.varargs;

public class Main {
    public static void main(String[] args) {
        //apelare metoda
        printNumbers(1,2,3,4,5,6,67,7,87,8,8,8,7,6,534534);
        System.out.println("---");
        printNumbers(1,2);
        System.out.println("---");
        printNumbers();

        printNumbersWithLocation("Arad", 12,45,56,54);
    }

    // ... ne spune ca aceasta metoda poate primii un numar infinit de parametrii
    public static void printNumbers(int ... numbers) {
        for(int i = 0; i < numbers.length; i++) {
            int nr = numbers[i];
            System.out.println(nr);
        }

//        String[] dataNames = new String[]{"Test", "Test2", "test3"};
//        main(dataNames);
    }
    // int ... numbers => se pune TOT TIMPUL pe ultimul loc!!!!
    public static void printNumbersWithLocation(String location, int ... numbers) {
        for(int i = 0; i < numbers.length; i++) {
            int nr = numbers[i];
            System.out.println(location + " " + nr);
        }
    }
}