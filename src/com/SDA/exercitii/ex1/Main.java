package com.SDA.exercitii.ex1;
import java.util.Scanner;
/**
 Sa se introduca de la tastatura 10 numere intregi. Pe care le vom salva intrun array.
 Pentru fiecare element din array vom verifica daca elementul este numar par sau impar si vom afisa:
 daca e par afisam: nr - par
 daca e impar afisam: nr - impar
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        for(int i = 0; i < 10; i++){
            System.out.println("introduceti nr: ");
            int nr = scanner.nextInt();
// Setam numarul introdus de la tastatura IN ARRAY
            numbers[i] = nr;
        }
        for(int i =0 ; i< numbers.length; i++){
            // Luam un element DIN ARRAY si il setam intr-o variabila
            int element = numbers[i];
            if(element % 2 == 0){
                System.out.println(element  + " - par");
            }else {
                System.out.println(element + " - impar");
            }
        }
    }
}