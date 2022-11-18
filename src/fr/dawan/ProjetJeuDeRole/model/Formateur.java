package fr.dawan.ProjetJeuDeRole.model;

import java.util.List;

import fr.dawan.ProjetJeuDeRole.interfaces.Combat;

public class Formateur extends Personnage implements Combat{
    
private static int pv;
    
    public Formateur() {
        
        this.pv=20;
        super.armes.add(new MethodesJava());
        super.setNom("Formateur");
    }
    

    public Formateur(String nom, int pv, int exp, List<Arme> armes) {
        super(nom, pv, exp, armes);
        this.pv=20;
        super.armes.add(new MethodesJava());
        super.setNom("Formateur");
    }

    public int getPv() {
        return pv;
    }
    
    @Override
    public void attaque(Arme arme) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void defense(Personnage ennemi, Arme arme) {
        // TODO Auto-generated method stub
        
    }

    
    @Override
    public String toString() {
        return "Formateur [toString()=" + super.toString() + "]";
    }


   


    

}
