import java.util.Scanner;


public class principal06 {

	public static void main(String[] args) {

		int nbreAnnee = 0, i=0;
		double tauxInteret= 0, capitalDepart = 0., capitalFinal =0;
		
		System.out.print("Quel est votre capital de d�part ?");
		Scanner clavier = new Scanner(System.in);
		capitalDepart = clavier.nextDouble();
		System.out.print("Combien d'ann�e le capital vas t'il �tre placer ?");
		nbreAnnee = clavier.nextInt();
		System.out.print("quel est le taux d'int�ret du placement ?");
		tauxInteret = clavier.nextDouble();
		capitalFinal = capitalDepart;
		
// declaration du tableau
		double tableauInteret[] = new double[nbreAnnee]; 
		// boucle qui parcour le tableau et incremente.
			for (i=0; i<tableauInteret.length; i++){
			// calcule du taux d'interet
			capitalFinal =(1+ tauxInteret/100)*capitalFinal;
			// envoie des resultats du taux dans le tableau des interets.
			tableauInteret[i]= capitalFinal-capitalDepart;
			System.out.print("Les interets au bout de "+(i+1)+ "an(s) et de ");
			System.out.printf("%6.2f", tableauInteret[i]);
			System.out.println("�");
		}
		// libere de la memoire cache en stoppant le scanner.
		clavier.close();
	}
}
