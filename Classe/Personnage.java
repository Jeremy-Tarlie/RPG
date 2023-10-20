package Classe;

public class Personnage {
    private String nom;
    private int niveau;
    private int attaque;
    private int sante;
    
    public Personnage(String nom, int niveau, int attaque, int sante) {
        this.nom = nom;
        this.niveau = niveau;
        this.attaque = attaque;
        this.sante = sante;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getNiveau() {
        return niveau;
    }
    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }
    public int getAttaque() {
        return attaque;
    }
    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }
    public int getSante() {
        return sante;
    }
    public void setSante(int sante) {
        this.sante = sante;
    }
}