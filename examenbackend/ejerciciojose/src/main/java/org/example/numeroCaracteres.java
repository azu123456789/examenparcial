package org.example;

import java.util.ArrayList;

public class Colores {
    public static void main(String[] args) {

        ArrayList Colores = new ArrayList();
        Colores.add("Red");
        Colores.add("Green");
        Colores.add("Blue");

        System.out.println("Indice del color blue es: ");
        System.out.println(Colores.indexOf("Blue"));

    }
}
