package com.SDA.exercitii.ex8;

import java.util.Scanner;

/* Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output
25 != 39
25 < 39
25 <= 39

 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti a:");
        int a = scanner.nextInt();

        System.out.println("Introduceti b:");
        int b = scanner.nextInt();

        if (a == b) {
            System.out.println("a este egal cu b");
        } else if (a > b) {
            System.out.println("a este mai mare ca b");
        } else if (a < b) {
            System.out.println("a e mai mic ca b");
        }

    }
}
