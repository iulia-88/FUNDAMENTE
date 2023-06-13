package com.SDA.exercitii.ex7;

import java.util.Scanner;

/* sa se introduca un cuvant de la tastatura , care apoi va fi afisat de la coada la inceput
Sticla => alcitS
 */
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un cuvant");
        String text = scanner.nextLine();

        for (int i = text.length() -1;i >=0; i--){
            char c = text.charAt(i);
            System.out.print(c);

            }
    }
}
