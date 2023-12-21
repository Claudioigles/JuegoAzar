package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero, intentos = 0;
        int numeroSecreto;
        String opcion;

        System.out.println("¡Bienvenido al Juego de Azar!");
        System.out.println("Quiere jugar? S/N");
        Scanner entrada = new Scanner(System.in);
        opcion = entrada.nextLine().toLowerCase();

        while (opcion.equals("s") || opcion.equals("si")) {
            System.out.println("Estoy pensando en un número entre 1 y 100...");
            numeroSecreto = (int) (Math.random() * 100);
            System.out.println(numeroSecreto);
            System.out.println("Introducir numero");
            numero = entrada.nextInt();
            entrada.nextLine();
            intentos++;

            if (numeroSecreto == numero) {
                System.out.println("Usted acertó en :" + intentos + " numero de intentos");
                System.out.println("Quiere volver a jugar? S/N");
                opcion = entrada.nextLine().toLowerCase();
                intentos = 0; // Reiniciar intentos para la nueva ronda
            } else if (numeroSecreto < numero) {
                System.out.println("El numero ingresado es mayor");
            } else {
                System.out.println("El numero ingresado es menor");
            }

            System.out.println("¿Volvemos a jugar? S/N");
            opcion = entrada.nextLine().toLowerCase();
        }

        System.out.println("Gracias por participar");
    }
}
