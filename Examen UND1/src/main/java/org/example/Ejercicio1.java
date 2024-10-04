package org.example;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio1 {
    public void main(String[] args) {
    }
    public void ejecuter() {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        boolean err = true;
        while(err == true){
            try {
                System.out.println("Introduce un número");
                numero = entrada.nextInt();
                err = false;
            }catch(InputMismatchException er) {
                System.out.println("ERROR. Introduce un valor válido...");
                entrada.nextLine();
            }
        }
        if(numero >= 0) {
            System.out.println("El valor absoluto es " + numero + ".");
        }else{
            int num = numero * -1;
            System.out.println("El valor absoluto es " + num + ".");
        }


    }
}
