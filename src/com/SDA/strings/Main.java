package com.SDA.strings;

public class Main {
    public static void main(String[] args) {
        // String => primitiva sau obiect ?
        // OBIECT

        // 1. length() => pentru lungimea stringului
        // 2. charAt(index) => returneaza caracterul de pe pozitia index
        // 3. toLowerCase() => transforma stringul in litere mici
        // 4. toUpperCase () => transforma stringul in litere mari
        // 5. equals(text2) => verifica daca textele sunt egale
        // 6. equalsIgnoreCase(text2) => verifica daca textele sunt egale fara sa tina cont daca sunt cu litere mici sau mari
        String name = "Catalin";
        String name1 = new String("SDA Trainer");


        // String => un sir de caractere ;
        String text = "a" + "b" + "c" + "d";
        // pas 0: "ab" + "c" +"d"
        // pas 1 : "abc" +"d"
        // pas 2 : "abcd"

        System.out.println(1 + 2 + "" + 3 + "");
        // "1" + 2+3+""
        //"12"+3+""
        //"123" +""
        // "123"

        //  System.out.println("value"+text);

        System.out.println(text);
        System.out.println(text.length());
        System.out.println(text.toUpperCase()); // => aplica caps lock
        System.out.println(text.toLowerCase());
        //afisare caracter de pe pozitia 2
        System.out.println(text.charAt(2));

        text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {

            }

        }

        //OBIECTELE NU SE COMPARA CU == NICIODATA !!!!!!!
        if ("ana".equals("Ana")) {
            System.out.println("sunt egale");
        } else {
            System.out.println("nu sunt egale");
        }

        if ("ana".equalsIgnoreCase("ANA")) {
            System.out.println("sunt egale");
        } else {
            System.out.println("nu sunt egale");

        }
    }
}

