package fr.dawan.ProjetJeuDeRole.model;

public class Arme {

    
    private String nomArme;
    private int degat;
    
    public Arme() {}
    
    
    public Arme(String nomArme, int degat) {
        super();
        this.nomArme = nomArme;
        this.degat = degat;
    }


    public String getNomArme() {
        return nomArme;
    }


    public void setNomArme(String nomArme) {
        this.nomArme = nomArme;
    }


    public int getDegat() {
        return degat;
    }


    public void setDegat(int degat) {
        this.degat = degat;
    }


    @Override
    public String toString() {
        return "Arme [nomArme=" + nomArme + ", degat=" + degat + "]";
    }
    
    
    
    
    
}
