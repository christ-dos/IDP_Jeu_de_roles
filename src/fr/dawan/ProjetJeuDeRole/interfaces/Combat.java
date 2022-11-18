package fr.dawan.ProjetJeuDeRole.interfaces;

import fr.dawan.ProjetJeuDeRole.model.Arme;
import fr.dawan.ProjetJeuDeRole.model.Personnage;

public interface Combat {
    void attaque(Arme arme);
    void defense();
    void estAttaque(Personnage ennemi, Arme arme);
}
