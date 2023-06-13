package com.SDA.regex;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String textRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        String email = "test@test.com";

       boolean isMatched = true;
        isMatched = Pattern

               .compile(textRegex) // incarca regexul in memorie
               .matcher(email) // incarca textul pe care dorim sa-l verificam
               .matches(); // verifica textul si returneaza true / false


        System.out.println(isMatched);
    }

}
