package fr.dawan.ProjetJeuDeRole.model;

import java.util.List;

import fr.dawan.ProjetJeuDeRole.interfaces.Combat;

public class Codeuse extends Personnage implements Combat{
    
    private static int pdef;
    
    public Codeuse() {
        
        this.pdef=35;
        super.armes.add(new Ordinateur()); 
        super.setNom("Codeuse");
    }
    

    public Codeuse(String nom, int pv, int exp, List<Arme> armes) {
        super(nom, pv, exp, armes);
        this.pdef=35;
        super.armes.add(new Ordinateur()); 
        super.setNom("Codeuse");
    }



    public static int getPdef() {
        return pdef;
    }
    
    @Override
    public void attaque(Arme arme) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void defence() {
        // TODO Auto-generated method stub
        
    }


    @Override
    public String toString() {
        return "Codeuse [toString()=" + super.toString() + "]";
    }


    

   

    
    
    
    
    
   
    

}
