package com.SDA.exercitii.homeworks;


import java.util.Locale;
import java.util.Scanner;

/**
 * 1. Write a Java program to print 'Hello' on one line and then print your name on a separate line. Output:
 * Hello
 * John
 *
 * 2. Write a Java program to display the following pattern:
 * 3. Write a Java program to convert a given string into lowercase: “THE QUICK BROWN FOX
 * JUMPS OVER THE LAZY DOG”
 * Output: the quick brown fox jumps over the lazy dog
 * 4. Write a Java program to reverse a word: “avaJ”
 * Output: Java
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Julia");

        System.out.println("----------");

        System.out.println("   J   a   v    v  a");
        System.out.println("   J  a a   v  v  a a");
        System.out.println("J  J  aaaaa  V V aaaaa");
        System.out.println(" JJ   a    a  V  a    a");

        System.out.println("--------");

        String text = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        System.out.println(text.toLowerCase());



    }
}



