package org.example.peluchitos;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TiendaPeluchitos {

    public static void main(String[] args) {
        //la tienda peluchitos necesita almacenar la información de productos, ademas necesita almacenar la información de una venta indicando al cliente final el precio unitario, el IVA y aplicando los descuentos si es necesario


        // un producto: id, nombre(codigo), descripcion
        //precio unitario, fotografia, cantidad en bodega

        //una venta: id del producto, iva del 19%
        //cantidad del producto
        //debe de mostrar el total sin iva
        // debe de mostrar el total despues dell iva

        //entradas

        String descripcion;
        String nombreProducto;
        String fotografia;
        long cantidadBodega;
        long idProducto;
        Float precioUnitario;
        final Float Iva_PRODUCTO = 0.19F;
        Float precioConIva;
        Float precioConDescuento;

        Byte cantidadProductoComprado;
        //  Entrada especial para pedir datos por teclado
        Scanner leerTeclado = new Scanner(System.in);

        //procesos
        // 1 Almacenando la informacíon de 1 producto
        String verde = "\u001B[32m";
        String rojo = "\u001B[31m";

        System.out.print("***Tienda peluchitos***");
        System.out.print("*****************************\n");


        System.out.print("Regristando un producto en la base de datos");

        System.out.print("1. Digita el nombre del producto que ingresa a bodega");
        nombreProducto = leerTeclado.nextLine();

        System.out.println("2. Escriba la descipción del producto (forma, tamaño, etc)");
        descripcion = leerTeclado.nextLine();

        System.out.println("3. Ingrese la url de la fotografia del producto: ");
        fotografia = leerTeclado.nextLine();

        System.out.println("4. Ingrese el identificacdor del producto: ");
        idProducto = leerTeclado.nextLong();

        System.out.println("5. Ahora cuantos productos similares hay una bodega? :");
        cantidadBodega = leerTeclado.nextLong();

        System.out.println("6. Cual es el precio unitario de venta del producto: ");
        precioUnitario = leerTeclado.nextFloat();

        System.out.println(".....procesando ");
        System.out.println("exito registrando producto ");
        System.out.println("\n resultado: ");
        System.out.println("nombre del producto registrado: ");
        System.out.println("___" + descripcion);
        System.out.println("$" + precioUnitario + "Precio unitario de venta");

        //procesando una venta del producto

        System.out.println("\n ***Registro de venta***");
        System.out.println("Digita el id o codigo del producto que quieres comprar : ");
        // 1. Cargar la variarible con el id que digite el usuario
        System.out.println("cuantas unidades quieres comprar de un producto :");
        cantidadProductoComprado= leerTeclado.nextByte();
        Float costoTotalBruto= precioUnitario*cantidadProductoComprado;
        Float costoTotalNeto= costoTotalBruto +(costoTotalBruto*Iva_PRODUCTO);
        System.out.println("El cosoto total de la compra del producto");




    }
}