package com.SDA.staticKeyword;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car("A4", 200);
        Car dacia = new Car("logan", 201);

        System.out.println("------");
        System.out.println(audi.carName);

        // declarare      initializare
        // obiect         obiect
        Car carTest = new Car("Test Car", 1);
        // new aloca spatiu in memorie pentru obiectul carTest

        // obiectul carTest . numeleMetodei(parametru)
        carTest.printCarName("1234");

        // apel proprietati care NU sunt statice
        Constante constante = new Constante();
        System.out.println(constante.bmw);
        System.out.println(constante.maxSpeed);

        // apel proprietati statice
        System.out.println(Constante.userType);
        System.out.println(Constante.welcomeMessage);
    }
}