import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Primero pedimos por consola el numero de filas y columnas.
        System.out.println("Intruduce el numero de filas:");
        Scanner scanner = new Scanner(System.in);
        int filas = scanner.nextInt();
        System.out.println("Intruduce el numero de columnas");
        int columnas = scanner.nextInt();

        // Creamos las matrices.
        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];
        int[][] sumaMatrices = new int[filas][columnas];

        // Rellenamos las matrices con numeros aleatorios entre 0 y 50.
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz1[i][j] = (int) (Math.random() * 51);
                matriz2[i][j] = (int) (Math.random() * 51);
            }
        }

        // Calculamos la suma de las matrices.
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaMatrices[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Mostramos las matrices
        System.out.println("Matriz 1");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Matriz 2");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        // Mostramos la matriz suma.
        System.out.println("Suma matrices");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(sumaMatrices[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
