package com.SDA.dataTypes;

public class Animal {
    // proprietati
    String name;
    int age;

    // constructor
    // - aloca spatiu in memorie
    // - are acelasi nume cu clasa din care face parte
    // - nu are tip returnat
    // - cand nu definim un constructor, se foloseste cel default (predefinit)
    Animal() {
        System.out.println("Constructor clasa Animal");
    }

    // metode
    // - sunt actiuni ale obiectelor
    // - !!! toate metodele trebuie sa returneze ceva !!!
    // - void => inseamna ca metoda nu returneaza nimic!!!!
    // orice metoda este compusa din:
//        - tip returnat (VOID)
//        - nume metoda, se scrie cu litera mica (goForward)
//        - parametrii (parantezele rotunde)
//        - bloc de cod (acoladele)
    void goForward() {
        System.out.println("Metoda goForward()");
    }
}
