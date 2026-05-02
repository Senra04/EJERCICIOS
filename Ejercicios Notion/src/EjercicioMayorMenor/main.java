package EjercicioMayorMenor;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] numeros = {15, 8, 23, 4, 19, 22};
        /* int max = numeros[0], min = numeros[0];

        for (int item : numeros) {
            if (item > max) {
                max = item;
            }
            if (item < min) {
                min = item;
            }
        } */ //Esto es la forma larga

        Arrays.sort(numeros);  //hace la ordenacion numericamente
        int min = numeros[0], max = numeros[numeros.length - 1];
        System.out.println("max= " + max);
        System.out.println("min= " + min);
    }
}
