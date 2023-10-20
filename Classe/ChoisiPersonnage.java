package Classe;

public class ChoisiPersonnage {
	private String perso;

	public void tonPersonnage(String value) {
		if (value.equals("mage")) {
			System.out.println("Vous avez choisi le mage comme personnage");
		} else if (value.equals("archer")) {
			System.out.println("Vous avez choisi l'archer comme personnage");
		} else if (value.equals("guerrier")) {
			System.out.println("Vous avez choisi le guerrier comme personnage");
		}
	}
	
	
}