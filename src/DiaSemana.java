import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Por favor, ingresa un número del 1 al 5: ");
        int numero = scanner.nextInt();


        switch (numero) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            default:
                System.out.println("Número inválido. Por favor ingresa un número del 1 al 5.");
                break;
        }

        scanner.close();
    }
}
