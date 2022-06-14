import java.util.Scanner;

public class Exercici4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Introdueix un número (0 per acabar): ");
        numero = scanner.nextInt();

        while (numero != 0) {

            if (numero > 0) {
                System.out.print("Positiu");
            } else {
                System.out.print("Negatiu");
            }
            if(numero % 2 == 0){
                System.out.println(" Par");
            }else{
                System.out.println(" Impar");
            }

            System.out.print("Introdueix (0 para acabar): ");                                  
            numero = scanner.nextInt();
        }
    } 
}
