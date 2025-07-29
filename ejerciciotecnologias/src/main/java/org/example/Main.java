package org.example;



import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random random = new Random();
         int num1, num2, num3;

         num1=random.nextInt(1000);
         num2=random.nextInt(1000);
         num3=random.nextInt(1000);

        System.out.println("Numero uno "+ num1 + "Numero dos "+ num2 + "Numero tres " + num3);

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("\n El numero mayor es: " + num1);
            }else {
                System.out.println("\n El numero mayor es: " + num3);
            }
        }else {
            if (num2 > num3) {
                System.out.println("\n El numero mayor es: " + num2);
            }else{
                System.out.println("\n El numero mayor es: " + num3);
            }
        }




    }
}