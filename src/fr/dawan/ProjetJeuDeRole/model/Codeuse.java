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
        if (arme instanceof Ordinateur) {
            Ordinateur ordinateur = new Ordinateur();
            this.pdef += ordinateur.getDegat();
            
        } else if (arme instanceof Cuillere) {
            Cuillere cuillere = new Cuillere();
            this.pdef += cuillere.getDegat();
            
        }else if (arme instanceof MethodesJava) {
            MethodesJava methodesJava = new MethodesJava();
            this.pdef += methodesJava.getDegat();
        }
    }
    
    @Override
    public void estAttaque(Personnage ennemi, Arme arme) {
        
        if (arme instanceof Ordinateur) {
            Ordinateur ordinateur = new Ordinateur();
            this.pdef -= ordinateur.getDegat();
            ennemi.setPdef(ennemi.getPdef() + ordinateur.getDegat());
            
        } else if (arme instanceof Cuillere) {
            Cuillere cuillere = new Cuillere();
            this.pdef -= cuillere.getDegat();
            ennemi.setPdef(ennemi.getPdef() + cuillere.getDegat());
            
        }else if (arme instanceof MethodesJava) {
            MethodesJava methodesJava = new MethodesJava();
            this.pdef -= methodesJava.getDegat();
            ennemi.setPdef(ennemi.getPdef() + methodesJava.getDegat());
        }
    }


    @Override
    public void defense() {
        
    }


    @Override
    public String toString() {
        return "Codeuse [toString()=" + super.toString() + "]";
    }


    

   

    
    
    
    
    
   
    

}
