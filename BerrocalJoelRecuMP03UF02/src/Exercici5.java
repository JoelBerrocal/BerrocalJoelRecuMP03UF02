import java.util.Scanner;

public class Exercici5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclat = new Scanner(System.in);
	    System.out.println("Son 3 candidats. ");
	    int num_candidatos = 3; //Aquí especifico el espacio de la array candidatos

	    System.out.println("I 160 alumnes que hi voten.");
	    int total_votantes = 160; //Aquí especifico el espacio de la array votos

	    int voto_user; //Voto de cada user

	    int[] candidatos = new int[num_candidatos]; // Num de Candidatos 

	    int[] votos = new int[total_votantes]; // Num de personas que votan 

	    
	    for (int i = 0; i <= candidatos.length; i++) {

	        do {
	            int indice = i+1;
	            System.out.println("Votant " + indice + ", entra el teu vot (1-" + num_candidatos + "):");
	            
	            // Aquí tenemos el voto del votante
	            voto_user = teclat.nextInt();

	            if (voto_user > num_candidatos) {
	                System.out.println("Voto inválido.");
	            }

	        } while (voto_user > num_candidatos);

	        // Si el voto es valido lo guardamos en la posición que le toque
	        votos[i] = voto_user;
	    }
	    System.out.println("Resultats:");
	    System.out.println("-----------------------");
	    for (int i = 0; i < candidatos.length; i++) {
	        
	        System.out.println("Candidat " + (i+1) + " "+votos[i] + " vots.");
	    }
	}

}
