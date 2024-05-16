import java.util.Scanner;

public class NumerosImparesWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;


        do {
            System.out.print("Por favor, ingresa un número mayor a 10 y menor que 30: ");
            numero = scanner.nextInt();
        } while (numero <= 10 || numero >= 30);

        System.out.println("Números impares desde 1 hasta " + numero + ":");
        int i = 1;
        while (i <= numero) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }


        scanner.close();
    }
}

