package fr.dawan.ProjetJeuDeRole.model;

import java.util.List;

import fr.dawan.ProjetJeuDeRole.interfaces.Combat;

public class Formateur extends Personnage implements Combat {
    public static final String CYAN = "\033[0;36m"; // CYAN
    public static final String RESET = "\033[0m";  // Text Reset
    private static int pv;

    public Formateur() {

        this.pv = 1;
        super.armes.add(new MethodesJava());
        super.setNom("Formateur");
    }

    public Formateur(String nom, int pv, int exp, List<Arme> armes) {
        super(nom, pv, exp, armes);
        this.pv = 1;
        super.armes.add(new MethodesJava());
        super.setNom("Formateur");
    }

    public int getPv() {
        return pv;
    }

    @Override
    public void attaque(Arme arme) {
        if (arme instanceof Ordinateur) {
            Ordinateur ordinateur = new Ordinateur();
            this.pv += ordinateur.getDegat();

        } else if (arme instanceof Cuillere) {
            Cuillere cuillere = new Cuillere();
            this.pv += cuillere.getDegat();

        } else if (arme instanceof MethodesJava) {
            MethodesJava methodesJava = new MethodesJava();
            this.pv += methodesJava.getDegat();
        }
        if (this.pv < 0 ) {
            this.pv = 0;
        }
        System.out.println( CYAN +"->>Vous venez attaquer le Joueur:");
        System.out.println("->>Vous avez à present: " + this.pv + " point de vie"+ RESET);
    }

    @Override
    public void defense(Personnage ennemi, Arme arme) {

        if (arme instanceof Ordinateur) {
            Ordinateur ordinateur = new Ordinateur();
            this.pv -= ordinateur.getDegat();
            ennemi.setPv(ennemi.getPv() + ordinateur.getDegat());

        } else if (arme instanceof Cuillere) {
            Cuillere cuillere = new Cuillere();
            this.pv -= cuillere.getDegat();
            ennemi.setPv(ennemi.getPv() + cuillere.getDegat());

        } else if (arme instanceof MethodesJava) {
            MethodesJava methodesJava = new MethodesJava();
            this.pv -= methodesJava.getDegat();
            ennemi.setPv(ennemi.getPv() + methodesJava.getDegat());
           // this.setPv(this.getPv() - methodesJava.getDegat());
            // System.out.println(this.setPv(this.getPv()-methodesJava.getDegat()));
        }
        if (this.pv < 0 ) {
            this.pv = 0;
        }
        System.out.println(CYAN + "->>Votre ennemi s'est defendu:");
        System.out.println("->>il lui reste: " + ennemi.getPv() + " point de vie" + RESET);
    }

    @Override
    public String toString() {
        return "Formateur [toString()=" + super.toString() + "]";
    }

}
