package fr.dawan.ProjetJeuDeRole.model;

import java.util.ArrayList;
import java.util.List;

public class Personnage {
    // ___________________________________Attribut_______________________________________________________
    private String nom;
    private int pv;
    private int exp = 0;

    List<Arme> armes = new ArrayList<>();

    // _________________________________________constructor_____________________________________________

    public Personnage() {

        this.pv = 10;
    
    }

    public Personnage(String nom, int pv, int exp, List<Arme> armes) {
        super();
        this.nom = nom;
        this.pv = pv;
        this.exp = exp;
        this.pv = 10;
        this.armes = armes;
    
    }
    // ___________________________________________getter/setter_____________________________________________

    public List<Arme> getArmes() {
        return armes;
    }

    public void setArmes(List<Arme> armes) {
        this.armes = armes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }


    // _________________________________________toString___________________________________________________

    @Override
    public String toString() {
        return "Personnage [nom=" + nom + ", pv=" + pv + ", exp=" + exp + ", armes=" + armes + "]";
    }

    // _________________________________________methode____________________________________________________

    public void add(Arme arme) {
        this.armes.add(arme);
    }

}
