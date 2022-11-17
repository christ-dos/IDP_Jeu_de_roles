package fr.dawan.ProjetJeuDeRole.model;

import java.util.List;

public class Codeuse extends Personnage {
    
    private static int pdef;
    
    public Codeuse() {
        
        this.pdef=35;
        super.armes.add(null); // todo : ajouter l'arme !!!!!!!!!!!!!!!!!!!!!
    }
    

    public Codeuse(String nom, int pv, int exp, List<Arme> armes) {
        super(nom, pv, exp, armes);
        this.pdef=35;
        super.armes.add(null); // todo : ajouter l'arme !!!!!!!!!!!!!!!!!!!!!
    }



    public static int getPdef() {
        return pdef;
    }


    @Override
    public String toString() {
        return "Codeuse [toString()=" + super.toString() + "]";
    }

   

    
    
    
    
    
   
    

}
