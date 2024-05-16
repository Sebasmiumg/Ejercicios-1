//Escribir un programa que pida al usuario un número y calcule su factorial utilizando un bucle while.

import java.util.Scanner;

public class Factorial01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Por favor, ingresa un número: ");
        int numero = scanner.nextInt();


        long factorial01 = 1;
        int i = 1;


        while (i <= numero) {
            factorial01 *= i;
            i++;
        }


        System.out.println("El factorial de " + numero + " es " + factorial01);


        scanner.close();
    }
}
