package ejercicio1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué tamaño tienen las matrices?");

        int tamanio = scanner.nextInt();
        int[][] matriz1 = new int[tamanio][tamanio];
        int[][] matriz2 = new int[tamanio][tamanio];
        int[][] sumaMatrices = new int[tamanio][tamanio];

        // 1. Rellenar matriz1 y matriz2
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                matriz1[i][j] = (int) (Math.random() * 51);
                matriz2[i][j] = (int) (Math.random() * 51);
            }

        }
        //2. Sumar matrices
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                sumaMatrices[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // 3. Creamos y llamamos metodo para optimizar codigo.
        System.out.println("Imprimiendo matrices");
        imprimirArray(matriz1);
        System.out.println();
        imprimirArray(matriz2);
        System.out.println();
        System.out.println("Suma matrices:");
        imprimirArray(sumaMatrices);
    }

    public static void imprimirArray(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int item : fila) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }

    }
}
