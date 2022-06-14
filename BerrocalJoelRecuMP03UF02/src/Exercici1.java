import java.util.Scanner;

public class Exercici1 {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        double area, lado_a, lado_b, lado_c, semiperimetro;
        System.out.print("Ingresa el valor de costat a: ");
        lado_a = teclat.nextDouble();
        teclat.nextLine();
        System.out.print("Ingresa el valor de costat b: ");
        lado_b = teclat.nextDouble();
        teclat.nextLine();
        System.out.print("Ingresa el valor de costat c: ");
        lado_c = teclat.nextDouble();
        teclat.nextLine();
        semiperimetro=0;
        area=0;
        if(lado_a+lado_b>lado_c&&lado_b+lado_c>lado_a&&lado_c+lado_a>lado_b)
        {
            System.out.println("Los datos corresponden a un tri\u00E1ngulo.");
            semiperimetro=(lado_a+lado_b+lado_c)/2;
            area=Math.sqrt(semiperimetro*(semiperimetro-lado_a)*(semiperimetro-lado_b)*(semiperimetro-lado_c));
        }
        else
            System.out.println("Los datos no corresponden a un tri\u00E1ngulo.");
        if(semiperimetro!=0&&lado_a==lado_b&&lado_b==lado_c)
            System.out.println("Tri\u00E1ngulo equil\u00E1tero.");
        if(semiperimetro!=0&&((lado_a==lado_b&&lado_b!=lado_c)||(lado_b==lado_c&&lado_c!=lado_a)||(lado_c==lado_a&&lado_a!=lado_b)))
            System.out.println("Tri\u00E1ngulo is\u00F3sceles.");
        if(semiperimetro!=0&&lado_a!=lado_b&&lado_b!=lado_c&&lado_c!=lado_a)
            System.out.println("Tri\u00E1ngulo escaleno.");
        System.out.println("Valor de area: " + area);
        System.out.println("Valor de semiperimetro: " + semiperimetro);
    }

}