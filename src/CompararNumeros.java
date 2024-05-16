//Escribir un programa que pida al usuario dos números y determine cuál es el mayor de los dos.

import java.util.Scanner;

public class CompararNumeros {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el primer número
        System.out.print("Por favor, ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        // Pedir al usuario que ingrese el segundo número
        System.out.print("Por favor, ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        // Determinar cuál número es mayor
        if (numero1 > numero2) {
            System.out.println("El primer número (" + numero1 + ") es mayor que el segundo número (" + numero2 + ").");
        } else if (numero2 > numero1) {
            System.out.println("El segundo número (" + numero2 + ") es mayor que el primer número (" + numero1 + ").");
        } else {
            System.out.println("Ambos números son iguales.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

