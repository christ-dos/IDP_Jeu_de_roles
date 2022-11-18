package fr.dawan.ProjetJeuDeRole.model;

import java.util.List;

import fr.dawan.ProjetJeuDeRole.interfaces.Combat;

public class Vampirette extends Personnage implements Combat{
    
private static int pv;
    
    public Vampirette() {
        
        this.pv=20;
        super.armes.add(new Cuillere()); 
        super.setNom("Vampirette");
    }
    

    public Vampirette(String nom, int pv, int exp, List<Arme> armes) {
        super(nom, pv, exp, armes);
        this.pv=20;
        super.armes.add(new Cuillere()); 
        super.setNom("Vampirette");
    }

    public  int getPv() {
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
        return "Vampirette [toString()=" + super.toString() + "]";
    }


    


    


}
