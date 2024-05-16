//Escribir un programa que pida al usuario su edad y determine si es mayor de edad o no.

import java.util.Scanner;

public class MayorDeEdad {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese su edad
        System.out.print("Por favor, ingresa tu edad: ");
        int edad = scanner.nextInt();

        // Determinar si el usuario es mayor de edad
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("No eres mayor de edad.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
