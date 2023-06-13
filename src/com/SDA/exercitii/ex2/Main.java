package com.SDA.exercitii.ex2;
/**
 * Sa se enumere cate vocale sunt in textul urmator:
 * Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
 * Vocalele sunt : a,e,i,o,u.
 * hint:
 * 1. Punem textul intro variabila de tipul string
 * 2. Pentru fiecare caracter din string (charAT(i)) verificam daca e vocala
 * 3. Daca e vocala atunci contorizam intr-o variabila.
 * 4. Afisam contorul dupa parcurgerea stringului.
 */
public class Main {
    public static void main(String[] args) {
        String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
        text = text.toLowerCase();
        int contor = 0;
        int contorA = 0;
        int contorE = 0;
        int contorI = 0;
        int contorO = 0;
        int contorU = 0;
        for (int i = 0; i < text.length(); i++ ){
            char c = text.charAt(i);
            System.out.println(c);
            //         if (c == 'a' || c== 'e' || c == 'i' || c== 'o' || c =='u'){
            //    contor++;
            //        }
            switch (c){
                case 'a':
                    contorA++;
                    break;
                case 'e':
                    contorE++;
                    break;
                case 'i':
                    contorI++;
                    break;
                case 'o':
                    contorO++;
                    break;
                case 'u':
                    contorU++;
                    break;
            }
        }
        contor = contorA + contorE + contorI + contorO + contorU;
        System.out.println("Nr vocale: " + contor);
        System.out.println("contor A " + contorA);
        System.out.println("contor E " + contorE);
        System.out.println("contor I " + contorI);
        System.out.println("contor O " + contorO);
        System.out.println("contor U " + contorU);
    }
}