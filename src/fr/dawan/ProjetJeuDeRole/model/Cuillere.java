package fr.dawan.ProjetJeuDeRole.model;

public class Cuillere extends Arme {
    
    private int idCuillere;
    private static int degat;
    
    public Cuillere () {
        this.idCuillere = 2;
        this.degat=10;
    }

    public Cuillere(String nomArme, int degat) {
        super(nomArme, degat);
        this.idCuillere = 2;
    }

    public int getIdCuillere() {
        return idCuillere;
    }

  

    @Override
    public String toString() {
        return "Nom arme: " + super.getNomArme() + ", idCuillere=" + idCuillere + ", point de degats= " + this.degat ;
    }

}
