package ejercicio2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        Scanner scan = new Scanner(System.in);
        int opcion;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 20) + 1;
        }

        do {
            System.out.println("1- imprimir el array");
            System.out.println("2- mover izquierda");
            System.out.println("3- mover derecha");
            System.out.println("4- invertir");
            System.out.println("5- rotar por pares");
            System.out.println("6- salir");
            System.out.println("¿Qué opción quieres hacer?");
            opcion = scan.nextInt();

            switch (opcion) {

                case 1 -> imprimirArray(numeros);

                case 2 -> {
                    int primero = numeros[0];

                    for (int i = 0; i < numeros.length - 1; i++) {
                        numeros[i] = numeros[i + 1];
                    }

                    numeros[numeros.length - 1] = primero;
                    imprimirArray(numeros);
                }

                case 3 -> {
                    int ultimo = numeros[numeros.length - 1];

                    for (int i = numeros.length - 1; i > 0; i--) {
                        numeros[i] = numeros[i - 1];
                    }

                    numeros[0] = ultimo;
                    imprimirArray(numeros);
                }

                case 4 -> {
                    for (int i = 0; i < numeros.length / 2; i++) {
                        int aux = numeros[i];
                        numeros[i] = numeros[numeros.length - 1 - i];
                        numeros[numeros.length - 1 - i] = aux;
                    }

                    imprimirArray(numeros);
                }

                case 5 -> {
                    for (int i = 0; i < numeros.length - 1; i += 2) {
                        int aux = numeros[i];
                        numeros[i] = numeros[i + 1];
                        numeros[i + 1] = aux;
                    }

                    imprimirArray(numeros);
                }

                case 6 -> System.out.println("Programa finalizado.");

                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 6);

        scan.close();
    }

    public static void imprimirArray(int[] numeros) {
        for (int item : numeros) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println();
    }
}