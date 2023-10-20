package Main;

import java.util.Random;
import java.util.Scanner;

import Classe.Archer;
import Classe.Guerrier;
import Classe.Mage;
import Classe.Monstre;
import Classe.Personnage;

public class Jeu {
	public Jeu() {
	}
	
	public void Game() {
		int tours = 1;
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Choisissez votre nom :");
			String name = scan.nextLine();
			System.out.println("Choisissez votre classe\n" + "1-Mage\n" + "2-Guerrier\n" + "3-Archer");

			String choice = scan.nextLine();
			Personnage personnage = new Personnage(null, 0, 0, 0);

			switch (choice) {
			case "1":
				personnage = new Mage(name);
				break;
			case "2":
				personnage = new Guerrier(name);
				break;
			case "3":
				personnage = new Archer(name);
				break;
			default:
				System.out.println("Entrée inconnue");
				break;
			}
			Monstre monstre = new Monstre("Slime");
			Random random = new Random();

			while (personnage.getSante() > 0) {
				int hpMonstre = monstre.getSante();
				int hpJoueur = personnage.getSante();
				int randomChoix = random.nextInt();
				int defendMonstre = 1;
				int defendJoueur = 1;

				if (tours % 2 == 1) {
					System.out.println("Tours du joueur");
					System.out.println("1 - Attaqué");
					System.out.println("2 - Defendre");
					System.out.println("Autre - Tu passe ton tour");
					String choix = scan.nextLine();

					switch (choix) {
					case "1":
						System.out.println(personnage.getNom()+" attaque");
						hpMonstre -= personnage.getAttaque() * (defendMonstre / 100) + personnage.getAttaque();
						monstre.setSante(hpMonstre);
						defendMonstre = 1;
						break;
					case "2":
						System.out.println(personnage.getNom()+"se defend");
						defendJoueur = 50;
						break;

					default:
						System.out.println("Tu passe ton tour");
						break;
					}

					System.out.println(personnage.getNom()+" à " + personnage.getSante());
				} else {
					System.out.println("Tours du monstre");
					if (randomChoix % 2 == 0) {
						System.out.println(monstre.getNom()+" attaque");
						hpJoueur -= monstre.getAttaque() * (defendJoueur / 100) + monstre.getAttaque();
						personnage.setSante(hpJoueur);
						defendMonstre = 1;
					} else {
						System.out.println(monstre.getNom()+" se défend");
						defendMonstre = 25;
					}
					System.out.println(monstre.getNom()+" à " + monstre.getSante());
				}
				
				if(monstre.getSante() <= 0) {
					System.out.println("-----------------------------");
					System.out.println("Tu as vaincu le monstre");
					System.out.println("Tu as gagné un niveau");
					System.out.println("Nouveau monstre");
					int niveau = personnage.getNiveau();
					niveau ++;
					personnage.setNiveau(niveau);
					monstre = new Monstre("Slime");
					tours = 0;
				}
				
				tours++;
				System.out.println("-----------------------------");
			}

			if (monstre.getSante() <= 0) {
				System.out.println("Tu as gagné");
			} else if (personnage.getSante() <= 0) {
				System.out.println("Tu as perdu");
			}
			System.out.println("Tu était au niveau : " + personnage.getNiveau());
		}
	}
}
