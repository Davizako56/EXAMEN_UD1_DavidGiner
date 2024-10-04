package org.example;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
    }
    public void ejecuter() {
        Scanner entrada = new Scanner(System.in);
        int ancho = 0;
        int largo = 0;
        int anchoA = 0;
        int largoA = 0;

        System.out.println("Introduce el ancho de la pared...");
        ancho = entrada.nextInt();
        System.out.println("Introduce el largo de la pared...");
        largo = entrada.nextInt();
        System.out.println("Introduce el ancho del azulejo...");
        anchoA = entrada.nextInt();
        System.out.println("Introduce el largo del azulejo...");
        largoA = entrada.nextInt();

        if(anchoA == largoA); {
            System.out.println("El azulejo no puede ser cuadrado.");
            if(ancho < anchoA | ancho < largoA | largo < anchoA | largo < largoA); {
                System.out.println("El azulejo no puede ser mas grande que la pared");
            }
        }
    }
}
