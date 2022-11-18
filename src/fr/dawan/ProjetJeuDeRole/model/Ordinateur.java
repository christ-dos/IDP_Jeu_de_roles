package fr.dawan.ProjetJeuDeRole.model;

public class Ordinateur extends Arme {

    private int idPc;
    private static int degat;
    
    public Ordinateur () {
        this.idPc = 1;
        this.degat=5;
        this.setNomArme("ordinateur");
    }

    public Ordinateur(String nomArme, int degat ) {
        super(nomArme, degat);
        this.idPc = 1;
        this.degat=5;
        this.setNomArme("ordinateur");
    }

    public int getIdPc() {
        return idPc;
    }

    
    @Override
    public String toString() {
        return "Nom arme: " + super.getNomArme() + " ,idPc=" + idPc + ", point de degats= " + this.degat ;
    }

   

    

    
    
    
    
}
