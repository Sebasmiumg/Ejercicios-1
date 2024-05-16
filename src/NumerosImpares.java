//Escribir un programa que pida al usuario un número mayor a 10 y menor que 30,
// y que muestre por pantalla todos los números impares desde 1 hasta ese número utilizando un bucle for.

import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;


        do {
            System.out.print("Por favor, ingresa un número mayor a 10 y menor que 30: ");
            numero = scanner.nextInt();
        } while (numero <= 10 || numero >= 30);


        System.out.println("Números impares desde 1 hasta " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }


        scanner.close();
    }
}
