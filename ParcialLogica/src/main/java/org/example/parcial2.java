
package org.example;

import java.util.Scanner;

public class parcial2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nombre del cliente quien hara la reserva: ");
        String nombre = scanner.nextLine();

        System.out.print("Número de personas: ");
        int numPersonas = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Destino deseado (Playa, Montaña, Ciudad): ");
        String destino = scanner.nextLine().toLowerCase();

        System.out.print("¿Desea incluir seguro de viaje por persona? (si/no): ");
        String incluirSeguro = scanner.nextLine().toLowerCase();

        // Precio base por persona según destino
        double precioPorPersona = 0;
        switch (destino) {
            case "playa":
                precioPorPersona = 1200000;
                break;
            case "montaña":
                precioPorPersona = 900000;
                break;
            case "ciudad":
                precioPorPersona = 650000;
                break;
            default:
                System.out.println("Destino no válido.");
                return;
        }

        // Seguro de viaje
        double costoSeguroPorPersona = 50;
        boolean seguroIncluido = incluirSeguro.equals("si");

        // Cálculo del costo base
        double costoBase = precioPorPersona * numPersonas;

        // Descuento si hay más de 4 personas
        double descuento = (numPersonas > 4) ? 0.08 * costoBase : 0;

        // Subtotal después del descuento
        double subtotal = costoBase - descuento;

        // Impuesto del 12%
        double impuesto = 0.12 * subtotal;

        // Seguro si aplica
        double seguroTotal = seguroIncluido ? costoSeguroPorPersona * numPersonas : 0;

        // Total final
        double totalFinal = subtotal + impuesto + seguroTotal;

        // Resultados
        System.out.println("\n--- Resumen del paquete turístico ---");
        System.out.println("Cliente: " + nombre);
        System.out.println("Destino: " + destino);
        System.out.println("Número de personas: " + numPersonas);
        System.out.println("Costo base: $\n"+ costoBase);
        System.out.println("Descuento: -$\n"+ descuento);
        System.out.println("Subtotal con descuento: $\n"+ subtotal);
        System.out.println("Impuestos (12%%): $\n"+ impuesto);
        System.out.println("Seguro total: $\n"+ seguroTotal);
        System.out.println("TOTAL FINAL: $\n"+ totalFinal);


    }
}

