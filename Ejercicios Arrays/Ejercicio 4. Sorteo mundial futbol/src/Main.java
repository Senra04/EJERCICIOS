import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] bombo1 = new String[3];
        String[] bombo2 = new String[3];
        boolean[] usado = new boolean[3];

        // Pedir equipos del bombo 1
        for (int i = 0; i < bombo1.length; i++) {
            System.out.println("Introduce la seleccion " + (i + 1) + " del bombo 1:");
            bombo1[i] = scanner.nextLine();
        }

        // Pedir equipos del bombo 2
        for (int i = 0; i < bombo2.length; i++) {
            System.out.println("Introduce la seleccion " + (i + 1) + " del bombo 2:");
            bombo2[i] = scanner.nextLine();
        }

        // Mostrar emparejamientos
        System.out.println("EMPAREJAMIENTOS:");

        for (int i = 0; i < bombo1.length; i++) {
            int aleatorio;

            do {
                aleatorio = (int) (Math.random() * bombo2.length);
            } while (usado[aleatorio]);

            System.out.println(bombo1[i] + " vs " + bombo2[aleatorio]);

            usado[aleatorio] = true;
        }
    }
}