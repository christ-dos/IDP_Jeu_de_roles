package fr.dawan.ProjetJeuDeRole.model;

import java.util.List;

import fr.dawan.ProjetJeuDeRole.interfaces.Combat;

public class Formateur extends Personnage implements Combat{
    
private static int pdef;
    
    public Formateur() {
        
        this.pdef=20;
        super.armes.add(new MethodesJava());
        super.setNom("Formateur");
    }
    

    public Formateur(String nom, int pv, int exp, List<Arme> armes) {
        super(nom, pv, exp, armes);
        this.pdef=20;
        super.armes.add(new MethodesJava());
        super.setNom("Formateur");
    }

    public static int getPdef() {
        return pdef;
    }
    
    @Override
    public void attaque(Arme arme) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void defense() {
        // TODO Auto-generated method stub
        
    }

    
    @Override
    public String toString() {
        return "Formateur [toString()=" + super.toString() + "]";
    }


    @Override
    public void estAttaque(Personnage ennemi, Arme arme) {
        // TODO Auto-generated method stub
        
    }


    

}
