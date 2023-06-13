package com.SDA.exercitii.ex5;

import java.util.Scanner;

/* Sa se introduca n numere de la tastatura cat timp suma lor este mai mica decat 30*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (sum < 30) {
            System.out.println("introduceti un numar");
            int n = scanner.nextInt();
            if ((sum + n) > 30) {
                System.out.println("Suma este mai mare ca 30 ");
            } else {
                sum = sum + n;
            }
        }

        System.out.println(sum);


}
}
