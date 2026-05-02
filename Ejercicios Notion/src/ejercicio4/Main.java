package ejercicio4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] bombo1 = new String[3];
        String[] bombo2 = new String[3];

        for (int i = 0; i < 2; i++) {
            System.out.println("Equipos del bombo " + (i + 1));
            for (int j = 0; j < bombo1.length; j++) {
                System.out.println("Indica la seleccion");
                String seleccion = scanner.next();
                if (i == 0) {
                    bombo1[j] = seleccion;
                } else {
                    bombo2[j] = seleccion;
                }
            }
        }
        // DESORDENAR BOMBO 2
        for (int i = 0; i < bombo2.length; i++) {
            int posicionAleatoria = random.nextInt(bombo2.length);
            String temp = bombo2[i];
            bombo2[i] = bombo2[posicionAleatoria];
            bombo2[posicionAleatoria] = temp;
        }

        System.out.println("Imprimiendo bombo 1");
        imprimirBombo(bombo1);

        System.out.println();

        System.out.println("Imprimiendo bombo 2");
        imprimirBombo(bombo2);

        System.out.println();

        System.out.println("Emparejamientos: ");
        for (int i = 0; i < bombo1.length; i++) {
            System.out.println(bombo1[i] + " vs " + bombo2[i]);
        }
    }

    public static void imprimirBombo(String[] bombo) {
        for (String item : bombo) {
            System.out.println(item);
        }
    }
}
