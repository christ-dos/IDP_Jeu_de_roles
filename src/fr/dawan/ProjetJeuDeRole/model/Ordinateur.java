package fr.dawan.ProjetJeuDeRole.model;

public class Ordinateur extends Arme {

    private int idPc;
    private static int degat;
    
    public Ordinateur () {
        this.idPc = 1;
        this.degat=5;
        
    }

    public Ordinateur(String nomArme, int degat ) {
        super(nomArme, degat);
        this.idPc = 1;
    }

    public int getIdPc() {
        return idPc;
    }


    @Override
    public String toString() {
        return "Ordinateur [idPc=" + idPc + ", toString()=" + super.toString() + "]";
    }

   

    

    
    
    
    
}
