package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Ingrese el número de las horas trabajas en el mes: ");
        int horasTrabajadas = scanner.nextInt();
        System.out.println("Ingrese el valor por hora: ");
        double valorHora = scanner.nextDouble();
        System.out.println("Ingrese los años laborados en la empresa: ");
        int anosLaborados = scanner.nextInt();




        double salarioBruto = horasTrabajadas * valorHora;
        double bonificacion = anosLaborados * 30000;
        double deduccion = salarioBruto * 0.08;
        double salarioNeto = salarioBruto + bonificacion - deduccion;

        System.out.println("Salario Bruto Mensual: $" + salarioBruto);
        System.out.println("Bonificación: $" + bonificacion);
        System.out.println("Deducciones (8%): $" + deduccion);
        System.out.println("Salario Neto Mensual: $" + salarioNeto);
    }
}