package fr.dawan.ProjetJeuDeRole.model;

import java.util.List;

public class Vampirette extends Personnage {
    
private static int pdef;
    
    public Vampirette() {
        
        this.pdef=20;
        super.armes.add(new Cuillere()); 
        super.setNom("Vampirette");
    }
    

    public Vampirette(String nom, int pv, int exp, List<Arme> armes) {
        super(nom, pv, exp, armes);
        this.pdef=20;
        super.armes.add(new Cuillere()); 
        super.setNom("Vampirette");
    }



    public static int getPdef() {
        return pdef;
    }


    @Override
    public String toString() {
        return "Vampirette [toString()=" + super.toString() + "]";
    }

    

}
