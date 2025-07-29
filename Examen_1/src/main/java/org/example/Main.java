package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int edadPersona;
        int meses;
        int dias;

        System.out.println("Tenga buen dia, señor usuario");
        System.out.print("ingrese su edad");
        edadPersona = sc.nextInt();
        meses= edadPersona*12;
        System.out.print("Su edad en meses es: "+meses);
        dias= edadPersona*365;
        System.out.print("Su edad en dias es: "+ dias);







    }
}