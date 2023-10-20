package Objets;

public class Potion extends Objet{
    private String name;
    private int pv;
    private int quantite;
    
    public Potion(String name, int pv, int quantite) {
        super(name);
        this.name = name;
        this.pv = pv;
        this.quantite = quantite;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }


}