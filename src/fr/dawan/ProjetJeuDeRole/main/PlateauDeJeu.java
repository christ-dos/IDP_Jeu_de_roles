package fr.dawan.ProjetJeuDeRole.main;

import java.util.Scanner;

import fr.dawan.ProjetJeuDeRole.model.Codeuse;
import fr.dawan.ProjetJeuDeRole.model.MethodesJava;
import fr.dawan.ProjetJeuDeRole.model.Personnage;
import fr.dawan.ProjetJeuDeRole.model.Vampirette;

public class PlateauDeJeu {
    static Scanner scan = new Scanner(System.in);

    public static int menuPrincipal() {

        System.out.println("Etes vous prêtes à jouer ?");

        System.out.println();
        System.out.println("    Choisissez un personnage   ");
        System.out.println("*******************************");
        System.out.println("*     1-The Codeuse !!!!!     *");
        System.out.println("*     2-The Vampirette !!     *");
        System.out.println("*******************************");
        int choixPerso=scan.nextInt();
        
        return choixPerso;

    }
    
    public static int menuQuete() {


        System.out.println();
        System.out.println("        Choisissez votre quête           ");
        System.out.println("*****************************************");
        System.out.println("*   1- A la poursuite du Git perdu      *");
        System.out.println("*   2- Le tresor englouti d'Hibernate   *");
        System.out.println("*****************************************");
        int choixQuete=scan.nextInt();
        
        return choixQuete;
    }
    
    public  static void afficherCaracteristiquesPerso( int choixPerso) {
        
    if (choixPerso==1) {
        
        Codeuse codeuse=new Codeuse();
        
        System.out.println("****************Caracteristiques du personnage****************************");
        System.out.println("*        Bienvenue chere " + codeuse.getNom()+"                                         *");
        System.out.println("*      Tu possèdes  " +codeuse.getPv()+ " points de vie,                                    *");
        System.out.println("*      tu possèdes  " +codeuse.getPdef()+ " points de défense,                                *");
        System.out.println("*      tu possèdes  " +codeuse.getExp()+ " points d'expérience,                               *");
        System.out.println("*      et tes armes :  " +codeuse.getArmes()+ "*");
        System.out.println("**************************************************************************");
    } else {
        
        Vampirette vampirette=new Vampirette();
        
        System.out.println("****************Caracteristiques du personnage*****************************");
        System.out.println("*       Bienvenue chere " + vampirette.getNom()+"                                        *");
        System.out.println("*      Tu possèdes  " +vampirette.getPv()+ " points de vie,                                     *");
        System.out.println("*      tu possèdes  " +vampirette.getPdef()+ " points de défense,                                 *");
        System.out.println("*      tu possèdes  " +vampirette.getExp()+ " points d'expérience                                 *");
        System.out.println("*      et tes armes :  " +vampirette.getArmes()+ "                                             *");
        System.out.println("***************************************************************************"); 

    }
        
    }
    
    public static void afficherScenarioQuete(int choixQuete) {
        
        if (choixQuete==1) {
            
            System.out.println("****************Quete  A la poursuite du Git perdu **********************************");
            System.out.println();
            System.out.println("                  ***Bienvenu sur notre quête***");
            System.out.println("-> Votre mission si vous l'acceptez sera de trouver la branche perdue!!!");
            System.out.println("-> Vous affronterez votre ennemi juré le Formateur, qui à coup de methodes java");
            System.out.println("-> Pourra a tout moment casser votre code, et pousser sur votre Repo");
            System.out.println("-> Si vous perdez tous vos points de vie pour perderez à tout jamais votre Repo Git");
            System.out.println();
            System.out.println("*************************************************************************************");
        } else {
            System.out.println("***************Quete  Le trésor engloutis d'Hibernate ********************************");
            System.out.println();
            System.out.println("                  ***Bienvenu sur notre quête***");
            System.out.println("-> Votre mission si vous l'acceptez sera de trouver la base de données engloutie!!!");
            System.out.println("-> Vous affronterez votre ennemi juré le Formateur, qui à coup de methodes java");
            System.out.println("-> Pourra a tout moment casser vos requêtes Sql, et Droper vos tables");
            System.out.println("-> Si vous perdez tous vos points de vie votre Database sera perdu à tout jamais");
            System.out.println();
            System.out.println("*************************************************************************************");
           

        } 
        
        
        
    }
    
    //____________________________________________Main________________________________________________________________

    public static void main(String[] args) {

        Personnage p = new Personnage();
        System.out.println(p.getPv());
        System.out.println(p.getPdef());
        Codeuse codeuse = new Codeuse();
        System.out.println(codeuse.getPdef());
        MethodesJava mj = new MethodesJava();
        System.out.println(mj);
        
    int choixPerso =menuPrincipal();
    afficherCaracteristiquesPerso(choixPerso);
    
    int choixQuete=menuQuete();
    afficherScenarioQuete(choixQuete);

    }

}
