package fr.dawan.ProjetJeuDeRole.model;

import java.util.List;

import fr.dawan.ProjetJeuDeRole.interfaces.Combat;

public class Vampirette extends Personnage implements Combat {
    public static final String RESET = "\033[0m"; // Text Reset
    public static final String GREEN = "\033[0;32m"; // GREEN
    private static int pv;

    public Vampirette() {

        this.pv = 5;
        super.armes.add(new Cuillere());
        super.setNom("Vampirette");
    }

    public Vampirette(String nom, int pv, int exp, List<Arme> armes) {
        super(nom, pv, exp, armes);
        this.pv = 5;
        super.armes.add(new Cuillere());
        super.setNom("Vampirette");
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
        System.out.println(GREEN + "->>Vous venez attaquer votre ennemi:");
        System.out.println("->>Vos points de vie: " + this.pv + " point de vie" + RESET);
        System.out.println();
    }

    @Override
    public void defense(Personnage ennemi, Arme arme) {// todo a revoir

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
            this.setPv(this.getPv() - methodesJava.getDegat());
            // System.out.println(this.setPv(this.getPv()-methodesJava.getDegat()));
        }
        if (this.pv < 0 ) {
            this.pv = 0;
        }
        System.out.println(GREEN + "->>il s'est defendu:");
        System.out.println("->>il lui reste " + this.getPv() + " point de vie" + RESET);
    }

    @Override
    public String toString() {
        return "Vampirette [toString()=" + super.toString() + "]";
    }

}
