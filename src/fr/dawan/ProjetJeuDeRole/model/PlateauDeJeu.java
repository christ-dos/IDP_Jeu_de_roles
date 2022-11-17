package fr.dawan.ProjetJeuDeRole.model;

import java.util.Scanner;

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
        System.out.println("*    1- A la poursuite du Git perdu     *");
        System.out.println("*   2- Le tresor englouti d'Hibernate   *");
        System.out.println("*****************************************");
        int choixQuete=scan.nextInt();
        
        return choixQuete;
    }
    
    public  static void afficherCaracteristiquesPerso( int choixPerso) {
        
    if (choixPerso==1) {
        
        Codeuse codeuse=new Codeuse();
        
        System.out.println("****************Caracteristiques du personnage*************************");
        System.out.println("*              Bienvenue chere " + codeuse.getNom()+"                 *");
        System.out.println("*      Tu possèdes  " +codeuse.getPv()+ " points de vie,              *");
        System.out.println("*      tu possèdes  " +codeuse.getPdef()+ " points de défense,        *");
        System.out.println("*       tu possèdes  " +codeuse.getExp()+ " points d'expérience,      *");
        System.out.println("*    et tes armes :  " +codeuse.getArmes()+ "                         *");
        System.out.println("***********************************************************************");
    } else {
        
        Vampirette vampirette=new Vampirette();
        
        System.out.println("****************Caracteristiques du personnage****************************");
        System.out.println("*              Bienvenue chere " + vampirette.getNom()+"                 *");
        System.out.println("*      Tu possèdes  " +vampirette.getPv()+ " points de vie,              *");
        System.out.println("*      tu possèdes  " +vampirette.getPdef()+ " points de défense,        *");
        System.out.println("*      tu possèdes  " +vampirette.getExp()+ " points d'expérience        *");
        System.out.println("*    et tes armes :  " +vampirette.getArmes()+ "                         *");
        System.out.println("**************************************************************************"); 

    }
        
    }
    
    public static void afficherScenarioQuete(int choixQuete) {
        
        if (choixQuete==1) {
            
           
            
            System.out.println("****************Quete  A la poursuite du Git perdu *************************");
            System.out.println("*     Lorem ipsum dolor sit amet, consectetur adipiscing elit, \n "
                    + "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n "
                    + "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea \n"
                    + "commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu \n"
                    + " fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \n"
                    + " deserunt mollit anim id est laborum                  \n *");

            System.out.println("*****************************************************************************");
        } else {
            System.out.println("****************Quete Le tresor englouti d'Hibernate *************************");
            System.out.println("*     Lorem ipsum dolor sit amet, consectetur adipiscing elit, \n "
                    + "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n "
                    + "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea \n"
                    + "commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu \n"
                    + " fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia \n"
                    + " deserunt mollit anim id est laborum                  \n *");

            System.out.println("*****************************************************************************");
           

        } 
        
        
        
    }
    
    //____________________________________________Main________________________________________________________________

    public static void main(String[] args) {

        Personnage p = new Personnage();
        System.out.println(p.getPv());
        System.out.println(p.getPdef());
        Codeuse codeuse = new Codeuse();
        System.out.println(codeuse.getPdef());
        
    int choixPerso =menuPrincipal();
    afficherCaracteristiquesPerso(choixPerso);
    
    int choixQuete=menuQuete();
    afficherScenarioQuete(choixQuete);

    }

}
