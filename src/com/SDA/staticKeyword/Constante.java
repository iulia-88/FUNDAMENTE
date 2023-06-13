package com.SDA.staticKeyword;

public class Constante {
    // proprietati
    String bmw = "BMW";
    int maxSpeed = 370;

    /**
     * final => se aplica pentru:
     *          - proprietati, nu mai permite reinitializarea
     *          - clase, nu pot fi mostenite (Mostenirea este un principiu OOP)
     *          - metode, nu pot fi suprascrise (Polimorfism este un pricipiu OOP)
     */
    static final String userType = "ADMIN";
    static String welcomeMessage = "Bun venit!";
}