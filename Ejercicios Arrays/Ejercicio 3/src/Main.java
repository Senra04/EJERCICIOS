import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creamos un scanner y array:
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[10];

        // Ahora pedimos las 10 notas y las validamos.
        for (int i = 0; i < notas.length; i++) {
            double nota; // variable temporal para guardar la nota antes de validarla
            do {
                System.out.println("Introduce la nota del alumno " + (i + 1) + ":");
                nota = scanner.nextDouble();

                if (nota < 0 || nota > 10) {
                    System.out.println("Error. La nota debe ser entre 0 e 10");
                }
            } while (nota < 0 || nota > 10);
            notas[i] = nota; // cuando la nota es valida la guardamos en el array
        }

        // Preparar variables para calcular resultados
        double suma = 0;
        double mayor = notas[0];
        double menor = notas[0];
        int aprobados = 0;
        int suspensos = 0;

        // Creamos un bucle para hacer todos los calculos y guardarlos.
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];

            if (notas[i] > mayor) {
                mayor = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
            if (notas[i] >= 5) {
                aprobados++;
            }
            if (notas[i]<=5){
                suspensos++;
            }
        }
        double media= suma/notas.length;
        // Pedimos los calculos
        System.out.println("Nota media: "+media);
        System.out.println("Nota mas alta: "+mayor);
        System.out.println("Nota mas baja: "+menor);
        System.out.println("Cantidad de aprobados: "+aprobados);
        System.out.println("Cantidad de suspensos: "+suspensos);

    }
}
