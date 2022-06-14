import java.util.Scanner;

public class Exercici3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2, menor, mayor;
       
        //Lectura de dos n�meros enteros distintos
        do {
            System.out.print("Introdueix un n�mero enter: ");
            numero1 = scanner.nextInt();
            System.out.print("Introdueix un altre n�mero enter distint del anterior: ");                   
            numero2 = scanner.nextInt();
            if(numero1 == numero2){
                System.out.println("Has d'introducir dos n�meros distints");
            }
        } while (numero1 == numero2);
       
        //Calcular cu�l de los n�meros es el mayor y cu�l el menor para poderlos imprimir por pantalla
        if (numero1 > numero2) {
            mayor = numero1;
            menor = numero2;
        } else {
            mayor = numero2;
            menor = numero1;
        }
       
        //Mostrar por pantalla los n�meros desde el menor hasta el mayor.
        System.out.println("\nN�meros desde " + menor + " fins " + mayor + " : ");
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }
    }
}