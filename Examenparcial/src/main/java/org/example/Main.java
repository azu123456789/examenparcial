package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HashMap<String, String>> productos = new ArrayList<>();

        String opcion;
        do {
            System.out.println("===°°° MENÚ DEL SISTEMA °°°===");
            System.out.println("1. Registrar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Editar precio");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    HashMap<String, String> producto = new HashMap<>();

                    System.out.print("id: ");
                    producto.put("id", sc.nextLine());

                    System.out.print("Nombre: ");
                    producto.put("nombre", sc.nextLine());

                    System.out.print("Precio unitario: ");
                    producto.put("precio", sc.nextLine());

                    System.out.print("Cantidad en bodega: ");
                    producto.put("cantidad", sc.nextLine());

                    System.out.print("¿El producto tiene caducidad? (si/no): ");
                    producto.put("caducidad", sc.nextLine().toLowerCase());

                    System.out.print("Fecha de vencimiento (aaaa-mm-dd): ");
                    producto.put("fechaVencimiento", sc.nextLine());

                    System.out.print("Fotografía 1 (URL o nombre): ");
                    producto.put("foto1", sc.nextLine());

                    System.out.print("Fotografía 2 (URL o nombre): ");
                    producto.put("foto2", sc.nextLine());

                    System.out.print("Descripción: ");
                    producto.put("descripcion", sc.nextLine());

                    System.out.print("Categoría: ");
                    producto.put("categoria", sc.nextLine());

                    System.out.print("Nombre del proveedor: ");
                    producto.put("proveedor", sc.nextLine());

                    productos.add(producto);
                    System.out.println("Su Producto registrado con éxito.");
                    break;

                case "2":
                    if (productos.isEmpty()) {
                        System.out.println("No hay productos registrados.");
                    } else {
                        System.out.println(" La Lista de productos:");
                        for (HashMap<String, String> p : productos) {
                            System.out.println("----------------------------");

                            // Validar vencimiento
                            if (p.get("caducidad").equals("si")) {
                                LocalDate hoy = LocalDate.now();
                                try {
                                    LocalDate vencimiento = LocalDate.parse(p.get("fechaVencimiento"));
                                    long diasVencido = ChronoUnit.DAYS.between(vencimiento, hoy);
                                    if (diasVencido > 3) {
                                        // Restar 1 unidad de la bodega
                                        int cantidad = Integer.parseInt(p.get("cantidad"));
                                        if (cantidad > 0) {
                                            cantidad--;
                                            p.put("cantidad", String.valueOf(cantidad));
                                            System.out.println(" Producto vencido hace " + diasVencido + " días. Se restó 1 unidad.");
                                        }
                                    }
                                } catch (Exception e) {
                                    System.out.println(" Fecha de vencimiento inválida en producto ID " + p.get("id"));
                                }
                            }

                            for (String clave : p.keySet()) {
                                System.out.println(clave + ": " + p.get(clave));
                            }
                        }
                    }
                    break;

                case "3":
                    System.out.print("Ingrese el ID del producto para editar el precio: ");
                    String idEditar = sc.nextLine();
                    boolean encontrado = false;
                    for (HashMap<String, String> p : productos) {
                        if (p.get("id").equalsIgnoreCase(idEditar)) {
                            System.out.println(" Precio actual: " + p.get("precio"));
                            System.out.print("Ingrese el nuevo precio: ");
                            String nuevoPrecio = sc.nextLine();
                            p.put("precio", nuevoPrecio);
                            System.out.println("El Precio ha sido actualizado.");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Su Producto no encontrado.");
                    }
                    break;

                case "4":
                    System.out.print("Ingrese el ID del producto a eliminar: ");
                    String idEliminar = sc.nextLine();
                    boolean eliminado = false;
                    for (int i = 0; i < productos.size(); i++) {
                        if (productos.get(i).get("id").equalsIgnoreCase(idEliminar)) {
                            productos.remove(i);
                            eliminado = true;
                            System.out.println("Su Producto eliminado.");
                            break;
                        }
                    }
                    if (!eliminado) {
                        System.out.println(" No se encontró el producto.");
                    }
                    break;

                case "5":
                    System.out.println("espero volvernos a encontrar pronto ");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (!opcion.equals("5"));


    }
}

