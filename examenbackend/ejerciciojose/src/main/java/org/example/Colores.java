package org.example;

public class Main {
    public static void numeroPar(String[] args) {

        String mensaje = "";
        for (int i = 10; i > 0 ; i--) {

            if(i%2==0){
                mensaje += i;
            }

        }

        System.out.println(mensaje);
    }

    public void DevolverPares(){

    }


    public class Robot {
        String nombre;
        String tipo;
    }


    public String recibirNombre (String nombre) {
        System.out.println("Ty");
        return nombre;
    }

    public String saludar (String saludo) {
        return saludo;
    }
}

