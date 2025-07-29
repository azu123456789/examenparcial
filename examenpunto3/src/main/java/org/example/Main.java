package org.example;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la cantidad de las materias a la que se ha matriculado: ");
        double cantidadMaterias = scanner.nextDouble();

        System.out.print("Ingrese el valor de cada materia: ");
        double valorMateria = scanner.nextDouble();

        double papeleria = 200_000;
        double carned= 30_000;
        double subtotalMaterias = cantidadMaterias * valorMateria;
        double descuento = subtotalMaterias * 0.20;

        double total = (subtotalMaterias - descuento) + papeleria + carned;


        System.out.println("Estudiante: " + nombre);
        System.out.println("Subtotal materias: " + subtotalMaterias);
        System.out.println("Descuento (20%): -" +descuento);
        System.out.println("Papelería: " + papeleria);
        System.out.println("Carned: " + carned);
        System.out.println(" Valor neto de la matrícula: " + total);
    }
}

