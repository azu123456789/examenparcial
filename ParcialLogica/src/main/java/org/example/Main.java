package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner mundoAventurero = new Scanner(System.in);

        String nombreUsuario;
        String destinoDeseado;
        int numeroPersonas;
        double precioPersona;
        double descuento;
        double totalBruto;
        double totalGeneral;
        double impuesto;
        double precioSeguro;
        boolean seguro;

        System.out.println(" Buen dia, espero que nuestro sistema los deje sastifechos " );
        System.out.println(" Ingrese el nombre del usuario: ");
        nombreUsuario = mundoAventurero.nextLine();
        System.out.println(" Señor usuario "+nombreUsuario );
        System.out.println("Ingrese el numero de personas que viajaran");
        numeroPersonas = mundoAventurero.nextInt();
        System.out.println("¿Cual es el precio por persona");
        precioPersona = mundoAventurero.nextDouble();
        System.out.println("¿Cual es su destino deseado?");
        destinoDeseado = mundoAventurero.nextLine();
        System.out.println("\n ingrese el precio del seguro por persona ");
        precioSeguro = mundoAventurero.nextDouble();
        System.out.println("Las personas ha viajar desean seguro? (responder true si tu respuesta es Si o false si la respuesta es No)");
        seguro = mundoAventurero.nextBoolean();
        totalBruto=numeroPersonas*precioPersona;
        impuesto=(totalBruto*12)/100;
        if (seguro == true) {
            System.out.println("El seguro de viaje sera añadido al precio total");
            totalGeneral= totalBruto+impuesto+precioSeguro;
        }else {
            System.out.println("El seguro de viaje no sera añadido");
            totalGeneral= totalBruto+impuesto;
        }










    }
}