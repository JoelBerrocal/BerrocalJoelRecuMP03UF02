import java.util.Scanner;

public class Exercici3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2, menor, mayor;
       
        //Lectura de dos números enteros distintos
        do {
            System.out.print("Introdueix un número enter: ");
            numero1 = scanner.nextInt();
            System.out.print("Introdueix un altre número enter distint del anterior: ");                   
            numero2 = scanner.nextInt();
            if(numero1 == numero2){
                System.out.println("Has d'introducir dos números distints");
            }
        } while (numero1 == numero2);
       
        //Calcular cuál de los números es el mayor y cuál el menor para poderlos imprimir por pantalla
        if (numero1 > numero2) {
            mayor = numero1;
            menor = numero2;
        } else {
            mayor = numero2;
            menor = numero1;
        }
       
        //Mostrar por pantalla los números desde el menor hasta el mayor.
        System.out.println("\nNúmeros desde " + menor + " fins " + mayor + " : ");
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }
    }
}