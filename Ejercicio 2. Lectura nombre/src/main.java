
import java.util.Scanner;    // Importamos la clase Scanner, que sirve para leer datos del teclado.

public class main {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in); //  Creamos un objeto Scanner para leer datos del teclado

            //Pedimos y leemos el nombre completo
            System.out.print("ESCRIBE TU NOMBRE COMPLETO: ");
            String nombre = sc.nextLine(); // nextLine() lee toda la línea (nombre + apellidos)

            // Pedimos y leemos la edad
            System.out.print("ESCRIBE TU EDAD: ");
            int edad = sc.nextInt(); // nextInt() lee un número entero

            //  Mostramos los resultados
            System.out.println("Te llamas " + nombre);
            System.out.println("Tienes " + edad + " años");

            // Mensaje final
            System.out.println("Pulsa enter para continuar …");
            sc.nextLine(); // Limpiamos el salto de línea pendiente
            sc.nextLine(); // Esperamos a que el usuario presione Enter

            sc.close(); // Cerramos el Scanner
        }
    }
