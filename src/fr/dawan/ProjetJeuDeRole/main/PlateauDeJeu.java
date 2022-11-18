package fr.dawan.ProjetJeuDeRole.main;

import java.util.Scanner;

import fr.dawan.ProjetJeuDeRole.interfaces.Combat;
import fr.dawan.ProjetJeuDeRole.model.Codeuse;
import fr.dawan.ProjetJeuDeRole.model.Cuillere;
import fr.dawan.ProjetJeuDeRole.model.Formateur;
import fr.dawan.ProjetJeuDeRole.model.MethodesJava;
import fr.dawan.ProjetJeuDeRole.model.Ordinateur;
import fr.dawan.ProjetJeuDeRole.model.Personnage;
import fr.dawan.ProjetJeuDeRole.model.Vampirette;

public class PlateauDeJeu {
    static Scanner scan = new Scanner(System.in);
    Combat combat = new Codeuse();

    public static final String RESET = "\033[0m"; // Text Reset

    // Regular Colors
    public static final String GREEN = "\033[0;32m"; // GREEN
    public static final String RED = "\033[0;31m"; // RED
    public static final String CYAN = "\033[0;36m"; // CYAN
    public static final String YELLOW = "\033[0;33m"; // YELLOW

    public static int menuPrincipal() {

        System.out.println("Etes vous prêtes à jouer ?");

        System.out.println();
        System.out.println(YELLOW + "    Choisissez un personnage   ");
        System.out.println("*******************************" + RESET);
        System.out.println(YELLOW +"*"+ RESET +"     1-The Codeuse !!!!!     "+YELLOW +"*"+ RESET);
        System.out.println(YELLOW +"*"+ RESET +"     2-The Vampirette !!     "+YELLOW +"*");
        System.out.println("*******************************" +RESET);
        int choixPerso = scan.nextInt();

        return choixPerso;

    }

    public static int menuQuete() {

        System.out.println();
        System.out.println(YELLOW + "        Choisissez votre quête           ");
        System.out.println("*****************************************" + RESET);
        System.out.println(YELLOW +"*"+ RESET + "   1- A la poursuite du Git perdu      "+YELLOW +"*"+ RESET);
        System.out.println(YELLOW +"*"+ RESET + "   2- Le tresor englouti d'Hibernate   "+YELLOW +"*"+ RESET);
        System.out.println(YELLOW +"*****************************************"+ RESET);
        int choixQuete = scan.nextInt();

        return choixQuete;
    }

    public static Personnage creerPersonnage(int choixPerso) {
        Personnage perso = new Personnage();

        if (choixPerso == 1) {
            perso = new Codeuse();
        } else if (choixPerso == 2) {
            perso = new Vampirette();
        } else if (choixPerso == 3) {
            perso = new Formateur();
        }
        return perso;

    }

    public static void afficherCaracteristiquesPerso(Personnage perso) {

        if (perso instanceof Codeuse) {

            Codeuse codeuse = (Codeuse) perso;

            System.out.println(
                    YELLOW + "****************Caracteristiques du personnage****************************" + RESET);
            System.out.println(
                    YELLOW +"*"+ RESET +"        Bienvenue chere " + codeuse.getNom() + "                                         "+YELLOW +"*"+ RESET);
            System.out.println(
                    YELLOW +"*"+ RESET +"      Tu possèdes  " + codeuse.getPv() + " points de vie,                                    "+YELLOW +"*"+ RESET);
            System.out.println(YELLOW +"*"+ RESET +"      tu possèdes  " + codeuse.getExp()
                    + " points d'expérience,                               "+YELLOW +"*"+ RESET);
            System.out.println(YELLOW +"*"+ RESET +"      et tes armes :  " + codeuse.getArmes() + ""+YELLOW +"*"+ RESET);
            System.out.println(YELLOW +"**************************************************************************"+ RESET);
        } else if (perso instanceof Vampirette) {

            Vampirette vampirette = (Vampirette) perso;

            System.out.println(
                    YELLOW + "******************Caracteristiques du personnage********************************" + RESET);
            System.out.println(YELLOW +"*"+ RESET +"       Bienvenue chere " + vampirette.getNom()
                    + "                                             "+YELLOW +"*"+ RESET);
            System.out.println(YELLOW +"*"+ RESET +"      Tu possèdes  " + vampirette.getPv()
                    + " points de vie,                                           "+YELLOW +"*"+ RESET);
            System.out.println(YELLOW +"*"+ RESET +"      tu possèdes  " + vampirette.getExp()
                    + " points d'expérience                                      "+YELLOW +"*"+ RESET);
            System.out.println(YELLOW +"*"+ RESET +"      et tes armes :  " + vampirette.getArmes() +YELLOW +" *"+ RESET);
            System.out.println(YELLOW +"********************************************************************************" +RESET);
        } else if (perso instanceof Formateur) {

            Formateur formateur = (Formateur) perso;

            System.out.println(
                    YELLOW + "****************Caracteristiques du personnage********************************" + RESET);
            System.out.println(YELLOW +"*"+ RESET +
                    "       Bienvenue chere " + formateur.getNom() + "                                            "+YELLOW +"*"+ RESET);
            System.out.println(YELLOW +"*"+ RESET +"      Tu possèdes  " + formateur.getPv()
                    + " points de vie,                                         "+YELLOW +"*"+ RESET);
            System.out.println(YELLOW +"*"+ RESET +"      tu possèdes  " + formateur.getExp()
                    + " points d'expérience                                    "+YELLOW +"*"+ RESET);
            System.out.println(YELLOW +"*"+ RESET +"      et tes armes :  " + formateur.getArmes()+YELLOW +" *"+ RESET);
            System.out.println(YELLOW +"******************************************************************************"+RESET);
        }
    }

    public static void afficherScenarioQuete(int choixQuete) {

        if (choixQuete == 1) {

            System.out.println(YELLOW
                    + "****************Quete  A la poursuite du Git perdu **********************************" + RESET);
            System.out.println();
            System.out.println("                  ***Bienvenue sur notre quête***");
            System.out.println("-> Votre mission si vous l'acceptez sera de trouver la branche perdue!!!");
            System.out.println("-> Vous affronterez votre ennemi juré le Formateur, qui à coup de methodes java");
            System.out.println("-> Pourra a tout moment casser votre code, et pousser sur votre Repo");
            System.out.println("-> Si vous perdez tous vos points de vie vous perderez à tout jamais votre Repo Git");
            System.out.println();
            System.out.println(YELLOW+ "*************************************************************************************"+ RESET);
            System.out.println();
        } else {
            System.out.println(YELLOW
                    + "***************Quete  Le trésor engloutis d'Hibernate ********************************" + RESET);
            System.out.println();
            System.out.println("                  ***Bienvenue sur notre quête***");
            System.out.println("-> Votre mission si vous l'acceptez sera de trouver la base de données engloutie!!!");
            System.out.println("-> Vous affronterez votre ennemi juré le Formateur, qui à coup de methodes java");
            System.out.println("-> Pourra a tout moment casser vos requêtes Sql, et Droper vos tables");
            System.out.println("-> Si vous perdez tous vos points de vie votre Database sera perdue à tout jamais");
            System.out.println();
            System.out.println(YELLOW+"*************************************************************************************" +RESET);
            System.out.println();
        }

    }

    public static void jouer(Personnage perso, Personnage ennemi, int choixPerso) {
        Combat persoCombat = null;

        Combat ennemiCombat = new Formateur();
        if (choixPerso == 1) {
            persoCombat = new Codeuse();
            afficherCaracteristiquesPerso((Codeuse) perso);

        } else if (choixPerso == 2) {
            persoCombat = new Vampirette();
            afficherCaracteristiquesPerso((Vampirette) perso);
        } else if (choixPerso == 3) {
            persoCombat = new Formateur();
            afficherCaracteristiquesPerso((Formateur) perso);
        }

        int choixQuete = menuQuete();
        afficherScenarioQuete(choixQuete);

        System.out.println(RED + "***Dans cette quête vous affronterez: ***" + RESET);
        System.out.println();
        afficherCaracteristiquesPerso(ennemi);

        while (ennemi.getPv() > 0 && perso.getPv() > 0) {
            if (perso.getPv() > 0) {
                System.out.println("Début du combat...");
                persoCombat.attaque(perso.getArmes().get(0));
                ennemiCombat.defense(ennemi, perso.getArmes().get(0));
                System.out.println();
            } else {
                break;
            }
            if (ennemi.getPv() > 0) {
                System.out.println("Ton ennemi passe à l'attaque...");
                ennemiCombat.attaque(ennemi.getArmes().get(0));
                System.out.println();
                persoCombat.defense(ennemi, ennemi.getArmes().get(0));
            } else {
                break;
            }
        }

        if (ennemi.getPv() <= 0) {
            System.out.println();
            System.out.println(GREEN + "->>Bravo vous avez gagné la partie!!");
            perso.setExp(perso.getExp() + 1);
            System.out.println("->>Vos points Xp: " + perso.getExp() + RESET);
            System.out.println();
        } else {
            System.out.println();
            System.out.println(CYAN + "->>Le joueur a perdu!!");
            System.out.println("->>>>>>>Game Over<<<<<<<<-" + RESET);
            ennemi.setExp(ennemi.getExp() + 1);
        }

    }

    // ____________________________________________Main________________________________________________________________

    public static void main(String[] args) {
        char reponse = 0;
        Personnage ennemi = creerPersonnage(3);

        int choixPerso = menuPrincipal();
        Personnage perso = creerPersonnage(choixPerso);
        do {
            if (reponse != 0) {
                System.out.println("Voulez vous changer de personnage? O:oui ou N:non");
                int changerPerso = scan.next().charAt(0);
                if (changerPerso == 'O') {
                    choixPerso = menuPrincipal();
                    perso = creerPersonnage(choixPerso);
                }
            }
            jouer(perso, ennemi, choixPerso);
            System.out.println(" Souhaitez vous rejouer une partie? O: oui ou N: non");
            reponse = scan.next().charAt(0);

        } while (reponse == 'O');

        System.out.println(RED + "A la prochaine pour une nouvelle aventure!!!" + RESET);

    }

}
