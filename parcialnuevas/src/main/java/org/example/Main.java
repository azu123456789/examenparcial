package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner tiendaElectrodomesticos = new Scanner(System.in);

        float cantidadComputadoras;
        float cantidadImpresoras;
        float valorComputadoras;
        float valorImpresoras;
        float descuento;
        float iva;
        float valorTotal;
        float valorBrutoImp;
        float valorBrutoCom;
        float valorTotalBruto;


        System.out.println("ingrese la cantidad de computadores que el usuario comprara ");
        cantidadComputadoras = tiendaElectrodomesticos.nextFloat();
        System.out.println(" Ingrese la cantidad de impresoras que el usuario va a comprar ");
        cantidadImpresoras = tiendaElectrodomesticos.nextFloat();
        System.out.println(" Ingrese el valor de una computadora ");
        valorComputadoras = tiendaElectrodomesticos.nextFloat();
        System.out.println("Ingrese el valor de una impresora " );
        valorImpresoras = tiendaElectrodomesticos.nextFloat();

        valorBrutoCom=cantidadComputadoras*valorComputadoras;
        valorBrutoImp=valorImpresoras+cantidadImpresoras;
        valorTotalBruto=valorBrutoCom+valorBrutoImp;
        descuento= (valorTotalBruto*5)/100;
        iva=(valorTotalBruto*19)/100;
        valorTotal=valorTotalBruto+iva-descuento;

        System.out.println("EL valor de la compra de las computadoras es: " + valorBrutoCom);
        System.out.println("EL valor de la compra de las impresoras es: " + valorBrutoImp);
        System.out.println("En total por los 2 articulos es: "+valorTotalBruto);
        System.out.println("Usted ha recibido un descuento del: "+descuento);
        System.out.println("EL valor total ha pagar es: "+valorTotal);









    }
}