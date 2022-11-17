package fr.dawan.ProjetJeuDeRole.model;

import java.util.List;

public class Formateur extends Personnage {
    
private static int pdef;
    
    public Formateur() {
        
        this.pdef=20;
        super.armes.add(null); // todo : ajouter l'arme !!!!!!!!!!!!!!!!!!!!!
    }
    

    public Formateur(String nom, int pv, int exp, List<Arme> armes) {
        super(nom, pv, exp, armes);
        this.pdef=20;
        super.armes.add(null); // todo : ajouter l'arme !!!!!!!!!!!!!!!!!!!!!
    }



    public static int getPdef() {
        return pdef;
    }

    @Override
    public String toString() {
        return "Formateur []";
    }

}
