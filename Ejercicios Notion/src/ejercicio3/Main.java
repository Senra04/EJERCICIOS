package ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        for (int i = 0; i < notas.length; i++) {
            double nota;
            do {
                System.out.println("Indicame la nota del alumno");
                nota = scanner.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("La nota no es valida");
                }
            } while (nota < 0.0 || nota > 10.0);
            notas[i] = nota;

        }

        int suspensos = 0, aprobados = 0;
        double media = 0, acumulados = 0;
        for (double item : notas) {
            if (item < 5) {
                suspensos++;
            } else {
                aprobados++;
            }
            acumulados += item;
        }
        System.out.println("Suspensos: " + suspensos);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Media: " + acumulados / notas.length);

    }
}