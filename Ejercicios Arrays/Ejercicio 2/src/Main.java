import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int opcion;

        // Rellenar array con aleatorios del 1 al 20
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 20) + 1;
        }

        // Mostrar menú
        do {
            System.out.println("MENU");
            System.out.println("1. Imprimir array");
            System.out.println("2. Mover a izquierda");
            System.out.println("3. Mover a derecha");
            System.out.println("4. Invertir");
            System.out.println("5. Salir");

            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Array:");
                    for (int i = 0; i < numeros.length; i++) {
                        System.out.print(numeros[i] + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    int primero = numeros[0];

                    for (int i = 0; i < numeros.length - 1; i++) {
                        numeros[i] = numeros[i + 1];
                    }

                    numeros[numeros.length - 1] = primero;

                    System.out.println("Array movido a la izquierda:");
                    for (int i = 0; i < numeros.length; i++) {
                        System.out.print(numeros[i] + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    int ultimo = numeros[numeros.length - 1];

                    for (int i = numeros.length - 1; i > 0; i--) {
                        numeros[i] = numeros[i - 1];
                    }

                    numeros[0] = ultimo;

                    System.out.println("Array movido a la derecha:");
                    for (int i = 0; i < numeros.length; i++) {
                        System.out.print(numeros[i] + " ");
                    }
                    System.out.println();
                    break;

                case 4:
                    for (int i = 0; i < numeros.length / 2; i++) {
                        int temp = numeros[i];
                        numeros[i] = numeros[numeros.length - 1 - i];
                        numeros[numeros.length - 1 - i] = temp;
                    }

                    System.out.println("Array invertido:");
                    for (int i = 0; i < numeros.length; i++) {
                        System.out.print(numeros[i] + " ");
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while (opcion !=5);
    }
}