package Objets;

public class Arme extends Objet{
    private String name;
    private int attaque;
    
    public Arme(String name, int attaque) {
        super(name);
        this.name = name;
        this.attaque = attaque;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttaque() {
        return attaque;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

}