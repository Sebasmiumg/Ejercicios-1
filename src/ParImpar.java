//Escribir un programa que pida al usuario un número entero y determine si es par o impar.

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número entero
        System.out.print("Por favor, ingresa un número entero: ");
        int numero = scanner.nextInt();

        // Determinar si el número es par o impar
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

